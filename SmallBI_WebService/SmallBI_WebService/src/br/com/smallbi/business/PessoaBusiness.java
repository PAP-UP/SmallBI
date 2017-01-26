package br.com.smallbi.business;

import java.util.ArrayList;
import java.util.List;

import br.com.smallbi.business.interfaceBusiness.InterfaceBusiness;
import br.com.smallbi.dal.factory.FactoryDao;
import br.com.smallbi.dal.interfaceDal.InterfaceDao;
import br.com.smallbi.entity.Cliente;
import br.com.smallbi.entity.Endereco;
import br.com.smallbi.entity.Funcao;
import br.com.smallbi.entity.Pessoa;
import br.com.smallbi.util.Util;

public class PessoaBusiness implements InterfaceBusiness<Pessoa>{

	InterfaceDao<Pessoa> pessoaDao = FactoryDao.createPessoaDao();
	InterfaceDao<Endereco> enderecoDao = FactoryDao.createEnderecoDao();
	InterfaceDao<Funcao> funcaoDao = FactoryDao.createFuncaoDao();
	InterfaceDao<Cliente> clienteDao = FactoryDao.createClienteDao();
	
	@Override
	public String create(Pessoa t){
		
		if(t == null){
//			throw new BusinessException("O objeto não pode ser null!");
			return "O objeto não pode ser null!";
		}
		
		if(t.getIdPessoa() != null){
			return "A variavel ID não pode ser informada na criação de um novo objeto!";
		}
		
		if(t.getCpf().equals(null) || t.getCpf().equals("")){
//			throw new BusinessException("A variável 'cpf' deve ser informada!");
			return "A variável 'cpf' deve ser informada!";
		}else{
			//VALIDAR CPF
		}
		
/*		if(t.getDataCadastro() == null){
			throw new BusinessException("A variável 'dataCadastro' deve ser informada!");
		}*/
		
		//Retirado o endereço da pessoa, pois estava invertido, uma pessoa tem vários endereços, um endereço tem uma pessoa.
//		  if(t.getEndereco() != null){
//			if(t.getEndereco().getIdEndereco() != null){
//				Endereco endereco = enderecoDao.getObjById(t.getEndereco().getIdEndereco());
//				if(endereco == null){
////					throw new BusinessException("Nenhum resultado para a variável 'endereco' foi encontrado!");
//					return "Nenhum resultado para a variável 'endereco' foi encontrado!";
//				}
//			}else{
////				throw new BusinessException("A variável 'endereco.idEndereco' deve ser informada!");
//				return "A variável 'endereco.idEndereco' deve ser informada!";
//			}
//		}else{
////			throw new BusinessException("A variável 'endereco' deve ser informada!");
//			return "A variável 'endereco' deve ser informada!";
//		}
		
		if(t.getCliente() != null){
			if(t.getCliente().getIdCliente() != null){
				Cliente cliente = clienteDao.getObjById(t.getCliente().getIdCliente());
				if(cliente == null){
					return "Nenhum resultado para a variável 'cliente' foi encontrado!";
				}
			}else{
				return "A variável 'cliente.idCliente' deve ser informada!";
			}
		}else{
			return "A variável 'cliente' deve ser informada!";
		}
		
		if(t.getFuncao() != null){
			if(t.getFuncao().getIdFuncao() != null){
				Funcao funcao = funcaoDao.getObjById(t.getFuncao().getIdFuncao());
				if(funcao == null){
//					throw new BusinessException("Nenhum resultado para a variável 'funcao' foi encontrado!");
					return "Nenhum resultado para a variável 'funcao' foi encontrado!";
				}
			}else{
//				throw new BusinessException("A variável 'funcao.idFuncao' deve ser informada!");
				return "A variável 'funcao.idFuncao' deve ser informada!";
			}
		}else{
//			throw new BusinessException("A variável 'funcao' deve ser informada!");
			return "A variável 'funcao' deve ser informada!";
		}
		
		if(t.getNome().equals(null) || t.getNome().equals("")){
//			throw new BusinessException("A variável 'nome' deve ser informada!");
			return "A variável 'nome' deve ser informada!";
		}
		
		if(t.getRg().equals(null) || t.getRg().equals("")){
//			throw new BusinessException("A variável 'rg' deve ser informada!");
			return "A variável 'rg' deve ser informada!";
		}else{
			//VALIDAR RG
		}
		
		if(t.getUsuarioId() == null){
//			throw new BusinessException("A variável 'usuarioId' deve ser informada!");
			return "A variável 'usuarioId' deve ser informada!";
		}
		
		t.setDataCadastro(Util.getDate());
		t.setStatus(true);
		
		pessoaDao.create(t);
		return "Pessoa cadastrada com sucesso!";
	}

	@Override
	public List<Pessoa> list() {
		List<Pessoa> pessoas = new ArrayList<>();
		for(Pessoa p : pessoaDao.list()){
			if(p.isStatus() == true){
				pessoas.add(p);
			}
		}
		return pessoas;
	}

	@Override
	public String update(Pessoa t){
		
		if(t == null){
//			throw new BusinessException("O objeto não pode ser null!");
			return "O objeto não pode ser null!";
		}
		
		if(t.getIdPessoa() == null){
//			throw new BusinessException("A variável 'idPessoa' deve ser informada!");
			return "A variável 'idPessoa' deve ser informada!";
		}else{
			Pessoa pessoa = pessoaDao.getObjById(t.getIdPessoa());
			if(pessoa == null){
//				throw new BusinessException("Nenhum resultado para a variável 'pessoa' foi encontrado!");
				return "Nenhum resultado para a variável 'pessoa' foi encontrado!";
			}
		}
		
		if(t.getCpf().equals(null) || t.getCpf().equals("")){
//			throw new BusinessException("A variável 'cpf' deve ser informada!");
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
//					throw new BusinessException("Nenhum resultado para a variável 'funcao' foi encontrado!");
					return "Nenhum resultado para a variável 'funcao' foi encontrado!";
				}
			}else{
//				throw new BusinessException("A variável 'funcao.idFuncao' deve ser informada!");
				return "A variável 'funcao.idFuncao' deve ser informada!";
			}
		}else{
//			throw new BusinessException("A variável 'funcao' deve ser informada!");
			return "A variável 'funcao' deve ser informada!";
		}
		
		if(t.getNome().equals(null) || t.getNome().equals("")){
//			throw new BusinessException("A variável 'nome' deve ser informada!");
			return "A variável 'nome' deve ser informada!";
		}
		
		if(t.getRg().equals(null) || t.getRg().equals("")){
//			throw new BusinessException("A variável 'rg' deve ser informada!");
			return "A variável 'rg' deve ser informada!";
		}else{
			//VALIDAR RG
		}
		
		if(t.getUsuarioId() == null){
//			throw new BusinessException("A variável 'usuarioId' deve ser informada!");
			return "A variável 'usuarioId' deve ser informada!";
		}
		
		t.setDataCadastro(Util.getDate());
		t.setStatus(true);
		
		pessoaDao.update(t);
		return "Pessoa alterada com sucesso!";
	}

	@Override
	public String delete(Integer id){
		Pessoa pessoa = getObjById(id);
		if(pessoa == null){
			return "Nenhum resultado foi encontrado na tabela Pessoa com o id {"+id+"}";
		}
		pessoaDao.delete(pessoa);
		return "Pessoa deletada com sucesso!";
	}

	@Override
	public Pessoa getObjById(Integer id){
		Pessoa pessoa = pessoaDao.getObjById(id);
		if(pessoa != null && pessoa.isStatus() != false){
			return pessoa;
		}
		return null;
	}

}
