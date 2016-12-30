package br.com.smallbi.dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.smallbi.dal.interfaceDal.InterfaceDao;
import br.com.smallbi.dal.singleton.SingletonConexao;
import br.com.smallbi.entity.Plano;

public class PlanoDao implements InterfaceDao<Plano>{

	@Override
	public void create(Plano t) {
		EntityManager em = SingletonConexao.getInstance();
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
		em.close();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Plano> list() {
		EntityManager em = SingletonConexao.getInstance();
		Query q = em.createQuery("SELECT e FROM Plano e");
		return q.getResultList();
	}

	@Override
	public void update(Plano t) {
		EntityManager em = SingletonConexao.getInstance();
		em.getTransaction().begin();
		em.merge(t);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void delete(Plano t) {
		t.setStatus(false);
		update(t);
	}

	@Override
	public Plano getObjById(Integer id) {
		EntityManager em = SingletonConexao.getInstance();
		return em.find(Plano.class, id);
	}

}
