package br.com.smallbi.business;

import java.util.List;

import br.com.smallbi.business.interfaceBusiness.InterfaceBusiness;
import br.com.smallbi.dal.UsuarioLogadoDao;
import br.com.smallbi.entity.UsuarioLogado;

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
		dao.delete(ul);
		return "Token deletado com sucesso!";
	}

	@Override
	public UsuarioLogado getObjById(Integer id) {
		return dao.getObjById(id);
	}

}
