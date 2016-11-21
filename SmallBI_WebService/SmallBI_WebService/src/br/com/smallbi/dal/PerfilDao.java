package br.com.smallbi.dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.smallbi.dal.interfaceDal.InterfaceDao;
import br.com.smallbi.dal.singleton.SingletonConexao;
import br.com.smallbi.entity.Perfil;

public class PerfilDao implements InterfaceDao<Perfil>{

	@Override
	public void create(Perfil t) {
		EntityManager em = SingletonConexao.getInstance();
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public List<Perfil> list() {
		EntityManager em = SingletonConexao.getInstance();
		Query q = em.createQuery("SELECT e FROM Perfil e");
		return q.getResultList();
	}

	@Override
	public void update(Perfil t) {
		EntityManager em = SingletonConexao.getInstance();
		em.getTransaction().begin();
		em.merge(t);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void delete(Perfil t) {
		EntityManager em = SingletonConexao.getInstance();
		em.getTransaction().begin();
		em.remove(t);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public Perfil getObjById(Integer id) {
		EntityManager em = SingletonConexao.getInstance();
		return em.find(Perfil.class, id);
	}

}
