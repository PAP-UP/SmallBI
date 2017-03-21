package br.com.smallbi.dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.smallbi.dal.interfaceDal.InterfaceDao;
import br.com.smallbi.dal.singleton.SingletonConexao;
import br.com.smallbi.entity.Usuario;

public class UsuarioDao implements InterfaceDao<Usuario>{

	@Override
	public void create(Usuario t) {
		EntityManager em = SingletonConexao.getInstance();
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
		em.close();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Usuario> list() {
		EntityManager em = SingletonConexao.getInstance();
		Query q = em.createQuery("SELECT e FROM Usuario e");
		return q.getResultList();
	}

	@Override
	public void update(Usuario t) {
		EntityManager em = SingletonConexao.getInstance();
		em.getTransaction().begin();
		em.merge(t);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void delete(Usuario t) {
		t.setStatus(false);
		update(t);
	}

	@Override
	public Usuario getObjById(Integer id) {
		EntityManager em = SingletonConexao.getInstance();
		return em.find(Usuario.class, id);
	}

	@Override
	public void physicalDelete(Usuario t) {
		// TODO Auto-generated method stub
		
	}
}
