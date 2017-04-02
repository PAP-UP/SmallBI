package br.com.smallbi.dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.smallbi.dal.interfaceDal.InterfaceDao;
import br.com.smallbi.dal.singleton.SingletonConexao;
import br.com.smallbi.entity.Url;

public class UrlDao implements InterfaceDao<Url>{

	@Override
	public void create(Url t) {
		EntityManager em = SingletonConexao.getInstance();
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
		em.close();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Url> list() {
		EntityManager em = SingletonConexao.getInstance();
		Query q = em.createQuery("SELECT u FROM Url u");
		return q.getResultList();
	}

	@Override
	public void update(Url t) {
		EntityManager em = SingletonConexao.getInstance();
		em.getTransaction().begin();
		em.merge(t);
		em.getTransaction().commit();
		em.close();		
	}

	@Override
	public void delete(Url t) {
		// TODO Auto-generated method stub
	}

	@Override
	public void physicalDelete(Url t) {
		EntityManager em = SingletonConexao.getInstance();
		em.getTransaction().begin();
		em.remove(em.contains(t) ? t : em.merge(t));
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public Url getObjById(Integer id) {
		EntityManager em = SingletonConexao.getInstance();
		return em.find(Url.class, id);
	}

}
