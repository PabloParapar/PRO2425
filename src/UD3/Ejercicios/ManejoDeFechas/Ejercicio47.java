package src.UD3.Ejercicios.ManejoDeFechas;

import java.time.LocalDate;
import java.util.Scanner;

public class Ejercicio47 {
    public static void ejercicio47(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 47\n" + ":");
        System.out.println(":");
        entrada.nextLine();
        String fecha = entrada.nextLine();
        comprobarFecha(fecha);
    }

    public static void comprobarFecha(String texto) {
        LocalDate fechaNacimiento = LocalDate.parse(texto);
        LocalDate fechaJubilacion = fechaNacimiento.plusYears(67);
        System.out.println("Día de la semana en que nació = " + fechaNacimiento.getDayOfWeek());
        System.out.println("Fecha de Jubilación = " + fechaJubilacion);
    }
}