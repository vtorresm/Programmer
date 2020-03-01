/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vt.com.pe.tarea02.dao.impl;

import cjava.beans.Alumno;
import cjava.dao.AlumnoDao;
import cjava.util.AlumnoOrdenPorNombre;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author emaravi
 */
public class EventoDaoMemory implements AlumnoDao{

    private List<Alumno> lAlumno;

    public EventoDaoMemory() {
        lAlumno = new ArrayList<>();
    }

    @Override
    public void create(Alumno t) {
        if(find(t.getId())==null)
            lAlumno.add(t);
    }

    @Override
    public Alumno find(Object id) {
        for(Alumno alumno:lAlumno){
            if(alumno.getId()==(int)id)
                return alumno;
        }
        return null;
    }

    @Override
    public List<Alumno> findAll() {
        return lAlumno;
    }

    @Override
    public void update(Alumno t) {
        for(int ind=0; ind<lAlumno.size(); ind++){
            if(lAlumno.get(ind).getId()==t.getId()){
                lAlumno.set(ind,t);
                break;
            }
        }
    }

    @Override
    public void delete(Object id) {
        lAlumno.remove(find(id));
    }
    
     @Override
    public List<Alumno> filterByEstado(String estado) {
        List<Alumno> subList=new ArrayList<>();
        for(Alumno a:lAlumno){
            if(a.getEstado().equals(estado))
                subList.add(a);
        }
        return subList;
    }

    @Override
    public List<Alumno> orderByPromedio() {
        return null;
    }

    @Override
    public List<Alumno> orderByNombre() {
        Comparator<Alumno> sortName = new AlumnoOrdenPorNombre();
         Collections.sort(lAlumno, sortName);  
        return lAlumno;
    }
}
