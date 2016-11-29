package br.com.smallbi.test;

import java.util.Calendar;
import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.smallbi.business.EstadoBusiness;
import br.com.smallbi.business.exception.BusinessException;
import br.com.smallbi.entity.Estado;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestEstado{

	EstadoBusiness estadoBusiness = new EstadoBusiness();
	public static int idTestEstado;
	
	@Test
	public void test1CreateEstado(){
		Estado estado = new Estado();
		estado.setNomeEstado("Santa Catarina");
		estado.setSiglaEstado("RS");
		estado.setUsuarioId(1);
		estado.setDataCadastro(Calendar.getInstance());		
		try {
			estadoBusiness.create(estado);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
		idTestEstado = estado.getIdEstado();
	}
	
	@Test
	public void test2ListEstado(){
		List<Estado> estados = estadoBusiness.list();
		System.out.println("<<Estados>>");
		for(Estado e : estados){
			System.out.println("----------");
			System.out.println("Nome: " + e.getNomeEstado());
			System.out.println("Sigla: " + e.getSiglaEstado());
			System.out.println("Id: " + e.getIdEstado());
			System.out.println("Usuário: " + e.getUsuarioId());
			System.out.println("Data de Cadastro: " + e.getDataCadastro().getTime());
			System.out.println("----------");
		}
	}
	
	@Test
	public void test3UpdateEstado(){
		try {
			Estado e = estadoBusiness.getObjById(idTestEstado);
			e.setNomeEstado("Paraná");
			estadoBusiness.update(e);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
		System.out.println("UPDATE");
		test2ListEstado();
	}
	
//	@Test
//	public void testDeleteEstado(){
//		try {
//			estadoBusiness.delete(idGerado);
//		} catch (BusinessException e) {
//			e.printStackTrace();
//		}
//		System.out.println("DELETE");
//		testListEstado();
//	}
}