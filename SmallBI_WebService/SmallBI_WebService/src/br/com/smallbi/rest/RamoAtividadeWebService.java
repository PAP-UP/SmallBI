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

import br.com.smallbi.business.RamoAtividadeBusiness;
import br.com.smallbi.entity.RamoAtividade;

@Path("/ramoAtividade")
public class RamoAtividadeWebService {

	RamoAtividadeBusiness ramoAtividadeBusiness = new RamoAtividadeBusiness();
	Gson gson = new Gson();
	Type type = new TypeToken<RamoAtividade>() {}.getType();
	
	@GET
	@Path("/listar")
	@Produces(MediaType.APPLICATION_JSON)
	public String getRamos(){
		List<RamoAtividade> ramos = ramoAtividadeBusiness.list();
		List<Hashtable<String, Object>> hashtables = new ArrayList<>();
		for(RamoAtividade r : ramos){
			hashtables.add(getHashFromObject(r));
		}
		return gson.toJson(hashtables);
	}
	
	@POST
	@Path("/adicionar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String addRamo(String json) throws JSONException{
		RamoAtividade ramoAtividade = getObjectFromHash(json);
		return gson.toJson(ramoAtividadeBusiness.create(ramoAtividade));
	}
	
	@POST
	@Path("/alterar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String setRamo(String json) throws JSONException{
		RamoAtividade ramoAtividade = getObjectFromHash(json);
		return gson.toJson(ramoAtividadeBusiness.update(ramoAtividade));
	}
	
	@GET
	@Path("/deletar/{idRamoAtividade}")
	//@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String delRamo(@PathParam("idRamoAtividade") String idRamoAtividade) throws JSONException{
		/*JSONObject jsonObject = new JSONObject(json);
		RamoAtividade ramoAtividade = new RamoAtividade();
		ramoAtividade.setIdRamoAtividade(jsonObject.getInt("idRamoAtividade"));
		return gson.toJson(ramoAtividadeBusiness.delete(ramoAtividade.getIdRamoAtividade()));*/
		return gson.toJson(ramoAtividadeBusiness.delete(Integer.parseInt(idRamoAtividade)));
	}
	
	@GET
	@Path("/getById/{idRamoAtividade}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getById(@PathParam("idRamoAtividade") String idRamoAtividade){
		RamoAtividade ramoAtividade = ramoAtividadeBusiness.getObjById(Integer.parseInt(idRamoAtividade));
		if(ramoAtividade != null){
			return gson.toJson(getHashFromObject(ramoAtividade));
		}
		return "Nenhum resultado foi encontrado na tabela RamoAtividade com o id {"+idRamoAtividade+"}";
	}
	
	public Hashtable<String, Object> getHashFromObject(RamoAtividade ra){
		Hashtable<String, Object> hash = new Hashtable<>();
		hash.put("idRamoAtividade", ra.getIdRamoAtividade());
		hash.put("descricao", ra.getRamoAtividade());
		return hash;
	}
	
	public RamoAtividade getObjectFromHash(String json) throws JSONException{
		JSONObject jsonObject = new JSONObject(json);
		RamoAtividade ra = new RamoAtividade();
		if(!jsonObject.isNull("idRamoAtividade")){
			ra.setIdRamoAtividade(jsonObject.getInt("idRamoAtividade"));
		}
		ra.setUsuarioId(jsonObject.getInt("usuarioId"));
		ra.setRamoAtividade(jsonObject.getString("descricao"));
		return ra;
	}
}
