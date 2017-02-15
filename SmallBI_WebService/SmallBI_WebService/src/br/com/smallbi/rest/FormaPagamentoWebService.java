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

import br.com.smallbi.business.FormaPagamentoBusiness;
import br.com.smallbi.entity.FormaPagamento;

@Path("/formaPagamento")
public class FormaPagamentoWebService {

	FormaPagamentoBusiness formaPagamentoBusiness = new FormaPagamentoBusiness();
	Gson gson = new Gson();
	Type type = new TypeToken<FormaPagamento>() {}.getType();
	
	@GET
	@Path("/listar")
	@Produces(MediaType.APPLICATION_JSON)
	public String getFormasPag(){
		List<FormaPagamento> formas = formaPagamentoBusiness.list();
		List<Hashtable<String, Object>> hashFps = new ArrayList<>();
		for(FormaPagamento fp : formas){
			hashFps.add(getHashFromObject(fp));
		}
		return gson.toJson(hashFps);
	}
	
	@POST
	@Path("/adicionar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String addFormaPag(String json) throws JSONException{
		FormaPagamento forma = getObjectFromHash(json);
		return gson.toJson(formaPagamentoBusiness.create(forma));
	}
	
	@POST
	@Path("/alterar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String setFormaPag(String json) throws JSONException{
		FormaPagamento forma = getObjectFromHash(json);
		return gson.toJson(formaPagamentoBusiness.update(forma));
	}
	
	@DELETE
	@Path("/deletar/{idFormaPagamento}")
//	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String delFormaPag(@PathParam("idFormaPagamento") String idFormaPagamento) throws JSONException {
		/*JSONObject jsonObject = new JSONObject(json);
		FormaPagamento forma = new FormaPagamento();
		forma.setIdFormaPagamento(jsonObject.getInt("idFormaPagamento"));
		return gson.toJson(formaPagamentoBusiness.delete(forma.getIdFormaPagamento()));*/
		return gson.toJson(formaPagamentoBusiness.delete(Integer.parseInt(idFormaPagamento)));
	}
	
	@GET
	@Path("/getById/{idFormaPagamento}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getById(@PathParam("idFormaPagamento") String idFormaPagamento){
		FormaPagamento forma = formaPagamentoBusiness.getObjById(Integer.parseInt(idFormaPagamento));
		if(forma != null){
			return gson.toJson(getHashFromObject(forma));
		}
		return gson.toJson("Nenhum resultado foi encontrado na tabela FormaPagamento com o id {"+idFormaPagamento+"}");
	}
	
	public Hashtable<String, Object> getHashFromObject(FormaPagamento fp){
		Hashtable<String, Object> hashtable = new Hashtable<>();
		hashtable.put("idFormaPagamaneto", fp.getIdFormaPagamento());
		hashtable.put("descricao", fp.getFormaPagamento());
		return hashtable;
	}
	
	public FormaPagamento getObjectFromHash(String json) throws JSONException{
		JSONObject jsonObject = new JSONObject(json);
		FormaPagamento fp = new FormaPagamento();
		if(!jsonObject.isNull("idFormaPagamento")){
			fp.setIdFormaPagamento(jsonObject.getInt("idFormaPagamento"));
		}
		fp.setUsuarioId(jsonObject.getInt("usuarioId"));
		fp.setFormaPagamento(jsonObject.getString("descricao"));
		return fp;
	}
}
