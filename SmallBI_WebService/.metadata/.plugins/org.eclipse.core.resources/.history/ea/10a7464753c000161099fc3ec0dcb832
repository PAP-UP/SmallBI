package br.com.smallbi.test;

import java.util.Calendar;
import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.smallbi.business.FuncaoBusiness;
import br.com.smallbi.business.exception.BusinessException;
import br.com.smallbi.entity.Funcao;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestFuncao {

	FuncaoBusiness funcaoBusiness = new FuncaoBusiness();
	public static int idTestFuncao;
	
	@Test
	public void test1CreateFuncao(){
		Funcao funcao = new Funcao();
		funcao.setDataCadastro(Calendar.getInstance());
		funcao.setNomeFuncao("Data Scientist");
		funcao.setStatus(true);
		funcao.setUsuarioId(1);
		
		try {
			funcaoBusiness.create(funcao);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
		idTestFuncao = funcao.getIdFuncao();
	}
	
	@Test
	public void test2ListFuncao(){
		List<Funcao> funcoes = funcaoBusiness.list();
		System.out.println("<<Funções>>");
		for(Funcao f : funcoes){
			System.out.println("----------");
			System.out.println("Função: " + f.getNomeFuncao());
			System.out.println("Id: " + f.getIdFuncao());
			System.out.println("Usuário: " + f.getUsuarioId());
			System.out.println("Data de cadastro: " + f.getDataCadastro().getTime());
			System.out.println("----------");
		}
	}
	
	@Test
	public void test3UpdateFuncao(){
		try {
			Funcao funcao = funcaoBusiness.getObjById(idTestFuncao);
			funcao.setNomeFuncao("Security Analyst");
			funcaoBusiness.update(funcao);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
		System.out.println("UPDATE");
		test2ListFuncao();
	}

	@Test
	public void test4DeleteFuncao(){
		try {
			funcaoBusiness.delete(idTestFuncao);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("DELETE");
		test2ListFuncao();
	}
}
