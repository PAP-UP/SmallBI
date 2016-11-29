package br.com.smallbi.business;

import java.util.List;

import br.com.smallbi.business.exception.BusinessException;
import br.com.smallbi.business.interfaceBusiness.InterfaceBusiness;
import br.com.smallbi.dal.factory.FactoryDao;
import br.com.smallbi.dal.interfaceDal.InterfaceDao;
import br.com.smallbi.entity.RamoAtividade;

public class RamoAtividadeBusiness implements InterfaceBusiness<RamoAtividade>{

	InterfaceDao<RamoAtividade> ramoAtividadeDao = FactoryDao.createRamoAtividadeDao();
	
	@Override
	public void create(RamoAtividade t) throws BusinessException {
		
		if(t == null){
			throw new BusinessException("O objeto não pode ser null!");
		}
		
		if(t.getDataCadastro() == null){
			throw new BusinessException("A variável 'dataCadastro' deve ser informada!");
		}
		
		if(t.getRamoAtividade().equals(null) || t.getRamoAtividade().equals("")){
			throw new BusinessException("A variável 'ramoAtividade' deve ser informada!");
		}
		
		if(t.getUsuarioId() == null){
			throw new BusinessException("A variável 'usuarioId' deve ser informada!");
		}
		
		ramoAtividadeDao.create(t);
	}

	@Override
	public List<RamoAtividade> list() {
		return ramoAtividadeDao.list();
	}

	@Override
	public void update(RamoAtividade t) throws BusinessException {
		
		if(t == null){
			throw new BusinessException("O objeto não pode ser null!");
		}
		
		if(t.getDataCadastro() == null){
			throw new BusinessException("A variável 'dataCadastro' deve ser informada!");
		}
		
		if(t.getRamoAtividade().equals(null) || t.getRamoAtividade().equals("")){
			throw new BusinessException("A variável 'ramoAtividade' deve ser informada!");
		}
		
		if(t.getUsuarioId() == null){
			throw new BusinessException("A variável 'usuarioId' deve ser informada!");
		}
		
		ramoAtividadeDao.update(t);
	}

	@Override
	public void delete(Integer id) throws BusinessException {
		RamoAtividade ramoAtividade = ramoAtividadeDao.getObjById(id);
		if(ramoAtividade == null){
			throw new BusinessException("Nenhum resultado foi encontrado para o objeto do tipo 'RamoAtividade'!");
		}
		ramoAtividadeDao.delete(ramoAtividade);
	}

	@Override
	public RamoAtividade getObjById(Integer id) throws BusinessException {
		RamoAtividade ramoAtividade = ramoAtividadeDao.getObjById(id);
		if(ramoAtividade == null){
			throw new BusinessException("Nenhum resultado foi encontrado para o objeto do tipo 'RamoAtividade'!");
		}
		return ramoAtividade;
	}

}