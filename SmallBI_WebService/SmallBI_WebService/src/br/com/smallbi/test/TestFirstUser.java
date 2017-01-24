package br.com.smallbi.test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.smallbi.business.UsuarioBusiness;
import br.com.smallbi.entity.Usuario;
import br.com.smallbi.util.Util;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestFirstUser {

	@Test
	public void test1CreateFirstUser(){
		Usuario usuario = new Usuario();
		usuario.setDataCadastro(Util.getDate());
		usuario.setCliente(null);
		usuario.setLogin("deynesonborba");
		usuario.setPerfil(null);
		usuario.setPessoa(null);
		usuario.setSenha("12345");
		usuario.setUsuarioId(null);
		usuario.setUsuarioSaiku(null);
		usuario.setStatus(true);
		
		new UsuarioBusiness().createFirstUser(usuario);
	}
}
