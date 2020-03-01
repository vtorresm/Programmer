package vt.com.pe.equiposComputo.entidades;

import static vt.com.pe.equiposComputo.Util.Util.EstadoA;
import static vt.com.pe.equiposComputo.Util.Util.EstadoB;
import static vt.com.pe.equiposComputo.Util.Util.EstadoC;
import static vt.com.pe.equiposComputo.entidades.Equipo.Estado.Activo;
import static vt.com.pe.equiposComputo.entidades.Equipo.Estado.Desactivo;

public class Equipo {

    private String id;
    private String nombre;
    private int stock;
    double precio;
    String categoria;
    private int cantidad;
    private String estado;

    public Equipo() {
    }

    public Equipo(String id, String nombre, int stock, double precio, int cantidad, String categoria, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
        this.estado = estado;

    }

    @Override
    public String toString() {
        return "Equipo{" + "id=" + id + ", nombre=" + nombre + ", stock=" + stock + ", precio=" + precio + ", cantidad=" + cantidad + ", categoria=" + categoria + ", estado=" + estado + '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    } 

    enum Estado {
        Activo,
        Desactivo
    }
    Estado miEstado = Estado.Activo;

    public String getTipoEstado() {

        switch (miEstado) {
            case Activo:
                estado = EstadoA;
                System.out.println("Estado Activo");
                break;
            case Desactivo:
                estado = EstadoB;
                System.out.println("Estado Desactivo");
                break;
            default:
                estado = EstadoC;
                System.out.println("Estado Desconocido");
        }
        return estado;
    }

}
