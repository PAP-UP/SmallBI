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
		return gson.toJson(estados);
	}	
	
	@POST
	@Path("/adicionar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String addEstado(String json){		
		Estado estado = gson.fromJson(json, type);
		String response = estadoBusiness.create(estado);
		return gson.toJson(response);
	}
	
	@POST
	@Path("/alterar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String setEstado(String json){
		Estado estado = gson.fromJson(json, type);
		String response = estadoBusiness.update(estado);
		return gson.toJson(response);
	}
	
	@POST
	@Path("/deletar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String delEstado(String json){
		Estado estado = gson.fromJson(json, type);
		String response = estadoBusiness.delete(estado.getIdEstado());
		return gson.toJson(response);
	}
	
	@GET
	@Path("/getById/{idEstado}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getById(@PathParam("idEstado") String idEstado){
		Estado estado = estadoBusiness.getObjById(Integer.parseInt(idEstado));
		return gson.toJson(estado);
	}
}
