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

import br.com.smallbi.business.PlanoBusiness;
import br.com.smallbi.business.exception.BusinessException;
import br.com.smallbi.entity.Plano;

@Path("/plano")
public class PlanoWebService {
	
	PlanoBusiness planoBusiness = new PlanoBusiness();
	Gson gson = new Gson();
	Type type = new TypeToken<Plano>() {}.getType();

	@GET
	@Path("/listar")
	@Produces(MediaType.APPLICATION_JSON)
	public String getPlanos(){
		List<Plano> planos = planoBusiness.list();
		return gson.toJson(planos);
	}
	
	@POST
	@Path("/adicionar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String addPlano(String json){
		Plano plano = gson.fromJson(json, type);
		try {
			planoBusiness.create(plano);
			return gson.toJson(true);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
		return gson.toJson(false);
	}
	
	@POST
	@Path("/alterar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String setPlano(String json){
		Plano plano = gson.fromJson(json, type);
		try {
			planoBusiness.update(plano);
			return gson.toJson(true);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
		return gson.toJson(false);
	}
	
	@POST
	@Path("/deletar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String delPlano(String json){
		Plano plano = gson.fromJson(json, type);
		try {
			planoBusiness.delete(plano.getIdPlano());
			return gson.toJson(true);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
		return gson.toJson(false);
	}
	
	@GET
	@Path("/getById/{idPlano}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getPlanos(@PathParam("idPlano") String idPlano){
		try {
			Plano plano = planoBusiness.getObjById(Integer.parseInt(idPlano));
			return gson.toJson(plano);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
		return "";
	}
}