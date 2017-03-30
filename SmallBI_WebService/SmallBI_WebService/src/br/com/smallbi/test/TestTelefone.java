package br.com.smallbi.test;

import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.smallbi.business.TelefoneBusiness;
import br.com.smallbi.business.TipoBusiness;
import br.com.smallbi.entity.Telefone;
import br.com.smallbi.entity.Tipo;
import br.com.smallbi.util.Data;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestTelefone {
	
	TelefoneBusiness telefoneBusiness = new TelefoneBusiness();
	public static int idTestTeledone;

	@Test
	public void test1CreateTelefone(){
		Telefone telefone = new Telefone();
		telefone.setDataCadastro(Data.getDate());
		
		
		//---------------------------------------------		
		//ATRIBUI ESTE TELEFONE A UMA PESSOA OU CLIENTE
		//---------------------------------------------
		/*List<Cliente> clientes = new ClienteBusiness().list();
		Cliente cliente = clientes.get(0);
		telefone.setCliente(cliente);*/
		
		/*List<Pessoa> pessoas = new PessoaBusiness().list();
		Pessoa pessoa = pessoas.get(0);
		telefone.setPessoa(pessoa);*/
		
//		telefone.setStatus(true);
		telefone.setTelefone("1234-5678");
		
		List<Tipo> tipos = new TipoBusiness().list();
		Tipo tipo = tipos.get(0);
		telefone.setTipo(tipo);
		
		telefone.setUsuarioId(1);
		
		telefoneBusiness.create(telefone);
		idTestTeledone = telefone.getIdTelefone();
	}
	
	@Test
	public void test2ListTelefone(){
		List<Telefone> telefones = telefoneBusiness.list();
		System.out.println("<<Telefones>>");
		for(Telefone t : telefones){
			System.out.println("----------");
			System.out.println("Telefone: " + t.getTelefone());
			System.out.println("Id: " + t.getIdTelefone());
			System.out.println("Usuário: " + t.getUsuarioId());
			System.out.println("Data de cadastro: " + Data.formatDate(t.getDataCadastro()));
			System.out.println("Tipo: " + t.getTipo().getTipo());
			System.out.println("----------");
		}
	}
	
	@Test
	public void test3UpdateTelefone(){
		Telefone t = telefoneBusiness.getObjById(idTestTeledone);
		t.setTelefone("9999-9999");
		telefoneBusiness.update(t);
		System.out.println("UPDATE");
		test2ListTelefone();
	}

	@Test
	public void test4DeleteTelefone(){
		telefoneBusiness.delete(idTestTeledone);
		System.out.println("DELETE");
		test2ListTelefone();
	}
}
