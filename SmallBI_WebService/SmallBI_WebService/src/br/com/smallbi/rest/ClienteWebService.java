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

import br.com.smallbi.business.ClienteBusiness;
import br.com.smallbi.entity.Cliente;
import br.com.smallbi.entity.FormaPagamento;
import br.com.smallbi.entity.Plano;
import br.com.smallbi.entity.RamoAtividade;

@Path("/cliente")
public class ClienteWebService {

	ClienteBusiness clienteBusiness = new ClienteBusiness();
	Gson gson = new Gson();
	Type type = new TypeToken<Cliente>() {}.getType();
	
	@GET
	@Path("/listar")
	@Produces(MediaType.APPLICATION_JSON)
	public String getEmpresas(){
		List<Cliente> clientes = clienteBusiness.list();
		List<Hashtable<String, Object>> hashClientes = new ArrayList<>();
		for(Cliente c : clientes){
			hashClientes.add(getHashFromObject(c));
		}
		return gson.toJson(hashClientes);
	}
	
	@POST
	@Path("/adicionar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String addEmpresa(String json) throws JSONException{
		Cliente cliente = getObjectFromHash(json);
		String response = clienteBusiness.create(cliente);
		return gson.toJson(response);
	}
	
	@POST
	@Path("/alterar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String setEmpresa(String json) throws JSONException{
		Cliente cliente = updateGetObjectFromHash(json);
		String response = clienteBusiness.update(cliente);
		return gson.toJson(response);
	}
	
	@DELETE
	@Path("/deletar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String delEmpresa(String json) throws JSONException{
		JSONObject jsonObject = new JSONObject(json);
		Cliente c = new Cliente();
		c.setIdCliente(jsonObject.getInt("idCliente"));
		return gson.toJson(clienteBusiness.delete(c.getIdCliente()));
	}
	
	@GET
	@Path("/getById/{idCliente}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getById(@PathParam("idCliente") String idCliente){
		Cliente cliente = clienteBusiness.getObjById(Integer.parseInt(idCliente));
		if(cliente != null){
			return gson.toJson(getHashFromObject(cliente));
		}
		return gson.toJson("Nenhum resultado foi encontrado na tabela Cliente com o id {"+idCliente+"}");
	}
	
	public Cliente updateGetObjectFromHash(String json) throws JSONException{
		JSONObject jsonObject = new JSONObject(json);
		Cliente c = new Cliente();
		c.setIdCliente(jsonObject.getInt("idCliente"));
		c.setUsuarioId(jsonObject.getInt("usuarioId"));
		c.setRazaoSocial(jsonObject.getString("razaoSocial"));
		c.setNomeFantasia(jsonObject.getString("nomeFantasia"));
		c.setCnpj(jsonObject.getString("cnpj"));
		c.setIe(jsonObject.getString("ie"));
		
		RamoAtividade ramoAtividade = new RamoAtividade();
		ramoAtividade.setIdRamoAtividade(jsonObject.getInt("idRamoAtividade"));
		c.setRamoAtividade(ramoAtividade);
		
		c.setTamanhoTotal(jsonObject.getInt("tamanhoTotal"));
		
		FormaPagamento formaPagamento = new FormaPagamento();
		formaPagamento.setIdFormaPagamento(jsonObject.getInt("idFormaPagamento"));
		c.setFormaPagamento(formaPagamento);
		
		Plano plano = new Plano();
		plano.setIdPlano(jsonObject.getInt("idPlano"));
		c.setPlano(plano);
		return c;
	}
	
	public Cliente getObjectFromHash(String json) throws JSONException{
		JSONObject jsonObject = new JSONObject(json);
		Cliente c = new Cliente();
		c.setUsuarioId(jsonObject.getInt("usuarioId"));
		c.setRazaoSocial(jsonObject.getString("razaoSocial"));
		c.setNomeFantasia(jsonObject.getString("nomeFantasia"));
		c.setCnpj(jsonObject.getString("cnpj"));
		c.setIe(jsonObject.getString("ie"));
		
		RamoAtividade ramoAtividade = new RamoAtividade();
		ramoAtividade.setIdRamoAtividade(jsonObject.getInt("idRamoAtividade"));
		c.setRamoAtividade(ramoAtividade);
		
		c.setTamanhoTotal(jsonObject.getInt("tamanhoTotal"));
		
		FormaPagamento formaPagamento = new FormaPagamento();
		formaPagamento.setIdFormaPagamento(jsonObject.getInt("idFormaPagamento"));
		c.setFormaPagamento(formaPagamento);
		
		Plano plano = new Plano();
		plano.setIdPlano(jsonObject.getInt("idPlano"));
		c.setPlano(plano);
		return c;
	}
	
	public Hashtable<String, Object> getHashFromObject(Cliente c){
		Hashtable<String, Object> hashCliente = new Hashtable<>();
		hashCliente.put("idCliente", c.getIdCliente());
		hashCliente.put("usuarioId", c.getUsuarioId());
		hashCliente.put("razaoSocial", c.getRazaoSocial());
		hashCliente.put("nomeFantasia", c.getNomeFantasia());
		hashCliente.put("cnpj", c.getCnpj());
		hashCliente.put("ie", c.getIe());
		hashCliente.put("ramoAtividade", c.getRamoAtividade().getRamoAtividade());
		hashCliente.put("tamamhoTotal", c.getTamanhoTotal());
		hashCliente.put("formaPagamento", c.getFormaPagamento().getFormaPagamento());
		hashCliente.put("plano", c.getPlano().getNomePlano());
		return hashCliente;
	}
}
