package br.com.smallbi.dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.smallbi.dal.interfaceDal.InterfaceDao;
import br.com.smallbi.dal.singleton.SingletonConexao;
import br.com.smallbi.entity.Endereco;

public class EnderecoDao implements InterfaceDao<Endereco>{

	@Override
	public void create(Endereco t) {
		EntityManager em = SingletonConexao.getInstance();
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public List<Endereco> list() {
		EntityManager em = SingletonConexao.getInstance();
		Query q = em.createQuery("SELECT e FROM Endereco e");
		return q.getResultList();
	}

	@Override
	public void update(Endereco t) {
		EntityManager em = SingletonConexao.getInstance();
		em.getTransaction().begin();
		em.merge(t);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void delete(Endereco t) {
		EntityManager em = SingletonConexao.getInstance();
		em.getTransaction().begin();
		em.remove(t);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public Endereco getObjById(Integer id) {
		EntityManager em = SingletonConexao.getInstance();
		return em.find(Endereco.class, id);
	}

}
