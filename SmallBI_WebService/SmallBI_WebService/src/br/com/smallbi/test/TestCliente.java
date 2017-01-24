package br.com.smallbi.test;

import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.smallbi.business.ClienteBusiness;
import br.com.smallbi.business.FormaPagamentoBusiness;
import br.com.smallbi.business.PlanoBusiness;
import br.com.smallbi.business.RamoAtividadeBusiness;
import br.com.smallbi.entity.Cliente;
import br.com.smallbi.entity.FormaPagamento;
import br.com.smallbi.entity.Plano;
import br.com.smallbi.entity.RamoAtividade;
import br.com.smallbi.util.Util;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestCliente {

	ClienteBusiness clienteBusiness = new ClienteBusiness();
	public static int idTestEmpresa;
	
	@Test
	public void test1CreateEmpresa(){
		Cliente e = new Cliente();
		e.setCnpj("12.123.123/1234-12");
		e.setDataCadastro(Util.getDate());
		
		List<FormaPagamento> formas = new FormaPagamentoBusiness().list();
		FormaPagamento formaPagamento = formas.get(0);
		e.setFormaPagamento(formaPagamento);
		
		e.setIe("I don't know what this!");
		e.setNomeFantasia("SmallBI Enterprise");
		
		List<Plano> planos = new PlanoBusiness().list();
		Plano plano = planos.get(0);
		e.setPlano(plano);
		
		List<RamoAtividade> ramos = new RamoAtividadeBusiness().list();
		RamoAtividade ramoAtividade = ramos.get(0);
		e.setRamoAtividade(ramoAtividade);
		
		e.setRazaoSocial("Deyneson Borba Ltda");
		//e.setStatus(true);
		e.setTamanhoTotal(100);
		e.setUsuarioId(1);
		
		clienteBusiness.create(e);
		idTestEmpresa = e.getIdCliente();
	}
	
	@Test
	public void test2ListEmpresa(){
		List<Cliente> clientes = clienteBusiness.list();
		System.out.println("<<Empresas:>>");
		for(Cliente e : clientes){
			System.out.println("----------");
			System.out.println("CNJP: " + e.getCnpj());
			System.out.println("Ie: " + e.getIe());
			System.out.println("Nome Fantasia: " + e.getNomeFantasia());
			System.out.println("Razão Social: " + e.getRazaoSocial());
			System.out.println("Id: " + e.getIdCliente());
			System.out.println("Tamanho total: " + e.getTamanhoTotal());
			System.out.println("Usuário: " + e.getUsuarioId());
			System.out.println("Data de cadastro: " + Util.formatDate(e.getDataCadastro()));
//			System.out.println("Endereço: " + e.getEndereco().getEndereco());
			System.out.println("Forma de pagamento: " + e.getFormaPagamento().getFormaPagamento());
			System.out.println("Plano: " + e.getPlano().getNomePlano());
			System.out.println("Ramo de atividade: " + e.getRamoAtividade().getRamoAtividade());
			System.out.println("----------");
		}
	}
	
	@Test
	public void test3UpdateEmpresa(){
		Cliente cliente = clienteBusiness.getObjById(idTestEmpresa);
		cliente.setNomeFantasia("SmallBI");
		clienteBusiness.update(cliente);
		System.out.println("UPDATE");
		test2ListEmpresa();
	}

	@Test
	public void test4DeleteEmpresa(){
		clienteBusiness.delete(idTestEmpresa);
		System.out.println("DELETE");
		test2ListEmpresa();
	}
}
