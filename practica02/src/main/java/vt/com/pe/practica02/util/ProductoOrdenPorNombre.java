
package vt.com.pe.practica02.util;

import vt.com.pe.practica02.beans.Producto;
import java.util.Comparator;


public class ProductoOrdenPorNombre implements Comparator<Producto>{
    
    @Override
    public int compare(Producto o1, Producto o2) {
        int result = o1.getTipo().compareTo(o2.getTipo());
        if (result != 0) { return result; }
        else { 
            return 0;
        } 
    }
}
