package br.com.smallbi.business;

import java.util.ArrayList;
import java.util.List;

import br.com.smallbi.business.interfaceBusiness.InterfaceBusiness;
import br.com.smallbi.dal.factory.FactoryDao;
import br.com.smallbi.dal.interfaceDal.InterfaceDao;
import br.com.smallbi.entity.Funcao;
import br.com.smallbi.util.Util;

public class FuncaoBusiness implements InterfaceBusiness<Funcao>{

	InterfaceDao<Funcao> funcaoDao = FactoryDao.createFuncaoDao();
	
	@Override
	public String create(Funcao t){
		
		if(t == null){
//			throw new BusinessException("O objeto não pode ser null!");
			return "O objeto não pode ser null!";
		}
		
		if(t.getIdFuncao() != null){
			return "A variavel ID não pode ser informada na criação de um novo objeto!";
		}
		
/*		if(t.getDataCadastro() == null){
			throw new BusinessException("A variável 'dataCadastro' deve ser informada!");
		}*/
		
		if(t.getNomeFuncao().equals(null) || t.getNomeFuncao().equals("")){
//			throw new BusinessException("A variável 'nomeFuncao' deve ser informada!");
			return "A variável 'nomeFuncao' deve ser informada!";
		}
		
		if(t.getUsuarioId() == null){
//			throw new BusinessException("A variável 'usuarioId' deve ser informada!");
			return "A variável 'usuarioId' deve ser informada!";
		}
		
		t.setDataCadastro(Util.getDate());
		t.setStatus(true);
		
		funcaoDao.create(t);
		return "Funcao cadastrada com sucesso!";
	}

	@Override
	public List<Funcao> list() {
		List<Funcao> funcoes = new ArrayList<>();
		for(Funcao f : funcaoDao.list()){
			if(f.isStatus() == true){
				funcoes.add(f);
			}
		}
		return funcoes;
	}

	@Override
	public String update(Funcao t){
		
		if(t == null){
//			throw new BusinessException("O objeto não pode ser null!");
			return "O objeto não pode ser null!";
		}

		if(t.getIdFuncao() == null){
//			throw new BusinessException("A variável 'idFuncao' deve ser informada!");
			return "A variável 'idFuncao' deve ser informada!";
		}else{
			Funcao funcao = funcaoDao.getObjById(t.getIdFuncao());
			if(funcao == null){
//				throw new BusinessException("Nenhum resultado para a variável 'funcao' foi encontrado!");
				return "Nenhum resultado para a variável 'funcao' foi encontrado!";
			}
		}
		
/*		if(t.getDataCadastro() == null){
			throw new BusinessException("A variável 'dataCadastro' deve ser informada!");
		}*/
		
		if(t.getNomeFuncao().equals(null) || t.getNomeFuncao().equals("")){
//			throw new BusinessException("A variável 'nomeFuncao' deve ser informada!");
			return "A variável 'nomeFuncao' deve ser informada!";
		}
		
		if(t.getUsuarioId() == null){
//			throw new BusinessException("A variável 'usuarioId' deve ser informada!");
			return "A variável 'usuarioId' deve ser informada!";
		}
		
		t.setDataCadastro(Util.getDate());
		t.setStatus(true);
		
		funcaoDao.update(t);
		return "Funcao alterada com sucesso!";
	}

	@Override
	public String delete(Integer id){
		Funcao funcao = getObjById(id);
		if(funcao == null){
			return "Nenhum resultado foi encontrado na tabela Função com o id {"+id+"}";
		}
		funcaoDao.delete(funcao);
		return "Funcao deletada com sucesso!";
	}

	@Override
	public Funcao getObjById(Integer id){
		Funcao funcao = funcaoDao.getObjById(id);
		if(funcao != null && funcao.isStatus() != false){
			return funcao;
		}
		return null;
	}

}
