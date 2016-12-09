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

import br.com.smallbi.business.EmpresaBusiness;
import br.com.smallbi.business.exception.BusinessException;
import br.com.smallbi.entity.Empresa;

@Path("/empresa")
public class EmpresaWebService {

	EmpresaBusiness empresaBusiness = new EmpresaBusiness();
	Gson gson = new Gson();
	Type type = new TypeToken<Empresa>() {}.getType();
	
	@GET
	@Path("/listar")
	@Produces(MediaType.APPLICATION_JSON)
	public String getEmpresas(){
		List<Empresa> empresas = empresaBusiness.list();
		return gson.toJson(empresas);
	}
	
	@POST
	@Path("/adicionar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String addEmpresa(String json){
		Empresa empresa = gson.fromJson(json, type);
		try {
			empresaBusiness.create(empresa);
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
	public String setEmpresa(String json){
		Empresa empresa = gson.fromJson(json, type);
		try {
			empresaBusiness.update(empresa);
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
	public String delEmpresa(String json){
		Empresa empresa = gson.fromJson(json, type);
		try {
			empresaBusiness.delete(empresa.getIdEmpresa());
			return gson.toJson(true);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
		return gson.toJson(false);
	}
	
	@GET
	@Path("/getById/{idEmpresa}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getById(@PathParam("idEmpresa") String idEmpresa){
		try {
			Empresa empresa = empresaBusiness.getObjById(Integer.parseInt(idEmpresa));
			return gson.toJson(empresa);
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
}
