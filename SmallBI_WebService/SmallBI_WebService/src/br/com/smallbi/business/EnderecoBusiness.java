package br.com.smallbi.business;

import java.util.ArrayList;
import java.util.List;

import br.com.smallbi.business.interfaceBusiness.InterfaceBusiness;
import br.com.smallbi.dal.factory.FactoryDao;
import br.com.smallbi.dal.interfaceDal.InterfaceDao;
import br.com.smallbi.entity.Cidade;
import br.com.smallbi.entity.Endereco;
import br.com.smallbi.entity.Tipo;
import br.com.smallbi.util.Data;

public class EnderecoBusiness implements InterfaceBusiness<Endereco>{

	InterfaceDao<Endereco> enderecoDao = FactoryDao.createEnderecoDao();
	InterfaceDao<Cidade> cidadeDao = FactoryDao.createCidadeDao();
	InterfaceDao<Tipo> tipoDao = FactoryDao.createTipoDao();
	
	@Override
	public String create(Endereco t){
		
		if(t == null){
			return "O objeto não pode ser null!";
		}
		
		if(t.getIdEndereco() != null){
			return "A variavel ID não pode ser informada na criação de um novo objeto!";
		}
		
		if(t.getBairro().equals(null) || t.getBairro().equals("")){
			return "A variável 'bairro' deve ser informada!";
		}
		
		if(t.getCidade() != null){
			if(t.getCidade().getIdCidade() != null){
				Cidade cidade = cidadeDao.getObjById(t.getCidade().getIdCidade());
				if(cidade == null){
					return "Nenhum resultado para a variável 'cidade' foi encontrado!";
				}
			}else{
				return "A variável 'cidade.idCidade' deve ser informada!";
			}
		}else{
			return "A variável 'cidade' deve ser informada!";
		}
		
		if(t.getEndereco().equals(null) || t.getEndereco().equals("")){
			return "A variável 'endereco' deve ser informada!";
		}
		
		if(t.getNumero() <= 0){
			return "A variável 'numero' deve ser informada!";
		}
		
		if(t.getTipo() != null){
			if(t.getTipo().getIdTipo() != null){
				Tipo tipo = tipoDao.getObjById(t.getTipo().getIdTipo());
				if(tipo == null){
					return "Nenhum resultado para a variável 'tipo' foi encontrado!";
				}
			}else{
				return "A variável 'tipo.idTipo' deve ser informada!";
			}
		}else{
			return "A variável 'tipo' deve ser informada!";
		}
		
		/*if(t.getUsuarioId() == null){
			return "A variável 'usuarioId' deve ser informada!";
		}*/
		t.setUsuarioId(1);
		t.setDataCadastro(Data.getDate());
		t.setStatus(true);
		
		enderecoDao.create(t);
		return "Endereco cadastrado com sucesso!";
	}

	@Override
	public List<Endereco> list() {
		List<Endereco> enderecos = new ArrayList<>();
		for(Endereco e : enderecoDao.list()){
			if(e.isStatus() == true){
				enderecos.add(e);
			}
		}
		return enderecos;
	}

	@Override
	public String update(Endereco t){

		if(t == null){
//			throw new BusinessException("O objeto não pode ser null!");
			return "O objeto não pode ser null!";
		}
		
		if(t.getIdEndereco() == null){
//			throw new BusinessException("A variável 'idEndereco' deve ser informada!");
			return "A variável 'idEndereco' deve ser informada!";
		}else{
			Endereco endereco = enderecoDao.getObjById(t.getIdEndereco());
			if(endereco == null){
//				throw new BusinessException("Nenhum resultado para a variável 'endereco' foi encontrado!");
				return "Nenhum resultado para a variável 'endereco' foi encontrado!";
			}
		}
		
		if(t.getBairro().equals(null) || t.getBairro().equals("")){
//			throw new BusinessException("A variável 'bairro' deve ser informada!");
			return "A variável 'bairro' deve ser informada!";
		}
		
		if(t.getCidade() != null){
			if(t.getCidade().getIdCidade() != null){
				Cidade cidade = cidadeDao.getObjById(t.getCidade().getIdCidade());
				if(cidade == null){
//					throw new BusinessException("Nenhum resultado para a variável 'cidade' foi encontrado!");
					return "Nenhum resultado para a variável 'cidade' foi encontrado!";
				}
			}else{
//				throw new BusinessException("A variável 'cidade.idCidade' deve ser informada!");
				return  "A variável 'cidade.idCidade' deve ser informada!";
			}
		}else{
//			throw new BusinessException("A variável 'cidade' deve ser informada!");
			return "A variável 'cidade' deve ser informada!";
		}
		
/*		if(t.getDataCadastro() == null){
			throw new BusinessException("A variável 'dataCadastro' deve ser informada!");
		}*/
		
		if(t.getEndereco().equals(null) || t.getEndereco().equals("")){
//			throw new BusinessException("A variável 'endereco' deve ser informada!");
			return "A variável 'endereco' deve ser informada!";
		}
		
		if(t.getNumero() <= 0){
//			throw new BusinessException("A variável 'numero' deve ser informada!");
			return "A variável 'numero' deve ser informada!";
		}
		
		if(t.getTipo() != null){
			if(t.getTipo().getIdTipo() != null){
				Tipo tipo = tipoDao.getObjById(t.getTipo().getIdTipo());
				if(tipo == null){
//					throw new BusinessException("Nenhum resultado para a variável 'tipo' foi encontrado!");
					return "Nenhum resultado para a variável 'tipo' foi encontrado!";
				}
			}else{
//				throw new BusinessException("A variável 'tipo.idTipo' deve ser informada!");
				return "A variável 'tipo.idTipo' deve ser informada!";
			}
		}else{
//			throw new BusinessException("A variável 'tipo' deve ser informada!");
			return "A variável 'tipo' deve ser informada!";
		}
		
		/*if(t.getUsuarioId() == null){
//			throw new BusinessException("A variável 'usuarioId' deve ser informada!");
			return "A variável 'usuarioId' deve ser informada!";
		}*/
		
		t.setUsuarioId(1);
		t.setDataCadastro(Data.getDate());
		t.setStatus(true);
		
		enderecoDao.update(t);
		return "Endereco alterado com sucesso!";
	}

	@Override
	public String delete(Integer id){
		Endereco endereco = getObjById(id);
		if(endereco == null){
			return "Nenhum resultado foi encontrado na tabela Endereco com o id {"+id+"}";
		}
		enderecoDao.delete(endereco);
		return "Endereco deletado com sucesso!";
	}

	@Override
	public Endereco getObjById(Integer id){
		Endereco endereco = enderecoDao.getObjById(id);
		if(endereco != null && endereco.isStatus() != false){
			return endereco;
		}
		return null;
	}
	
	public Endereco getByPessoa(Integer idPessoa){
		List<Endereco> enderecos = list();
		for(Endereco e : enderecos){
			if(e.getPessoa() != null){
				if(e.getPessoa().getIdPessoa() == idPessoa){
					return e;
				}
			}			
		}
		return null;
	}
	
	public Endereco getByCliente(Integer idCliente){
		List<Endereco> enderecos = list();
		for(Endereco e : enderecos){
			if(e.getCliente() != null){
				if(e.getCliente().getIdCliente() == idCliente){
					return e;
				}
			}
		}
		return null;
	}
}
