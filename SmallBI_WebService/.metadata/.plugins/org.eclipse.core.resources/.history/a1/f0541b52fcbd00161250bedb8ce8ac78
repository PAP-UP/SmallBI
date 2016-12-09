package br.com.smallbi.business;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.smallbi.business.exception.BusinessException;
import br.com.smallbi.business.interfaceBusiness.InterfaceBusiness;
import br.com.smallbi.dal.factory.FactoryDao;
import br.com.smallbi.dal.interfaceDal.InterfaceDao;
import br.com.smallbi.entity.Endereco;
import br.com.smallbi.entity.Funcao;
import br.com.smallbi.entity.Pessoa;

public class PessoaBusiness implements InterfaceBusiness<Pessoa>{

	InterfaceDao<Pessoa> pessoaDao = FactoryDao.createPessoaDao();
	InterfaceDao<Endereco> enderecoDao = FactoryDao.createEnderecoDao();
	InterfaceDao<Funcao> funcaoDao = FactoryDao.createFuncaoDao();
	
	@Override
	public void create(Pessoa t) throws BusinessException {
		
		if(t == null){
			throw new BusinessException("O objeto não pode ser null!");
		}
		
		if(t.getCpf().equals(null) || t.getCpf().equals("")){
			throw new BusinessException("A variável 'cpf' deve ser informada!");
		}else{
			//VALIDAR CPF
		}
		
/*		if(t.getDataCadastro() == null){
			throw new BusinessException("A variável 'dataCadastro' deve ser informada!");
		}*/
		
		if(t.getEndereco() != null){
			if(t.getEndereco().getIdEndereco() != null){
				Endereco endereco = enderecoDao.getObjById(t.getEndereco().getIdEndereco());
				if(endereco == null){
					throw new BusinessException("Nenhum resultado para a variável 'endereco' foi encontrado!");
				}
			}else{
				throw new BusinessException("A variável 'endereco.idEndereco' deve ser informada!");
			}
		}else{
			throw new BusinessException("A variável 'endereco' deve ser informada!");
		}
		
		if(t.getFuncao() != null){
			if(t.getFuncao().getIdFuncao() != null){
				Funcao funcao = funcaoDao.getObjById(t.getFuncao().getIdFuncao());
				if(funcao == null){
					throw new BusinessException("Nenhum resultado para a variável 'funcao' foi encontrado!");
				}
			}else{
				throw new BusinessException("A variável 'funcao.idFuncao' deve ser informada!");
			}
		}else{
			throw new BusinessException("A variável 'funcao' deve ser informada!");
		}
		
		if(t.getNome().equals(null) || t.getNome().equals("")){
			throw new BusinessException("A variável 'nome' deve ser informada!");
		}
		
		if(t.getRg().equals(null) || t.getRg().equals("")){
			throw new BusinessException("A variável 'rg' deve ser informada!");
		}else{
			//VALIDAR RG
		}
		
		if(t.getUsuarioId() == null){
			throw new BusinessException("A variável 'usuarioId' deve ser informada!");
		}
		
		t.setDataCadastro(Calendar.getInstance());
		t.setStatus(true);
		
		pessoaDao.create(t);
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
	public void update(Pessoa t) throws BusinessException {
		
		if(t == null){
			throw new BusinessException("O objeto não pode ser null!");
		}
		
		if(t.getCpf().equals(null) || t.getCpf().equals("")){
			throw new BusinessException("A variável 'cpf' deve ser informada!");
		}else{
			//VALIDAR CPF
		}
		
/*		if(t.getDataCadastro() == null){
			throw new BusinessException("A variável 'dataCadastro' deve ser informada!");
		}*/
		
		if(t.getEndereco() != null){
			if(t.getEndereco().getIdEndereco() != null){
				Endereco endereco = enderecoDao.getObjById(t.getEndereco().getIdEndereco());
				if(endereco == null){
					throw new BusinessException("Nenhum resultado para a variável 'endereco' foi encontrado!");
				}
			}else{
				throw new BusinessException("A variável 'endereco.idEndereco' deve ser informada!");
			}
		}else{
			throw new BusinessException("A variável 'endereco' deve ser informada!");
		}
		
		if(t.getFuncao() != null){
			if(t.getFuncao().getIdFuncao() != null){
				Funcao funcao = funcaoDao.getObjById(t.getFuncao().getIdFuncao());
				if(funcao == null){
					throw new BusinessException("Nenhum resultado para a variável 'funcao' foi encontrado!");
				}
			}else{
				throw new BusinessException("A variável 'funcao.idFuncao' deve ser informada!");
			}
		}else{
			throw new BusinessException("A variável 'funcao' deve ser informada!");
		}
		
		if(t.getNome().equals(null) || t.getNome().equals("")){
			throw new BusinessException("A variável 'nome' deve ser informada!");
		}
		
		if(t.getRg().equals(null) || t.getRg().equals("")){
			throw new BusinessException("A variável 'rg' deve ser informada!");
		}else{
			//VALIDAR RG
		}
		
		if(t.getUsuarioId() == null){
			throw new BusinessException("A variável 'usuarioId' deve ser informada!");
		}
		
		t.setDataCadastro(Calendar.getInstance());
		t.setStatus(true);
		
		pessoaDao.update(t);
	}

	@Override
	public void delete(Integer id) throws BusinessException {
		Pessoa pessoa = pessoaDao.getObjById(id);
		if(pessoa == null){
			throw new BusinessException("Nenhum resultado foi encontrado para o objeto do tipo 'Pessoa'!");
		}
		pessoaDao.delete(pessoa);
	}

	@Override
	public Pessoa getObjById(Integer id) throws BusinessException {
		Pessoa pessoa = pessoaDao.getObjById(id);
		if(pessoa == null){
			throw new BusinessException("Nenhum resultado foi encontrado para o objeto do tipo 'Pessoa'!");
		}
		return pessoa;
	}

}
