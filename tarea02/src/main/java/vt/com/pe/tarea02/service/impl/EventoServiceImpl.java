package vt.com.pe.tarea02.service.impl;

import java.util.List;
import vt.com.pe.tarea02.beans.Evento;
import vt.com.pe.tarea02.dao.EventoDao;
import vt.com.pe.tarea02.dao.impl.DaoFactory;
import vt.com.pe.tarea02.service.EventoService;

/**
 *
 * @author emaravi
 */
public class EventoServiceImpl implements EventoService{
    private EventoDao dao;

    public EventoServiceImpl() {
        DaoFactory fabrica = DaoFactory.getInstance();
        dao = fabrica.getEventoDao(opc);
    }
    
    @Override
    public void grabar(Evento evento) {
        dao.create(evento);
    }

    @Override
    public Evento buscar(Object id) {
        return dao.find(id);
    }

    @Override
    public List<Evento> listar() {
        return dao.findAll();
    }

    @Override
    public void actualizar(Evento evento) {
        dao.update(evento);
    }

    @Override
    public void borrar(Object id) {
        dao.delete(id);
    }

//    @Override
//    public List<Evento> filtrarPoEstado(String estado) {
//        return dao.filterByEstado(estado);
//    }

//    @Override
//    public List<Evento> ordenarPorPromedio() {
//        return dao.orderByPromedio();
//    }

    @Override
    public List<Evento> ordenarPorNombre() {
        return dao.orderByNombre();
    }
    
}
