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

import br.com.smallbi.business.EstadoBusiness;
import br.com.smallbi.entity.Estado;

@Path("/estado")
public class EstadoWebService {

	EstadoBusiness estadoBusiness = new EstadoBusiness();	
	Gson gson = new Gson();
	Type type = new TypeToken<Estado>() {}.getType();
	
	@GET
	@Path("/listar")
	@Produces(MediaType.APPLICATION_JSON)
	public String getEstados(){
		List<Estado> estados = estadoBusiness.list();
		List<Hashtable<String, Object>> hashEstados = new ArrayList<>();
		for(Estado e : estados){
			hashEstados.add(getHashFromObject(e));
		}
		return gson.toJson(hashEstados);
	}	
	
	@POST
	@Path("/adicionar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String addEstado(String json) throws JSONException{		
		Estado estado = getObjectFromHash(json);
		return gson.toJson(estadoBusiness.create(estado));
	}
	
	@POST
	@Path("/alterar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String setEstado(String json) throws JSONException{
		Estado estado = getObjectFromHash(json);
		return gson.toJson(estadoBusiness.update(estado));
	}
	
	@DELETE
	@Path("/deletar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String delEstado(String json) throws JSONException{
		JSONObject jsonObject = new JSONObject(json);
		Estado e = new Estado();
		e.setIdEstado(jsonObject.getInt("idEstado"));
		return gson.toJson(estadoBusiness.delete(e.getIdEstado()));
	}
	
	@GET
	@Path("/getById/{idEstado}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getById(@PathParam("idEstado") String idEstado){
		Estado estado = estadoBusiness.getObjById(Integer.parseInt(idEstado));
		if(estado != null){
			return gson.toJson(getHashFromObject(estado));
		}
		return gson.toJson("Nenhum resultado foi encontrado na tabela Estado com o id {"+idEstado+"}");
	}
	
	public Hashtable<String, Object> getHashFromObject(Estado e){
		Hashtable<String, Object> hashtable = new Hashtable<>();
		hashtable.put("idEstado", e.getIdEstado());
		hashtable.put("nomeEstado", e.getNomeEstado());
		hashtable.put("siglaEstado", e.getSiglaEstado());
		return hashtable;
	}
	
	public Estado getObjectFromHash(String json) throws JSONException{
		JSONObject jsonObject = new JSONObject(json);
		Estado e = new Estado();
		if(!jsonObject.isNull("idEstado")){
			e.setIdEstado(jsonObject.getInt("idEstado"));
		}
		e.setUsuarioId(jsonObject.getInt("usuarioId"));
		e.setNomeEstado(jsonObject.getString("nomeEstado"));
		e.setSiglaEstado(jsonObject.getString("siglaEstado"));
		return e;
	}
}
