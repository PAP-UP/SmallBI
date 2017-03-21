package br.com.smallbi.dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.smallbi.dal.interfaceDal.InterfaceDao;
import br.com.smallbi.dal.singleton.SingletonConexao;
import br.com.smallbi.entity.Telefone;

public class TelefoneDao implements InterfaceDao<Telefone>{

	@Override
	public void create(Telefone t) {
		EntityManager em = SingletonConexao.getInstance();
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
		em.close();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Telefone> list() {
		EntityManager em = SingletonConexao.getInstance();
		Query q = em.createQuery("SELECT e FROM Telefone e");
		return q.getResultList();
	}

	@Override
	public void update(Telefone t) {
		EntityManager em = SingletonConexao.getInstance();
		em.getTransaction().begin();
		em.merge(t);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void delete(Telefone t) {
		t.setStatus(false);
		update(t);
	}

	@Override
	public Telefone getObjById(Integer id) {
		EntityManager em = SingletonConexao.getInstance();
		return em.find(Telefone.class, id);
	}

	@Override
	public void physicalDelete(Telefone t) {
		EntityManager em = SingletonConexao.getInstance();
		em.getTransaction().begin();
		em.remove(em.contains(t) ? t : em.merge(t));
		em.getTransaction().commit();
		em.close();
	}

}
