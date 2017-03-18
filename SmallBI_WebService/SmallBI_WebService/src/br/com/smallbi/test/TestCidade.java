package br.com.smallbi.test;

import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.smallbi.business.CidadeBusiness;
import br.com.smallbi.business.EstadoBusiness;
import br.com.smallbi.entity.Cidade;
import br.com.smallbi.entity.Estado;
import br.com.smallbi.util.Data;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestCidade {

	CidadeBusiness cidadeBusiness = new CidadeBusiness();
	public static int idTestCidade;
	
	@Test
	public void test1CreateCidade(){
		Cidade cidade = new Cidade();
		cidade.setDataCadastro(Data.getDate());
		
		List<Estado> estados = new EstadoBusiness().list();
		Estado estado = estados.get(0);
		estado.setIdEstado(estado.getIdEstado());
		
		cidade.setEstado(estado);
		cidade.setNomeCidade("Londrina");
		cidade.setStatus(true);
		cidade.setUsuarioId(1);		
		cidadeBusiness.create(cidade);
		idTestCidade = cidade.getIdCidade();
	}
	
	@Test
	public void test2ListCidade(){
		List<Cidade> cidades = cidadeBusiness.list();
		System.out.println("<<Cidade>>");
		for(Cidade c : cidades){
			System.out.println("----------");
			System.out.println("Nome da Cidade: " + c.getNomeCidade());
			System.out.println("Data de Cadastro: " + Data.formatDate(c.getDataCadastro()));
			System.out.println("Estado: " + c.getEstado().getNomeEstado());
			System.out.println("Id: " + c.getIdCidade());
			System.out.println("Usuário: " + c.getUsuarioId());
			System.out.println("----------");
		}
	}
	
	@Test
	public void test3UpdadeCidade(){
		Cidade cidade = cidadeBusiness.getObjById(idTestCidade);
		cidade.setNomeCidade("Curitiba");
		cidadeBusiness.update(cidade);
		System.out.println("UPDATE");
		test2ListCidade();		
	}
	
	@Test
	public void test4DeleteCidade(){

		cidadeBusiness.delete(idTestCidade);
		System.out.println("DELETE");
		test2ListCidade();
	}
}
