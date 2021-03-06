package br.com.smallbi.dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.smallbi.dal.interfaceDal.InterfaceDao;
import br.com.smallbi.dal.singleton.SingletonConexao;
import br.com.smallbi.entity.Cidade;

public class CidadeDao implements InterfaceDao<Cidade>{

	@Override
	public void create(Cidade t) {
		EntityManager em = SingletonConexao.getInstance();
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
		em.close();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Cidade> list() {
		EntityManager em = SingletonConexao.getInstance();
		Query q = em.createQuery("SELECT e FROM Cidade e");
		return q.getResultList();
	}

	@Override
	public void update(Cidade t) {
		EntityManager em = SingletonConexao.getInstance();
		em.getTransaction().begin();
		em.merge(t);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void delete(Cidade t) {
		t.setStatus(false);
		update(t);
	}

	@Override
	public Cidade getObjById(Integer id) {
		EntityManager em = SingletonConexao.getInstance();
		return em.find(Cidade.class, id);
	}

	@Override
	public void physicalDelete(Cidade t) {
		// TODO Auto-generated method stub
		
	}

}
