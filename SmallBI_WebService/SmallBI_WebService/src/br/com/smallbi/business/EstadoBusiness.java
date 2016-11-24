package br.com.smallbi.business;

import java.util.List;

import br.com.smallbi.business.exception.BusinessException;
import br.com.smallbi.business.interfaceBusiness.InterfaceBusiness;
import br.com.smallbi.dal.factory.FactoryDao;
import br.com.smallbi.dal.interfaceDal.InterfaceDao;
import br.com.smallbi.entity.Estado;

public class EstadoBusiness implements InterfaceBusiness<Estado>{

	InterfaceDao<Estado> estadoDao = FactoryDao.createEstadoDao();
	
	@Override
	public void create(Estado t) throws BusinessException {
		/*if(t.equals(null)){
			throw new BusinessException("O objeto não pode ser null!");
		}
		if(t.getNomeEstado().equals(null) || t.getNomeEstado().equals("")){
			throw new BusinessException("A variável 'nomeEstado' deve ser informada!");
		}
		if(t.getSiglaEstado().equals(null) || t.getSiglaEstado().equals("")){
			throw new BusinessException("A variável 'siglaEstado' deve ser informada!");
		}
		if(t.getUsuarioId().equals(null)){
			throw new BusinessException("A variável 'usuarioId' deve ser informada!");
		}
		if(t.getDataCadastro().equals(null)){
			throw new BusinessException("A variável 'dataCadastro' deve ser informada!");
		}*/
		estadoDao.create(t);
	}

	@Override
	public List<Estado> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Estado t) throws BusinessException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer t) throws BusinessException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Estado getObjById(Integer t) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	
}
