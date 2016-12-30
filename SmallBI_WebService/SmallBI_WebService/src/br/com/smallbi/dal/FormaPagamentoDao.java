package br.com.smallbi.dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.smallbi.dal.interfaceDal.InterfaceDao;
import br.com.smallbi.dal.singleton.SingletonConexao;
import br.com.smallbi.entity.FormaPagamento;

public class FormaPagamentoDao implements InterfaceDao<FormaPagamento>{

	@Override
	public void create(FormaPagamento t) {
		EntityManager em = SingletonConexao.getInstance();
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
		em.close();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<FormaPagamento> list() {
		EntityManager em = SingletonConexao.getInstance();
		Query q = em.createQuery("SELECT e FROM FormaPagamento e");
		return q.getResultList();
	}

	@Override
	public void update(FormaPagamento t) {
		EntityManager em = SingletonConexao.getInstance();
		em.getTransaction().begin();
		em.merge(t);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void delete(FormaPagamento t) {
		t.setStatus(false);
		update(t);
	}

	@Override
	public FormaPagamento getObjById(Integer id) {
		EntityManager em = SingletonConexao.getInstance();
		return em.find(FormaPagamento.class, id);
	}

}
