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

import br.com.smallbi.business.TipoBusiness;
import br.com.smallbi.entity.Tipo;

@Path("/tipo")
public class TipoWebService {

	TipoBusiness tipoBusiness = new TipoBusiness();
	Gson gson = new Gson();
	Type type = new TypeToken<Tipo>() {}.getType();
	
	@GET
	@Path("/listar")
	@Produces(MediaType.APPLICATION_JSON)
	public String getTipos(){
		List<Tipo> tipos = tipoBusiness.list();
		List<Hashtable<String, Object>> hashTipos = new ArrayList<>();
		for(Tipo t : tipos){
			hashTipos.add(getHashFromObject(t));
		}
		return gson.toJson(hashTipos);
	}
	
	@POST
	@Path("/adicionar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String addTipo(String json) throws JSONException{
		Tipo tipo = getObjectFromHash(json);
		return gson.toJson(tipoBusiness.create(tipo));
	}
	
	@POST
	@Path("/alterar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String setTipo(String json) throws JSONException{
		Tipo tipo = getObjectFromHash(json);
		return gson.toJson(tipoBusiness.update(tipo));
	}
	
	@GET
	@Path("/deletar/{idTipo}")
	//@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String delTipo(@PathParam("idTipo") String idTipo) throws JSONException{
		/*JSONObject jsonObject = new JSONObject(json);
		Tipo tipo = new Tipo();
		tipo.setIdTipo(jsonObject.getInt("idTipo"));
		return gson.toJson(tipoBusiness.delete(tipo.getIdTipo()));*/
		return gson.toJson(tipoBusiness.delete(Integer.parseInt(idTipo)));
	}
	
	@GET
	@Path("/getById/{idTipo}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getById(@PathParam("idTipo") String idTipo){
		Tipo tipo = tipoBusiness.getObjById(Integer.parseInt(idTipo));
		if(tipo != null){
			return gson.toJson(getHashFromObject(tipo));
		}
		return "Nenhum resultado foi encontrado na tabela Tipo com o id {"+idTipo+"}";
	}
	
	public Hashtable<String, Object> getHashFromObject(Tipo t){
		Hashtable<String, Object> hash = new Hashtable<>();
		hash.put("idTipo", t.getIdTipo());
		hash.put("descricao", t.getTipo());
		return hash;
	}
	
	public Tipo getObjectFromHash(String json) throws JSONException{
		JSONObject jsonObject = new JSONObject(json);
		Tipo t = new Tipo();
		if(!jsonObject.isNull("idTipo")){
			t.setIdTipo(jsonObject.getInt("idTipo"));
		}
		t.setUsuarioId(jsonObject.getInt("usuarioId"));
		t.setTipo(jsonObject.getString("descricao"));
		return t;
	}
}

