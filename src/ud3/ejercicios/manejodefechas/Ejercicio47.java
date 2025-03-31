package src.ud3.ejercicios.manejodefechas;

import src.ud3.ejercicios.Ejercicio;

import java.time.LocalDate;
import java.util.Scanner;

public class Ejercicio47 extends Ejercicio {
    public static void resolverEjercicio(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 47\n" + ":");
        System.out.println(":");
        entrada.nextLine();
        String fecha = ingresarCadena(entrada);
        comprobarFecha(fecha);
    }

    public static void comprobarFecha(String texto) {
        LocalDate fechaNacimiento = LocalDate.parse(texto);
        LocalDate fechaJubilacion = fechaNacimiento.plusYears(67);
        System.out.println("Día de la semana en que nació = " + fechaNacimiento.getDayOfWeek());
        System.out.println("Fecha de Jubilación = " + fechaJubilacion);
    }
}