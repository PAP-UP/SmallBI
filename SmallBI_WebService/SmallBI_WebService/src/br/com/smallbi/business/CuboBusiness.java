package br.com.smallbi.business;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jettison.json.JSONArray;
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
				
		Usuario usuario = new UsuarioBusiness().getUsuario(jsonObject.getString("login"), jsonObject.getString("senha"));
		
		if(usuario != null){
			
			String scriptSql = jsonObject.getString("scriptSql");
			Integer idCliente = usuario.getPessoa().getCliente().getIdCliente();
//			Integer idCliente = jsonObject.getInt("idCliente");

			List<String> tabelasCubo = new ArrayList<>();
			JSONArray jsonArray = jsonObject.getJSONArray("tabelasCubo");
			for(int i = 0; i < jsonArray.length(); i++){
				String s = (String) jsonArray.get(i);
				tabelasCubo.add(s);
			}
			
			boolean scriptsalvo = ConexaoDao.salvarScriptCubo(idCliente, scriptSql);
			
			if(scriptsalvo){
				
				/*boolean mdxSalvo = SaikuConnection.saveSchemaInSaikuServer(idCliente, jsonObject.getString("nomeCubo"), 
						jsonObject.getString("mdx"));*/
				
				//if(mdxSalvo){
					usuario.getPessoa().getCliente().setTamanhoTotal(ConexaoDao.getTamanhoBancoCliente(idCliente));
					new ClienteBusiness().update(usuario.getPessoa().getCliente());
					
					/*int saikuResponse = SaikuConnection.addDatasourceSaiku(idCliente, 
							jsonObject.getString("nomeCubo"));*/
					
//					if(saikuResponse == 200){
						Cubo cubo = new Cubo();			
						cubo.setCliente(usuario.getPessoa().getCliente());
						
						cubo.setMdx(jsonObject.getString("mdx"));
						
						cubo.setNomeCubo(jsonObject.getString("nomeCubo"));
						cubo.setTabelaFato(jsonObject.getString("nomeCubo")); //Provisório
						
						Integer tamCubo = ConexaoDao.getTamanhoCubo(idCliente, tabelasCubo);
						cubo.setTamanho(tamCubo);
						cubo.setUsuarioId(usuario.getIdUsuario());
						
						create(cubo);
						
						return "Cubo cadastrado com sucesso!";
					/*}else{
						return "Falha ao enviar cubo ao Saiku!";
					}*/
/*				}else{
					return "Falha ao salvar MDX no servidor!";
				}*/
			}else{
				return "Falha ao salvar tabelas no bando de dados do cliente!";
			}
		}		
		return "Usuário ou senha inválidos";
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
	
	public Cubo getCuboByName(String nome){
		List<Cubo> cubos = list();
		for(Cubo c : cubos){
			if(c.getNomeCubo().equals(nome)){
				return c;
			}
		}
		return null;
	}
}
