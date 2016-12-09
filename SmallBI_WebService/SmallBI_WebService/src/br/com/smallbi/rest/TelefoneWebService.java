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

import br.com.smallbi.business.TelefoneBusiness;
import br.com.smallbi.business.exception.BusinessException;
import br.com.smallbi.entity.Telefone;

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
		return gson.toJson(telefones);
	}
	
	@POST
	@Path("/adicionar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String addTelefone(String json){
		Telefone telefone = gson.fromJson(json, type);
		try {
			telefoneBusiness.create(telefone);
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
	public String setTelefone(String json){
		Telefone telefone = gson.fromJson(json, type);
		try {
			telefoneBusiness.update(telefone);
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
	public String delTelefone(String json){
		Telefone telefone = gson.fromJson(json, type);
		try {
			telefoneBusiness.delete(telefone.getIdTelefone());
			return gson.toJson(true);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
		return gson.toJson(false);
	}
	
	@GET
	@Path("/getById/{idTelefone}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getById(@PathParam("idTelefone") String idTelefone){
		try {
			Telefone telefone = telefoneBusiness.getObjById(Integer.parseInt(idTelefone));
			return gson.toJson(telefone);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
		return "";
	}
}
