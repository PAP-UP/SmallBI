package br.com.smallbi.test;

import java.util.Calendar;
import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.smallbi.business.CidadeBusiness;
import br.com.smallbi.business.EnderecoBusiness;
import br.com.smallbi.business.TipoBusiness;
import br.com.smallbi.business.exception.BusinessException;
import br.com.smallbi.entity.Cidade;
import br.com.smallbi.entity.Endereco;
import br.com.smallbi.entity.Tipo;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestEndereco {
	
	EnderecoBusiness enderecoBusiness = new EnderecoBusiness();
	public static int idTestEndereco;
	
	@Test
	public void test1CreateEndereco(){
		Endereco endereco = new Endereco();
		endereco.setBairro("Centro");
		
		List<Cidade> cidades = new CidadeBusiness().list();
		Cidade cidade = cidades.get(0);
		endereco.setCidade(cidade);
		
		endereco.setDataCadastro(Calendar.getInstance());
		endereco.setEndereco("Rua do Zacarias");
		endereco.setNumero("1200");
		endereco.setStatus(true);
		
		List<Tipo> tipos = new TipoBusiness().list();
		Tipo tipo = tipos.get(0);
		endereco.setTipo(tipo);
		
		endereco.setUsuarioId(1);
		
		try {
			enderecoBusiness.create(endereco);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
		idTestEndereco = endereco.getIdEndereco();
	}
	
	@Test
	public void test2ListEndereco(){
		List<Endereco> enderecos = enderecoBusiness.list();
		System.out.println("<<Endereços>>");
		for(Endereco e : enderecos){
			System.out.println("----------");
			System.out.println("Bairro: " + e.getBairro());
			System.out.println("Endereço: " + e.getEndereco());
			System.out.println("Número: " + e.getNumero());
			System.out.println("Cidade: " + e.getCidade().getNomeCidade());
			System.out.println("Data de cadastro: " + e.getDataCadastro().getTime());
			System.out.println("Tipo de endereço: " + e.getTipo().getTipo());
			System.out.println("Usuário: " + e.getUsuarioId());
			System.out.println("----------");
		}
	}
	
	@Test
	public void test3UpdateEndereco(){
		try {
			Endereco endereco = enderecoBusiness.getObjById(idTestEndereco);
			endereco.setEndereco("Rua dos Bobos");
			endereco.setNumero("0");
			enderecoBusiness.update(endereco);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
		test2ListEndereco();
	}

	@Test
	public void test4DeleteEndereco(){
		try {
			enderecoBusiness.delete(idTestEndereco);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("DELETE");
		test2ListEndereco();
	}
}
