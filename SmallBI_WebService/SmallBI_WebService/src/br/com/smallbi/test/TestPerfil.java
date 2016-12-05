package br.com.smallbi.test;

import java.util.Calendar;
import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.smallbi.business.PerfilBusiness;
import br.com.smallbi.business.exception.BusinessException;
import br.com.smallbi.entity.Perfil;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestPerfil {

	PerfilBusiness perfilBusiness = new PerfilBusiness();
	public static int idTestPerfil;
	
	@Test
	public void test1CreatePerfil(){
		Perfil perfil = new Perfil();
		perfil.setDataCadastro(Calendar.getInstance());
		perfil.setNomePerfil("Adm");
		perfil.setStatus(true);
		perfil.setUsuarioId(1);
		
		try {
			perfilBusiness.create(perfil);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
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
			System.out.println("data de cadastro: " + p.getDataCadastro().getTime());
			System.out.println("----------");
		}
	}
	
	@Test
	public void test3UpdatePerfil(){
		try {
			Perfil p = perfilBusiness.getObjById(idTestPerfil);
			p.setNomePerfil("User");
			perfilBusiness.update(p);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
		System.out.println("UPDATE");
		test2ListPerfil();
	}

	@Test
	public void test4DeletePerfil(){
		try {
			perfilBusiness.delete(idTestPerfil);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("DELETE");
		test2ListPerfil();
	}
}
