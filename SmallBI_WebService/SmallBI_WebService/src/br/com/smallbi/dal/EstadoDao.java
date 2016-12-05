package br.com.smallbi.dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.smallbi.dal.interfaceDal.InterfaceDao;
import br.com.smallbi.dal.singleton.SingletonConexao;
import br.com.smallbi.entity.Estado;

public class EstadoDao implements InterfaceDao<Estado>{

	@Override
	public void create(Estado t) {
		EntityManager em = SingletonConexao.getInstance();
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public List<Estado> list() {
		EntityManager em = SingletonConexao.getInstance();
		Query q = em.createQuery("SELECT e FROM Estado e");
		return q.getResultList();
	}

	@Override
	public void update(Estado t) {
		EntityManager em = SingletonConexao.getInstance();
		em.getTransaction().begin();
		em.merge(t);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void delete(Estado t) {
		t.setStatus(false);
		update(t);
	}

	@Override
	public Estado getObjById(Integer id) {
		EntityManager em = SingletonConexao.getInstance();
		return em.find(Estado.class, id);
	}
}
