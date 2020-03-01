package vt.com.pe.equiposComputo.pruebas;

import java.util.Iterator;
import java.util.Scanner;
import vt.com.pe.equiposComputo.Util.Util;
import vt.com.pe.equiposComputo.daos.EquipoDao;
import vt.com.pe.equiposComputo.daos.impl.DaoFactory;
import vt.com.pe.equiposComputo.entidades.Equipo;
import vt.com.pe.equiposComputo.entidades.Factura;

public class Prueba01 {

    static String direc, nom, tel;
    static int cantidad, id, habitaciones;
    static double costo;
    static double igv, total;
    static double tot;
    static String personas;

    public static void main(String[] args) {

        Equipo c01 = new Equipo("100", "Monitor", 45, 530.00, 3, "B", "ACTIVO");
        Equipo c02 = new Equipo("101", "CPU", 23, 2300.00, 4, "A", "ACTIVO");
        Equipo c03 = new Equipo("102", "Disco duro", 350, 230.00, 2, "C", "ACTIVO");
        Equipo c04 = new Equipo("103", "Memoria RAM", 95, 230.00, 3, "C", "ACTIVO");
        Equipo c05 = new Equipo("104", "Teclado", 65, 23.00, 3, "C", "DESACTIVO");

        DaoFactory fabrica = DaoFactory.getInstance();
        EquipoDao dao = fabrica.getEquipoDao(Util.opc);

        dao.create(c01);

        dao.create(c02);

        dao.create(c03);

        dao.create(c04);

        dao.create(c05);

        dao.update(
                new Equipo("105", "Impresora", 15, 430.00, 0, "B", "ACTIVO"));
        dao.update(
                new Equipo("106", "Laptop", 235, 1430.00, 0, "A", "ACTIVO"));
        dao.update(
                new Equipo("102", "Disco duro", 15, 430.00, 0, "B", "DESACTIVO"));

        for (Iterator<Equipo> it = dao.findAll().iterator(); it.hasNext();) {
            Equipo c = it.next();
            System.out.println(c);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("digite nombre: ");
        nom = sc.next();
        System.out.println("digite direccion: ");
        direc = sc.next();
        System.out.println("digite telefono: ");
        tel = sc.next();
        System.out.println("digite identificacion: ");
        id = sc.nextInt();
        System.out.println("digite cantidad");
        cantidad = sc.nextInt();
        while (cantidad < 1) {
            System.out.println("digite valores validos ");
            cantidad = sc.nextInt();
        }
        System.out.println("digite costo unidad");
        costo = sc.nextInt();

        while (costo < 1) {
            System.out.println("digite valores validos ");
            costo = sc.nextInt();
        }

        factura();
        calcularIGV();

    }

    public static void factura() {

        System.out.println("su factura es " + "\n" + " nombre " + nom + "\n" + "direccion " + direc + "\n" + "telefono " + tel + "\n" + "idenficacion " + id + "\n" + "costo unidad " + costo + "\n");
    }

    public static void calcularIGV() {
        total = costo * cantidad;
        igv = (total * 18) / 100;
        tot = total + igv;
        System.out.println("costo total " + tot);
    }

    public class CalcularNeto {

        public void getNeto() {
            Factura calcularNeto = new Factura();
            calcularNeto.getCalcularNeto();
        }
    }

}
