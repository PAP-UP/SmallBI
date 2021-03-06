package br.com.smallbi.test;

import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.smallbi.business.PerfilBusiness;
import br.com.smallbi.entity.Perfil;
import br.com.smallbi.util.Data;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestPerfil {

	PerfilBusiness perfilBusiness = new PerfilBusiness();
	public static int idTestPerfil;
	
	@Test
	public void test1CreatePerfil(){
		Perfil perfil = new Perfil();
		perfil.setDataCadastro(Data.getDate());
		perfil.setNomePerfil("Adm");
		perfil.setStatus(true);
		perfil.setUsuarioId(1);
		
		perfilBusiness.create(perfil);
		idTestPerfil = perfil.getIdPerfil();
	}
	
	@Test
	public void test2ListPerfil(){
		List<Perfil> perfis = perfilBusiness.list();
		System.out.println("<<Perfis>>");
		for(Perfil p : perfis){
			System.out.println("----------");
			System.out.println("Perfil: " + p.getNomePerfil());
			System.out.println("Id: " + p.getIdPerfil());
			System.out.println("Usuário: " + p.getUsuarioId());
			System.out.println("data de cadastro: " + Data.formatDate(p.getDataCadastro()));
			System.out.println("----------");
		}
	}
	
	@Test
	public void test3UpdatePerfil(){
		Perfil p = perfilBusiness.getObjById(idTestPerfil);
		p.setNomePerfil("User");
		perfilBusiness.update(p);
		System.out.println("UPDATE");
		test2ListPerfil();
	}

	@Test
	public void test4DeletePerfil(){
		perfilBusiness.delete(idTestPerfil);
		System.out.println("DELETE");
		test2ListPerfil();
	}
}
