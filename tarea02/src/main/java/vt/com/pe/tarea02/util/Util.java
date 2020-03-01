package vt.com.pe.tarea02.util;

import java.util.ResourceBundle;

/**
 *
 * @author Victor
 */
public class Util {

    public static final int MEMORY = 0;
    public static final int FILE = 1;
    public static final int DB = 2;
    public static String mensajeAprobado;
    public static String mensajeADesaprobado;

    public static final int MAX = 13;

    public static int opc;

    static {
        ResourceBundle properties = ResourceBundle.getBundle("cjava.util.config");
        opc = Integer.parseInt(properties.getString("opc"));
        mensajeAprobado = properties.getString("maprobado");
        mensajeADesaprobado = properties.getString("mdesaprobado");

    }
}
