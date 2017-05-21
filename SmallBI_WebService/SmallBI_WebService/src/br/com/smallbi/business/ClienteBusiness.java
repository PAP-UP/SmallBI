package br.com.smallbi.business;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import br.com.smallbi.dal.ConexaoDao;
import br.com.smallbi.dal.factory.FactoryDao;
import br.com.smallbi.dal.interfaceDal.InterfaceDao;
import br.com.smallbi.entity.Cliente;
import br.com.smallbi.entity.Endereco;
import br.com.smallbi.entity.FormaPagamento;
import br.com.smallbi.entity.Plano;
import br.com.smallbi.entity.RamoAtividade;
import br.com.smallbi.util.Data;

public class ClienteBusiness{

	InterfaceDao<Cliente> clienteDao = FactoryDao.createClienteDao();
	InterfaceDao<Endereco> enderecoDao = FactoryDao.createEnderecoDao();
	InterfaceDao<FormaPagamento> formaPagamentoDao = FactoryDao.createFormaPagamentoDao();
	InterfaceDao<Plano> planoDao = FactoryDao.createPlanoDao();
	InterfaceDao<RamoAtividade> ramoAtividadeDao = FactoryDao.createRamoAtividadeDao();
	
	public JSONObject create(Cliente t){
		
		String msg = new String();
		if(t == null){
			msg = "O objeto não pode ser null!";
		}
		
		if(t.getIdCliente() != null){
			msg = "A variavel ID não pode ser informada na criação de um novo objeto!";
		}
		
		if(t.getCnpj().equals(null) || t.getCnpj().equals("")){
			msg = "A variável 'cnpj' deve ser informada!";
		}else{
			//validar cnpj
		}
		
		if(t.getFormaPagamento() != null){
			if(t.getFormaPagamento().getIdFormaPagamento() != null){
				FormaPagamento formaPagamento = formaPagamentoDao.getObjById(t.getFormaPagamento().getIdFormaPagamento());
				if(formaPagamento == null){
					msg = "Nenhum resultado para a variável 'FormaPagamento' foi encontrado!";
				}
			}else{
				msg = "A variável 'formaPagamento.idFormaPagamento' deve ser informada!";
			}
		}else{
			msg = "A variável 'formaPagamento' deve ser informada!";
		}
		
		if(t.getIe().equals(null) || t.getIe().equals("")){
			msg = "A variável 'ie' deve ser informada!";
		}
		
		if(t.getNomeFantasia().equals(null) || t.getNomeFantasia().equals("")){
			msg = "A variável 'nomeFantasia' deve ser informada!";
		}
		
		if(t.getPlano() != null){
			if(t.getPlano().getIdPlano() != null){
				Plano plano = planoDao.getObjById(t.getPlano().getIdPlano());
				if(plano == null){
					msg = "Nenhum resultado para a variável 'Plano' foi encontrado!";
				}
			}else{
				msg = "A variável 'plano.idPlano' deve ser informada!";
			}
		}else{
			msg ="A variável 'plano' deve ser informada!";
		}
		
		if(t.getRamoAtividade() != null){
			if(t.getRamoAtividade().getIdRamoAtividade() != null){
				RamoAtividade ramoAtividade = ramoAtividadeDao.getObjById(t.getRamoAtividade().getIdRamoAtividade());
				if(ramoAtividade == null){
					msg = "Nenhum resultado para a variável 'RamoAtividade' foi encontrado!";
				}
			}else{
				msg = "A variável 'ramoAtividade.idRamoAtividade' deve ser informada!";
			}
		}else{
			msg = "A variável 'ramoAtividade' deve ser informada!";
		}
		
		if(t.getRazaoSocial().equals(null) || t.getRazaoSocial().equals("")){
			msg = "A variável 'razaoSocial' deve ser informada!";
		}
		
		t.setUsuarioId(1);
		
		t.setDataCadastro(Data.getDate());
		t.setStatus(true);
		//O campo Tamanho Total está definido como NOT NULL;
		t.setTamanhoTotal(0);
		clienteDao.create(t);
		
		boolean result = ConexaoDao.criarDatabaseCliente(t.getNomeFantasia(), t.getIdCliente());
		
		if(result == false){
			msg = "Falha ao criar banco de dados do cliente!";
		}
		
		Integer tamBd = ConexaoDao.getTamanhoBancoCliente(t.getIdCliente());
		if(tamBd <= 0){
			t.setNomeFantasia(t.getNomeFantasia() + "Erro Tam Bd");
			clienteDao.update(t);
			delete(t.getIdCliente());
			msg = "Falha ao definir tamanho do Banco de Dados do cliete";
		}else{
			t.setTamanhoTotal(tamBd);
			clienteDao.update(t);
		}
		
		if("".equals(msg))
			msg = "Cliente cadastrado com sucesso!";
		
		try {
			JSONObject response = new JSONObject().put("message", msg).put("idCliente", t.getIdCliente());
			return response;
		} catch (JSONException e) {
			e.printStackTrace();
			return null;
		}
	}

	
	public List<Cliente> list() {
		List<Cliente> clientes = new ArrayList<>();
		for(Cliente e : clienteDao.list()){
			if(e.isStatus() == true){
				clientes.add(e);
			}
		}
		return clientes;
	}

	
	public JSONObject update(Cliente t){
		
		String msg = new String();
		if(t == null){
			msg = "O objeto não pode ser null!";
		}
		
		if(t.getCnpj().equals(null) || t.getCnpj().equals("")){
			msg = "A variável 'cnpj' deve ser informada!";
		}else{
			//validar cnpj
		}
		
		if(t.getFormaPagamento() != null){
			if(t.getFormaPagamento().getIdFormaPagamento() != null){
				FormaPagamento formaPagamento = formaPagamentoDao.getObjById(t.getFormaPagamento().getIdFormaPagamento());
				if(formaPagamento == null){
					msg = "Nenhum resultado para a variável 'FormaPagamento' foi encontrado!";
				}
			}else{
				msg = "A variável 'formaPagamento.idFormaPagamento' deve ser informada!";
			}
		}else{
			msg = "A variável 'formaPagamento' deve ser informada!";
		}
		
		if(t.getIe().equals(null) || t.getIe().equals("")){
			msg = "A variável 'ie' deve ser informada!";
		}
		
		if(t.getNomeFantasia().equals(null) || t.getNomeFantasia().equals("")){
			msg = "A variável 'nomeFantasia' deve ser informada!";
		}
		
		if(t.getPlano() != null){
			if(t.getPlano().getIdPlano() != null){
				Plano plano = planoDao.getObjById(t.getPlano().getIdPlano());
				if(plano == null){
					msg = "Nenhum resultado para a variável 'Plano' foi encontrado!";
				}
			}else{
				msg = "A variável 'plano.idPlano' deve ser informada!";
			}
		}else{
			msg ="A variável 'plano' deve ser informada!";
		}
		
		if(t.getRamoAtividade() != null){
			if(t.getRamoAtividade().getIdRamoAtividade() != null){
				RamoAtividade ramoAtividade = ramoAtividadeDao.getObjById(t.getRamoAtividade().getIdRamoAtividade());
				if(ramoAtividade == null){
					msg = "Nenhum resultado para a variável 'RamoAtividade' foi encontrado!";
				}
			}else{
				msg = "A variável 'ramoAtividade.idRamoAtividade' deve ser informada!";
			}
		}else{
			msg = "A variável 'ramoAtividade' deve ser informada!";
		}
		
		if(t.getRazaoSocial().equals(null) || t.getRazaoSocial().equals("")){
			msg = "A variável 'razaoSocial' deve ser informada!";
		}
		
		t.setUsuarioId(1);
		
		if(t.getTamanhoTotal() == null)
			t.setTamanhoTotal(0);
		
		t.setDataCadastro(Data.getDate());
		t.setStatus(true);
		
		Integer tamBd = ConexaoDao.getTamanhoBancoCliente(t.getIdCliente());
		if(tamBd <= 0){
			t.setNomeFantasia(t.getNomeFantasia() + "Erro Tam Bd");
			clienteDao.update(t);
			delete(t.getIdCliente());
			msg =  "Falha ao definir tamanho do Banco de Dados do cliete";
		}else{
			t.setTamanhoTotal(tamBd);
			clienteDao.update(t);
		}
		
		if(msg.equals(""))
			msg = "Cliente alterado com sucesso!";
		
		try {
			JSONObject response = new JSONObject().put("message", msg).put("idCliente", t.getIdCliente());
			return response;
		} catch (JSONException e) {
			e.printStackTrace();
			return null;
		}
	}

	
	public String delete(Integer id){
		Cliente cliente = getObjById(id);
		if(cliente == null){
			return "Nenhum resultado foi encontrado na tabela Cliente com o id {"+id+"}";
		}
		clienteDao.delete(cliente);
		return "Empresa deletada com sucesso!";
	}

	
	public Cliente getObjById(Integer id){
		Cliente cliente = clienteDao.getObjById(id);
		if(cliente != null && cliente.isStatus() != false){
			return cliente;
		}
		return null;
	}	
}
