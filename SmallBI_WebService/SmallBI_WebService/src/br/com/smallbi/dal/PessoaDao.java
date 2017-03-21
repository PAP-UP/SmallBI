package br.com.smallbi.dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.smallbi.dal.interfaceDal.InterfaceDao;
import br.com.smallbi.dal.singleton.SingletonConexao;
import br.com.smallbi.entity.Pessoa;

public class PessoaDao implements InterfaceDao<Pessoa>{

	@Override
	public void create(Pessoa t) {
		EntityManager em = SingletonConexao.getInstance();
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
		em.close();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Pessoa> list() {
		EntityManager em = SingletonConexao.getInstance();
		Query q = em.createQuery("SELECT e FROM Pessoa e");
		return q.getResultList();
	}

	@Override
	public void update(Pessoa t) {
		EntityManager em = SingletonConexao.getInstance();
		em.getTransaction().begin();
		em.merge(t);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void delete(Pessoa t) {
		t.setStatus(false);
		update(t);
	}

	@Override
	public Pessoa getObjById(Integer id) {
		EntityManager em = SingletonConexao.getInstance();
		return em.find(Pessoa.class, id);
	}

	@Override
	public void physicalDelete(Pessoa t) {
		EntityManager em = SingletonConexao.getInstance();
		em.getTransaction().begin();
		em.remove(em.contains(t) ? t : em.merge(t));
		em.getTransaction().commit();
		em.close();
	}

}
