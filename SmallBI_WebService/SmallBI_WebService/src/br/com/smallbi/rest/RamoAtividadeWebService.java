package br.com.smallbi.rest;

import java.lang.reflect.Type;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

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
		return gson.toJson(ramos);
	}
	
	@POST
	@Path("/adicionar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String addRamo(String json){
		RamoAtividade ramoAtividade = gson.fromJson(json, type);
		String response = ramoAtividadeBusiness.create(ramoAtividade);
		return gson.toJson(response);
	}
	
	@POST
	@Path("/alterar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String setRamo(String json){
		RamoAtividade ramoAtividade = gson.fromJson(json, type);
		String response = ramoAtividadeBusiness.update(ramoAtividade);
		return gson.toJson(response);
	}
	
	@POST
	@Path("/deletar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String delRamo(String json){
		RamoAtividade ramoAtividade = gson.fromJson(json, type);
		String response = ramoAtividadeBusiness.delete(ramoAtividade.getIdRamoAtividade());
		return gson.toJson(response);
	}
	
	@GET
	@Path("/getById/{idRamoAtividade}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getById(@PathParam("idRamoAtividade") String idRamoAtividade){
		RamoAtividade ramoAtividade = ramoAtividadeBusiness.getObjById(Integer.parseInt(idRamoAtividade));
		return gson.toJson(ramoAtividade);
	}
}
