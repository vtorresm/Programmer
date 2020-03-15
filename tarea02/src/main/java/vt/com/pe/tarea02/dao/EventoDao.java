package vt.com.pe.tarea02.dao;

import java.util.List;
import vt.com.pe.tarea02.beans.Evento;

/**
 *
 * @author Victor
 */
public interface EventoDao extends EntidadDao<Evento>{
    //public List<Evento> filterByEstado(String estado);
    //public List<Evento> orderByFechaAscDesc();
    //public List<Evento> orderByFechaRango();
    public List<Evento> orderByNombre();
    public List<Evento> filterByCategoria(String categoria);
    
}
