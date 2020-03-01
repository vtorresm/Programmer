package vt.com.pe.tarea02.dao.impl;

import vt.com.pe.tarea02.beans.Evento;
import vt.com.pe.tarea02.dao.EventoDao;
import vt.com.pe.tarea02.util.EventoOrdenPorNombre;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author Victor
 */
public class EventoDaoFile implements EventoDao{

    private List<Evento> lEvento;

    public EventoDaoFile() {
        lEvento = new ArrayList<>();
    }

    @Override
    public void create(Evento t) {
        if(find(t.getId())==null){
            lEvento.add(t);
            grabarEventos();
        }
    }

    @Override
    public Evento find(Object id) {
        leerEventos();
        for(Evento evento:lEvento){
            if(evento.getId()==(int)id)
                return evento;
        }
        return null;
    }

    @Override
    public List<Evento> findAll() {
        leerEventos();
        return lEvento;
    }

    @Override
    public void update(Evento t) {
        for(int ind=0; ind<lEvento.size(); ind++){
            if(lEvento.get(ind).getId()==t.getId()){
                lEvento.set(ind,t);
                grabarEventos();
                break;
            }
        }
    }

    @Override
    public void delete(Object id) {
        lEvento.remove(find(id));
        grabarEventos();
    }
    
//     @Override
//    public List<Evento> filterByEstado(String estado) {
//        leerEventos();
//        List<Evento> subList=new ArrayList<>();
//        for(Evento a:lEvento){
//            if(a.getEstado().equals(estado))
//                subList.add(a);
//        }
//        return subList;
//    }

//    @Override
//    public List<Evento> orderByPromedio() {
//        leerEventos();
//        return null;
//    }

    @Override
    public List<Evento> orderByNombre() {
        leerEventos();
        Comparator<Evento> sortName = new EventoOrdenPorNombre();
         Collections.sort(lEvento, sortName);  
        return lEvento;
    }
    
    private void grabarEventos(){
        String linea;
        try (BufferedWriter bufOutput = new BufferedWriter(new FileWriter("eventos.txt"))) {
            for(Evento evento:lEvento){
                linea = evento.getId()+","+evento.getNombre()+","+
                        evento.isGenero()+","+evento.getPromedio()+","+
                        evento.getEstado();
                bufOutput.write(linea);
                bufOutput.newLine();
            }
        } catch (FileNotFoundException f) {
            System.out.println("[grabar]Archivo no encontrado: " + f);
        } catch (IOException e) {
            System.out.println("No se pudeo grabar alumno.txt: " + e);
        }
    }
    
    private void leerEventos(){
        try (BufferedReader bufInput = new BufferedReader(new FileReader("alumnos.txt"))) {
            String linea;
            lEvento.clear();
            Evento evento;
            while ((linea = bufInput.readLine()) != null) {
                StringTokenizer tokens = new StringTokenizer(linea,",");
                evento = new Evento();
                evento.setId(Integer.parseInt(tokens.nextToken().trim()));
                evento.setNombre(tokens.nextToken().trim());
                evento.setGenero(Boolean.parseBoolean(tokens.nextToken().trim()));
                evento.setPromedio(Double.parseDouble(tokens.nextToken().trim()));
                evento.add(evento);
            }
        } catch (FileNotFoundException f) {
            System.out.println("[leer]Archivo no encontrado: " + f);
        } catch (IOException e) {
            System.out.println("No se pudeo leer alumno.txt: " + e);
        }
    }
}
