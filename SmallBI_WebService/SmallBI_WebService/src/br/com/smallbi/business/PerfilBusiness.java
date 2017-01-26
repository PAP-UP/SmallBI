package br.com.smallbi.business;

import java.util.ArrayList;
import java.util.List;

import br.com.smallbi.business.interfaceBusiness.InterfaceBusiness;
import br.com.smallbi.dal.factory.FactoryDao;
import br.com.smallbi.dal.interfaceDal.InterfaceDao;
import br.com.smallbi.entity.Perfil;
import br.com.smallbi.util.Util;

public class PerfilBusiness implements InterfaceBusiness<Perfil>{

	InterfaceDao<Perfil> perfilDao = FactoryDao.createPerfilDao();
	
	@Override
	public String create(Perfil t){
		
		if(t == null){
//			throw new BusinessException("O objeto não pode ser null!");
			return "O objeto não pode ser null!";
		}
		
		if(t.getIdPerfil() != null){
			return "A variavel ID não pode ser informada na criação de um novo objeto!";
		}
		
/*		if(t.getDataCadastro() == null){
			throw new BusinessException("A variável 'dataCadastro' deve ser informada!");
		}*/
		
		if(t.getNomePerfil().equals(null) || t.getNomePerfil().equals("")){
//			throw new BusinessException("A variável 'nomePerfil' deve ser informada!");
			return "A variável 'nomePerfil' deve ser informada!";
		}
		
		if(t.getUsuarioId() == null){
//			throw new BusinessException("A variável 'usuarioId' deve ser informada!");
			return "A variável 'usuarioId' deve ser informada!";
		}
		
		t.setDataCadastro(Util.getDate());
		t.setStatus(true);
		
		perfilDao.create(t);
		return "Perfil cadastrado com sucesso!";
	}

	@Override
	public List<Perfil> list() {
		List<Perfil> perfis = new ArrayList<>();
		for(Perfil p : perfilDao.list()){
			if(p.isStatus() == true){
				perfis.add(p);
			}
		}
		return perfis;
	}

	@Override
	public String update(Perfil t){

		if(t == null){
//			throw new BusinessException("O objeto não pode ser null!");
			return "O objeto não pode ser null!";
		}
		
		if(t.getIdPerfil() == null){
//			throw new BusinessException("A variável 'idPerfil' deve ser informada!");
			return "A variável 'idPerfil' deve ser informada!";
		}else{
			Perfil perfil = perfilDao.getObjById(t.getIdPerfil());
			if(perfil == null){
//				throw new BusinessException("Nenhum resultado para a variável 'perfil' foi encontrado!");
				return "Nenhum resultado para a variável 'perfil' foi encontrado!";
			}
		}
		
/*		if(t.getDataCadastro() == null){
			throw new BusinessException("A variável 'dataCadastro' deve ser informada!");
		}*/
		
		if(t.getNomePerfil().equals(null) || t.getNomePerfil().equals("")){
//			throw new BusinessException("A variável 'nomePerfil' deve ser informada!");
			return "A variável 'nomePerfil' deve ser informada!";
		}
		
		if(t.getUsuarioId() == null){
//			throw new BusinessException("A variável 'usuarioId' deve ser informada!");
			return "A variável 'usuarioId' deve ser informada!";
		}
		
		t.setDataCadastro(Util.getDate());
		t.setStatus(true);
		
		perfilDao.update(t);
		return "Perfil alterado com sucessso!";
	}

	@Override
	public String delete(Integer id){
		Perfil perfil = getObjById(id);
		if(perfil == null){
			return "Nenhum resultado foi encontrado na tabela Pefil com o id {"+id+"}";
		}
		perfilDao.delete(perfil);
		return "Perfil deletado com sucesso!";
	}

	@Override
	public Perfil getObjById(Integer id){
		Perfil perfil = perfilDao.getObjById(id);
		if(perfil != null && perfil.isStatus() != false){
			return perfil;
		}
		return null;
	}

}
