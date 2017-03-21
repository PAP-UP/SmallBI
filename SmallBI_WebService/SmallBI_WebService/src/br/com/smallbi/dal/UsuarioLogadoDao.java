package br.com.smallbi.dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.smallbi.dal.interfaceDal.InterfaceDao;
import br.com.smallbi.dal.singleton.SingletonConexao;
import br.com.smallbi.entity.UsuarioLogado;

public class UsuarioLogadoDao implements InterfaceDao<UsuarioLogado>{

	@Override
	public void create(UsuarioLogado t) {
		EntityManager em = SingletonConexao.getInstance();
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
		em.close();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<UsuarioLogado> list() {
		EntityManager em = SingletonConexao.getInstance();
		Query q = em.createQuery("SELECT ul FROM UsuarioLogado ul");
		return q.getResultList();
	}

	@Override
	public void update(UsuarioLogado t) {
		EntityManager em = SingletonConexao.getInstance();
		em.getTransaction().begin();
		em.merge(t);
		em.getTransaction().commit();
		em.clear();
	}

	@Override
	public void delete(UsuarioLogado t) {

	}

	@Override
	public UsuarioLogado getObjById(Integer id) {
		EntityManager em = SingletonConexao.getInstance();
		return em.find(UsuarioLogado.class, id);
	}

	@Override
	public void physicalDelete(UsuarioLogado t) {
		EntityManager em = SingletonConexao.getInstance();
		em.getTransaction().begin();
		em.remove(em.contains(t) ? t : em.merge(t));
		em.getTransaction().commit();
		em.close();
	}

}
