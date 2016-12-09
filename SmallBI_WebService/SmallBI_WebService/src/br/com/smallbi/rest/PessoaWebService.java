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

import br.com.smallbi.business.PessoaBusiness;
import br.com.smallbi.business.exception.BusinessException;
import br.com.smallbi.entity.Pessoa;

@Path("/pessoa")
public class PessoaWebService {

	PessoaBusiness pessoaBusiness = new PessoaBusiness();
	Gson gson = new Gson();
	Type type = new TypeToken<Pessoa>() {}.getType();
	
	@GET
	@Path("/listar")
	@Produces(MediaType.APPLICATION_JSON)
	public String getPessoas(){
		List<Pessoa> pessoas = pessoaBusiness.list();
		return gson.toJson(pessoas);
	}
	
	@POST
	@Path("/adicionar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String addPessoa(String json){
		Pessoa pessoa = gson.fromJson(json, type);
		try {
			pessoaBusiness.create(pessoa);
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
	public String setPessoa(String json){
		Pessoa pessoa = gson.fromJson(json, type);
		try {
			pessoaBusiness.update(pessoa);
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
	public String delPessoa(String json){
		Pessoa pessoa = gson.fromJson(json, type);
		try {
			pessoaBusiness.delete(pessoa.getIdPessoa());
			return gson.toJson(true);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
		return gson.toJson(false);
	}
	
	@GET
	@Path("/getById/{idPessoa}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getById(@PathParam("idPessoa") String idPessoa){
		try {
			Pessoa pessoa = pessoaBusiness.getObjById(Integer.parseInt(idPessoa));
			return gson.toJson(pessoa);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
		return "";
	}
}