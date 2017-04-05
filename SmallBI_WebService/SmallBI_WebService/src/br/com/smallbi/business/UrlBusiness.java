package br.com.smallbi.business;

import java.util.List;

import br.com.smallbi.business.interfaceBusiness.InterfaceBusiness;
import br.com.smallbi.dal.UrlDao;
import br.com.smallbi.entity.Url;

public class UrlBusiness implements InterfaceBusiness<Url>{

	@Override
	public String create(Url t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Url> list() {
		return new UrlDao().list();
	}

	@Override
	public String update(Url t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Url getObjById(Integer id) {
		return new UrlDao().getObjById(id);
	}
	
	public Url getUrlByUrl(String urlParam){
		List<Url> urls = list();
		for(Url u : urls){
			if(u.getUrl().equals(urlParam))
				return u;
		}
		return null;
	}

	public boolean hasAccess(String urlParam, Integer idPerfil){
		
		Url url = getUrlByUrl(urlParam);

		if(urlParam.equals("usuario.listar") || urlParam.equals("usuario.cadastrar") || 
				urlParam.equals("usuario.editar")){
			if(idPerfil == 1 || idPerfil == 2)
				return true;
		}

		if(urlParam.equals("cubo.listar")){
			if(idPerfil == 1 || idPerfil == 2)
				return true;
		}

		if(urlParam.equals("cliente.listar") || urlParam.equals("cliente.cadastrar") ||
				urlParam.equals("cliente.editar")){
			if(idPerfil == 1 || idPerfil == 2)
				return true;
		}
		
		if(url.getPerfil().getIdPerfil() == idPerfil){
			return true;
		}
		
		return false;
	}	
}
