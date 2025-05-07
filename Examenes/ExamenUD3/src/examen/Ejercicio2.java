package examen;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa la fecha de nacimiento:");
        String fecha = entrada.next();
        LocalDate fechaNacimiento = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.forLanguageTag("es")));
        LocalDate fechaJubilacion = fechaNacimiento.plusYears(72);
        System.out.println("El día de la Semana en que nació fue " + fechaNacimiento.getDayOfWeek() +
                "\nEl día en el que podrá jubilarse será " + fechaJubilacion.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
}
