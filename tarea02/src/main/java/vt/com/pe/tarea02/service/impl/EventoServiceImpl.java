/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vt.com.pe.tarea02.service.impl;

import cjava.beans.Evento;
import cjava.dao.EventoDao;
import cjava.dao.impl.DaoFactory;
import cjava.service.EventoService;
import static cjava.util.Util.opc;
import java.util.List;

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

    @Override
    public List<Evento> filtrarPoEstado(String estado) {
        return dao.filterByEstado(estado);
    }

    @Override
    public List<Evento> ordenarPorPromedio() {
        return dao.orderByPromedio();
    }

    @Override
    public List<Evento> ordenarPorNombre() {
        return dao.orderByNombre();
    }
    
}
