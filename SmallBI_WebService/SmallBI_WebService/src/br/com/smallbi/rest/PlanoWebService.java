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

import br.com.smallbi.business.PlanoBusiness;
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
		List<Hashtable<String, Object>> hashPlanos = new ArrayList<>();
		for(Plano p : planos){
			hashPlanos.add(getHashFromObject(p));
		}
		return gson.toJson(hashPlanos);
	}
	
	@POST
	@Path("/adicionar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String addPlano(String json) throws JSONException{
		Plano plano = getObjectFromHash(json);
		return gson.toJson(planoBusiness.create(plano));
	}
	
	@POST
	@Path("/alterar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String setPlano(String json) throws JSONException{
		Plano plano = getObjectFromHash(json);
		return gson.toJson(planoBusiness.update(plano));
	}
	
	@DELETE
	@Path("/deletar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String delPlano(String json) throws JSONException{
		JSONObject jsonObject = new JSONObject(json);
		Plano plano = new Plano();
		plano.setIdPlano(jsonObject.getInt("idPlano"));
		return gson.toJson(planoBusiness.delete(plano.getIdPlano()));
	}
	
	@GET
	@Path("/getById/{idPlano}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getPlanos(@PathParam("idPlano") String idPlano){
		Plano plano = planoBusiness.getObjById(Integer.parseInt(idPlano));
		if(plano != null){
			return gson.toJson(getHashFromObject(plano));
		}
		return "Nenhum resultado foi encontrado na tabela Plano com o id {"+idPlano+"}";
	}
	
	public Hashtable<String, Object> getHashFromObject(Plano p){
		Hashtable<String, Object> hash = new Hashtable<>();
		hash.put("idPlano", p.getIdPlano());
		hash.put("descricao", p.getNomePlano());
		return hash;
	}
	
	public Plano getObjectFromHash(String json) throws JSONException{
		JSONObject jsonObject = new JSONObject(json);
		Plano p = new Plano();
		if(!jsonObject.isNull("idPlano")){
			p.setIdPlano(jsonObject.getInt("idPlano"));
		}
		p.setUsuarioId(jsonObject.getInt("usuarioId"));
		p.setNomePlano(jsonObject.getString("descricao"));
		return p;
	}
}
