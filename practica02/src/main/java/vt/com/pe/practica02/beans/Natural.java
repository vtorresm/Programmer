package vt.com.pe.practica02.beans;

import java.io.Serializable;

/**
 *
 * @author Victor
 */
public class Natural extends Persona implements Serializable{

    private String DNI;
    private String paterno;
    
    public Natural() {
        super();
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }
    private String materno;

}
