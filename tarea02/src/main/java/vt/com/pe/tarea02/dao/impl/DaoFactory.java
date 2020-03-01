package vt.com.pe.tarea02.dao.impl;

import vt.com.pe.tarea02.dao.EventoDao;
import static vt.com.pe.tarea02.util.Util.DB;
import static vt.com.pe.tarea02.util.Util.FILE;
import static vt.com.pe.tarea02.util.Util.MEMORY;
/**
 *
 * @author emaravi
 */
public class DaoFactory {
    
    private DaoFactory() {
    }
    
    public static DaoFactory getInstance() {
        return DaoFactoryHolder.INSTANCE;
    }
    
    private static class DaoFactoryHolder {
        private static final DaoFactory INSTANCE = new DaoFactory();
    }
    
    public EventoDao getEventoDao(int tipo){
        switch(tipo){
           case MEMORY: return new EventoDaoMemory();
           case FILE: return new EventoDaoFile();
           case DB: return new EventoDaoDataBase();
           default: return null;    
        }
    }
}
