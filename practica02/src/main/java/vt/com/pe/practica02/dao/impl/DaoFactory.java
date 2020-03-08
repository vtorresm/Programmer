package vt.com.pe.practica02.dao.impl;

import static vt.com.pe.practica02.util.Util.DB;
import static vt.com.pe.practica02.util.Util.FILE;
import static vt.com.pe.practica02.util.Util.MEMORY;
import vt.com.pe.practica02.dao.ProductoDao;

public class DaoFactory {
    
    private DaoFactory() {
    }
    
    public static DaoFactory getInstance() {
        return DaoFactoryHolder.INSTANCE;
    }
    
    private static class DaoFactoryHolder {
        private static final DaoFactory INSTANCE = new DaoFactory();
    }
    
    public ProductoDao getProductoDao(int tipo){
        switch(tipo){
           case MEMORY: return new ProductoDaoMemory();
           case FILE: return new ProductoDaoFile();
           default: return null;    
        }
    }
}
