package vt.com.pe.practica02.dao;

import java.util.List;


public interface EntidadProducto<T> {

    public void create(T t);

    public T find(Object id);

    public List<T> findAll();

    public void update(T t);

    public void delete(Object id);
}
