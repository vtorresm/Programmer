package vt.com.pe.tarea02.service;

import java.util.List;
import vt.com.pe.tarea02.beans.Evento;

/**
 *
 * @author Victor
 */
public interface EventoService {

    public void grabar(Evento evento);

    public Evento buscar(Object id);

    public List<Evento> listar();

    public void actualizar(Evento evento);

    public void borrar(Object id);

    public List<Evento> filtrarPoEstado(String estado);

    public List<Evento> ordenarPorPromedio();

    public List<Evento> ordenarPorNombre();
}
