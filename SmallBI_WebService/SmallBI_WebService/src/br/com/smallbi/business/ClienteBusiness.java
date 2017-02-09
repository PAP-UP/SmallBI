package br.com.smallbi.business;

import java.util.ArrayList;
import java.util.List;

import br.com.smallbi.business.interfaceBusiness.InterfaceBusiness;
import br.com.smallbi.dal.ConexaoDao;
import br.com.smallbi.dal.factory.FactoryDao;
import br.com.smallbi.dal.interfaceDal.InterfaceDao;
import br.com.smallbi.entity.Cliente;
import br.com.smallbi.entity.Endereco;
import br.com.smallbi.entity.FormaPagamento;
import br.com.smallbi.entity.Plano;
import br.com.smallbi.entity.RamoAtividade;
import br.com.smallbi.util.SaikuConnection;
import br.com.smallbi.util.Util;

public class ClienteBusiness implements InterfaceBusiness<Cliente>{

	InterfaceDao<Cliente> clienteDao = FactoryDao.createClienteDao();
	InterfaceDao<Endereco> enderecoDao = FactoryDao.createEnderecoDao();
	InterfaceDao<FormaPagamento> formaPagamentoDao = FactoryDao.createFormaPagamentoDao();
	InterfaceDao<Plano> planoDao = FactoryDao.createPlanoDao();
	InterfaceDao<RamoAtividade> ramoAtividadeDao = FactoryDao.createRamoAtividadeDao();
	
	@Override
	public String create(Cliente t){
		
		if(t == null){
			return "O objeto não pode ser null!";
		}
		
		if(t.getIdCliente() != null){
			return "A variavel ID não pode ser informada na criação de um novo objeto!";
		}
		
		if(t.getCnpj().equals(null) || t.getCnpj().equals("")){
			return "A variável 'cnpj' deve ser informada!";
		}else{
			//validar cnpj
		}
		
		if(t.getFormaPagamento() != null){
			if(t.getFormaPagamento().getIdFormaPagamento() != null){
				FormaPagamento formaPagamento = formaPagamentoDao.getObjById(t.getFormaPagamento().getIdFormaPagamento());
				if(formaPagamento == null){
					return "Nenhum resultado para a variável 'FormaPagamento' foi encontrado!";
				}
			}else{
				return "A variável 'formaPagamento.idFormaPagamento' deve ser informada!";
			}
		}else{
			return "A variável 'formaPagamento' deve ser informada!";
		}
		
		if(t.getIe().equals(null) || t.getIe().equals("")){
			return "A variável 'ie' deve ser informada!";
		}
		
		if(t.getNomeFantasia().equals(null) || t.getNomeFantasia().equals("")){
			return "A variável 'nomeFantasia' deve ser informada!";
		}
		
		if(t.getPlano() != null){
			if(t.getPlano().getIdPlano() != null){
				Plano plano = planoDao.getObjById(t.getPlano().getIdPlano());
				if(plano == null){
					return "Nenhum resultado para a variável 'Plano' foi encontrado!";
				}
			}else{
				return "A variável 'plano.idPlano' deve ser informada!";
			}
		}else{
			return "A variável 'plano' deve ser informada!";
		}
		
		if(t.getRamoAtividade() != null){
			if(t.getRamoAtividade().getIdRamoAtividade() != null){
				RamoAtividade ramoAtividade = ramoAtividadeDao.getObjById(t.getRamoAtividade().getIdRamoAtividade());
				if(ramoAtividade == null){
					return "Nenhum resultado para a variável 'RamoAtividade' foi encontrado!";
				}
			}else{
				return "A variável 'ramoAtividade.idRamoAtividade' deve ser informada!";
			}
		}else{
			return "A variável 'ramoAtividade' deve ser informada!";
		}
		
		if(t.getRazaoSocial().equals(null) || t.getRazaoSocial().equals("")){
			return "A variável 'razaoSocial' deve ser informada!";
		}
		
		if(t.getTamanhoTotal() == null){
			return "A variável 'tamahoTotal' deve ser informada!";
		}
		
		if(t.getUsuarioId() == null){
			return "A variável 'usuarioId' deve ser informada!";
		}
		
		t.setDataCadastro(Util.getDate());
		t.setStatus(true);
		
		clienteDao.create(t);
		
		ConexaoDao.criarDatabase(t.getNomeFantasia(), t.getIdCliente());
		
		return "Cliente cadastrado com sucesso!";
	}

	@Override
	public List<Cliente> list() {
		List<Cliente> clientes = new ArrayList<>();
		for(Cliente e : clienteDao.list()){
			if(e.isStatus() == true){
				clientes.add(e);
			}
		}
		return clientes;
	}

	@Override
	public String update(Cliente t){
		
		if(t == null){
			return "O objeto não pode ser null!";
		}
		
		if(t.getIdCliente() == null){
			return "A variável 'idEmpresa' deve ser informada!";
		}else{
			Cliente cliente = clienteDao.getObjById(t.getIdCliente());
			if(cliente == null){
				return "Nenhum resultado para a variável 'empresa' foi encontrado!";
			}
		}
		
		if(t.getCnpj().equals(null) || t.getCnpj().equals("")){
			return "A variável 'cnpj' deve ser informada!";
		}else{
			//validar cnpj
		}
		
		if(t.getFormaPagamento() != null){
			if(t.getFormaPagamento().getIdFormaPagamento() != null){
				FormaPagamento formaPagamento = formaPagamentoDao.getObjById(t.getFormaPagamento().getIdFormaPagamento());
				if(formaPagamento == null){
					return "Nenhum resultado para a variável 'FormaPagamento' foi encontrado!";
				}
			}else{
				return "A variável 'formaPagamento.idFormaPagamento' deve ser informada!";
			}
		}else{
			return "A variável 'formaPagamento' deve ser informada!";
		}
		
		if(t.getIe().equals(null) || t.getIe().equals("")){
			return "A variável 'ie' deve ser informada!";
		}
		
		if(t.getNomeFantasia().equals(null) || t.getNomeFantasia().equals("")){
			return "A variável 'nomeFantasia' deve ser informada!";
		}
		
		if(t.getPlano() != null){
			if(t.getPlano().getIdPlano() != null){
				Plano plano = planoDao.getObjById(t.getPlano().getIdPlano());
				if(plano == null){
					return "Nenhum resultado para a variável 'Plano' foi encontrado!";
				}
			}else{
				return "A variável 'plano.idPlano' deve ser informada!";
			}
		}else{
			return "A variável 'plano' deve ser informada!";
		}
		
		if(t.getRamoAtividade() != null){
			if(t.getRamoAtividade().getIdRamoAtividade() != null){
				RamoAtividade ramoAtividade = ramoAtividadeDao.getObjById(t.getRamoAtividade().getIdRamoAtividade());
				if(ramoAtividade == null){
					return "Nenhum resultado para a variável 'RamoAtividade' foi encontrado!";
				}
			}else{
				return "A variável 'ramoAtividade.idRamoAtividade' deve ser informada!";
			}
		}else{
			return "A variável 'ramoAtividade' deve ser informada!";
		}
		
		if(t.getRazaoSocial().equals(null) || t.getRazaoSocial().equals("")){
			return "A variável 'razaoSocial' deve ser informada!";
		}
		
		if(t.getTamanhoTotal() == null){
			return "A variável 'tamahoTotal' deve ser informada!";
		}
		
		if(t.getUsuarioId() == null){
			return "A variável 'usuarioId' deve ser informada!";
		}
		
		t.setDataCadastro(Util.getDate());
		t.setStatus(true);
		
		clienteDao.update(t);
		return "Empresa alterada com sucesso!";
	}

	@Override
	public String delete(Integer id){
		Cliente cliente = getObjById(id);
		if(cliente == null){
			return "Nenhum resultado foi encontrado na tabela Cliente com o id {"+id+"}";
		}
		clienteDao.delete(cliente);
		return "Empresa deletada com sucesso!";
	}

	@Override
	public Cliente getObjById(Integer id){
		Cliente cliente = clienteDao.getObjById(id);
		if(cliente != null && cliente.isStatus() != false){
			return cliente;
		}
		return null;
	}
}
