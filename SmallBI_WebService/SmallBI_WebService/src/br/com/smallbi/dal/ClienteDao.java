package br.com.smallbi.dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.smallbi.dal.interfaceDal.InterfaceDao;
import br.com.smallbi.dal.singleton.SingletonConexao;
import br.com.smallbi.entity.Cliente;

public class ClienteDao implements InterfaceDao<Cliente>{

	@Override
	public void create(Cliente t) {
		EntityManager em = SingletonConexao.getInstance();
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
		em.close();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Cliente> list() {
		EntityManager em = SingletonConexao.getInstance();
		Query q = em.createQuery("SELECT e FROM Cliente e");
		return q.getResultList();
	}

	@Override
	public void update(Cliente t) {
		EntityManager em = SingletonConexao.getInstance();
		em.getTransaction().begin();
		em.merge(t);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void delete(Cliente t) {
		t.setStatus(false);
		update(t);
	}

	@Override
	public Cliente getObjById(Integer id) {
		EntityManager em = SingletonConexao.getInstance();
		return em.find(Cliente.class, id);
	}

	@Override
	public void physicalDelete(Cliente t) {
		// TODO Auto-generated method stub
		
	}
}
