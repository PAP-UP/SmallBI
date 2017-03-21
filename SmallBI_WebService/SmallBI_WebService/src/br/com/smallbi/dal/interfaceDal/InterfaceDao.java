package br.com.smallbi.dal.interfaceDal;

import java.util.List;

public interface InterfaceDao <T>{

	public void create(T t);
	public List<T> list();
	public void update(T t);
	public void delete(T t);
	public void physicalDelete(T t);
	public T getObjById(Integer id);
}
