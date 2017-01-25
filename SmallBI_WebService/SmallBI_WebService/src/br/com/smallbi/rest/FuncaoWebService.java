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

import br.com.smallbi.business.FuncaoBusiness;
import br.com.smallbi.entity.Funcao;

@Path("/funcao")
public class FuncaoWebService {

	FuncaoBusiness funcaoBusiness = new FuncaoBusiness();
	Gson gson = new Gson();
	Type type = new TypeToken<Funcao>() {}.getType();
	
	@GET
	@Path("/listar")
	@Produces(MediaType.APPLICATION_JSON)
	public String getFuncoes(){
		List<Funcao> funcoes = funcaoBusiness.list();
		List<Hashtable<String, Object>> hashFuncoes = new ArrayList<>();
		for(Funcao f : funcoes){
			hashFuncoes.add(getHashFromObject(f));
		}
		return gson.toJson(hashFuncoes);
	}
	
	@POST
	@Path("/adicionar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String addFuncao(String json) throws JSONException{
		Funcao funcao = getObjectFromHash(json);
		return gson.toJson(funcaoBusiness.create(funcao));
	}
	
	@POST
	@Path("/alterar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String setFuncao(String json) throws JSONException{
		Funcao funcao = getObjectFromHash(json);
		return gson.toJson(funcaoBusiness.update(funcao));
	}
	
	@DELETE
	@Path("/deletar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String delFuncao(String json) throws JSONException{
		JSONObject jsonObject = new JSONObject(json);
		Funcao funcao = new Funcao();
		funcao.setIdFuncao(jsonObject.getInt("idFuncao"));
		return gson.toJson(funcaoBusiness.delete(funcao.getIdFuncao()));
	}
	
	@GET
	@Path("/getById/{idFuncao}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getById(@PathParam("idFuncao") String idFuncao){
		Funcao funcao = funcaoBusiness.getObjById(Integer.parseInt(idFuncao));
		if(funcao != null){
			return gson.toJson(getHashFromObject(funcao));
		}
		return gson.toJson("Nenhum resultado foi encontrado na tabela Função com o id {"+idFuncao+"}");
	}
	
	public Hashtable<String, Object> getHashFromObject(Funcao f){
		Hashtable<String, Object> hashtable = new Hashtable<>();
		hashtable.put("idFuncao", f.getIdFuncao());
		hashtable.put("descricao", f.getNomeFuncao());
		return hashtable;
	}
	
	public Funcao getObjectFromHash(String json) throws JSONException{
		JSONObject jsonObject = new JSONObject(json);
		Funcao f = new Funcao();
		if(!jsonObject.isNull("idFuncao")){
			f.setIdFuncao(jsonObject.getInt("idFuncao"));
		}
		f.setNomeFuncao(jsonObject.getString("descricao"));
		f.setUsuarioId(jsonObject.getInt("usuarioId"));
		return f;
	}
}
