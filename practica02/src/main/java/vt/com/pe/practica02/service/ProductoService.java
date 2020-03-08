package vt.com.pe.practica02.service;

import java.util.List;
import vt.com.pe.practica02.beans.Producto;

/**
 *
 * @author Victor
 */
public interface ProductoService {

    public void grabar(Producto producto);

    public Producto buscar(Object id);

    public List<Producto> listar();

    public void actualizar(Producto producto);

    public void borrar(Object id);

    public List<Producto> filtrarPoTipo(String tipo);

//    public List<Producto> ordenarPorTipo();
    
    public List<Producto> ordenarPorNombre();
}
