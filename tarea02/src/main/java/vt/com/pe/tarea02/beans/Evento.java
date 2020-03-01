package vt.com.pe.tarea02.beans;

import java.io.Serializable;

/**
 *
 * @author Victor
 */
public class Evento implements Serializable{
    
    private int id;
    private String nombre;
    private String fecha;
    private String direccion;
    private int capacidad;
    private String categoria;
    private double costo;
    
    public Evento() {
    }
    
    public Evento(int id, String nombre,String fecha, 
            String direccion, int capacidad, String categoria,
            double costo) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.direccion = direccion;
        this.capacidad = capacidad;
        this.categoria = categoria;
        this.costo = costo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    
}
