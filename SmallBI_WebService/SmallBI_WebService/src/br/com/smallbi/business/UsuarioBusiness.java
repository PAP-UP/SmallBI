package br.com.smallbi.business;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.smallbi.business.exception.BusinessException;
import br.com.smallbi.business.interfaceBusiness.InterfaceBusiness;
import br.com.smallbi.dal.factory.FactoryDao;
import br.com.smallbi.dal.interfaceDal.InterfaceDao;
import br.com.smallbi.entity.Empresa;
import br.com.smallbi.entity.Perfil;
import br.com.smallbi.entity.Pessoa;
import br.com.smallbi.entity.Usuario;

public class UsuarioBusiness implements InterfaceBusiness<Usuario>{

	InterfaceDao<Usuario> usuarioDao = FactoryDao.createUsuarioDao();
	InterfaceDao<Empresa> empresaDao = FactoryDao.createEmpresaDao();
	InterfaceDao<Perfil> perfilDao = FactoryDao.createPerfilDao();
	InterfaceDao<Pessoa> pessoaDao = FactoryDao.createPessoaDao();
	
	@Override
	public void create(Usuario t) throws BusinessException {
		
		if(t == null){
			throw new BusinessException("O objeto não pode ser null!");
		}
		
/*		if(t.getDataCadastro() == null){
			throw new BusinessException("A variável 'dataCadastro' deve ser informada!");
		}*/
		
		if(t.getEmpresa() != null){
			if(t.getEmpresa().getIdEmpresa() != null){
				Empresa empresa = empresaDao.getObjById(t.getEmpresa().getIdEmpresa());
				if(empresa == null){
					throw new BusinessException("Nenhum resultado para a variável 'empresa' foi encontrado!");
				}
			}else{
				throw new BusinessException("A variável 'empresa.idEmpresa' deve ser informada!");
			}
		}else{
			throw new BusinessException("A variável 'empresa' deve ser informada!");
		}
		
		if(t.getUsuarioId() == null){
			throw new BusinessException("A variável 'usuarioId' deve ser informada!");
		}
		
		if(t.getLogin().equals(null)|| t.getLogin().equals("")){
			throw new BusinessException("A variável 'login' deve ser informada!");
		}
		
		if(t.getPerfil() != null){
			if(t.getPerfil().getIdPerfil() != null){
				Perfil perfil = perfilDao.getObjById(t.getPerfil().getIdPerfil());
				if(perfil == null){
					throw new BusinessException("Nenhum resultado para a variável 'perfil' foi encontrado!");
				}
			}else{
				throw new BusinessException("A variável 'perfil.idPerfil' deve ser informada!");
			}
		}else{
			throw new BusinessException("A variável 'perfil' deve ser informada!");
		}
		
		if(t.getPessoa() != null){
			if(t.getPessoa().getIdPessoa() != null){
				Pessoa pessoa = pessoaDao.getObjById(t.getPessoa().getIdPessoa());
				if(pessoa == null){
					throw new BusinessException("Nenhum resultado para a variável 'pessoa' foi encontrado!");
				}
			}else{
				throw new BusinessException("A variável 'pessoa.idPessoa' deve ser informada!");
			}
		}else{
			throw new BusinessException("A variável 'pessoa' deve ser informada!");
		}

		
		if(t.getSenha().equals(null) || t.getSenha().equals("")){
			throw new BusinessException("A variável 'senha' deve ser informada!");
		}
		
		if(t.getUsuarioId() == null){
			throw new BusinessException("A variável 'usuarioId' deve ser informada!");
		}
		
		if(t.getUsuarioSaiku().equals(null) || t.getUsuarioSaiku().equals("")){
			throw new BusinessException("A variável 'usuarioSaiku' deve ser informada!");
		}	
		
		t.setDataCadastro(Calendar.getInstance());
		t.setStatus(true);
		
		usuarioDao.create(t);
	}

	@Override
	public List<Usuario> list() {
		List<Usuario> usuarios = new ArrayList<>();
		for(Usuario u : usuarioDao.list()){
			if(u.isStatus() == true){
				usuarios.add(u);
			}
		}
		return usuarios;
	}

	@Override
	public void update(Usuario t) throws BusinessException {
		
/*		if(t.getDataCadastro() == null){
			throw new BusinessException("A variável 'dataCadastro' deve ser informada!");
		}*/
		
		if(t.getEmpresa() != null){
			if(t.getEmpresa().getIdEmpresa() != null){
				Empresa empresa = empresaDao.getObjById(t.getEmpresa().getIdEmpresa());
				if(empresa == null){
					throw new BusinessException("Nenhum resultado para a variável 'empresa' foi encontrado!");
				}
			}else{
				throw new BusinessException("A variável 'empresa.idEmpresa' deve ser informada!");
			}
		}else{
			throw new BusinessException("A variável 'empresa' deve ser informada!");
		}
		
		/*if(t.getIdUsuario() == null){
			throw new BusinessException("A variável 'idUsuario' deve ser informada!");
		}*/
		
		if(t.getLogin().equals(null)|| t.getLogin().equals("")){
			throw new BusinessException("A variável 'login' deve ser informada!");
		}
		
		if(t.getPerfil() != null){
			if(t.getPerfil().getIdPerfil() != null){
				Perfil perfil = perfilDao.getObjById(t.getPerfil().getIdPerfil());
				if(perfil == null){
					throw new BusinessException("Nenhum resultado para a variável 'perfil' foi encontrado!");
				}
			}else{
				throw new BusinessException("A variável 'perfil.idPerfil' deve ser informada!");
			}
		}else{
			throw new BusinessException("A variável 'perfil' deve ser informada!");
		}
		
		if(t.getPessoa() != null){
			if(t.getPessoa().getIdPessoa() != null){
				Pessoa pessoa = pessoaDao.getObjById(t.getPessoa().getIdPessoa());
				if(pessoa == null){
					throw new BusinessException("Nenhum resultado para a variável 'pessoa' foi encontrado!");
				}
			}else{
				throw new BusinessException("A variável 'pessoa.idPessoa' deve ser informada!");
			}
		}else{
			throw new BusinessException("A variável 'pessoa' deve ser informada!");
		}

		
		if(t.getSenha().equals(null) || t.getSenha().equals("")){
			throw new BusinessException("A variável 'senha' deve ser informada!");
		}
		
		if(t.getUsuarioId().equals(null)){
			throw new BusinessException("A variável 'usuarioId' deve ser informada!");
		}
		
		if(t.getUsuarioSaiku().equals(null) || t.getUsuarioSaiku().equals("")){
			throw new BusinessException("A variável 'usuarioSaiku' deve ser informada!");
		}	
		
		t.setDataCadastro(Calendar.getInstance());
		t.setStatus(true);
		
		usuarioDao.update(t);
	}

	@Override
	public void delete(Integer id) throws BusinessException {
		Usuario usuario = usuarioDao.getObjById(id);
		if(usuario == null){
			throw new BusinessException("Nenhum resultado foi encontrado para o objeto do tipo 'Usuario'!");
		}
		usuarioDao.delete(usuario);
	}

	@Override
	public Usuario getObjById(Integer id) throws BusinessException {
		Usuario usuario = usuarioDao.getObjById(id);
		if(usuario == null){
			throw new BusinessException("Nenhum resultado foi encontrado para o objeto do tipo 'Usuario'!");
		}
		return usuario;
	}

	public void createFirstUser(Usuario usuario){
		usuarioDao.create(usuario);
	}
}
