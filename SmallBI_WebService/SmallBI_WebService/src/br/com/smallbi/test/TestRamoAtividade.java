package br.com.smallbi.test;

import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.smallbi.business.RamoAtividadeBusiness;
import br.com.smallbi.entity.RamoAtividade;
import br.com.smallbi.util.Data;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestRamoAtividade {

	RamoAtividadeBusiness ramoAtividadeBusiness = new RamoAtividadeBusiness();
	public static int idTestRamoAtividade;
	
	@Test
	public void test1CreateRamoAtividade(){
		RamoAtividade ramoAtividade = new RamoAtividade();
		ramoAtividade.setDataCadastro(Data.getDate());
		ramoAtividade.setRamoAtividade("Rain cookie sales");
		ramoAtividade.setStatus(true);
		ramoAtividade.setUsuarioId(1);
		
		ramoAtividadeBusiness.create(ramoAtividade);
		idTestRamoAtividade = ramoAtividade.getIdRamoAtividade();
	}
	
	@Test
	public void test2ListRamoAtividade(){
		List<RamoAtividade> ramos = ramoAtividadeBusiness.list();
		System.out.println("<<Ramos de Atividade>>");
		for(RamoAtividade r : ramos){
			System.out.println("----------");
			System.out.println("Ramo de atividade: " + r.getRamoAtividade());
			System.out.println("Id: " + r.getIdRamoAtividade());
			System.out.println("Usuário: " + r.getUsuarioId());
			System.out.println("Data de Cadastro: " + Data.formatDate(r.getDataCadastro())); 
			System.out.println("----------");
		}
	}
	
	@Test
	public void test3UpdateRamoAtividade(){
		RamoAtividade r = ramoAtividadeBusiness.getObjById(idTestRamoAtividade);
		r.setRamoAtividade("Cyber Terrorism");
		ramoAtividadeBusiness.update(r);
		System.out.println("UPDATE");
		test2ListRamoAtividade();
	}

	@Test
	public void test4DeleteRamoAtividade(){
		ramoAtividadeBusiness.delete(idTestRamoAtividade);
		System.out.println("DELETE");
		test2ListRamoAtividade();
	}
}
