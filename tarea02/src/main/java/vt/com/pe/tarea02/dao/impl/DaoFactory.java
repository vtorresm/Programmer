package vt.com.pe.tarea02.dao.impl;

import cjava.dao.AlumnoDao;
import static cjava.util.Util.MEMORY;
import static cjava.util.Util.FILE;
import static cjava.util.Util.DB;
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
    
    public AlumnoDao getAlumnoDao(int tipo){
        switch(tipo){
           case MEMORY: return new EventoDaoMemory();
           case FILE: return new EventoDaoFile();
           case DB: return new EventoDaoDataBase();
           default: return null;    
        }
    }
}
