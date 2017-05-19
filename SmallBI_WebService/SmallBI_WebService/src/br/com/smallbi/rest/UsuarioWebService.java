package br.com.smallbi.rest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import br.com.smallbi.business.EnderecoBusiness;
import br.com.smallbi.business.PessoaBusiness;
import br.com.smallbi.business.TelefoneBusiness;
import br.com.smallbi.business.UrlBusiness;
import br.com.smallbi.business.UsuarioBusiness;
import br.com.smallbi.business.UsuarioLogadoBusiness;
import br.com.smallbi.entity.Cliente;
import br.com.smallbi.entity.Endereco;
import br.com.smallbi.entity.Funcao;
import br.com.smallbi.entity.Perfil;
import br.com.smallbi.entity.Pessoa;
import br.com.smallbi.entity.Telefone;
import br.com.smallbi.entity.Usuario;
import br.com.smallbi.entity.UsuarioLogado;
import br.com.smallbi.util.ClassMapper;

@Path("/usuario")
public class UsuarioWebService {

	UsuarioBusiness usuarioBusiness = new UsuarioBusiness();
	Gson gson = new Gson();
	Type type = new TypeToken<Usuario>() {}.getType();
	
	@GET
	@Path("/listar")
	@Produces(MediaType.APPLICATION_JSON)
	public String getUsuarios(){
		List<Usuario> usuarios = usuarioBusiness.list();
		List<Hashtable<String, Object>> hashUsuarios = new ArrayList<>();
		for(Usuario u : usuarios){
			hashUsuarios.add(getHashFromObject(u));
		}
		return gson.toJson(hashUsuarios);
	}
	
	@POST
	@Path("/listarByIdCliente")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String getUsuariosByIdCliente(String json) throws JSONException{
		List<Usuario> usuarios = usuarioBusiness.list();
		JSONObject jsonObject = new JSONObject(json);
		int idCliente = jsonObject.getInt("idCliente");
		List<Hashtable<String, Object>> hashUsuarios = new ArrayList<>();
		for(Usuario u : usuarios){
			if(u.getPessoa().getCliente().getIdCliente() == idCliente)
				hashUsuarios.add(getHashFromObject(u));
		}
		return gson.toJson(hashUsuarios);
	}
	
	@POST
	@Path("/adicionar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String addUsuario(String json) throws JSONException{
		
		String jsonIsValid = ClassMapper.validadeJson(json, new Usuario().getClass().getName());
		
		if(jsonIsValid.equals("OK")){
			Usuario usuario = getObjectFromHash(json);
			JSONObject response = usuarioBusiness.create(usuario);
			
			if(response.getString("message").equals("Usuario cadastrado com sucesso!"))
				appendEnderecoTelefone(json, usuario.getPessoa().getIdPessoa(), usuario.getUsuarioId());
				
			return response.toString();
		}
		
		JSONObject jsonObject = new JSONObject().put("message", jsonIsValid);
		return jsonObject.toString();
	}
	
	/**
	 * Metodo criado para adicionar o super usuário do cliente<br/>
	 * Usado no mesmo momento em que se cadastra o cliente
	 * @param json
	 * @return {@link Boolean}
	 * @throws JSONException 
	 */
	public JSONObject addUsuarioFromAddCliente(String json) throws JSONException{
		
		String jsonIsValid = ClassMapper.validadeJson(json, new Usuario().getClass().getName());
		if(jsonIsValid.equals("OK")){
			Usuario usuario = getObjectFromHash(json);
			JSONObject responseUsuarioBusiness = usuarioBusiness.create(usuario);
			
			if(!responseUsuarioBusiness.isNull("idUsuario")){
				appendEnderecoTelefone(json, usuario.getPessoa().getIdPessoa(), usuario.getUsuarioId());
			}
			return responseUsuarioBusiness;
		}
		return new JSONObject().put("message", jsonIsValid);
	}
	
	@POST
	@Path("/alterar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String setUsuario(String json) throws JSONException{
		Usuario usuario = getObjectFromHash(json);
		String response = usuarioBusiness.update(usuario);
		
		if(response.equals("Usuario alterado com sucesso!")){
			appendEnderecoTelefone(json, usuario.getPessoa().getIdPessoa(), usuario.getUsuarioId());
		}
		
		return gson.toJson(response);
	}
	
	@GET
	@Path("/deletar/{idUsuario}")
	//@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String delUsuario(@PathParam("idUsuario") String idUsuario) throws JSONException{
		return gson.toJson(usuarioBusiness.delete(Integer.parseInt(idUsuario)));
	}
	
	@GET
	@Path("/getById/{idUsuario}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getById(@PathParam("idUsuario") String idUsuario){
		Usuario usuario = usuarioBusiness.getObjById(Integer.parseInt(idUsuario));
		if(usuario != null){
			return gson.toJson(getHashById(usuario));
		}
		return gson.toJson("Nenhum resultado foi encontrado na tabela Usuario com o id {"+idUsuario+"}");
	}
	
	@POST
	@Path("/login")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String login(String json) throws JSONException{
		JSONObject jsonObject = new JSONObject(json);
		UsuarioLogado ul = usuarioBusiness.login(jsonObject.getString("login"), jsonObject.getString("senha"));
		
		if(ul != null){
			JSONObject jsonResponse = new JSONObject();
			jsonResponse.put("idUsuario", ul.getIdUsuarioLogado());
			jsonResponse.put("idCliente", ul.getClienteId());
			jsonResponse.put("token", ul.getToken());
			Usuario u = usuarioBusiness.getObjById(ul.getIdUsuarioLogado());
			jsonResponse.put("nome", u.getPessoa().getNome());
			jsonResponse.put("idPerfil", u.getPerfil().getIdPerfil());
			jsonResponse.put("success", true);
			jsonResponse.put("nomeCliente", u.getPessoa().getCliente().getNomeFantasia());
			return jsonResponse.toString();
		}else{
			//return gson.toJson("Usuário ou senha inválidos!");
			jsonObject = new JSONObject()
					.put("success", false)
						.put("msg", "Usuário ou senha inválidos!");
			
			return jsonObject.toString();
		}
	}
	
	@POST
	@Path("/authenticationVerify")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String checarToken(String json) throws JSONException{
		JSONObject jsonObject = new JSONObject(json);
		UsuarioLogado ul = new UsuarioLogadoBusiness().getUsuarioLogadoByToken(jsonObject.getString("token"));
		JSONObject jsonResponse = new JSONObject();
		if(ul != null){
			boolean access = new UrlBusiness().hasAccess(jsonObject.getString("url"), jsonObject.getInt("idPerfil"));
			if(access){
				jsonResponse.put("isValidAccess", true);
			}else{
				jsonResponse.put("isValidAccess", false);
			}
			
			Usuario u = usuarioBusiness.getObjById(ul.getIdUsuarioLogado());
			jsonResponse.put("idPerfil", u.getPerfil().getIdPerfil());
			
			jsonResponse.put("isValidToken", true);
			
			return jsonResponse.toString();
		}
		return jsonResponse.put("isValidToken", false).toString();
	}
	
	@POST
	@Path("/renovarToken")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String renovarToken(String json) throws JSONException{
		JSONObject jsonObject = new JSONObject(json);
		return gson.toJson(new UsuarioLogadoBusiness().renovarToken(jsonObject.getString("token")));
	}
		
	@POST
	@Path("/logout")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String logout(String json) throws JSONException{
		JSONObject jsonObject = new JSONObject(json);
		String response = new UsuarioLogadoBusiness().encerrarSessao(jsonObject.getString("token"));
		return gson.toJson(response);
	}
	
	public Hashtable<String, Object> getHashById(Usuario u){
		Hashtable<String, Object> hash = new Hashtable<>();
		hash.put("idPessoa", u.getPessoa().getIdPessoa());
		hash.put("usuarioId", u.getUsuarioId());
		hash.put("nome", u.getPessoa().getNome());
		hash.put("cpf", u.getPessoa().getCpf());
		hash.put("rg", u.getPessoa().getRg());
		hash.put("idCliente", u.getPessoa().getCliente().getIdCliente());
		hash.put("idFuncao", u.getPessoa().getFuncao().getIdFuncao());
		
		hash.put("idUsuario", u.getIdUsuario());
		hash.put("login", u.getLogin());
		hash.put("senha", u.getSenha());
		hash.put("usuarioSaiku", u.getUsuarioSaiku());
		hash.put("idPerfil", u.getPerfil().getIdPerfil());
		
		Endereco e = new EnderecoBusiness().getByPessoa(u.getPessoa().getIdPessoa());
		if(e != null){
			hash.put("idEndereco", e.getIdEndereco());
			hash.put("endereco", e.getEndereco());
			hash.put("numero", e.getNumero());
			hash.put("bairro", e.getBairro());
			hash.put("idCidade", e.getCidade().getIdCidade());
			//hash.put("idTipoEndereco", e.getTipo().getIdTipo());
		}
		
		Telefone t = new TelefoneBusiness().getByPessoa(u.getPessoa().getIdPessoa());
		if(t != null){
			hash.put("idTelefone", t.getIdTelefone());
			//hash.put("idTipoTelefone", t.getTipo().getIdTipo());
			//hash.put("ddd", t.getDdd());
			hash.put("telefone", t.getTelefone());
		}
		
		return hash;
	}
	
	public void appendEnderecoTelefone(String json, int idPessoa, int usuarioId) throws JSONException{
		
		JSONObject jsonObject = new JSONObject(json);
		jsonObject.put("idPessoa", idPessoa);
		
		if(!jsonObject.isNull("idCliente")){
			jsonObject.remove("idCliente");
		}		
		
		//AGUARDANDO DEFINIÇÃO
		if(!jsonObject.isNull("endereco")){
			jsonObject.put("idTipoEndereco", 3);
			new EnderecoWebService().addEndereco(jsonObject.toString());
		}
/*		if(jsonObject.isNull("idEndereco")){
			new EnderecoWebService().addEndereco(jsonObject.toString());
		}else{
			new EnderecoWebService().setEndereco(jsonObject.toString());
		}*/
		
		jsonObject.put("idTipoTelefone", 3);
		if(jsonObject.isNull("idTelefone")){
			new TelefoneWebService().addTelefone(jsonObject.toString());
		}else{
			new TelefoneWebService().setTelefone(jsonObject.toString());
		}		
	}
	
	public Hashtable<String, Object> getHashFromObject(Usuario u){
		Hashtable<String, Object> hash = new Hashtable<>();
		hash.put("idUsuario", u.getIdUsuario());
		hash.put("login", u.getLogin());
		hash.put("senha", u.getSenha());
		hash.put("usuarioSaiku", u.getUsuarioSaiku());
		hash.put("perfil", u.getPerfil().getNomePerfil());
		
		if(u.getPessoa() != null){
			hash.put("pessoa", u.getPessoa().getNome());
			hash.put("cliente", u.getPessoa().getCliente().getNomeFantasia());
		}
		return hash;
	}
	
	public Usuario getObjectFromHash(String json) throws JSONException{
		
		JSONObject jsonObject = new JSONObject(json);
		
		Pessoa p = new Pessoa();

		//int usuarioId = jsonObject.getInt("usuarioId");	//Atribuido à variavel para ser reutilizado no objeto u;
		//p.setUsuarioId(usuarioId);
		p.setNome(jsonObject.getString("nome"));
		p.setCpf(jsonObject.getString("cpf"));
		p.setRg(jsonObject.getString("rg"));
		
		Cliente c = new Cliente();
		c.setIdCliente(jsonObject.getInt("idCliente"));
		p.setCliente(c);
		
		Funcao f = new Funcao();
		f.setIdFuncao(jsonObject.getInt("idFuncao"));
		p.setFuncao(f);
		
		if(jsonObject.isNull("idPessoa")){
			new PessoaBusiness().create(p);
		}else{
			p.setIdPessoa(jsonObject.getInt("idPessoa"));
			new PessoaBusiness().update(p);
		}
		
		
		Usuario u = new Usuario();
		if(!jsonObject.isNull("idUsuario")){
			u.setIdUsuario(jsonObject.getInt("idUsuario"));
		}
		u.setPessoa(p);
		//u.setUsuarioId(usuarioId);
		u.setLogin(jsonObject.getString("login"));
		u.setSenha(jsonObject.getString("senha"));
		//u.setUsuarioSaiku(jsonObject.getString("usuarioSaiku"));
		
		Perfil perfil = new Perfil();
		perfil.setIdPerfil(jsonObject.getInt("idPerfil"));
		u.setPerfil(perfil);
		return u;
	}
}
