package br.com.smallbi.test;

import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.smallbi.business.ClienteBusiness;
import br.com.smallbi.business.CuboBusiness;
import br.com.smallbi.entity.Cliente;
import br.com.smallbi.entity.Cubo;
import br.com.smallbi.util.Data;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestCubo {

	CuboBusiness cuboBusiness = new CuboBusiness();
	public static int idTestCubo;
	
	@Test
	public void test1CreateCubo(){
		Cubo cubo = new Cubo();
		cubo.setDataCadastro(Data.getDate());
		
		List<Cliente> clientes = new ClienteBusiness().list();
		Cliente cliente = clientes.get(0);
		cubo.setCliente(cliente);
		
		cubo.setMdx("<?xml version='1.0'?> <Schema name='Deyneson Testes' metamodelVersion='4.0'> "
				+ "<PhysicalSchema> <Table name='cities'> <Key> <Column name='city_id'/> </Key> "
				+ "</Table> <Table name='people'> <Key> <Column name='person_id'/> </Key> </Table> "
				+ "<Link source='cities' target='people'> <ForeignKey> <Column name='person_city'/>"
				+ " </ForeignKey> </Link> </PhysicalSchema> <Cube name='People Cube'> <Dimensions> "
				+ "<Dimension name='Cities' table='cities' key='City_Id'> <Attributes> <Attribute "
				+ "name='City_Id' keyColumn='city_id' hasHierarchy='true'/> <Attribute name='City Name'"
				+ " keyColumn='name' hasHierarchy='true'/> </Attributes> </Dimension> <Dimension name='People' "
				+ "table='people' key='Person_Id'> <Attributes> <Attribute name='Person_Id' keyColumn="
				+ "'person_id' hasHierarchy='true'/> <Attribute name='Person Name' keyColumn='name' "
				+ "hasHierarchy='true'/> <Attribute name='Email' keyColumn='email' hasHierarchy='true'/> "
				+ "<Attribute name='Password' keyColumn='password' hasHierarchy='true'/> <Attribute "
				+ "name='Person City' keyColumn='person_city' hasHierarchy='true'/> </Attributes> "
				+ "</Dimension> </Dimensions> <MeasureGroups> <MeasureGroup name='Count People' table="
				+ "'people'> <Measures> <Measure name='Number of people' column='person_id' aggregator="
				+ "'count' formatString='Standard' visible='true'/> <Measure name='Number of Person per"
				+ " City' column='person_city' aggregator='count' formatString='Standard' visible='true'/>"
				+ " </Measures> <DimensionLinks> <FactLink dimension='Cities' foreignKeyColumn='person_city' "
				+ "/> <FactLink dimension='People' foreignKeyColumn='person_id'/> </DimensionLinks>"
				+ " </MeasureGroup> </MeasureGroups> </Cube> <Role name='Access'> <SchemaGrant access='all'/>"
				+ " </Role> <Role name='No Access'> <SchemaGrant access='none'/> </Role> </Schema>");
		
		cubo.setNomeCubo("Sales Cube");
		//cubo.setStatus(true);
		cubo.setTabelaFato("SalesPivot");
		cubo.setTamanho(30);
		cubo.setUsuarioId(1);
		
		cuboBusiness.create(cubo);
		idTestCubo = cubo.getIdCubo();
	}
	
	@Test
	public void test2ListCubo(){
		List<Cubo> cubos = cuboBusiness.list();
		System.out.println("<<CUBOS>>");
		for(Cubo c : cubos){
			System.out.println("----------");
			System.out.println("MDX: " + c.getMdx());
			System.out.println("Nome do cubo: " + c.getNomeCubo());
			System.out.println("Tabela Fato: " + c.getTabelaFato());
			System.out.println("Id: " + c.getIdCubo());
			System.out.println("Tamanho: " + c.getTamanho());
			System.out.println("Usuário: " + c.getUsuarioId());
			System.out.println("Data de cadastro: " + Data.formatDate(c.getDataCadastro()));
			System.out.println("Empresa: " + c.getCliente().getNomeFantasia());
			System.out.println("----------");
		}
	} 
	
	@Test
	public void test3Update(){
		Cubo cubo = cuboBusiness.getObjById(idTestCubo);
		cubo.setNomeCubo("Incidents Cube");
		cuboBusiness.update(cubo);
		System.out.println("UPDATE");
		test2ListCubo();
	}

	@Test
	public void test4DeleteCubo(){
		cuboBusiness.delete(idTestCubo);
		System.out.println("DELETE");
		test2ListCubo();
	}
}
