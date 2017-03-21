package br.com.smallbi.business;

import java.util.List;
import java.util.UUID;

import br.com.smallbi.business.interfaceBusiness.InterfaceBusiness;
import br.com.smallbi.dal.UsuarioLogadoDao;
import br.com.smallbi.entity.UsuarioLogado;
import br.com.smallbi.util.Data;

public class UsuarioLogadoBusiness implements InterfaceBusiness<UsuarioLogado>{

	private UsuarioLogadoDao dao = new UsuarioLogadoDao();
	
	@Override
	public String create(UsuarioLogado t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UsuarioLogado> list() {
		return dao.list();
	}

	@Override
	public String update(UsuarioLogado t) {
		dao.update(t);
		return "Token renovado com sucesso!";
	}

	@Override
	public String delete(Integer id) {
		UsuarioLogado ul = getObjById(id);
		dao.physicalDelete(ul);
		return "Token deletado com sucesso!";
	}

	@Override
	public UsuarioLogado getObjById(Integer id) {
		return dao.getObjById(id);
	}
	
	public UsuarioLogado getUsuarioLogadoByToken(String token){
		List<UsuarioLogado> uls = new UsuarioLogadoBusiness().list();
		for(UsuarioLogado ul : uls){
			if(ul.getToken().equals(token))
				return ul;
		}
		return null;
	}
	
	public String encerrarSessao(String token){
		UsuarioLogado ul = getUsuarioLogadoByToken(token);
		if(ul == null)
			return "Sessão já encerrada!";
		else{
			delete(ul.getId());
			return "Sessão encerrada!";
		}
	}
	
	public String criarToken(){
		String uuid = UUID.randomUUID().toString();
		System.out.println("uuid = " + uuid);
		return uuid;
	}
	
	public String renovarToken(String token){
		UsuarioLogadoBusiness business = new UsuarioLogadoBusiness();
		UsuarioLogado ul = business.getUsuarioLogadoByToken(token);
		if(ul == null)
			return "Sessão já encerrada!";
		
		ul.setData(Data.getDate());
		return new UsuarioLogadoBusiness().update(ul);
	}
}
