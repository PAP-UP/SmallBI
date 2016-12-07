package br.com.smallbi.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import br.com.smallbi.business.EstadoBusiness;
import br.com.smallbi.business.exception.BusinessException;
import br.com.smallbi.entity.Estado;

@Path("/estado")
public class EstadoWebService {

	EstadoBusiness estadoBusiness = new EstadoBusiness();	
	
	@GET
	@Path("/listar")
	@Produces(MediaType.APPLICATION_JSON)
	public String getEstados(){
		List<Estado> estados = estadoBusiness.list();
		Gson gson = new Gson();
		return gson.toJson(estados);
	}	
	
	@POST
	@Path("/adicionar")
	@Consumes(MediaType.APPLICATION_JSON)
	public void addEstado(String json){		
		Gson gson = new Gson();
		Type type = new TypeToken<Estado>() {}.getType();
		Estado estado = gson.fromJson(json, type);
		try {
			estadoBusiness.create(estado);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
	}
	
	@POST
	@Path("/alterar")
	@Consumes(MediaType.APPLICATION_JSON)
	public void setEstado(String json){
		Gson gson = new Gson();
		Type type = new TypeToken<Estado>() {}.getType();
		Estado estado = gson.fromJson(json, type);
		try {
			estadoBusiness.update(estado);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
	}
	
	@POST
	@Path("/deletar")
	@Consumes(MediaType.APPLICATION_JSON)
	public void delEstado(String json){
		Gson gson = new Gson();
		Type type = new TypeToken<Estado>() {}.getType();
		Estado estado = gson.fromJson(json, type);
		try {
			estadoBusiness.delete(estado.getIdEstado());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Não funciona!
/*	@GET
	@Path("/listar2")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Estado> getEstados2(){
		return new EstadoBusiness().list();
	}*/
}
