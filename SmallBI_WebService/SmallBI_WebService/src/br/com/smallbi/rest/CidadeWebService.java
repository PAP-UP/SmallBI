package br.com.smallbi.rest;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.google.gson.Gson;

import br.com.smallbi.business.CidadeBusiness;
import br.com.smallbi.entity.Cidade;
import br.com.smallbi.entity.Estado;

@Path("/cidade")
public class CidadeWebService {
	
	CidadeBusiness cidadeBusiness = new CidadeBusiness();
	Gson gson = new Gson();
//	Type type = new TypeToken<Cidade>() {}.getType();
	
	@GET
	@Path("/listar")
	@Produces(MediaType.APPLICATION_JSON)
	public String getCidade(){
		List<Cidade> cidades = cidadeBusiness.list();
		List<Hashtable<String, Object>> hashCidades = new ArrayList<>();
		for(Cidade c : cidades){
			hashCidades.add(getHashFromObject(c));
		}		
		return gson.toJson(hashCidades);
	}
	
	@POST
	@Path("/listarByIdEstado")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String listCidadeByIdEstado(String json){
		try {
			JSONObject jsonObject = new JSONObject(json);
			int idEstado = jsonObject.getInt("idEstado");
			
			List<Cidade> cidades = cidadeBusiness.list();
			List<Hashtable<String, Object>> hashCidades = new ArrayList<>();
			for(Cidade c : cidades){
				if(c.getEstado().getIdEstado() == idEstado)
					hashCidades.add(getHashFromObject(c));
			}		
			return gson.toJson(hashCidades);
			
		} catch (JSONException e) {
			System.out.println("Ocorreu um erro ao listar as cidade por idEstado " + e.getMessage());
			return "";
		}
	}
	
	@POST
	@Path("/adicionar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String addCidade(String json) throws JSONException{
		Cidade cidade = getObjectFromHash(json);
		return gson.toJson(cidadeBusiness.create(cidade));
	}
		
	@POST
	@Path("/alterar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String setCidade(String json) throws JSONException{
		Cidade cidade = getObjectFromHash(json);
		return gson.toJson(cidadeBusiness.update(cidade));
	}
	
	@GET
	@Path("/deletar/{idCidade}")
	//@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String delCidade(@PathParam("idCidade") String idCidade) throws JSONException{
/*		JSONObject jsonObject = new JSONObject(idCidade);
		Cidade c = new Cidade();
		c.setIdCidade(jsonObject.getInt("idCidade"));		
		return gson.toJson(cidadeBusiness.delete(c.getIdCidade()));*/
		return gson.toJson(cidadeBusiness.delete(Integer.parseInt(idCidade)));
	}
	
	@GET
	@Path("/getById/{idCidade}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getById(@PathParam("idCidade") String idCidade) throws JSONException{
		Cidade cidade = cidadeBusiness.getObjById(Integer.parseInt(idCidade));
		if(cidade != null){
			return gson.toJson(getHashFromObject(cidade));
		}else{
			return gson.toJson("Nenhum resultado foi encontrado na tabela Cidade com o id {"+idCidade+"}");
		}
	}
	
	public Cidade getObjectFromHash(String json) throws JSONException{
		JSONObject jsonObject = new JSONObject(json);
		Cidade c = new Cidade();
		if(!jsonObject.isNull("idCidade")){
			c.setIdCidade(jsonObject.getInt("idCidade"));
		}
		c.setUsuarioId(jsonObject.getInt("usuarioId"));
		c.setNomeCidade(jsonObject.getString("nomeCidade"));
		
		Estado estado = new Estado();
		estado.setIdEstado(jsonObject.getInt("idEstado"));
		c.setEstado(estado);
		return c;
	}
	
	public Hashtable<String, Object> getHashFromObject(Cidade c){
		Hashtable<String, Object> hashCidade = new Hashtable<>();
		hashCidade.put("idCidade", c.getIdCidade().toString());
		hashCidade.put("nomeCidade", c.getNomeCidade());
		hashCidade.put("idEstado", c.getEstado().getIdEstado());
		hashCidade.put("estado", c.getEstado().getNomeEstado());
		return hashCidade;
	}
}
