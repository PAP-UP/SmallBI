package br.com.smallbi.dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.smallbi.dal.interfaceDal.InterfaceDao;
import br.com.smallbi.dal.singleton.SingletonConexao;
import br.com.smallbi.entity.RamoAtividade;

public class RamoAtividadeDao implements InterfaceDao<RamoAtividade>{

	@Override
	public void create(RamoAtividade t) {
		EntityManager em = SingletonConexao.getInstance();
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public List<RamoAtividade> list() {
		EntityManager em = SingletonConexao.getInstance();
		Query q = em.createQuery("SELECT e FROM RamoAtividade e");
		return q.getResultList();
	}

	@Override
	public void update(RamoAtividade t) {
		EntityManager em = SingletonConexao.getInstance();
		em.getTransaction().begin();
		em.merge(t);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void delete(RamoAtividade t) {
		EntityManager em = SingletonConexao.getInstance();
		em.getTransaction().begin();
		em.remove(t);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public RamoAtividade getObjById(Integer id) {
		EntityManager em = SingletonConexao.getInstance();
		return em.find(RamoAtividade.class, id);
	}

}
