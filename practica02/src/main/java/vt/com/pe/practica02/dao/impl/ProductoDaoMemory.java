package vt.com.pe.practica02.dao.impl;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import vt.com.pe.practica02.beans.Producto;
import vt.com.pe.practica02.dao.ProductoDao;
import vt.com.pe.practica02.util.ProductoOrdenPorNombre;

/**
 *
 * @author Victor
 */
public class ProductoDaoMemory implements ProductoDao{

    private List<Producto> lProducto;

    public ProductoDaoMemory() {
        lProducto = new ArrayList<>();
    }

    @Override
    public void create(Producto t) {
        if(find(t.getId())==null)
            lProducto.add(t);
    }

    @Override
    public Producto find(Object id) {
        for(Producto alumno:lProducto){
            if(alumno.getId()==(int)id)
                return alumno;
        }
        return null;
    }

    @Override
    public List<Producto> findAll() {
        return lProducto;
    }

    @Override
    public void update(Producto t) {
        for(int ind=0; ind<lProducto.size(); ind++){
            if(lProducto.get(ind).getId()==t.getId()){
                lProducto.set(ind,t);
                break;
            }
        }
    }

    @Override
    public void delete(Object id) {
        lProducto.remove(find(id));
    }
    
     @Override
    public List<Producto> filterByTipoProducto(String tipo) {
        List<Producto> subList=new ArrayList<>();
        for(Producto a:lProducto){
            if(a.getTipo().equals(tipo))
                subList.add(a);
        }
        return subList;
    }



    @Override
    public List<Producto> orderByNombre() {
        Comparator<Producto> sortName = new ProductoOrdenPorNombre();
         Collections.sort(lProducto, sortName);  
        return lProducto;
    }
}
