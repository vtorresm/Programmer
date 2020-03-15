package vt.com.pe.tarea02.util;

import java.util.Comparator;
import vt.com.pe.tarea02.beans.Evento;


public class EventoOrdenadoPorCategoria implements Comparator<Evento>{
    
    @Override
    public int compare(Evento o1, Evento o2) {
        int result = o1.getCategoria().compareTo(o2.getCategoria());
        if (result != 0) { return result; }
        else { 
            return 0;
        } 
    }
}
