package br.com.smallbi.business;

import java.util.List;

import br.com.smallbi.business.exception.BusinessException;
import br.com.smallbi.business.interfaceBusiness.InterfaceBusiness;
import br.com.smallbi.dal.factory.FactoryDao;
import br.com.smallbi.dal.interfaceDal.InterfaceDao;
import br.com.smallbi.entity.Funcao;

public class FuncaoBusiness implements InterfaceBusiness<Funcao>{

	InterfaceDao<Funcao> funcaoDao = FactoryDao.createFuncaoDao();
	
	@Override
	public void create(Funcao t) throws BusinessException {
		
		if(t == null){
			throw new BusinessException("O objeto não pode ser null!");
		}
		
		if(t.getDataCadastro() == null){
			throw new BusinessException("A variável 'dataCadastro' deve ser informada!");
		}
		
		if(t.getNomeFuncao().equals(null) || t.getNomeFuncao().equals("")){
			throw new BusinessException("A variável 'nomeFuncao' deve ser informada!");
		}
		
		if(t.getUsuarioId() == null){
			throw new BusinessException("A variável 'usuarioId' deve ser informada!");
		}
		
		funcaoDao.create(t);
	}

	@Override
	public List<Funcao> list() {
		return funcaoDao.list();
	}

	@Override
	public void update(Funcao t) throws BusinessException {
		
		if(t == null){
			throw new BusinessException("O objeto não pode ser null!");
		}
		
		if(t.getDataCadastro() == null){
			throw new BusinessException("A variável 'dataCadastro' deve ser informada!");
		}
		
		if(t.getNomeFuncao().equals(null) || t.getNomeFuncao().equals("")){
			throw new BusinessException("A variável 'nomeFuncao' deve ser informada!");
		}
		
		if(t.getUsuarioId() == null){
			throw new BusinessException("A variável 'usuarioId' deve ser informada!");
		}
		
		funcaoDao.update(t);
	}

	@Override
	public void delete(Integer id) throws BusinessException {
		Funcao funcao = funcaoDao.getObjById(id);
		if(funcao == null){
			throw new BusinessException("Nenhum resultado foi encontrado para o objeto do tipo 'Funcao'!");
		}
		funcaoDao.delete(funcao);
	}

	@Override
	public Funcao getObjById(Integer id) throws BusinessException {
		Funcao funcao = funcaoDao.getObjById(id);
		if(funcao == null){
			throw new BusinessException("Nenhum resultado foi encontrado para o objeto do tipo 'Funcao'!");
		}
		return funcao;
	}

}