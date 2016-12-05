package br.com.smallbi.business;

import java.util.ArrayList;
import java.util.List;

import com.sun.org.apache.regexp.internal.recompile;

import br.com.smallbi.business.exception.BusinessException;
import br.com.smallbi.business.interfaceBusiness.InterfaceBusiness;
import br.com.smallbi.dal.factory.FactoryDao;
import br.com.smallbi.dal.interfaceDal.InterfaceDao;
import br.com.smallbi.entity.Cidade;
import br.com.smallbi.entity.Estado;
import br.com.smallbi.entity.Usuario;

public class CidadeBusiness implements InterfaceBusiness<Cidade>{

	InterfaceDao<Cidade> cidadeDao = FactoryDao.createCidadeDao();
	InterfaceDao<Usuario> usuarioDao = FactoryDao.createUsuarioDao();
	InterfaceDao<Estado> estadoDao = FactoryDao.createEstadoDao();
	
	@Override
	public void create(Cidade t) throws BusinessException {
		
		if(t == null){
			throw new BusinessException("O objeto não pode ser null!");
		}
		
		if(t.getDataCadastro() == null){
			throw new BusinessException("A variável 'dataCadastro' deve ser informada!");
		}
		
		if(t.getEstado() != null){
			if(t.getEstado().getIdEstado() != null){
				Estado estado = estadoDao.getObjById(t.getEstado().getIdEstado());
				if(estado == null){
					throw new BusinessException("Nenhum resultado para a variável 'estado' foi encontrado!");
				}
			}else{
				throw new BusinessException("A variável 'estado.idEstado' deve ser informada!");
			}
		}else{
			throw new BusinessException("A variável 'estado' deve ser informada!");
		}
		
		if(t.getNomeCidade().equals(null) || t.getNomeCidade().equals("")){
			throw new BusinessException("A variável 'nomeCidade' deve ser informada!");
		}
		
		if(t.getSiglaCidade().equals(null) || t.getSiglaCidade().equals("")){
			throw new BusinessException("A variável 'siglaCidade' deve ser informada!");
		}
		
		if(t.getUsuarioId() == null){
			throw new BusinessException("A variável 'usuarioId' deve ser informada!");
		}
		
		cidadeDao.create(t);
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
	public void update(Cidade t) throws BusinessException {

		if(t == null){
			throw new BusinessException("O objeto não pode ser null!");
		}
		
		if(t.getDataCadastro() == null){
			throw new BusinessException("A variável 'dataCadastro' deve ser informada!");
		}
		
		if(t.getEstado() != null){
			if(t.getEstado().getIdEstado() != null){
				Estado estado = estadoDao.getObjById(t.getEstado().getIdEstado());
				if(estado == null){
					throw new BusinessException("Nenhum resultado para a variável 'estado' foi encontrado!");
				}
			}else{
				throw new BusinessException("A variável 'estado.idEstado' deve ser informada!");
			}
		}else{
			throw new BusinessException("A variável 'estado' deve ser informada!");
		}
		
		if(t.getNomeCidade().equals(null) || t.getNomeCidade().equals("")){
			throw new BusinessException("A variável 'nomeCidade' deve ser informada!");
		}
		
		if(t.getSiglaCidade().equals(null) || t.getSiglaCidade().equals("")){
			throw new BusinessException("A variável 'siglaCidade' deve ser informada!");
		}
		
		if(t.getUsuarioId() == null){
			throw new BusinessException("A variável 'usuarioId' deve ser informada!");
		}
		
		cidadeDao.update(t);
	}
	
	@Override
	public void delete(Integer id) throws BusinessException {
		Cidade cidade = cidadeDao.getObjById(id);
		if(cidade == null){
			throw new BusinessException("Nenhum resultado foi encontrado para o objeto do tipo 'Cidade'!");
		}
		cidadeDao.delete(cidade);
	}
	@Override
	public Cidade getObjById(Integer id) throws BusinessException {
		Cidade cidade = cidadeDao.getObjById(id);
		if(cidade == null){
			throw new BusinessException("Nenhum resultado foi encontrado para o objeto do tipo 'Cidade'!");
		}
		return cidade;
	}
}
