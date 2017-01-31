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

import br.com.smallbi.business.CuboBusiness;
import br.com.smallbi.entity.Cliente;
import br.com.smallbi.entity.Cubo;


@Path("/cubo")
public class CuboWebService {

	CuboBusiness cuboBusiness = new CuboBusiness();
	Gson gson = new Gson();
	Type type = new TypeToken<Cubo>() {}.getType();
	
	@GET
	@Path("/listar")
	@Produces(MediaType.APPLICATION_JSON)
	public String getCubos(){
		List<Cubo> cubos = cuboBusiness.list();
		List<Hashtable<String, Object>> hashCubos = new ArrayList<>();
		for(Cubo c : cubos){
			hashCubos.add(getHashFromObject(c));
		}
		return gson.toJson(hashCubos);
	}
	
	@POST
	@Path("/adicionar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String addCubo(String json) throws JSONException{
		Cubo cubo = getObjectFromHash(json);
		return gson.toJson(cuboBusiness.create(cubo));
	}
	
	@POST
	@Path("/addCubeFromAssistent")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String addCuboFromAssis(String json) throws JSONException{
		JSONObject jsonObject = new JSONObject(json);
		cuboBusiness.createFromAssistent(jsonObject);
		return "";
	}
	
	@POST
	@Path("/alterar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String setCubo(String json) throws JSONException{
		Cubo cubo = getObjectFromHash(json);
		return gson.toJson(cuboBusiness.update(cubo));
	}
	
	@DELETE
	@Path("/deletar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String delCubo(String json) throws JSONException{
		JSONObject jsonObject = new JSONObject(json);
		Cubo cubo = new Cubo();
		cubo.setIdCubo(jsonObject.getInt("idCubo"));
		return gson.toJson(cuboBusiness.delete(cubo.getIdCubo()));
	}
	
	@GET
	@Path("/getById/{idCubo}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getById(@PathParam("idCubo") String idCubo){
		Cubo cubo = cuboBusiness.getObjById(Integer.parseInt(idCubo));
		if(cubo != null){
			return gson.toJson(getHashFromObject(cubo));
		}
		return "Nenhum resultado foi encontrado na tabela Cubo com o id {"+idCubo+"}";
	}
	
	public Hashtable<String, Object> getHashFromObject(Cubo c){
		Hashtable<String, Object> hash = new Hashtable<>();
		hash.put("idCubo", c.getIdCubo());
		hash.put("nomeCubo", c.getNomeCubo());
		hash.put("cliente", c.getCliente().getNomeFantasia());
		hash.put("mdx", c.getMdx());
		hash.put("tabelaFato", c.getTabelaFato());
		hash.put("tamanho", c.getTamanho());
		return hash;
	}
	
	public Cubo getObjectFromHash(String json) throws JSONException{
		JSONObject jsonObject = new JSONObject(json);
		Cubo c = new Cubo();
		if(!jsonObject.isNull("idCubo")){
			c.setIdCubo(jsonObject.getInt("idCubo"));
		}
		c.setUsuarioId(jsonObject.getInt("usuarioId"));
		c.setNomeCubo(jsonObject.getString("nomeCubo"));
		
		Cliente cliente = new Cliente();
		cliente.setIdCliente(jsonObject.getInt("idCliente"));
		c.setCliente(cliente);
		
		c.setMdx(jsonObject.getString("mdx"));
		c.setTabelaFato(jsonObject.getString("tabelaFato"));
		c.setTamanho(jsonObject.getInt("tamanho"));
		return c;
	}
}
