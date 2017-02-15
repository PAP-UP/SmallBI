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

import br.com.smallbi.business.PessoaBusiness;
import br.com.smallbi.entity.Cliente;
import br.com.smallbi.entity.Funcao;
import br.com.smallbi.entity.Pessoa;

@Path("/pessoa")
public class PessoaWebService {

	PessoaBusiness pessoaBusiness = new PessoaBusiness();
	Gson gson = new Gson();
	Type type = new TypeToken<Pessoa>() {}.getType();
	
	@GET
	@Path("/listar")
	@Produces(MediaType.APPLICATION_JSON)
	public String getPessoas(){
		List<Pessoa> pessoas = pessoaBusiness.list();
		List<Hashtable<String, Object>> hashPessoas = new ArrayList<>();
		for(Pessoa p : pessoas){
			hashPessoas.add(getHashFromObject(p));
		}
		return gson.toJson(hashPessoas);
	}
	
	@POST
	@Path("/adicionar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String addPessoa(String json) throws JSONException{
		Pessoa pessoa = getObjectFromHash(json);
		return gson.toJson(pessoaBusiness.create(pessoa));
	}
	
	@POST
	@Path("/alterar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String setPessoa(String json) throws JSONException{
		Pessoa pessoa = getObjectFromHash(json);
		return gson.toJson(pessoaBusiness.update(pessoa));
	}
	
	@DELETE
	@Path("/deletar/{idPessoa}")
	//@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String delPessoa(@PathParam("idPessoa") String idPessoa) throws JSONException{
		/*JSONObject jsonObject = new JSONObject(json);
		Pessoa pessoa = new Pessoa();
		pessoa.setIdPessoa(jsonObject.getInt("idPessoa"));
		return gson.toJson(pessoaBusiness.delete(pessoa.getIdPessoa()));*/
		return gson.toJson(pessoaBusiness.delete(Integer.parseInt(idPessoa)));
	}
	
	@GET
	@Path("/getById/{idPessoa}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getById(@PathParam("idPessoa") String idPessoa){
		Pessoa pessoa = pessoaBusiness.getObjById(Integer.parseInt(idPessoa));
		if(pessoa != null){
			return gson.toJson(getHashFromObject(pessoa));
		}
		return "Nenhum resultado foi encontrado na tabela Pessoa com o id {"+idPessoa+"}";
	}
	
	public Hashtable<String, Object> getHashFromObject(Pessoa p){
		Hashtable<String, Object> hash = new Hashtable<>();
		hash.put("idPessoa", p.getIdPessoa());
		hash.put("nome", p.getNome());
		hash.put("cpf", p.getCpf());
		hash.put("rg", p.getRg());
		hash.put("cliente", p.getCliente().getNomeFantasia());
		hash.put("funcao", p.getFuncao().getNomeFuncao());
		return hash;
	}
	
	public Pessoa getObjectFromHash(String json) throws JSONException{
		JSONObject jsonObject = new JSONObject(json);
		Pessoa p = new Pessoa();
		if(!jsonObject.isNull("idPessoa")){
			p.setIdPessoa(jsonObject.getInt("idPessoa"));
		}
		p.setUsuarioId(jsonObject.getInt("usuarioId"));
		p.setNome(jsonObject.getString("nome"));
		p.setCpf(jsonObject.getString("cpf"));
		p.setRg(jsonObject.getString("rg"));
		
		Cliente c = new Cliente();
		c.setIdCliente(jsonObject.getInt("idCliente"));
		p.setCliente(c);
		
		Funcao f = new Funcao();
		f.setIdFuncao(jsonObject.getInt("idFuncao"));
		p.setFuncao(f);
		
		return p;
	}
}
