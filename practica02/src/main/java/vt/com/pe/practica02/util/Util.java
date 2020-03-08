package vt.com.pe.practica02.util;

import java.util.ResourceBundle;

/**
 *
 * @author Victor
 */
public class Util {
    
    public static final double Q = 10.00;
    public static final double L = 8.00;
    public static final double M = 3.00;

    public static final int MEMORY = 0;
    public static final int FILE = 1;
    public static final int DB = 2;
    

    public static int opc;

    static {
        ResourceBundle properties = ResourceBundle.getBundle("cjava.util.config");
        opc = Integer.parseInt(properties.getString("opc"));

    }
}
