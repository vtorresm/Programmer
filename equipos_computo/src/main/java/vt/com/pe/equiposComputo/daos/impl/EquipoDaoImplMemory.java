package vt.com.pe.equiposComputo.daos.impl;

import java.util.ArrayList;
import java.util.List;
import vt.com.pe.equiposComputo.daos.EquipoDao;
import vt.com.pe.equiposComputo.entidades.Equipo;

public class EquipoDaoImplMemory implements EquipoDao{
    
    private List<Equipo> lista;

    public EquipoDaoImplMemory() {
        lista =  new ArrayList<>();
    }
    
   @Override
    public void create(Equipo t) {
        if(find(t.getId())==null)
            lista.add(t);
    }

    @Override
    public Equipo find(String v) {
        for(Equipo a:lista) 
            if(a.getId().equals(v))
                return a;
        return null;
    }

    @Override
    public List<Equipo> findAll() {
        return lista;
    }

    @Override
    public void update(Equipo t) {
        for(int ind=0; ind<lista.size(); ind++){
            if(lista.get(ind).getId()==t.getId()){
                lista.set(ind,t);
                break;
            }
        }
    }

    @Override
    public void delete(String id) {
        lista.remove(find(id));
    }
}
