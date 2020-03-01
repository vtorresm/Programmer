package vt.com.pe.equiposComputo.daos;

import java.util.List;
import vt.com.pe.equiposComputo.entidades.Equipo;

public interface EquipoDao {
    
     public void create(Equipo equipo);
    
    public Equipo find (String id);
    public List<Equipo> findAll();
    
    public void update(Equipo equipo);
    
    public void delete (String id);
}
