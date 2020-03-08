package vt.com.pe.practica02.dao;

import java.util.List;
import vt.com.pe.practica02.beans.Producto;

/**
 *
 * @author Victor
 */
public interface ProductoDao extends EntidadProducto<Producto> {
    public List<Producto> filterByTipoProducto(String tipo);
    public List<Producto> orderByNombre();
}
