package br.com.smallbi.business;

import java.util.ArrayList;
import java.util.List;

import br.com.smallbi.business.interfaceBusiness.InterfaceBusiness;
import br.com.smallbi.dal.factory.FactoryDao;
import br.com.smallbi.dal.interfaceDal.InterfaceDao;
import br.com.smallbi.entity.Plano;
import br.com.smallbi.util.Data;

public class PlanoBusiness implements InterfaceBusiness<Plano>{

	InterfaceDao<Plano> planoDao = FactoryDao.createPlanoDao();
	
	@Override
	public String create(Plano t){
		
		if(t == null){
//			throw new BusinessException("O objeto não pode ser null!");
			return "O objeto não pode ser null!";
		}
		
		if(t.getIdPlano() != null){
			return "A variavel ID não pode ser informada na criação de um novo objeto!";
		}
		
/*		if(t.getDataCadastro() == null){
			throw new BusinessException("A variável 'dataCadastro' deve ser informada!");
		}*/
		
		if(t.getNomePlano().equals(null) || t.getNomePlano().equals("")){
//			throw new BusinessException("A variável 'descricao' deve ser informada!");
			return "A variável 'descricao' deve ser informada!";
		}
		
		if(t.getUsuarioId() == null){
//			throw new BusinessException("A variável 'usuarioId' deve ser informada!");
			return "A variável 'usuarioId' deve ser informada!";
		}
		
		t.setDataCadastro(Data.getDate());
		t.setStatus(true);
		
		planoDao.create(t);
		return "Plano cadastrado com sucesso!";
	}

	@Override
	public List<Plano> list() {
		List<Plano> planos = new ArrayList<>();
		for(Plano p : planoDao.list()){
			if(p.isStatus() == true){
				planos.add(p);
			}
		}
		return planos;
	}

	@Override
	public String update(Plano t){
		
		if(t == null){
//			throw new BusinessException("O objeto não pode ser null!");
			return "O objeto não pode ser null!";
		}
		
		if(t.getIdPlano() == null){
//			throw new BusinessException("A variável 'idPlano' deve ser informada!");
			return "A variável 'idPlano' deve ser informada!";
		}else{
			Plano plano = planoDao.getObjById(t.getIdPlano());
			if(plano == null){
//				throw new BusinessException("Nenhum resultado para a variável 'plano' foi encontrado!");
				return "Nenhum resultado para a variável 'plano' foi encontrado!";
			}
		}
		
/*		if(t.getDataCadastro() == null){
			throw new BusinessException("A variável 'dataCadastro' deve ser informada!");
		}*/
		
		if(t.getNomePlano().equals(null) || t.getNomePlano().equals("")){
//			throw new BusinessException("A variável 'descricao' deve ser informada!");
			return "A variável 'descricao' deve ser informada!";
		}
		
		if(t.getUsuarioId() == null){
//			throw new BusinessException("A variável 'usuarioId' deve ser informada!");
			return "A variável 'usuarioId' deve ser informada!";
		}
		
		t.setDataCadastro(Data.getDate());
		t.setStatus(true);
		
		planoDao.update(t);
		return "Plano alterado com sucesso!";
	}

	@Override
	public String delete(Integer id){
		Plano plano = getObjById(id);
		if(plano == null){
			return "Nenhum resultado foi encontrado na tabela Plano com o id {"+id+"}";
		}
		planoDao.delete(plano);
		return "Plano deletado com sucesso!";
	}

	@Override
	public Plano getObjById(Integer id){
		Plano plano = planoDao.getObjById(id);
		if(plano != null && plano.isStatus() != false){
			return plano;
		}
		return null;
	}

}
