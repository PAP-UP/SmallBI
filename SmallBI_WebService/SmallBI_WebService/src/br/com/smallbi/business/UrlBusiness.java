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

}
