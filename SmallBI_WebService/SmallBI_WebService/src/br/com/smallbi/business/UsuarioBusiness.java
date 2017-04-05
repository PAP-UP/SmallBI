package br.com.smallbi.business;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import br.com.smallbi.business.interfaceBusiness.InterfaceBusiness;
import br.com.smallbi.dal.EnderecoDao;
import br.com.smallbi.dal.PessoaDao;
import br.com.smallbi.dal.TelefoneDao;
import br.com.smallbi.dal.UsuarioLogadoDao;
import br.com.smallbi.dal.factory.FactoryDao;
import br.com.smallbi.dal.interfaceDal.InterfaceDao;
import br.com.smallbi.entity.Cliente;
import br.com.smallbi.entity.Endereco;
import br.com.smallbi.entity.Perfil;
import br.com.smallbi.entity.Pessoa;
import br.com.smallbi.entity.Telefone;
import br.com.smallbi.entity.Usuario;
import br.com.smallbi.entity.UsuarioLogado;
import br.com.smallbi.util.Data;
import br.com.smallbi.util.HashSenha;

public class UsuarioBusiness implements InterfaceBusiness<Usuario>{

	InterfaceDao<Usuario> usuarioDao = FactoryDao.createUsuarioDao();
	InterfaceDao<Cliente> empresaDao = FactoryDao.createClienteDao();
	InterfaceDao<Perfil> perfilDao = FactoryDao.createPerfilDao();
	InterfaceDao<Pessoa> pessoaDao = FactoryDao.createPessoaDao();
	
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
		}else{
			
			String regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
					+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(t.getLogin());
			boolean match = matcher.matches();
			
			if(match == true){
				System.out.println("corresponde");
			}else{
				System.out.println("Não corresponde");
				return "Email inválido!";
			}
			
			List<Usuario> usuarios = list();
			for(Usuario u : usuarios){
				if(u.getLogin().equals(t.getLogin())){
					return "Já existe um usuário com esse login!";
				}
			}
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
					//t.setPessoa(pessoa);
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
		
		//MUDAR PARA SETAR usuarioSaiku COM DADOS DO LOGIN
		t.setUsuarioSaiku(t.getLogin());
		/*if(t.getUsuarioSaiku().equals(null) || t.getUsuarioSaiku().equals("")){
			return "A variável 'usuarioSaiku' deve ser informada!";
		}*/	
		
		/*int code = SaikuConnection.addUsuarioSaiku(t.getUsuarioSaiku(), t.getSenha(), 
				t.getPessoa().getCliente().getIdCliente());
		
		if(code != 200){
			//chamar delete fisico
			new PessoaBusiness().delete(t.getPessoa().getIdPessoa());
			return "Falha ao adicionar usuário ao sistema Saiku!" + " Código da API do Saiku: " + code;
		}*/
		
		//Call here encryption method
		String hashSenha = HashSenha.makePasswordHash(t.getSenha());
		if(hashSenha != null && !hashSenha.equals(""))
			t.setSenha(hashSenha);
		System.out.println(t.getSenha());
		
		t.setDataCadastro(Data.getDate());
		t.setStatus(true);
		
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
		}else{
			
			String regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
					+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(t.getLogin());
			boolean match = matcher.matches();
			
			if(match == true){
				System.out.println("corresponde");
			}else{
				System.out.println("Não corresponde");
				return "Email inválido!";
			}
			
			List<Usuario> usuarios = list();
			for(Usuario u : usuarios){
				if(u.getLogin().equals(t.getLogin())){
					return "Já existe um usuário com esse login!";
				}
			}
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
		
		t.setDataCadastro(Data.getDate());
		t.setStatus(true);
		
		//Call here encryption method
		String hashSenha = HashSenha.makePasswordHash(t.getSenha());
		if(hashSenha != null && !hashSenha.equals(""))
			t.setSenha(hashSenha);
		System.out.println(t.getSenha());
		
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
		
		//Del Pessoa
		//new PessoaBusiness().delete(usuario.getPessoa().getIdPessoa());
		new PessoaDao().physicalDelete(usuario.getPessoa());
		
		//Del Telefone
		EnderecoBusiness enderecoBusiness = new EnderecoBusiness();
		Endereco e = enderecoBusiness.getByPessoa(usuario.getPessoa().getIdPessoa());
		//enderecoBusiness.delete(e.getIdEndereco());
		new EnderecoDao().physicalDelete(e);
		
		//Del Endereço
		TelefoneBusiness telefoneBusiness = new TelefoneBusiness();
		Telefone telefone = telefoneBusiness.getByPessoa(usuario.getPessoa().getIdPessoa());
		//telefoneBusiness.delete(telefone.getIdTelefone());
		new TelefoneDao().physicalDelete(telefone);
		
		
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

/*	public void createFirstUser(Usuario usuario){
		usuarioDao.create(usuario);
	}*/
	
	//Método utilizado na classe CuboBusiness para validação.
	public Usuario getUsuario(String login, String senha){
		
		Usuario u = getByUsername(login);
		if(u != null){
			
			String hashSenha = HashSenha.makePasswordHash(senha);
			if(u.getSenha().equals(hashSenha)){
				return u;
			}
			
			System.out.println("Senha inválida!");
			return null;
		}
		System.out.println("Usuário não encontrado!");
		return null;
	}
	
	public UsuarioLogado login(String login, String senha){
		
		Usuario u = getByUsername(login);
		if(u != null){
			String hashSenha = HashSenha.makePasswordHash(senha);
			if(u.getSenha().equals(hashSenha)){
				
				UsuarioLogado ul = new UsuarioLogado();
				ul.setIdUsuarioLogado(u.getIdUsuario());
				ul.setClienteId(u.getPessoa().getCliente().getIdCliente());
				ul.setData(Data.getDate());
				ul.setToken(new UsuarioLogadoBusiness().criarToken());
				
				new UsuarioLogadoDao().create(ul);
				
				return ul;
			}
			System.out.println("Senha inválida!");
			return null;
		}
		System.out.println("Usuário não encontrado!");
		return null;
	}
}
