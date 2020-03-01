/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vt.com.pe.tarea02.dao.impl;

import cjava.beans.Alumno;
import cjava.dao.AlumnoDao;
import cjava.util.AlumnoOrdenPorNombre;
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
 * @author emaravi
 */
public class EventoDaoFile implements AlumnoDao{

    private List<Alumno> lAlumno;

    public EventoDaoFile() {
        lAlumno = new ArrayList<>();
    }

    @Override
    public void create(Alumno t) {
        if(find(t.getId())==null){
            lAlumno.add(t);
            grabarAlumnos();
        }
    }

    @Override
    public Alumno find(Object id) {
        leerAlumnos();
        for(Alumno alumno:lAlumno){
            if(alumno.getId()==(int)id)
                return alumno;
        }
        return null;
    }

    @Override
    public List<Alumno> findAll() {
        leerAlumnos();
        return lAlumno;
    }

    @Override
    public void update(Alumno t) {
        for(int ind=0; ind<lAlumno.size(); ind++){
            if(lAlumno.get(ind).getId()==t.getId()){
                lAlumno.set(ind,t);
                grabarAlumnos();
                break;
            }
        }
    }

    @Override
    public void delete(Object id) {
        lAlumno.remove(find(id));
        grabarAlumnos();
    }
    
     @Override
    public List<Alumno> filterByEstado(String estado) {
        leerAlumnos();
        List<Alumno> subList=new ArrayList<>();
        for(Alumno a:lAlumno){
            if(a.getEstado().equals(estado))
                subList.add(a);
        }
        return subList;
    }

    @Override
    public List<Alumno> orderByPromedio() {
        leerAlumnos();
        return null;
    }

    @Override
    public List<Alumno> orderByNombre() {
        leerAlumnos();
        Comparator<Alumno> sortName = new AlumnoOrdenPorNombre();
         Collections.sort(lAlumno, sortName);  
        return lAlumno;
    }
    
    private void grabarAlumnos(){
        String linea;
        try (BufferedWriter bufOutput = new BufferedWriter(new FileWriter("alumnos.txt"))) {
            for(Alumno alumno:lAlumno){
                linea = alumno.getId()+","+alumno.getNombre()+","+
                        alumno.isGenero()+","+alumno.getPromedio()+","+
                        alumno.getEstado();
                bufOutput.write(linea);
                bufOutput.newLine();
            }
        } catch (FileNotFoundException f) {
            System.out.println("[grabar]Archivo no encontrado: " + f);
        } catch (IOException e) {
            System.out.println("No se pudeo grabar alumno.txt: " + e);
        }
    }
    
    private void leerAlumnos(){
        try (BufferedReader bufInput = new BufferedReader(new FileReader("alumnos.txt"))) {
            String linea;
            lAlumno.clear();
            Alumno alumno;
            while ((linea = bufInput.readLine()) != null) {
                StringTokenizer tokens = new StringTokenizer(linea,",");
                alumno = new Alumno();
                alumno.setId(Integer.parseInt(tokens.nextToken().trim()));
                alumno.setNombre(tokens.nextToken().trim());
                alumno.setGenero(Boolean.parseBoolean(tokens.nextToken().trim()));
                alumno.setPromedio(Double.parseDouble(tokens.nextToken().trim()));
                lAlumno.add(alumno);
            }
        } catch (FileNotFoundException f) {
            System.out.println("[leer]Archivo no encontrado: " + f);
        } catch (IOException e) {
            System.out.println("No se pudeo leer alumno.txt: " + e);
        }
    }
}
