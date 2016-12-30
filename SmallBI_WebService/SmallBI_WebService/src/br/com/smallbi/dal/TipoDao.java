package br.com.smallbi.dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.smallbi.dal.interfaceDal.InterfaceDao;
import br.com.smallbi.dal.singleton.SingletonConexao;
import br.com.smallbi.entity.Tipo;

public class TipoDao implements InterfaceDao<Tipo>{

	@Override
	public void create(Tipo t) {
		EntityManager em = SingletonConexao.getInstance();
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
		em.close();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Tipo> list() {
		EntityManager em = SingletonConexao.getInstance();
		Query q = em.createQuery("SELECT e FROM Tipo e");
		return q.getResultList();
	}

	@Override
	public void update(Tipo t) {
		EntityManager em = SingletonConexao.getInstance();
		em.getTransaction().begin();
		em.merge(t);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void delete(Tipo t) {
		t.setStatus(false);
		update(t);
	}

	@Override
	public Tipo getObjById(Integer id) {
		EntityManager em = SingletonConexao.getInstance();
		return em.find(Tipo.class, id);
	}

}
