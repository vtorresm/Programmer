package vt.com.pe.torres.pruebas;

import vt.com.pe.torres.entidades.Asistente;
import vt.com.pe.torres.entidades.Evento;

/**
 *
 * @author Victor
 */
public class Prueba1 {

    public static void main(String[] args) {

        Evento evento1 = new Evento();
        evento1.setId(100);
        evento1.setTitulo_evento("Curso JAVA");
        evento1.setDuracion_evento("20 horas");
        evento1.setNombre_expositor("Juan Lopez");
        evento1.setHora_ingreso("10:00 AM");
        evento1.setHora_salida("18:00 PM");
        evento1.setTemporada_evento("BAJA");
        evento1.setCosto_entradas(530);
        evento1.setUbicacion("Av. Arenales 390");

        Evento evento2 = new Evento();
        evento2.setId(101);
        evento2.setTitulo_evento("Curso PYTHON");
        evento2.setDuracion_evento("34 horas");
        evento2.setNombre_expositor("Pedro Ruiz");
        evento2.setHora_ingreso("12:00 PM");
        evento2.setHora_salida("18:00 PM");
        evento2.setTemporada_evento("ALTA");
        evento2.setCosto_entradas(530);
        evento2.setUbicacion("Av. Arenales 390");

        Evento evento3 = new Evento();
        evento3.setId(102);
        evento3.setTitulo_evento("Curso DOCKER");
        evento3.setDuracion_evento("15 horas");
        evento3.setNombre_expositor("Felipe Duarte");
        evento3.setHora_ingreso("8:00 AM");
        evento3.setHora_salida("18:00 PM");
        evento3.setTemporada_evento("BAJA");
        evento3.setCosto_entradas(530);
        evento3.setUbicacion("Av. Arenales 390");
        
        Asistente asistente = new Asistente();
        asistente.setNombre("Victor");
        asistente.setApellidos("Torres Mori");
        
        System.out.println("***********************EVENTOS*************************");
        System.out.println("Titulo: " + evento1.getTitulo_evento());
        System.out.println("Asistente: " + asistente.getNombre());
        System.out.println("Asistente: " + asistente.getApellidos());
        System.out.println("Expositor: " + evento1.getNombre_expositor());
        System.out.println("***********************EVENTOS*************************");
        System.out.println("Titulo: " + evento2.getTitulo_evento());
        System.out.println("Asistente: " + asistente.getNombre());
        System.out.println("Asistente: " + asistente.getApellidos());
        System.out.println("Expositor: " + evento2.getNombre_expositor());
        System.out.println("***********************EVENTOS*************************");
        System.out.println("Titulo: " + evento3.getTitulo_evento());
        System.out.println("Asistente: " + asistente.getNombre());
        System.out.println("Asistente: " + asistente.getApellidos());
        System.out.println("Expositor: " + evento3.getNombre_expositor());

        System.out.println("***********************EVENTO 1*************************");
        System.out.println("Titulo: " + evento1.getTitulo_evento());
        System.out.println("Duración: " + evento1.getDuracion_evento());
        System.out.println("Expositor: " + evento1.getNombre_expositor());
        System.out.println("Hora de Ingreso: " + evento1.getHora_ingreso());
        System.out.println("Hora de Salida: " + evento1.getHora_salida());
        System.out.println("Temporada: " + evento1.getTemporada_evento());
        System.out.println("Costo Entradas: " + evento1.getCosto_entradas());
        System.out.println("ubicacion: " + evento1.getUbicacion());


        System.out.println("***********************EVENTO 2*************************");
        System.out.println("Titulo: " + evento2.getTitulo_evento());
        System.out.println("Duración: " + evento2.getDuracion_evento());
        System.out.println("Expositor: " + evento2.getNombre_expositor());
        System.out.println("Hora de Ingreso: " + evento2.getHora_ingreso());
        System.out.println("Hora de Salida: " + evento2.getHora_salida());
        System.out.println("Temporada: " + evento2.getTemporada_evento());
        System.out.println("Costo Entradas: " + evento2.getCosto_entradas());
        System.out.println("ubicacion: " + evento2.getUbicacion());


        System.out.println("***********************EVENTO 3*************************");
        System.out.println("Titulo: " + evento3.getTitulo_evento());
        System.out.println("Duración: " + evento3.getDuracion_evento());
        System.out.println("Expositor: " + evento3.getNombre_expositor());
        System.out.println("Hora de Ingreso: " + evento3.getHora_ingreso());
        System.out.println("Hora de Salida: " + evento3.getHora_salida());
        System.out.println("Temporada: " + evento3.getTemporada_evento());
        System.out.println("Costo Entradas: " + evento3.getCosto_entradas());
        System.out.println("ubicacion: " + evento3.getUbicacion());
       

    }
}
