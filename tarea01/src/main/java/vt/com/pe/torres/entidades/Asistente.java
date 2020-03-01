package vt.com.pe.torres.entidades;

/**
 *
 * @author Victor
 */
public class Asistente extends Persona{
    
    private String telefono;
    private String direccion;
    
    public Asistente() {
        super();
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    

    

}
