package br.com.smallbi.dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.smallbi.dal.interfaceDal.InterfaceDao;
import br.com.smallbi.dal.singleton.SingletonConexao;
import br.com.smallbi.entity.Funcao;

public class FuncaoDao implements InterfaceDao<Funcao>{

	@Override
	public void create(Funcao t) {
		EntityManager em = SingletonConexao.getInstance();
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
		em.close();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Funcao> list() {
		EntityManager em = SingletonConexao.getInstance();
		Query q = em.createQuery("SELECT e FROM Funcao e");
		return q.getResultList();
	}

	@Override
	public void update(Funcao t) {
		EntityManager em = SingletonConexao.getInstance();
		em.getTransaction().begin();
		em.merge(t);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void delete(Funcao t) {
		t.setStatus(false);
		update(t);
	}

	@Override
	public Funcao getObjById(Integer id) {
		EntityManager em = SingletonConexao.getInstance();
		return em.find(Funcao.class, id);
	}

	@Override
	public void physicalDelete(Funcao t) {
		// TODO Auto-generated method stub
		
	}

}
