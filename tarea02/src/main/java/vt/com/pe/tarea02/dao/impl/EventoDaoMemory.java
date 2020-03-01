package vt.com.pe.tarea02.dao.impl;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import vt.com.pe.tarea02.beans.Evento;
import vt.com.pe.tarea02.dao.EventoDao;

/**
 *
 * @author Victor
 */
public class EventoDaoMemory implements EventoDao{

    private List<Evento> lEvento;

    public EventoDaoMemory() {
        lEvento = new ArrayList<>();
    }

    @Override
    public void create(Evento t) {
        if(find(t.getId())==null)
            lEvento.add(t);
    }

    @Override
    public Evento find(Object id) {
        for(Evento alumno:lEvento){
            if(alumno.getId()==(int)id)
                return alumno;
        }
        return null;
    }

    @Override
    public List<Evento> findAll() {
        return lEvento;
    }

    @Override
    public void update(Evento t) {
        for(int ind=0; ind<lEvento.size(); ind++){
            if(lEvento.get(ind).getId()==t.getId()){
                lEvento.set(ind,t);
                break;
            }
        }
    }

    @Override
    public void delete(Object id) {
        lEvento.remove(find(id));
    }
    
     @Override
    public List<Evento> filterByEstado(String estado) {
        List<Evento> subList=new ArrayList<>();
        for(Evento a:lEvento){
            if(a.getEstado().equals(estado))
                subList.add(a);
        }
        return subList;
    }

    @Override
    public List<Evento> orderByPromedio() {
        return null;
    }

    @Override
    public List<Evento> orderByNombre() {
        Comparator<Evento> sortName = new EventoOrdenPorNombre();
         Collections.sort(lEvento, sortName);  
        return lEvento;
    }
}
