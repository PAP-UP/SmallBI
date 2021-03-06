package br.com.smallbi.business;

import java.util.ArrayList;
import java.util.List;

import br.com.smallbi.business.interfaceBusiness.InterfaceBusiness;
import br.com.smallbi.dal.factory.FactoryDao;
import br.com.smallbi.dal.interfaceDal.InterfaceDao;
import br.com.smallbi.entity.Cliente;
import br.com.smallbi.entity.Pessoa;
import br.com.smallbi.entity.Telefone;
import br.com.smallbi.entity.Tipo;
import br.com.smallbi.util.Data;

public class TelefoneBusiness implements InterfaceBusiness<Telefone>{

	InterfaceDao<Telefone> telefoneDao = FactoryDao.createTelefoneDao();
	InterfaceDao<Cliente> empresaDao = FactoryDao.createClienteDao();
	InterfaceDao<Pessoa> pessoaDao = FactoryDao.createPessoaDao();
	InterfaceDao<Tipo> tipoDao = FactoryDao.createTipoDao();
	
	@Override
	public String create(Telefone t){
		
		if(t == null){
			return "O objeto não pode ser null!";
		}
		
		if(t.getIdTelefone() != null){
			return "A variavel ID não pode ser informada na criação de um novo objeto!";
		}
		
/*		if(t.getDdd() <= 0){
			return "A variável 'ddd' deve ser informada!";
		}*/
		
/*		if(t.getEmpresa() != null){
			if(t.getEmpresa().getIdCliente() != null){
				Cliente cliente = empresaDao.getObjById(t.getEmpresa().getIdCliente());
				if(cliente == null){
					return "Nenhum resultado para a variável 'empresa' foi encontrado!";
				}
			}else{
				return "A variável 'empresa.idEmpresa' deve ser informada!";
			}
		}else{
			return "A variável 'empresa' deve ser informada!";
		}
		
		if(t.getPessoa() != null){
			if(t.getPessoa().getIdPessoa() != null){
				Pessoa pessoa = pessoaDao.getObjById(t.getPessoa().getIdPessoa());
				if(pessoa == null){
					return "Nenhum resultado para a variável 'pessoa' foi encontrado!";
				}
			}else{
				return "A variável 'pessoa.idPessoa' deve ser informada!";
			}
		}else{
			return "A variável 'pessoa' deve ser informada!";
		}*/
		
		if(t.getTelefone().equals(null) || t.getTelefone().equals("")){
			return "A variável 'telefone' deve ser informada!";
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
		
		telefoneDao.create(t);
		return "Telefone cadastrado com sucesso!";
	}

	@Override
	public List<Telefone> list() {
		List<Telefone> telefones = new ArrayList<>();
		for(Telefone t : telefoneDao.list()){
			if(t.isStatus() == true){
				telefones.add(t);
			}
		}
		return telefones;
	}

	@Override
	public String update(Telefone t){
		
		if(t == null){
			return "O objeto não pode ser null!";
		}
		
		if(t.getIdTelefone() == null){
			return "A variável 'idTelefone' deve ser informada!";
		}else{
			Telefone telefone = telefoneDao.getObjById(t.getIdTelefone());
			if(telefone == null){
				return "Nenhum resultado para a variável 'telefone' foi encontrado!";
			}
		}
		
/*		if(t.getDdd() <= 0){
			return "A variável 'ddd' deve ser informada!";
		}*/
		
/*		if(t.getCliente() != null){
			if(t.getCliente().getIdCliente() != null){
				Cliente cliente = empresaDao.getObjById(t.getCliente().getIdCliente());
				if(cliente == null){
					return "Nenhum resultado para a variável 'empresa' foi encontrado!";
				}
			}else{
				return "A variável 'empresa.idEmpresa' deve ser informada!";
			}
		}else{
			return "A variável 'empresa' deve ser informada!";
		}
		
		if(t.getPessoa() != null){
			if(t.getPessoa().getIdPessoa() != null){
				Pessoa pessoa = pessoaDao.getObjById(t.getPessoa().getIdPessoa());
				if(pessoa == null){
					return "Nenhum resultado para a variável 'pessoa' foi encontrado!";
				}
			}else{
				return "A variável 'pessoa.idPessoa' deve ser informada!";
			}
		}else{
			return "A variável 'pessoa' deve ser informada!";
		}*/
		
		if(t.getTelefone().equals(null) || t.getTelefone().equals("")){
			return "A variável 'telefone' deve ser informada!";
		}
		
/*		if(t.getTipo() != null){
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
		}*/
		
		/*if(t.getUsuarioId() == null){
			return "A variável 'usuarioId' deve ser informada!";
		}*/
		
		t.setUsuarioId(1);
		t.setDataCadastro(Data.getDate());
		t.setStatus(true);
		
		telefoneDao.update(t);
		return "Telefone alterado com sucesso!";
	}

	@Override
	public String delete(Integer id){
		Telefone telefone = getObjById(id);
		if(telefone == null){
			return "Nenhum resultado foi encontrado na tabela Telefone com o id {"+id+"}";
		}
		telefoneDao.delete(telefone);
		return "Telefone deletado com sucesso!";
	}

	@Override
	public Telefone getObjById(Integer id){
		Telefone telefone = telefoneDao.getObjById(id);
		if(telefone != null && telefone.isStatus() != false){
			return telefone;
		}
		return null;
	}
	
	public Telefone getByPessoa(Integer idPessoa){
		List<Telefone> telefones = list();
		for(Telefone t : telefones){
			if(t.getPessoa() != null){
				if(t.getPessoa().getIdPessoa() == idPessoa){
					return t;
				}
			}
		}
		return null;
	}
	
	public Telefone getByCliente(Integer idCliente){
		List<Telefone> telefones = list();
		for(Telefone t : telefones){
			if(t.getCliente() != null){
				if(t.getCliente().getIdCliente() == idCliente){
					return t;
				}
			}
		}
		return null;
	}
}
