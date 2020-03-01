package vt.com.pe.tarea02.dao;

import java.util.List;

/**
 *
 * @author Victor
 */
public interface EntidadDao <T> {
    public void create(T t);
    
    public T find(Object id);
    public List<T> findAll();
    
    public void update(T t);
    public void delete(Object id);
}
