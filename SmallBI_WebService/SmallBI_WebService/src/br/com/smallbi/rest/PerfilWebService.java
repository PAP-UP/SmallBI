package br.com.smallbi.rest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
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

import br.com.smallbi.business.PerfilBusiness;
import br.com.smallbi.entity.Perfil;

@Path("/perfil")
public class PerfilWebService {

	PerfilBusiness perfilBusiness = new PerfilBusiness();
	Gson gson = new Gson();
	Type type = new TypeToken<Perfil>() {}.getType();
	
	@GET
	@Path("/listar")
	@Produces(MediaType.APPLICATION_JSON)
	public String getPerfis(){
		List<Perfil> perfis = perfilBusiness.list();
		List<Hashtable<String, Object>> hashPerfis = new ArrayList<>();
		for(Perfil p : perfis){
			hashPerfis.add(getHashFromObject(p));
		}
		return gson.toJson(hashPerfis);
	}
	
	@POST
	@Path("/adicionar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String addPerfil(String json) throws JSONException{
		Perfil perfil = getObjectFromHash(json);
		return gson.toJson(perfilBusiness.create(perfil));
	}
	
	@POST
	@Path("/alterar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String setPerfil(String json) throws JSONException{
		Perfil perfil = getObjectFromHash(json);
		return gson.toJson(perfilBusiness.update(perfil));
	}
	
	@DELETE
	@Path("/deletar/{idPerfil}")
	//@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String delPerfil(@PathParam("idPerfil") String idPerfil) throws JSONException{
		/*JSONObject jsonObject = new JSONObject(json);
		Perfil perfil = new Perfil();
		perfil.setIdPerfil(jsonObject.getInt("idPerfil"));
		return gson.toJson(perfilBusiness.delete(perfil.getIdPerfil()));*/
		return gson.toJson(perfilBusiness.delete(Integer.parseInt(idPerfil)));
	}
	
	@GET
	@Path("/getById/{idPerfil}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getById(@PathParam("idPerfil") String idPerfil){
		Perfil perfil = perfilBusiness.getObjById(Integer.parseInt(idPerfil));
		if(perfil != null){
			return gson.toJson(getHashFromObject(perfil));
		}
		return "Nenhum resultado foi encontrado na tabela Perfil com o id {"+idPerfil+"}";
	}
	
	public Hashtable<String, Object> getHashFromObject(Perfil p){
		Hashtable<String, Object> hash = new Hashtable<>();
		hash.put("idPerfil", p.getIdPerfil());
		hash.put("descricao", p.getNomePerfil());
		return hash;
	}
	
	public Perfil getObjectFromHash(String json) throws JSONException{
		JSONObject jsonObject = new JSONObject(json);
		Perfil p = new Perfil();
		if(!jsonObject.isNull("idPerfil")){
			p.setIdPerfil(jsonObject.getInt("idPerfil"));
		}
		p.setUsuarioId(jsonObject.getInt("usuarioId"));
		p.setNomePerfil(jsonObject.getString("descricao"));
		return p;
	}
}
