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

import br.com.smallbi.business.TelefoneBusiness;
import br.com.smallbi.entity.Cliente;
import br.com.smallbi.entity.Pessoa;
import br.com.smallbi.entity.Telefone;
import br.com.smallbi.entity.Tipo;

@Path("/telefone")
public class TelefoneWebService {

	TelefoneBusiness telefoneBusiness = new TelefoneBusiness();
	Gson gson = new Gson();
	Type type = new TypeToken<Telefone>() {}.getType();
	
	@GET
	@Path("/listar")
	@Produces(MediaType.APPLICATION_JSON)
	public String getTelefones(){
		List<Telefone> telefones = telefoneBusiness.list();
		List<Hashtable<String, Object>> hashtables = new ArrayList<>();
		for(Telefone t : telefones){
			hashtables.add(getHashFromObject(t));
		}
		return gson.toJson(hashtables);
	}
	
	@POST
	@Path("/adicionar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String addTelefone(String json) throws JSONException{
		Telefone telefone = getObjectFromHash(json);
		return gson.toJson(telefoneBusiness.create(telefone));
	}
	
	@POST
	@Path("/alterar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String setTelefone(String json) throws JSONException{
		Telefone telefone = getObjectFromHash(json);
		return gson.toJson(telefoneBusiness.update(telefone));
	}
	
	@DELETE
	@Path("/deletar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String delTelefone(String json) throws JSONException{
		JSONObject jsonObject = new JSONObject(json);
		Telefone telefone = new Telefone();
		telefone.setIdTelefone(jsonObject.getInt("idTelefone"));
		return gson.toJson(telefoneBusiness.delete(telefone.getIdTelefone()));
	}
	
	@GET
	@Path("/getById/{idTelefone}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getById(@PathParam("idTelefone") String idTelefone){
		Telefone telefone = telefoneBusiness.getObjById(Integer.parseInt(idTelefone));
		if(telefone != null){
			return gson.toJson(getHashById(telefone));
		}
		return "Nenhum resultado foi encontrado na tabela Telefone com o id {"+idTelefone+"}";
	}
	
	public Hashtable<String, Object> getHashById(Telefone t){
		Hashtable<String, Object> hash = new Hashtable<>();
		hash.put("idTelefone", t.getIdTelefone());
		hash.put("idTipo", t.getTipo().getIdTipo());
		hash.put("ddd", t.getDdd());
		hash.put("telefone", t.getTelefone());
		
		if(t.getPessoa() != null){
			hash.put("idPessoa", t.getPessoa().getIdPessoa());
		}
		
		if(t.getCliente() != null){
			hash.put("idCliente", t.getCliente().getIdCliente());
		}
		
		return hash;
	}
	
	public Hashtable<String, Object> getHashFromObject(Telefone t){
		Hashtable<String, Object> hash = new Hashtable<>();
		hash.put("idTelefone", t.getIdTelefone());
		hash.put("tipo", t.getTipo().getTipo());
		hash.put("ddd", t.getDdd());
		hash.put("telefone", t.getTelefone());
		if(t.getPessoa() != null){
			hash.put("pessoa", t.getPessoa().getNome());
			hash.put("cliente", t.getPessoa().getCliente().getNomeFantasia());
		}
		if(t.getCliente() != null){
			hash.put("cliente", t.getCliente().getNomeFantasia());
		}
		return hash;
	}
	
	public Telefone getObjectFromHash(String json) throws JSONException{
		JSONObject jsonObject = new JSONObject(json);
		Telefone t = new Telefone();
		if(!jsonObject.isNull("idTelefone")){
			t.setIdTelefone(jsonObject.getInt("idTelefone"));
		}
		t.setUsuarioId(jsonObject.getInt("usuarioId"));
		
		Tipo tipo = new Tipo();
		tipo.setIdTipo(jsonObject.getInt("idTipo"));
		t.setTipo(tipo);
		
		t.setDdd(jsonObject.getInt("ddd"));
		t.setTelefone(jsonObject.getString("telefone"));
		
		if(!jsonObject.isNull("idPessoa")){
			Pessoa pessoa = new Pessoa();
			pessoa.setIdPessoa(jsonObject.getInt("idPessoa"));
			t.setPessoa(pessoa);
		}
		if(!jsonObject.isNull("idCliente")){
			Cliente cliente = new Cliente();
			cliente.setIdCliente(jsonObject.getInt("idCliente"));
			t.setCliente(cliente);
		}
		return t;
	}
}
