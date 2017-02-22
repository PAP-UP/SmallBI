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
import br.com.smallbi.business.EnderecoBusiness;
import br.com.smallbi.business.TelefoneBusiness;
import br.com.smallbi.entity.Cliente;
import br.com.smallbi.entity.Endereco;
import br.com.smallbi.entity.FormaPagamento;
import br.com.smallbi.entity.Plano;
import br.com.smallbi.entity.RamoAtividade;
import br.com.smallbi.entity.Telefone;

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
		
		appendEnderecoTelefone(json, cliente.getIdCliente(), cliente.getUsuarioId());
		
		return gson.toJson(response);
	}
	
	@POST
	@Path("/alterar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String setEmpresa(String json) throws JSONException{
		Cliente cliente = getObjectFromHash(json);
		String response = clienteBusiness.update(cliente);
		
		if(response.equals("Cliente cadastrado com sucesso!")){
			appendEnderecoTelefone(json, cliente.getIdCliente(), cliente.getUsuarioId());
		}
		
		return gson.toJson(response);
	}
	
	@DELETE
	@Path("/deletar/{idCliente}")
	//@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String delEmpresa(@PathParam("idCliente") String idCliente) throws JSONException{
		/*JSONObject jsonObject = new JSONObject(json);
		Cliente c = new Cliente();
		c.setIdCliente(jsonObject.getInt("idCliente"));
		return gson.toJson(clienteBusiness.delete(c.getIdCliente()));*/
		return gson.toJson(clienteBusiness.delete(Integer.parseInt(idCliente)));
	}
	
	@GET
	@Path("/getById/{idCliente}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getById(@PathParam("idCliente") String idCliente){
		Cliente cliente = clienteBusiness.getObjById(Integer.parseInt(idCliente));
		if(cliente != null){
			return gson.toJson(getHashById(cliente));
		}
		return gson.toJson("Nenhum resultado foi encontrado na tabela Cliente com o id {"+idCliente+"}");
	}
	
	public Hashtable<String, Object> getHashById(Cliente c){
		Hashtable<String, Object> hash = new Hashtable<>();
		hash.put("idCliente", c.getIdCliente());
		hash.put("razaoSocial", c.getRazaoSocial());
		hash.put("nomeFantasia", c.getNomeFantasia());
		hash.put("cnpj", c.getCnpj());
		hash.put("ie", c.getIe());
		hash.put("idRamoAtividade", c.getRamoAtividade().getIdRamoAtividade());
		hash.put("tamanhoTotal", c.getTamanhoTotal());
		hash.put("idFormaPagamento", c.getFormaPagamento().getIdFormaPagamento());
		hash.put("idPlano", c.getPlano().getIdPlano());
		
		Endereco e = new EnderecoBusiness().getByCliente(c.getIdCliente());
		if(e != null){
			hash.put("idEndereco", e.getIdEndereco());
			hash.put("endereco", e.getEndereco());
			hash.put("numero", e.getNumero());
			hash.put("bairro", e.getBairro());
			hash.put("idCidade", e.getCidade().getIdCidade());
			hash.put("nomeCidade", e.getCidade().getNomeCidade());
			hash.put("idTipoEndereco", e.getTipo().getIdTipo());
		}
		
		Telefone t = new TelefoneBusiness().getByCliente(c.getIdCliente());
		if(t != null){
			hash.put("idTelefone", t.getIdTelefone());
//			hash.put("idTipoTelefone", t.getTipo().getIdTipo());
//			hash.put("ddd", t.getDdd());
			hash.put("telefone", t.getTelefone());
		}
		return hash;
	}
	
	public Cliente getObjectFromHash(String json) throws JSONException{
		JSONObject jsonObject = new JSONObject(json);
		Cliente c = new Cliente();
		if(!jsonObject.isNull("idCliente")){
			c.setIdCliente(jsonObject.getInt("idCliente"));
		}
		c.setUsuarioId(jsonObject.getInt("usuarioId"));
		c.setRazaoSocial(jsonObject.getString("razaoSocial"));
		c.setNomeFantasia(jsonObject.getString("nomeFantasia"));
		c.setCnpj(jsonObject.getString("cnpj"));
		c.setIe(jsonObject.getString("ie"));
		
		RamoAtividade ramoAtividade = new RamoAtividade();
		ramoAtividade.setIdRamoAtividade(jsonObject.getInt("idRamoAtividade"));
		c.setRamoAtividade(ramoAtividade);
		
		//c.setTamanhoTotal(jsonObject.getInt("tamanhoTotal"));
		
		FormaPagamento formaPagamento = new FormaPagamento();
		formaPagamento.setIdFormaPagamento(jsonObject.getInt("idFormaPagamento"));
		c.setFormaPagamento(formaPagamento);
		
		Plano plano = new Plano();
		plano.setIdPlano(jsonObject.getInt("idPlano"));
		c.setPlano(plano);
		return c;
	}
	
	public void appendEnderecoTelefone(String json, int idCliente, int usuarioId) throws JSONException{
		
		JSONObject jsonObject = new JSONObject(json);
		jsonObject.put("idCliente", idCliente);
		
		if(!jsonObject.isNull("idPessoa")){
			jsonObject.remove("idPessoa");
		}		
		
		//AGUARDANDO DEFINIÇÃO
		if(!jsonObject.isNull("endereco")){
			jsonObject.put("idTipoEndereco", 2);
			new EnderecoWebService().addEndereco(jsonObject.toString());
		}
/*		if(jsonObject.isNull("idEndereco")){
			new EnderecoWebService().addEndereco(jsonObject.toString());
		}else{
			new EnderecoWebService().setEndereco(jsonObject.toString());
		}*/
		
		jsonObject.put("idTipoTelefone", 2);
		if(jsonObject.isNull("idTelefone")){
			new TelefoneWebService().addTelefone(jsonObject.toString());
		}else{
			new TelefoneWebService().setTelefone(jsonObject.toString());
		}		
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
