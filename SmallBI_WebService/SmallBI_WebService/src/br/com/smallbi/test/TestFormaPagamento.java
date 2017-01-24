package br.com.smallbi.test;

import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.smallbi.business.FormaPagamentoBusiness;
import br.com.smallbi.entity.FormaPagamento;
import br.com.smallbi.util.Util;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestFormaPagamento {

	FormaPagamentoBusiness formaPagamentoBusiness = new FormaPagamentoBusiness();
	public static int idTestFormaPagamento;
	
	@Test
	public void test1CreateFormaPagamento(){
		FormaPagamento formaPagamento = new FormaPagamento();
		formaPagamento.setDataCadastro(Util.getDate());
		formaPagamento.setFormaPagamento("Credit");
		formaPagamento.setStatus(true);
		formaPagamento.setUsuarioId(1);
		formaPagamentoBusiness.create(formaPagamento);
		idTestFormaPagamento = formaPagamento.getIdFormaPagamento();
	}
	
	@Test
	public void test2ListFormaPagamento(){
		List<FormaPagamento> formas = formaPagamentoBusiness.list();
		System.out.println("<<Formas de Pagamento>>");
		for(FormaPagamento f : formas){
			System.out.println("----------");
			System.out.println("Forma de pag: " + f.getFormaPagamento());
			System.out.println("Id: " + f.getIdFormaPagamento());
			System.out.println("Usuário: " + f.getUsuarioId());
			System.out.println("Data de cadastro: " + Util.formatDate(f.getDataCadastro()));
			System.out.println("----------");
		}
	}
	
	@Test
	public void test3UpdateFormaPagamento(){
		FormaPagamento f = formaPagamentoBusiness.getObjById(idTestFormaPagamento);
		f.setFormaPagamento("Debit");
		formaPagamentoBusiness.update(f);
		System.out.println("UPDATE");
		test2ListFormaPagamento();
	}

	@Test
	public void test4DeleteFormaPagamento(){
		formaPagamentoBusiness.delete(idTestFormaPagamento);
		System.out.println("DELETE");
		test2ListFormaPagamento();
	}
}
