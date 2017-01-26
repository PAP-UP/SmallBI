package br.com.smallbi.business;

import java.util.ArrayList;
import java.util.List;

import br.com.smallbi.business.interfaceBusiness.InterfaceBusiness;
import br.com.smallbi.dal.factory.FactoryDao;
import br.com.smallbi.dal.interfaceDal.InterfaceDao;
import br.com.smallbi.entity.RamoAtividade;
import br.com.smallbi.util.Util;

public class RamoAtividadeBusiness implements InterfaceBusiness<RamoAtividade>{

	InterfaceDao<RamoAtividade> ramoAtividadeDao = FactoryDao.createRamoAtividadeDao();
	
	@Override
	public String create(RamoAtividade t){
		
		if(t == null){
//			throw new BusinessException("O objeto não pode ser null!");
			return "O objeto não pode ser null!";
		}
		
		if(t.getIdRamoAtividade() != null){
			return "A variavel ID não pode ser informada na criação de um novo objeto!";
		}
		
/*		if(t.getDataCadastro() == null){
			throw new BusinessException("A variável 'dataCadastro' deve ser informada!");
		}*/
		
		if(t.getRamoAtividade().equals(null) || t.getRamoAtividade().equals("")){
//			throw new BusinessException("A variável 'ramoAtividade' deve ser informada!");
			return "A variável 'ramoAtividade' deve ser informada!";
		}
		
		if(t.getUsuarioId() == null){
//			throw new BusinessException("A variável 'usuarioId' deve ser informada!");
			return "A variável 'usuarioId' deve ser informada!";
		}
		
		t.setDataCadastro(Util.getDate());
		t.setStatus(true);
		
		ramoAtividadeDao.create(t);
		return "Ramo de Atividade cadastrado com sucesso!";
	}

	@Override
	public List<RamoAtividade> list() {
		List<RamoAtividade> ramos = new ArrayList<>();
		for(RamoAtividade r : ramoAtividadeDao.list()){
			if(r.isStatus() == true){
				ramos.add(r);
			}
		}
		return ramos;
	}

	@Override
	public String update(RamoAtividade t){
		
		if(t == null){
//			throw new BusinessException("O objeto não pode ser null!");
			return "O objeto não pode ser null!";
		}
		
		if(t.getIdRamoAtividade() == null){
//			throw new BusinessException("A variável 'idRamoAtividade' deve ser informada!");
			return "A variável 'idRamoAtividade' deve ser informada!";
		}else{
			RamoAtividade ramoAtividade = ramoAtividadeDao.getObjById(t.getIdRamoAtividade());
			if(ramoAtividade == null){
//				throw new BusinessException("Nenhum resultado para a variável 'ramoAtividade' foi encontrado!");
				return "Nenhum resultado para a variável 'ramoAtividade' foi encontrado!";
			}
		}
		
/*		if(t.getDataCadastro() == null){
			throw new BusinessException("A variável 'dataCadastro' deve ser informada!");
		}*/
		
		if(t.getRamoAtividade().equals(null) || t.getRamoAtividade().equals("")){
//			throw new BusinessException("A variável 'ramoAtividade' deve ser informada!");
			return "A variável 'ramoAtividade' deve ser informada!";
		}
		
		if(t.getUsuarioId() == null){
//			throw new BusinessException("A variável 'usuarioId' deve ser informada!");
			return "A variável 'usuarioId' deve ser informada!";
		}
		
		t.setDataCadastro(Util.getDate());
		t.setStatus(true);
		
		ramoAtividadeDao.update(t);
		return "Ramo de Atividade alterado com sucesso!";
	}

	@Override
	public String delete(Integer id){
		RamoAtividade ramoAtividade = getObjById(id);
		if(ramoAtividade == null){
			return "Nenhum resultado foi encontrado na tabela RamoAtividade com o id {"+id+"}";
		}
		ramoAtividadeDao.delete(ramoAtividade);
		return "Ramo de Atividade deletado com sucesso!";
	}

	@Override
	public RamoAtividade getObjById(Integer id){
		RamoAtividade ramoAtividade = ramoAtividadeDao.getObjById(id);
		if(ramoAtividade != null && ramoAtividade.isStatus() != false){
			return ramoAtividade;
		}
		return null;
	}

}
