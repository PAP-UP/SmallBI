package br.com.smallbi.business;

import java.util.ArrayList;
import java.util.List;

import br.com.smallbi.business.interfaceBusiness.InterfaceBusiness;
import br.com.smallbi.dal.factory.FactoryDao;
import br.com.smallbi.dal.interfaceDal.InterfaceDao;
import br.com.smallbi.entity.Estado;
import br.com.smallbi.util.Data;

public class EstadoBusiness implements InterfaceBusiness<Estado>{

	InterfaceDao<Estado> estadoDao = FactoryDao.createEstadoDao();
	
	@Override
	public String create(Estado t){

		if(t == null){
//			throw new BusinessException("O objeto não pode ser null!");
			return "O objeto não pode ser null!";
		}
		
		if(t.getIdEstado() != null){
			return "A variavel ID não pode ser informada na criação de um novo objeto!";
		}
		
		if(t.getNomeEstado().equals(null) || t.getNomeEstado().equals("")){
//			throw new BusinessException("A variável 'nomeEstado' deve ser informada!");
			return "A variável 'nomeEstado' deve ser informada!";
		}
		
		if(t.getSiglaEstado().equals(null) || t.getSiglaEstado().equals("")){
//			throw new BusinessException("A variável 'siglaEstado' deve ser informada!");
			return "A variável 'siglaEstado' deve ser informada!";
		}
		
		if(t.getUsuarioId() == null){
//			throw new BusinessException("A variável 'usuarioId' deve ser informada!");
			return "A variável 'usuarioId' deve ser informada!";
		}
		
		
		t.setDataCadastro(Data.getDate());
		t.setStatus(true);
		
		estadoDao.create(t);
		return "Estado cadastrado com sucesso!";
	}

	@Override
	public List<Estado> list() {
		List<Estado> estados = new ArrayList<>();
		for(Estado e : estadoDao.list()){
			if(e.isStatus() == true){
				estados.add(e);
			}
		}
		return estados;
	}

	@Override
	public String update(Estado t){
		
		if(t == null){
//			throw new BusinessException("O objeto não pode ser null!");
			return "O objeto não pode ser null!";
		}
		
		if(t.getIdEstado() == null){
//			throw new BusinessException("A variável 'idEstado' deve ser informada!");
			return "A variável 'idEstado' deve ser informada!";
		}else{
			Estado estado = estadoDao.getObjById(t.getIdEstado());
			if(estado == null){
//				throw new BusinessException("Nenhum resultado para a variável 'estado' foi encontrado!");
				return "Nenhum resultado para a variável 'estado' foi encontrado!";
			}
		}
		
		if(t.getIdEstado() == null){
//			throw new BusinessException("A variável 'idEstado' deve ser informada!");
			return"A variável 'idEstado' deve ser informada!";
		}
		
		if(t.getNomeEstado().equals(null) || t.getNomeEstado().equals("")){
//			throw new BusinessException("A variável 'nomeEstado' deve ser informada!");
			return "A variável 'nomeEstado' deve ser informada!";
		}
		
		if(t.getSiglaEstado().equals(null) || t.getSiglaEstado().equals("")){
//			throw new BusinessException("A variável 'siglaEstado' deve ser informada!");
			return "A variável 'siglaEstado' deve ser informada!";
		}
		
		if(t.getUsuarioId() == null){
//			throw new BusinessException("A variável 'usuarioId' deve ser informada!");
			return "A variável 'usuarioId' deve ser informada!";
		}
		
		t.setDataCadastro(Data.getDate());
		t.setStatus(true);
		estadoDao.update(t);
		return "Estado alterado com sucesso!";
	}

	@Override
	public String delete(Integer id){
		Estado estado = getObjById(id);
		if(estado == null){
			return "Nenhum resultado foi encontrado para o objeto do tipo 'Estado'!";
		}
		estadoDao.delete(estado);
		return "Estado deletado com sucesso!";
	}

	@Override
	public Estado getObjById(Integer id){
		Estado estado = estadoDao.getObjById(id);
		if(estado != null && estado.isStatus() != false){
			return estado;
		}
		return null;
	}

	
}
