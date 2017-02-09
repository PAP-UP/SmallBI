package br.com.smallbi.business;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import br.com.smallbi.business.interfaceBusiness.InterfaceBusiness;
import br.com.smallbi.dal.UsuarioDao;
import br.com.smallbi.dal.factory.FactoryDao;
import br.com.smallbi.dal.interfaceDal.InterfaceDao;
import br.com.smallbi.entity.Cliente;
import br.com.smallbi.entity.Perfil;
import br.com.smallbi.entity.Pessoa;
import br.com.smallbi.entity.Usuario;
import br.com.smallbi.util.SaikuConnection;
import br.com.smallbi.util.Util;

public class UsuarioBusiness implements InterfaceBusiness<Usuario>{

	InterfaceDao<Usuario> usuarioDao = FactoryDao.createUsuarioDao();
	InterfaceDao<Cliente> empresaDao = FactoryDao.createClienteDao();
	InterfaceDao<Perfil> perfilDao = FactoryDao.createPerfilDao();
	InterfaceDao<Pessoa> pessoaDao = FactoryDao.createPessoaDao();
//	private Random random = new SecureRandom();
	
	@Override
	public String create(Usuario t){
		
		if(t == null){
			return "O objeto não pode ser null!";
		}
		
		if(t.getIdUsuario() != null){
			return "A variavel ID não pode ser informada na criação de um novo objeto!";
		}
		
		if(t.getUsuarioId() == null){
			return "A variável 'usuarioId' deve ser informada!";
		}
		
		if(t.getLogin().equals(null)|| t.getLogin().equals("")){
			return "A variável 'login' deve ser informada!";
		}
		
		if(t.getPerfil() != null){
			if(t.getPerfil().getIdPerfil() != null){
				Perfil perfil = perfilDao.getObjById(t.getPerfil().getIdPerfil());
				if(perfil == null){
					return "Nenhum resultado para a variável 'perfil' foi encontrado!";
				}
			}else{
				return "A variável 'perfil.idPerfil' deve ser informada!";
			}
		}else{
			return "A variável 'perfil' deve ser informada!";
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
		}

		
		if(t.getSenha().equals(null) || t.getSenha().equals("")){
			return "A variável 'senha' deve ser informada!";
		}
		
		if(t.getUsuarioId() == null){
			return "A variável 'usuarioId' deve ser informada!";
		}
		
		if(t.getUsuarioSaiku().equals(null) || t.getUsuarioSaiku().equals("")){
			return "A variável 'usuarioSaiku' deve ser informada!";
		}	
		
		t.setDataCadastro(Util.getDate());
		t.setStatus(true);
		
		int code = SaikuConnection.addUsuarioSaiku(t.getUsuarioSaiku(), t.getSenha());
		
		if(code != 200){
			return "Falha ao adicionar usuário ao sistema Saiku!" + " Código da API do Saiku: " + code;
		}
		
		//Call here encryption method
		//t.setSenha(Util.makePasswordHash(t.getSenha(), Integer.toString(random.nextInt())));
		
		usuarioDao.create(t);
		return "Usuario cadastrado com sucesso!";
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
	public String update(Usuario t){
		
		if(t.getIdUsuario() == null){
			return "A variável 'idUsuario' deve ser informada!";
		}else{
			Usuario usuario = usuarioDao.getObjById(t.getIdUsuario());
			if(usuario == null){
				return "Nenhum resultado para a variável 'usuario' foi encontrado!";
			}
		}
		
		if(t.getLogin().equals(null)|| t.getLogin().equals("")){
			return "A variável 'login' deve ser informada!";
		}
		
		if(t.getPerfil() != null){
			if(t.getPerfil().getIdPerfil() != null){
				Perfil perfil = perfilDao.getObjById(t.getPerfil().getIdPerfil());
				if(perfil == null){
					return "Nenhum resultado para a variável 'perfil' foi encontrado!";
				}
			}else{
				return "A variável 'perfil.idPerfil' deve ser informada!";
			}
		}else{
			return "A variável 'perfil' deve ser informada!";
		}
		
		if(t.getPessoa() != null){
			if(t.getPessoa().getIdPessoa() != null){
				Pessoa pessoa = pessoaDao.getObjById(t.getPessoa().getIdPessoa());
				if(pessoa == null){
					return "Nenhum resultado para a variável 'pessoa' foi encontrado!";
				}else{
					new PessoaBusiness().update(t.getPessoa());
				}
			}else{
				return "A variável 'pessoa.idPessoa' deve ser informada!";
			}
		}else{
			return "A variável 'pessoa' deve ser informada!";
		}

		
		if(t.getSenha().equals(null) || t.getSenha().equals("")){
			return "A variável 'senha' deve ser informada!";
		}
		
		//Usuário que está alterando estas informações
		if(t.getUsuarioId().equals(null)){
			return "A variável 'usuarioId' deve ser informada!";
		}
		
		if(t.getUsuarioSaiku().equals(null) || t.getUsuarioSaiku().equals("")){
			return "A variável 'usuarioSaiku' deve ser informada!";
		}	
		
		t.setDataCadastro(Util.getDate());
		t.setStatus(true);
		
		//Call here encryption method
		//t.setSenha(Util.makePasswordHash(t.getSenha(), Integer.toString(random.nextInt())))
		
		usuarioDao.update(t);
		return "Usuario alterado com sucesso!";
	}

	@Override
	public String delete(Integer id){
		Usuario usuario = getObjById(id);
		if(usuario == null){
			return "Nenhum resultado foi encontrado na tabela Usuario com o id {"+id+"}";
		}
		usuarioDao.delete(usuario);
		return "Usuario deletado com sucesso!";
	}

	@Override
	public Usuario getObjById(Integer id) {
		Usuario usuario = usuarioDao.getObjById(id);
		if(usuario != null && usuario.isStatus() != false){
			return usuario;
		}
		return null;
	}
	
	public Usuario getByUsername(String username){		
		List<Usuario> usuarios = list();		
		for(Usuario u : usuarios){
			if(u.getLogin().equals(username))
				return u;
		}
		return null;
	}

	public void createFirstUser(Usuario usuario){
		usuarioDao.create(usuario);
	}
	
	public String validarLogin(String login, String senha){
		Usuario usuario = Util.validateLogin(login, senha);
		if(usuario == null)
			return "Usuário ou senha inválidos!";
		
		//Chamar metodo que permite acesso ao site
		return null;
	}
}
