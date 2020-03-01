package vt.com.pe.equiposComputo.daos.impl;

import static vt.com.pe.equiposComputo.Util.Util.CATEGORY_A_PRICE;
import static vt.com.pe.equiposComputo.Util.Util.CATEGORY_B_PRICE;
import static vt.com.pe.equiposComputo.Util.Util.CATEGORY_C_PRICE;
import vt.com.pe.equiposComputo.daos.EquipoDao;

public class DaoFactory {
    
     private DaoFactory() {
    }
    
    public static DaoFactory getInstance() {
        return DaoFactoryHolder.INSTANCE;
    }
    
    private static class DaoFactoryHolder {

        private static final DaoFactory INSTANCE = new DaoFactory();
    }
    
    public EquipoDao getEquipoDao(int tipo){
        EquipoDao dao;
        switch(tipo){
            case CATEGORY_A_PRICE: dao = new EquipoDaoImplMemory();
            break;
            case CATEGORY_B_PRICE: dao = new EquipoDaoImplMemory();
            break;
            case CATEGORY_C_PRICE: dao = new EquipoDaoImplMemory();
            break;
            default: dao =null;
        }
        return dao;
    }
}
