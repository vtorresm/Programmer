package vt.com.pe.practica02.beans;

import java.io.Serializable;

/**
 *
 * @author Victor
 */
public class Juridica extends Persona implements Serializable{
    
    private String RUC;

    public Juridica() {
        super();
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }
}
