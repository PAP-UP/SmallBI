package br.com.smallbi.rest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
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
import br.com.smallbi.business.UsuarioBusiness;
import br.com.smallbi.entity.Cidade;
import br.com.smallbi.entity.Cliente;
import br.com.smallbi.entity.Endereco;
import br.com.smallbi.entity.Funcao;
import br.com.smallbi.entity.Perfil;
import br.com.smallbi.entity.Pessoa;
import br.com.smallbi.entity.Telefone;
import br.com.smallbi.entity.Usuario;

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
	@Path("/adicionar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String addUsuario(String json) throws JSONException{
		Usuario usuario = getObjectFromHash(json);
		String response = usuarioBusiness.create(usuario);
		
		appendEnderecoTelefone(json, usuario.getPessoa().getIdPessoa(), usuario.getUsuarioId());
		
		return gson.toJson(response);
	}
	
	@POST
	@Path("/alterar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String setUsuario(String json) throws JSONException{
		Usuario usuario = getObjectFromHash(json);
		String response = usuarioBusiness.update(usuario);
		
		appendEnderecoTelefone(json, usuario.getPessoa().getIdPessoa(), usuario.getUsuarioId());
		
		return gson.toJson(response);
	}
	
	@DELETE
	@Path("/deletar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String delUsuario(String json) throws JSONException{
		JSONObject jsonObject = new JSONObject(json);
		Usuario usuario = new Usuario();
		usuario.setIdUsuario(jsonObject.getInt("idUsuario"));
		return gson.toJson(usuarioBusiness.delete(usuario.getIdUsuario()));
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
			hash.put("idTipoEndereco", e.getTipo().getIdTipo());
		}
		
		Telefone t = new TelefoneBusiness().getByPessoa(u.getPessoa().getIdPessoa());
		if(t != null){
			hash.put("idTelefone", t.getIdTelefone());
			hash.put("idTipoTelefone", t.getTipo().getIdTipo());
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
			new EnderecoWebService().addEndereco(jsonObject.toString());
		}
/*		if(jsonObject.isNull("idEndereco")){
			new EnderecoWebService().addEndereco(jsonObject.toString());
		}else{
			new EnderecoWebService().setEndereco(jsonObject.toString());
		}*/
		
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
		if(!jsonObject.isNull("idPessoa")){
			p.setIdPessoa(jsonObject.getInt("idPessoa"));
		}
		int usuarioId = jsonObject.getInt("usuarioId");	//Atribuido à variavel para ser reutilizado no objeto u;
		p.setUsuarioId(usuarioId);
		p.setNome(jsonObject.getString("nome"));
		p.setCpf(jsonObject.getString("cpf"));
		p.setRg(jsonObject.getString("rg"));
		
		Cliente c = new Cliente();
		c.setIdCliente(jsonObject.getInt("idCliente"));
		p.setCliente(c);
		
		Funcao f = new Funcao();
		f.setIdFuncao(jsonObject.getInt("idFuncao"));
		p.setFuncao(f);
		
		new PessoaBusiness().create(p);
		
		Usuario u = new Usuario();
		if(!jsonObject.isNull("idUsuario")){
			u.setIdUsuario(jsonObject.getInt("idUsuario"));
		}
		u.setPessoa(p);
		u.setUsuarioId(usuarioId);
		u.setLogin(jsonObject.getString("login"));
		u.setSenha(jsonObject.getString("senha"));
		u.setUsuarioSaiku(jsonObject.getString("usuarioSaiku"));
		
		Perfil perfil = new Perfil();
		perfil.setIdPerfil(jsonObject.getInt("idPerfil"));
		u.setPerfil(perfil);
		return u;
	}
}
