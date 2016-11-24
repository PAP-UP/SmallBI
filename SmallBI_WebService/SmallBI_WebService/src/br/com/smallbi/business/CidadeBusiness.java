package br.com.smallbi.business;

import java.util.List;

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
		if(t.equals(null)){
			throw new BusinessException("O objeto não pode ser null.");
		}
		if(t.getDataCadastro().equals(null)){
			throw new BusinessException("A dataCadastro não pode ser null.");
		}		
		Usuario usuario = new Usuario();
//		try{
//			usuario = usuarioDao.getObjById(t.getUsuario().getIdUsuario());
//		}catch (Exception e) {
//			throw new BusinessException("Usuario não encontrado.");
//		}		
		if(t.getNomeCidade().equals(null) || t.getNomeCidade().equals("")){
			throw new BusinessException("O nomeCidade não pode ser null.");
		}
		if(t.getSiglaCidade().equals(null) || t.getSiglaCidade().equals("")){
			throw new BusinessException("A siglaCidade não pode ser null.");
		}
//		try{
//			Estado estado = estadoDao.getObjById(t.getEstado().getIdEstado());
//		}catch (Exception e) {
//			throw new BusinessException("O estado não pode ser null.");
//		}			
		cidadeDao.create(t);
	}
	
	@Override
	public List<Cidade> list() {
		return cidadeDao.list();
	}
	
	@Override
	public void update(Cidade t) throws BusinessException {
		if(t.equals(null)){
			//error
		}
		if(t.getDataCadastro().equals(null)){
			//error
		}
		if(t.getNomeCidade().equals(null) || t.getNomeCidade().equals("")){
			//error
		}
		if(t.getSiglaCidade().equals(null) || t.getSiglaCidade().equals("")){
			//error
		}
		Estado estado = estadoDao.getObjById(t.getEstado().getIdEstado());
		if(estado.equals(null)){
			//error
		}else{
			t.setEstado(estado);
		}		
		cidadeDao.update(t);
	}
	
	@Override
	public void delete(Integer t) throws BusinessException {
		Cidade cidade = cidadeDao.getObjById(t);
		cidadeDao.delete(cidade);
	}
	@Override
	public Cidade getObjById(Integer t) throws BusinessException {
		return cidadeDao.getObjById(t);
	}
}
