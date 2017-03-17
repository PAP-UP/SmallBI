package br.com.smallbi.test;

import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.smallbi.business.ClienteBusiness;
import br.com.smallbi.business.FuncaoBusiness;
import br.com.smallbi.business.PessoaBusiness;
import br.com.smallbi.entity.Cliente;
import br.com.smallbi.entity.Funcao;
import br.com.smallbi.entity.Pessoa;
import br.com.smallbi.util.Data;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestPessoa {

	PessoaBusiness pessoaBusiness = new PessoaBusiness();
	public static int idTestPessoa;
	
	@Test
	public void test1CreatePessoa(){
		Pessoa pessoa = new Pessoa();
		pessoa.setCpf("123.123.123-12");
		pessoa.setDataCadastro(Data.getDate());
		
		/*List<Endereco> enderecos = new EnderecoBusiness().list();
		Endereco endereco = enderecos.get(0);
		pessoa.setEndereco(endereco);*/
		
		List<Funcao> funcoes = new FuncaoBusiness().list();
		Funcao funcao = funcoes.get(0);
		pessoa.setFuncao(funcao);
		
		pessoa.setNome("Huguinho");
		pessoa.setRg("12.123.123-1");
		pessoa.setStatus(true);
		pessoa.setUsuarioId(1);
		
		List<Cliente> clientes = new ClienteBusiness().list();
		Cliente cliente = clientes.get(0);
		pessoa.setCliente(cliente);
		
		pessoaBusiness.create(pessoa);
		idTestPessoa = pessoa.getIdPessoa();
	}
	
	@Test
	public void test2ListPessoa(){
		List<Pessoa> pessoas = pessoaBusiness.list();
		System.out.println("<<Pessoas>>");
		for(Pessoa p : pessoas){
			System.out.println("----------");
			System.out.println("CPF: " + p.getCpf());
			System.out.println("Nome: " + p.getNome());
			System.out.println("RG: " + p.getRg());
			System.out.println("Id: "+ p.getIdPessoa());
			System.out.println("Usuário: " + p.getUsuarioId());
			System.out.println("Data de cadastro: " + Data.formatDate(p.getDataCadastro()));
			/*System.out.println("Endereço: " + p.getEndereco().getEndereco());*/
			System.out.println("Função: " + p.getFuncao().getNomeFuncao());
			System.out.println("----------");
		}
	}
	
	@Test
	public void test3UpdatePessoa(){
		Pessoa pessoa;
		pessoa = pessoaBusiness.getObjById(idTestPessoa);
		pessoa.setNome("Zezinho");
		pessoaBusiness.update(pessoa);
		System.out.println("UPDATE");
		test2ListPessoa();
	}

	@Test
	public void test4DeletePessoa(){
		pessoaBusiness.delete(idTestPessoa);
		System.out.println("DELETE");
		test2ListPessoa();
	}
}
