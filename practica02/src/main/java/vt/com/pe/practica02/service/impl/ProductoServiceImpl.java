package vt.com.pe.practica02.service.impl;

import java.util.List;
import vt.com.pe.practica02.beans.Producto;
import vt.com.pe.practica02.dao.ProductoDao;
import vt.com.pe.practica02.service.ProductoService;
import static vt.com.pe.practica02.util.Util.opc;
import vt.com.pe.practica02.dao.impl.DaoFactory;

/**
 *
 * @author emaravi
 */
public class ProductoServiceImpl implements ProductoService{
    private ProductoDao dao;

    public ProductoServiceImpl() {
        DaoFactory fabrica = DaoFactory.getInstance();
        dao = fabrica.getProductoDao(opc);
    }
    
    @Override
    public void grabar(Producto producto) {
        dao.create(producto);
    }

    @Override
    public Producto buscar(Object id) {
        return dao.find(id);
    }

    @Override
    public List<Producto> listar() {
        return dao.findAll();
    }

    @Override
    public void actualizar(Producto producto) {
        dao.update(producto);
    }

    @Override
    public void borrar(Object id) {
        dao.delete(id);
    }

    @Override
    public List<Producto> filtrarPoTipo(String tipo) {
        return dao.filterByTipoProducto(tipo);
    }

    @Override
    public List<Producto> ordenarPorNombre() {
        return dao.orderByNombre();
    }
    
}
