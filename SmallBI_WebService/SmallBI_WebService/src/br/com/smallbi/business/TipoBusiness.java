package br.com.smallbi.business;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.smallbi.business.interfaceBusiness.InterfaceBusiness;
import br.com.smallbi.dal.factory.FactoryDao;
import br.com.smallbi.dal.interfaceDal.InterfaceDao;
import br.com.smallbi.entity.Tipo;

public class TipoBusiness implements InterfaceBusiness<Tipo>{

	InterfaceDao<Tipo> tipoDao = FactoryDao.createTipoDao();
	
	@Override
	public String create(Tipo t){
		
		if(t == null){
//			throw new BusinessException("O objeto não pode ser null!");
			return "O objeto não pode ser null!";
		}
		
		if(t.getIdTipo() != null){
			return "A variavel ID não pode ser informada na criação de um novo objeto!";
		}
		
/*		if(t.getDataCadastro() == null){
			throw new BusinessException("A variável 'dataCadastro' deve ser informada!");
		}*/
		
		if(t.getTipo().equals(null) || t.getTipo().equals("")){
//			throw new BusinessException("A variável 'tipo' deve ser informada!");
			return "A variável 'tipo' deve ser informada!";
		}
		
		if(t.getUsuarioId() == null){
//			throw new BusinessException("A variável 'usuarioId' deve ser informada!");
			return "A variável 'usuarioId' deve ser informada!";
		}
		
		t.setDataCadastro(Calendar.getInstance());
		t.setStatus(true);
		
		tipoDao.create(t);
		return "Tipo cadastrado com sucesso!";
	}

	@Override
	public List<Tipo> list() {
		List<Tipo> tipos = new ArrayList<>();
		for(Tipo t : tipoDao.list()){
			if(t.isStatus() == true){
				tipos.add(t);
			}
		}
		return tipos;
	}

	@Override
	public String update(Tipo t){
		
		if(t == null){
//			throw new BusinessException("O objeto não pode ser null!");
			return "O objeto não pode ser null!";
		}
		
		if(t.getIdTipo() == null){
//			throw new BusinessException("A variável 'idTipo' deve ser informada!");
			return "A variável 'idTipo' deve ser informada!";
		}else{
			Tipo tipo = tipoDao.getObjById(t.getIdTipo());
			if(tipo == null){
//				throw new BusinessException("Nenhum resultado para a variável 'tipo' foi encontrado!");
				return "Nenhum resultado para a variável 'tipo' foi encontrado!";
			}
		}
		
/*		if(t.getDataCadastro() == null){
			throw new BusinessException("A variável 'dataCadastro' deve ser informada!");
		}*/
		
		if(t.getTipo().equals(null) || t.getTipo().equals("")){
//			throw new BusinessException("A variável 'tipo' deve ser informada!");
			return "A variável 'tipo' deve ser informada!";
		}
		
		if(t.getUsuarioId() == null){
//			throw new BusinessException("A variável 'usuarioId' deve ser informada!");
			return "A variável 'usuarioId' deve ser informada!";
		}
		
		t.setDataCadastro(Calendar.getInstance());
		t.setStatus(true);
		
		tipoDao.update(t);
		return "Tipo alterado com sucesso!";
	}

	@Override
	public String delete(Integer id){
		Tipo tipo = tipoDao.getObjById(id);
		if(tipo == null){
//			throw new BusinessException("Nenhum resultado foi encontrado para o objeto do tipo 'Tipo'!");
			return "Nenhum resultado foi encontrado para o objeto do tipo 'Tipo'!";
		}
		tipoDao.delete(tipo);
		return "Tipo deletado com sucesso!";
	}

	@Override
	public Tipo getObjById(Integer id){
		Tipo tipo = tipoDao.getObjById(id);
		if(tipo == null){
			//throw new BusinessException("Nenhum resultado foi encontrado para o objeto do tipo 'Tipo'!");
		}
		return tipo;
	}

}
