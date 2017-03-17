package br.com.smallbi.business;

import java.util.ArrayList;
import java.util.List;

import br.com.smallbi.business.interfaceBusiness.InterfaceBusiness;
import br.com.smallbi.dal.factory.FactoryDao;
import br.com.smallbi.dal.interfaceDal.InterfaceDao;
import br.com.smallbi.entity.Cidade;
import br.com.smallbi.entity.Estado;
import br.com.smallbi.entity.Usuario;
import br.com.smallbi.util.Data;

public class CidadeBusiness implements InterfaceBusiness<Cidade>{

	InterfaceDao<Cidade> cidadeDao = FactoryDao.createCidadeDao();
	InterfaceDao<Usuario> usuarioDao = FactoryDao.createUsuarioDao();
	InterfaceDao<Estado> estadoDao = FactoryDao.createEstadoDao();
	
	@Override
	public String create(Cidade t){
		
		if(t == null){
			return "O objeto não pode ser null!";
		}
		
		if(t.getIdCidade() != null){
			return "A variavel ID não pode ser informada na criação de um novo objeto!";
		}
		
		if(t.getEstado() != null){
			if(t.getEstado().getIdEstado() != null){
				Estado estado = estadoDao.getObjById(t.getEstado().getIdEstado());
				if(estado == null){
					return "Nenhum resultado para a variável 'estado' foi encontrado!";
				}
			}else{
				return "A variável 'estado.idEstado' deve ser informada!";
			}
		}else{
			return "A variável 'estado' deve ser informada!";
		}
		
		if(t.getNomeCidade().equals(null) || t.getNomeCidade().equals("")){
			return "A variável 'nomeCidade' deve ser informada!";
		}
		
		if(t.getUsuarioId() == null){
			return "A variável 'usuarioId' deve ser informada!";
		}
		
		t.setDataCadastro(Data.getDate());
		t.setStatus(true);
		
		cidadeDao.create(t);
		return "Cidade cadastrada com sucesso!";
	}
	
	@Override
	public List<Cidade> list() {
		List<Cidade> cidades = new ArrayList<>();
		for(Cidade c : cidadeDao.list()){
			if(c.isStatus() == true){
				cidades.add(c);
			}
		}
		return cidades;
	}
	
	@Override
	public String update(Cidade t){

		if(t == null){
			return "O objeto não pode ser null!";
		}
		
		if(t.getIdCidade() == null){
			return "A variável 'idCidade' deve ser informada!";
		}else{
			Cidade cidade = cidadeDao.getObjById(t.getIdCidade());
			if(cidade == null){
				return "Nenhum resultado para a variável 'cidade' foi encontrado!";
			}
		}
		
		if(t.getEstado() != null){
			if(t.getEstado().getIdEstado() != null){
				Estado estado = estadoDao.getObjById(t.getEstado().getIdEstado());
				if(estado == null){
					return "Nenhum resultado para a variável 'estado' foi encontrado!";
				}
			}else{
				return "A variável 'estado.idEstado' deve ser informada!";
			}
		}else{
			return "A variável 'estado' deve ser informada!";
		}
		
		if(t.getNomeCidade().equals(null) || t.getNomeCidade().equals("")){
			return "A variável 'nomeCidade' deve ser informada!";
		}
		
		if(t.getUsuarioId() == null){
			return "A variável 'usuarioId' deve ser informada!";
		}
		
		t.setDataCadastro(Data.getDate());
		t.setStatus(true);
		
		cidadeDao.update(t);
		return "Cidade alterada com sucesso!";
	}
	
	@Override
	public String delete(Integer id){
		Cidade cidade = getObjById(id);
		if(cidade == null){
			return "Nenhum resultado foi encontrado na tabela Cidade com o id {"+id+"}";
		}
		cidadeDao.delete(cidade);
		return "Cidade deletada com sucesso!";
	}
	
	@Override
	public Cidade getObjById(Integer id){
		Cidade cidade = cidadeDao.getObjById(id);
		if(cidade != null && cidade.isStatus() != false){
			return cidade;
		}
		return null;
	}
	
	public Cidade getByName(String nomeCidade){
		List<Cidade> cidades = list();
		for(Cidade c : cidades){
			if(c.getNomeCidade().equals(nomeCidade)){
				return c;
			}
		}
		return null;
	}
}
