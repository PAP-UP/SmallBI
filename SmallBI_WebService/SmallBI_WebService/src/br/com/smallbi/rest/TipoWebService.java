package br.com.smallbi.rest;

import java.lang.reflect.Type;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import br.com.smallbi.business.TipoBusiness;
import br.com.smallbi.business.exception.BusinessException;
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
		return gson.toJson(tipos);
	}
	
	@POST
	@Path("/adicionar")
	@Consumes(MediaType.APPLICATION_JSON)
	public void addTipo(String json){
		Tipo tipo = gson.fromJson(json, type);
		try {
			tipoBusiness.create(tipo);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
	}
	
	@POST
	@Path("/alterar")
	@Consumes(MediaType.APPLICATION_JSON)
	public void setTipo(String json){
		Tipo tipo = gson.fromJson(json, type);
		try {
			tipoBusiness.update(tipo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@POST
	@Path("/deletar")
	@Consumes(MediaType.APPLICATION_JSON)
	public void delTipo(String json){
		Tipo tipo = gson.fromJson(json, type);
		try {
			tipoBusiness.delete(tipo.getIdTipo());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
