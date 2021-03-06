package br.com.smallbi.business;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import br.com.smallbi.dal.factory.FactoryDao;
import br.com.smallbi.dal.interfaceDal.InterfaceDao;
import br.com.smallbi.entity.Cliente;
import br.com.smallbi.entity.Endereco;
import br.com.smallbi.entity.Funcao;
import br.com.smallbi.entity.Pessoa;
import br.com.smallbi.util.Data;

public class PessoaBusiness {

	InterfaceDao<Pessoa> pessoaDao = FactoryDao.createPessoaDao();
	InterfaceDao<Endereco> enderecoDao = FactoryDao.createEnderecoDao();
	InterfaceDao<Funcao> funcaoDao = FactoryDao.createFuncaoDao();
	InterfaceDao<Cliente> clienteDao = FactoryDao.createClienteDao();
	
	public JSONObject create(Pessoa t){
		
		String msg = new String();
		if(t == null){
			/*return "O objeto não pode ser null!";*/
			msg = "O objeto não pode ser null!";
		}
		
		if(t.getIdPessoa() != null){
			/*return "A variavel ID não pode ser informada na criação de um novo objeto!";*/
			msg = "A variavel ID não pode ser informada na criação de um novo objeto!";
		}
		
		if(t.getCpf().equals(null) || t.getCpf().equals("")){
			/*return "A variável 'cpf' deve ser informada!";*/
			msg = "A variável 'cpf' deve ser informada!";
		}else{
			//VALIDAR CPF
		}
		
		if(t.getCliente() != null){
			if(t.getCliente().getIdCliente() != null){
				Cliente cliente = clienteDao.getObjById(t.getCliente().getIdCliente());
				if(cliente == null){
					/*return "Nenhum resultado para a variável 'cliente' foi encontrado!";*/
					msg = "Nenhum resultado para a variável 'cliente' foi encontrado!";
				}
			}else{
				/*return "A variável 'cliente.idCliente' deve ser informada!";*/
				msg = "A variável 'cliente.idCliente' deve ser informada!";
			}
		}else{
			/*return "A variável 'cliente' deve ser informada!";*/
			msg = "A variável 'cliente' deve ser informada!";
		}
		
		if(t.getFuncao() != null){
			if(t.getFuncao().getIdFuncao() != null){
				Funcao funcao = funcaoDao.getObjById(t.getFuncao().getIdFuncao());
				if(funcao == null){
					/*return "Nenhum resultado para a variável 'funcao' foi encontrado!";*/
					msg = "Nenhum resultado para a variável 'funcao' foi encontrado!";
				}
			}else{
				/*return "A variável 'funcao.idFuncao' deve ser informada!";*/
				msg = "A variável 'funcao.idFuncao' deve ser informada!";
			}
		}else{
			/*return "A variável 'funcao' deve ser informada!";*/
			msg = "A variável 'funcao' deve ser informada!";
		}
		
		if(t.getNome().equals(null) || t.getNome().equals("")){
			/*return "A variável 'nome' deve ser informada!";*/
			msg = "A variável 'nome' deve ser informada!";
		}
		
		if(t.getRg().equals(null) || t.getRg().equals("")){
			/*return "A variável 'rg' deve ser informada!";*/
			msg = "A variável 'rg' deve ser informada!";
		}else{
			//VALIDAR RG
		}
		
		/*if(t.getUsuarioId() == null){
			return "A variável 'usuarioId' deve ser informada!";
		}*/	
		
		t.setUsuarioId(1);
		
		t.setDataCadastro(Data.getDate());
		t.setStatus(true);
		
		pessoaDao.create(t);
		if(msg != null && !msg.equals(""))
			msg = "Pessoa cadastrada com sucesso!";
		
		try {
			JSONObject jsonObject = new JSONObject().put("msg", msg);
			return jsonObject;
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		/*return "Pessoa cadastrada com sucesso! => ID: " + t.getIdPessoa();*/
	}

	public List<Pessoa> list() {
		List<Pessoa> pessoas = new ArrayList<>();
		for(Pessoa p : pessoaDao.list()){
			if(p.isStatus() == true){
				pessoas.add(p);
			}
		}
		return pessoas;
	}

	public String update(Pessoa t){
		
		if(t == null){
			return "O objeto não pode ser null!";
		}
		
		if(t.getIdPessoa() == null){
			return "A variável 'idPessoa' deve ser informada!";
		}else{
			Pessoa pessoa = pessoaDao.getObjById(t.getIdPessoa());
			if(pessoa == null){
				return "Nenhum resultado para a variável 'pessoa' foi encontrado!";
			}
		}
		
		if(t.getCpf().equals(null) || t.getCpf().equals("")){
			return "A variável 'cpf' deve ser informada!";
		}else{
			//VALIDAR CPF
		}
		
/*		if(t.getDataCadastro() == null){
			throw new BusinessException("A variável 'dataCadastro' deve ser informada!");
		}*/
		
		/*Retirado o endereço da pessoa, pois estava invertido, uma pessoa tem vários endereços, um endereço tem uma pessoa.
		 * if(t.getEndereco() != null){
			if(t.getEndereco().getIdEndereco() != null){
				Endereco endereco = enderecoDao.getObjById(t.getEndereco().getIdEndereco());
				if(endereco == null){
//					throw new BusinessException("Nenhum resultado para a variável 'endereco' foi encontrado!");
					return "Nenhum resultado para a variável 'endereco' foi encontrado!";
				}
			}else{
//				throw new BusinessException("A variável 'endereco.idEndereco' deve ser informada!");
				return "A variável 'endereco.idEndereco' deve ser informada!";
			}
		}else{
//			throw new BusinessException("A variável 'endereco' deve ser informada!");
			return "A variável 'endereco' deve ser informada!";
		}*/
		
		if(t.getFuncao() != null){
			if(t.getFuncao().getIdFuncao() != null){
				Funcao funcao = funcaoDao.getObjById(t.getFuncao().getIdFuncao());
				if(funcao == null){
					return "Nenhum resultado para a variável 'funcao' foi encontrado!";
				}
			}else{
				return "A variável 'funcao.idFuncao' deve ser informada!";
			}
		}else{
			return "A variável 'funcao' deve ser informada!";
		}
		
		if(t.getNome().equals(null) || t.getNome().equals("")){
			return "A variável 'nome' deve ser informada!";
		}
		
		if(t.getRg().equals(null) || t.getRg().equals("")){
			return "A variável 'rg' deve ser informada!";
		}else{
			//VALIDAR RG
		}
		
		if(t.getUsuarioId() == null){
			return "A variável 'usuarioId' deve ser informada!";
		}
		
		t.setDataCadastro(Data.getDate());
		t.setStatus(true);
		
		pessoaDao.update(t);
		return "Pessoa alterada com sucesso!";
	}

	public String delete(Integer id){
		Pessoa pessoa = this.getObjById(id);
		if(pessoa == null){
			return "Nenhum resultado foi encontrado na tabela Pessoa com o id {"+id+"}";
		}
		pessoaDao.delete(pessoa);
		return "Pessoa deletada com sucesso!";
	}
	
	public String deleteFisico(Integer id){
		Pessoa pessoa = this.getObjById(id);
		if(pessoa == null){
			return "Nenhum resultado foi encontrado na tabela Pessoa com o id {"+id+"}";
		}
		pessoaDao.physicalDelete(pessoa);
		return "Pessoa deletada com sucesso!";
	}

	public Pessoa getObjById(Integer id){
		Pessoa pessoa = pessoaDao.getObjById(id);
		if(pessoa != null && pessoa.isStatus() != false){
			return pessoa;
		}
		return null;
	}

}
