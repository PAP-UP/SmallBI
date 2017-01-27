package br.com.smallbi.business;

import java.util.ArrayList;
import java.util.List;

import br.com.smallbi.business.interfaceBusiness.InterfaceBusiness;
import br.com.smallbi.dal.factory.FactoryDao;
import br.com.smallbi.dal.interfaceDal.InterfaceDao;
import br.com.smallbi.entity.Cubo;
import br.com.smallbi.util.Util;
import br.com.smallbi.entity.Cliente;

public class CuboBusiness implements InterfaceBusiness<Cubo>{
	
	InterfaceDao<Cubo> cuboDao = FactoryDao.createCuboDao();
	InterfaceDao<Cliente> empresaDao = FactoryDao.createClienteDao();

	@Override
	public String create(Cubo t){
		
		if(t == null){
			//throw new BusinessException("O objeto não pode ser null!");
			return "O objeto não pode ser null!";
		}
		
/*		if(t.getDataCadastro() == null){
			throw new BusinessException("A variável 'dataCadastro' deve ser informada!");
		}*/
		
		if(t.getIdCubo() != null){
			return "A variavel ID não pode ser informada na criação de um novo objeto!";
		}
		
		if(t.getCliente() != null){
			if(t.getCliente().getIdCliente() != null){
				Cliente cliente = empresaDao.getObjById(t.getCliente().getIdCliente());
				if(cliente == null){
					//throw new BusinessException("Nenhum resultado para a variável 'empresa' foi encontrado!");
					return "Nenhum resultado para a variável 'empresa' foi encontrado!";
				}
			}else{
				//throw new BusinessException("A variável 'empresa.idEmpresa' deve ser informada!");
				return "A variável 'empresa.idEmpresa' deve ser informada!";
			}
		}else{
//			throw new BusinessException("A variável 'empresa' deve ser informada!");
			return "A variável 'empresa' deve ser informada!";
		}
		
		if(t.getMdx().equals(null) || t.getMdx().equals("")){
//			throw new BusinessException("A variável 'mdx' deve ser informada!");
			return "A variável 'mdx' deve ser informada!";
		}
			
//		t.setMdx(t.getMdx() + "::xml");
		
		
		if(t.getNomeCubo().equals(null) || t.getNomeCubo().equals("")){
//			throw new BusinessException("A variável 'nomeCubo' deve ser informada!");
			return "A variável 'nomeCubo' deve ser informada!";
		}
		
		if(t.getTabelaFato().equals(null) || t.getTabelaFato().equals("")){
//			throw new BusinessException("A variável 'tabelaFato' deve ser informada!");
			return "A variável 'tabelaFato' deve ser informada!";
		}
		
		if(t.getTamanho() == null){
//			throw new BusinessException("A variável 'tamanho' deve ser informada!");
			return "A variável 'tamanho' deve ser informada!";
		}
		
		if(t.getUsuarioId() == null){
//			throw new BusinessException("A variável 'usuarioId' deve ser informada!");
			return "A variável 'usuarioId' deve ser informada!";
		}
		
		t.setDataCadastro(Util.getDate());
		t.setStatus(true);
		
		cuboDao.create(t);
		return "Cubo cadastrado com sucesso!";
	}

	@Override
	public List<Cubo> list() {
		List<Cubo> cubos = new ArrayList<>();
		for(Cubo c : cuboDao.list()){
			if(c.isStatus() == true){
				cubos.add(c);
			}
		}
		return cubos;
	}

	@Override
	public String update(Cubo t){
		
		if(t == null){
//			throw new BusinessException("O objeto não pode ser null!");
			return "O objeto não pode ser null!";
		}
		
		if(t.getIdCubo() == null){
//			throw new BusinessException("A variável 'idCidade' deve ser informada!");
			return "A variável 'idCidade' deve ser informada!";
		}else{
			Cubo cubo = cuboDao.getObjById(t.getIdCubo());
			if(cubo == null){
//				throw new BusinessException("Nenhum resultado para a variável 'cubo' foi encontrado!");
				return "Nenhum resultado para a variável 'cubo' foi encontrado!";
			}
		}
		
/*		if(t.getDataCadastro() == null){
			throw new BusinessException("A variável 'dataCadastro' deve ser informada!");
		}*/
		
		if(t.getCliente() != null){
			if(t.getCliente().getIdCliente() != null){
				Cliente cliente = empresaDao.getObjById(t.getCliente().getIdCliente());
				if(cliente == null){
//					throw new BusinessException("Nenhum resultado para a variável 'empresa' foi encontrado!");
					return "Nenhum resultado para a variável 'empresa' foi encontrado!";
				}
			}else{
//				throw new BusinessException("A variável 'empresa.idEmpresa' deve ser informada!");
				return "A variável 'empresa.idEmpresa' deve ser informada!";
			}
		}else{
//			throw new BusinessException("A variável 'empresa' deve ser informada!");
			return "A variável 'empresa' deve ser informada!";
		}
		
		if(t.getMdx().equals(null) || t.getMdx().equals("")){
//			throw new BusinessException("A variável 'mdx' deve ser informada!");
			return "A variável 'mdx' deve ser informada!";
		}
		
		if(t.getNomeCubo().equals(null) || t.getNomeCubo().equals("")){
//			throw new BusinessException("A variável 'nomeCubo' deve ser informada!");
			return "A variável 'nomeCubo' deve ser informada!";
		}
		
		if(t.getTabelaFato().equals(null) || t.getTabelaFato().equals("")){
//			throw new BusinessException("A variável 'tabelaFato' deve ser informada!");
			return "A variável 'tabelaFato' deve ser informada!";
		}
		
		if(t.getTamanho() == null){
//			throw new BusinessException("A variável 'tamanho' deve ser informada!");
			return "A variável 'tamanho' deve ser informada!";
		}
		
		if(t.getUsuarioId() == null){
//			throw new BusinessException("A variável 'usuarioId' deve ser informada!");
			return "A variável 'usuarioId' deve ser informada!";
		}
		
		t.setDataCadastro(Util.getDate());
		t.setStatus(true);
		
		cuboDao.update(t);
		return "Cubo alterado com sucesso!";
	}

	@Override
	public String delete(Integer id){
		Cubo cubo = getObjById(id);
		if(cubo == null){
			return "Nenhum resultado foi encontrado na tabela Cubo com o id {"+id+"}";
		}
		cuboDao.delete(cubo);
		return "Cubo deletado com sucesso!";
	}

	@Override
	public Cubo getObjById(Integer id){
		Cubo cubo = cuboDao.getObjById(id);
		if(cubo != null && cubo.isStatus() != false){
			return cubo;
		}
		return null;
	}

}
