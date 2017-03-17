package br.com.smallbi.test;

import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.smallbi.business.TipoBusiness;
import br.com.smallbi.entity.Tipo;
import br.com.smallbi.util.Data;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestTipo {

	TipoBusiness tipoBusiness = new TipoBusiness();
	public static int idTestTipo;
	
	@Test
	public void test1CreateTipo(){
		Tipo tipo = new Tipo();
		tipo.setDataCadastro(Data.getDate());
		tipo.setStatus(true);
		tipo.setTipo("Residencial");
		tipo.setUsuarioId(1);
		
		tipoBusiness.create(tipo);
		idTestTipo = tipo.getIdTipo();
	}
	
	@Test
	public void test2ListTipo(){
		List<Tipo> tipos = tipoBusiness.list();
		System.out.println("<<Tipos>>");
		for(Tipo t : tipos){
			System.out.println("----------");
			System.out.println("Tipo: " + t.getTipo());
			System.out.println("Data de Cadastro: " + Data.formatDate(t.getDataCadastro()));
			System.out.println("Usuário: " + t.getUsuarioId());
			System.out.println("id gerado:" + idTestTipo);
			System.out.println("----------");
		}
	}
	
	@Test
	public void test3UpdadeTipo(){
		Tipo tipo = tipoBusiness.getObjById(idTestTipo);
		tipo.setTipo("Comercial");
		tipoBusiness.update(tipo);
		System.out.println("UPDATE");
		test2ListTipo();
	}

	@Test
	public void test4DeleteTipo(){
		tipoBusiness.delete(idTestTipo);
		System.out.println("DELETE");
		test2ListTipo();
	}
}
