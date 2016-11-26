package br.com.smallbi.test;

import java.util.Calendar;
import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.smallbi.business.CidadeBusiness;
import br.com.smallbi.business.EstadoBusiness;
import br.com.smallbi.business.exception.BusinessException;
import br.com.smallbi.entity.Cidade;
import br.com.smallbi.entity.Estado;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestCidade {

	CidadeBusiness cidadeBusiness = new CidadeBusiness();
	public static int idTestCidade;
	
	@Test
	public void test1CreateCidade(){
		Cidade cidade = new Cidade();
		cidade.setDataCadastro(Calendar.getInstance());
		
		List<Estado> estados = new EstadoBusiness().list();
		Estado estado = estados.get(0);
		estado.setIdEstado(estado.getIdEstado());
		
		cidade.setEstado(estado);
		cidade.setNomeCidade("Londrina");
		cidade.setSiglaCidade("LDRN");
		cidade.setUsuarioId(1);		
		try {
			cidadeBusiness.create(cidade);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
		idTestCidade = cidade.getIdCidade();
	}
	
	@Test
	public void test2ListCidade(){
		List<Cidade> cidades = cidadeBusiness.list();
		System.out.println("<<Cidade>>");
		for(Cidade c : cidades){
			System.out.println("----------");
			System.out.println("Nome da Cidade: " + c.getNomeCidade());
			System.out.println("Sigla da Cidade: " + c.getSiglaCidade());
			System.out.println("Data de Cadastro: " + c.getDataCadastro().getTime());
			System.out.println("Estado: " + c.getEstado().getNomeEstado());
			System.out.println("Id: " + c.getIdCidade());
			System.out.println("Usuário: " + c.getUsuarioId());
			System.out.println("----------");
		}
	}
	
	@Test
	public void test3UpdadeCidade(){
		try {
			Cidade cidade = cidadeBusiness.getObjById(idTestCidade);
			cidade.setNomeCidade("Curitiba");
			cidade.setSiglaCidade("CTBA");
			cidadeBusiness.update(cidade);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
		System.out.println("UPDATE");
		test2ListCidade();		
	}
}
