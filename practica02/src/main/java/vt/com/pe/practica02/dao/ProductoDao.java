package vt.com.pe.practica02.dao;

import java.util.List;

/**
 *
 * @author Victor
 */
public interface ProductoDao <T> {
    public void create(T t);
    
    public T find(Object id);
    public List<T> findAll();
    
    public void update(T t);
    public void delete(Object id);
}
