package br.com.smallbi.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import br.com.smallbi.business.EstadoBusiness;
import br.com.smallbi.business.exception.BusinessException;
import br.com.smallbi.entity.Estado;

@Path("/estado")
public class EstadoWebService {

	@GET
	@Path("/listar")
	@Produces(MediaType.APPLICATION_JSON)
	public String getEstados(){
		List<Estado> estados = new EstadoBusiness().list();
		Gson gson = new Gson();
		return gson.toJson(estados);
	}
	
	
	//Não funciona!
	@GET
	@Path("/listar2")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Estado> getEstados2(){
		return new EstadoBusiness().list();
	}
	
	@POST
	@Path("/adicionar")
	@Consumes(MediaType.APPLICATION_JSON)
	public void addEstado(Estado estado){
		try {
			new EstadoBusiness().create(estado);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
	}
	
	@POST
	@Path("/atualizar")
	@Consumes(MediaType.APPLICATION_JSON)
	public void alterarEstado(Estado estado){
		try {
			new EstadoBusiness().update(estado);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
	}
}