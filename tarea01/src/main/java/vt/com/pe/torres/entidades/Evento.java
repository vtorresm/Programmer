package vt.com.pe.torres.entidades;

import static vt.com.pe.torres.util.MisConstantes.GOLD;
import static vt.com.pe.torres.util.MisConstantes.PLATINUM;
import static vt.com.pe.torres.util.MisConstantes.TEMP_ALTA;
import static vt.com.pe.torres.util.MisConstantes.TEMP_BAJA;
import static vt.com.pe.torres.util.MisConstantes.VIP;
import static vt.com.pe.torres.util.MisConstantes.IGV;

/**
 *
 * @author Victor
 */
public class Evento extends Persona {

    private int id;
    private String titulo_evento;
    private String duracion_evento;
    private String nombre_expositor;
    private String hora_ingreso;
    private String hora_salida;
    private String temporada_evento;
    private double costo_entradas;
    private String ubicacion;

    public Evento() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo_evento() {
        return titulo_evento;
    }

    public void setTitulo_evento(String titulo_evento) {
        this.titulo_evento = titulo_evento;
    }

    public String getDuracion_evento() {
        return duracion_evento;
    }

    public void setDuracion_evento(String duracion_evento) {
        this.duracion_evento = duracion_evento;
    }

    public String getNombre_expositor() {
        return nombre_expositor;
    }

    public void setNombre_expositor(String nombre_expositor) {
        this.nombre_expositor = nombre_expositor;
    }

    public String getHora_ingreso() {
        return hora_ingreso;
    }

    public void setHora_ingreso(String hora_ingreso) {
        this.hora_ingreso = hora_ingreso;
    }

    public String getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(String hora_salida) {
        this.hora_salida = hora_salida;
    }

    public String getTemporada_evento() {
        return temporada_evento;
    }

    public void setTemporada_evento(String temporada_evento) {
        this.temporada_evento = temporada_evento.toUpperCase();
    }

    public double getCosto_entradas() {
        return costo_entradas;
    }

    public void setCosto_entradas(double costo_entradas) {
        this.costo_entradas = costo_entradas;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion.toUpperCase();
    }

    //Metodo COSTO DE INGRESO
    public double getCosto() {
        //formula  para COSTO DE INGRESO
        switch (ubicacion) {
            case "P":
                costo_entradas = PLATINUM;
                break;
            case "G":
                costo_entradas = GOLD;
                break;
            case "V":
                costo_entradas = VIP;
                break;
            default:
                costo_entradas = 0;
        }
        return costo_entradas;
    }

    public double getCalculoIGV() {
        return costo_entradas * IGV;
    }

    Double descuento = 0.00;

    public double getDescuento() {
        //formula  para DESCUENTO

        switch (temporada_evento) {
            case "ALTA":
                descuento = costo_entradas * TEMP_ALTA;
                break;
            case "BAJA":
                descuento = costo_entradas * TEMP_BAJA;
                break;
            default:
                descuento = 0.00;
        }
        return descuento;
    }

    public double getMontoTotal(double getCosto,
            double getCalculoIGV, double getDescuento) {

        return (getCosto - getDescuento) + getCalculoIGV;
    }

}
