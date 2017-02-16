package br.com.smallbi.business;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import br.com.smallbi.business.interfaceBusiness.InterfaceBusiness;
import br.com.smallbi.dal.ConexaoDao;
import br.com.smallbi.dal.factory.FactoryDao;
import br.com.smallbi.dal.interfaceDal.InterfaceDao;
import br.com.smallbi.entity.Cubo;
import br.com.smallbi.entity.Usuario;
import br.com.smallbi.util.Util;
import br.com.smallbi.entity.Cliente;

public class CuboBusiness implements InterfaceBusiness<Cubo>{
	
	InterfaceDao<Cubo> cuboDao = FactoryDao.createCuboDao();
	InterfaceDao<Cliente> empresaDao = FactoryDao.createClienteDao();

	@Override
	public String create(Cubo t){
		
		if(t == null){
			return "O objeto não pode ser null!";
		}
		
		if(t.getIdCubo() != null){
			return "A variavel ID não pode ser informada na criação de um novo objeto!";
		}
		
		if(t.getCliente() != null){
			if(t.getCliente().getIdCliente() != null){
				Cliente cliente = empresaDao.getObjById(t.getCliente().getIdCliente());
				if(cliente == null){
					return "Nenhum resultado para a variável 'empresa' foi encontrado!";
				}
			}else{
				return "A variável 'empresa.idEmpresa' deve ser informada!";
			}
		}else{
			return "A variável 'empresa' deve ser informada!";
		}
		
		if(t.getMdx().equals(null) || t.getMdx().equals("")){
			return "A variável 'mdx' deve ser informada!";
		}
		
		if(t.getNomeCubo().equals(null) || t.getNomeCubo().equals("")){
			return "A variável 'nomeCubo' deve ser informada!";
		}
		
/*		if(t.getTabelaFato().equals(null) || t.getTabelaFato().equals("")){
			return "A variável 'tabelaFato' deve ser informada!";
		}
		
		if(t.getTamanho() == null){
			return "A variável 'tamanho' deve ser informada!";
		}*/
		
		if(t.getUsuarioId() == null){
			return "A variável 'usuarioId' deve ser informada!";
		}
		
		t.setDataCadastro(Util.getDate());
		t.setStatus(true);
		
		cuboDao.create(t);
		return "Cubo cadastrado com sucesso!";
	}

	public String createFromAssistent(JSONObject jsonObject) throws JSONException{
				
		Usuario usuario = Util.validateLogin(jsonObject.getString("login"), jsonObject.getString("senha"));
		
		if(usuario != null){
			
			String scriptSql = jsonObject.getString("scriptSql");
			String cliente = usuario.getPessoa().getCliente().getNomeFantasia();
			Integer id = usuario.getPessoa().getCliente().getIdCliente();
			boolean result = ConexaoDao.salvarScript(cliente, id, scriptSql);
			
			if(result == true){
				Cubo cubo = new Cubo();			
				cubo.setCliente(usuario.getPessoa().getCliente());
				
				//Criar método para adicionar o ROLE pertinente à este cliente
				
				//cubo.setMdx(jsonObject.getString("mdx"));
				String mdx = adicionarRoleAoCubo(jsonObject.getString("mdx"), cliente, id);
				cubo.setMdx(mdx);
				
				cubo.setNomeCubo(jsonObject.getString("nomeCubo"));
				cubo.setTabelaFato(jsonObject.getString("nomeCubo")); //Provisório
				
				//Fazer consulta do tamanho da tabela
				cubo.setTamanho(0); //Provisório
				cubo.setUsuarioId(usuario.getIdUsuario());
				
				create(cubo);
			}else{
				return "Falha ao salvar tabelas no bando de dados do cliente!";
			}
		}		
		return "Usuário ou senha inválidos";
	}
	
	private String adicionarRoleAoCubo(String mdx, String cliente, Integer id){
		String perfil = "cliente_" + cliente + "_id_" + id;	//Mesmo formato do nome do banco de dados de cada cliente;
		/*
	    <Role name='Access’>
    		<SchemaGrant access='all'/>
    	</Role>
		 */
		
		mdx += "<Role name='"+perfil+"'><SchemaGrant access='all'/></Role></Schema>";
		return mdx;
	}
	
	@Override
	public List<Cubo> list() {
		List<Cubo> cubos = new ArrayList<>();
		for(Cubo c : cuboDao.list()){
			if(c.isStatus() == true){
				cubos.add(c);
			}
		}
		return cubos;
	}

	@Override
	public String update(Cubo t){
		
		if(t == null){
			return "O objeto não pode ser null!";
		}
		
		if(t.getIdCubo() == null){
			return "A variável 'idCidade' deve ser informada!";
		}else{
			Cubo cubo = cuboDao.getObjById(t.getIdCubo());
			if(cubo == null){
				return "Nenhum resultado para a variável 'cubo' foi encontrado!";
			}
		}
		
		if(t.getCliente() != null){
			if(t.getCliente().getIdCliente() != null){
				Cliente cliente = empresaDao.getObjById(t.getCliente().getIdCliente());
				if(cliente == null){
					return "Nenhum resultado para a variável 'empresa' foi encontrado!";
				}
			}else{
				return "A variável 'empresa.idEmpresa' deve ser informada!";
			}
		}else{
			return "A variável 'empresa' deve ser informada!";
		}
		
		if(t.getMdx().equals(null) || t.getMdx().equals("")){
			return "A variável 'mdx' deve ser informada!";
		}
		
		if(t.getNomeCubo().equals(null) || t.getNomeCubo().equals("")){
			return "A variável 'nomeCubo' deve ser informada!";
		}
		
		if(t.getTabelaFato().equals(null) || t.getTabelaFato().equals("")){
			return "A variável 'tabelaFato' deve ser informada!";
		}
		
		if(t.getTamanho() == null){
			return "A variável 'tamanho' deve ser informada!";
		}
		
		if(t.getUsuarioId() == null){
			return "A variável 'usuarioId' deve ser informada!";
		}
		
		t.setDataCadastro(Util.getDate());
		t.setStatus(true);
		
		cuboDao.update(t);
		return "Cubo alterado com sucesso!";
	}

	@Override
	public String delete(Integer id){
		Cubo cubo = getObjById(id);
		if(cubo == null){
			return "Nenhum resultado foi encontrado na tabela Cubo com o id {"+id+"}";
		}
		cuboDao.delete(cubo);
		return "Cubo deletado com sucesso!";
	}

	@Override
	public Cubo getObjById(Integer id){
		Cubo cubo = cuboDao.getObjById(id);
		if(cubo != null && cubo.isStatus() != false){
			return cubo;
		}
		return null;
	}

}
