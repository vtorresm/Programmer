package vt.com.pe.practica02.beans;

import java.io.Serializable;

/**
 *
 * @author Victor
 */
public class Producto implements Serializable{
    
    private int id;
    private String tipo;
    private String descripcion;
    private double precio;
    private int stock_actual;
    private int stock_final;
    private String unid_medida;

    
    public Producto() {
    }
    
    public Producto(int id, String descripcion,double precio, 
            int stock_actual, int stock_final, String unid_medida) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock_actual = stock_actual;
        this.stock_final = stock_final;
        this.unid_medida = unid_medida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock_actual() {
        return stock_actual;
    }

    public void setStock_actual(int stock_actual) {
        this.stock_actual = stock_actual;
    }

    public int getStock_final() {
        return stock_final;
    }

    public void setStock_final(int stock_final) {
        this.stock_final = stock_final;
    }

    public String getUnid_medida() {
        return unid_medida;
    }

    public void setUnid_medida(String unid_medida) {
        this.unid_medida = unid_medida;
    }


    
    
}
