package br.com.smallbi.rest;

import java.lang.reflect.Type;
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
import com.google.gson.reflect.TypeToken;

import br.com.smallbi.business.CuboBusiness;
import br.com.smallbi.entity.Cliente;
import br.com.smallbi.entity.Cubo;
import br.com.smallbi.util.SaikuConnection;


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
	@Path("/listarByIdCliente")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String getCubosByIdCliente(String json) throws JSONException{
		List<Cubo> cubos = cuboBusiness.list();
		JSONObject jsonObject = new JSONObject(json);
		int idCliente = jsonObject.getInt("idCliente");
		List<Hashtable<String, Object>> hashCubos = new ArrayList<>();
		for(Cubo c : cubos){
			if(c.getCliente().getIdCliente() == idCliente)
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
		String response = cuboBusiness.createFromAssistent(jsonObject);
		jsonObject = new JSONObject().put("msg", response);
		return jsonObject.toString();
	}
	
	@POST
	@Path("/analisar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String analisarCubo(String json) throws JSONException{
		Cubo cubo = new Cubo();
		JSONObject jsonObject;
		try{
			jsonObject = new JSONObject(json);
		}catch(Exception e){
			System.out.println("O objeto json com o atributo idCubo deve ser informado! Verifique "
					+ "se o objeto está sendo criado corretamente!");
			
			return gson.toJson("O objeto json com o atributo idCubo deve ser informado! Verifique "
					+ "se o objeto está sendo criado corretamente!");
		}
		
		if(!jsonObject.isNull("idCubo")){
			cubo = cuboBusiness.getObjById(jsonObject.getInt("idCubo"));
		}else{
			System.out.println("O objeto json com o atributo idCubo deve ser informado! Verifique "
					+ "se o objeto está sendo criado corretamente!");
			
			return gson.toJson("O objeto json com o atributo idCubo deve ser informado! Verifique "
					+ "se o objeto está sendo criado corretamente!");
		}
		
		if(cubo != null){
			boolean mdxSalvo = SaikuConnection.saveSchemaInSaikuServer(cubo.getCliente().getIdCliente(),
					cubo.getNomeCubo(), cubo.getMdx());
			
			if(mdxSalvo){
				int code = SaikuConnection.addDatasourceSaiku(cubo.getCliente().getIdCliente(), cubo.getNomeCubo());
				switch(code){
					case 200:
						return gson.toJson("Cubo adicionado com sucesso!\n"
								+ "Entre com seu usuário em smallbi.com.br para analisar seus dados!");
					case 404:
						return gson.toJson("Falha ao adicionar datasource no Saiku. Servidor Saiku não encontrado ou indisponível!");
					case 500:
						return gson.toJson("Falha ao adicionar datasource no Saiku. Erro interno no Saiku API!");
				}
			}else{
				return gson.toJson("Falha ao salvar MDX no servidor!");
			}
			
		}else{
			return gson.toJson("Nenhum cubo encontrado com esse nome!");
		}
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
	
	@GET
	@Path("/deletar/{idCubo}")
	//@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String delCubo(@PathParam("idCubo") String idCubo) throws JSONException{
		/*JSONObject jsonObject = new JSONObject(json);
		Cubo cubo = new Cubo();
		cubo.setIdCubo(jsonObject.getInt("idCubo"));
		return gson.toJson(cuboBusiness.delete(cubo.getIdCubo()));*/
		return gson.toJson(cuboBusiness.delete(Integer.parseInt(idCubo)));
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
		hash.put("idCliente", c.getCliente().getIdCliente());
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
