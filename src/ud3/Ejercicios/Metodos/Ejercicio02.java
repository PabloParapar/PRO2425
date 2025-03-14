package src.ud3.Ejercicios.Metodos;

import java.util.Scanner;

public class Ejercicio02{
    public static void resolverEjercicio(Scanner entrada) {
        System.out.println("\n\tBoletin 3 | Ejercicio 2\n" + "Ingresa una fecha en formato dd/mm/aaaa y valida si es correcta o no con el método del ejercicio 1:");
        System.out.println("\nIngresa la fecha (dd/mm/aaaa):");
        String fecha = entrada.next();
        int dia = Integer.parseInt(fecha.substring(0, 2));
        int mes = Integer.parseInt(fecha.substring(3, 5));
        int anho = Integer.parseInt(fecha.substring(6, 10));

        if (dia <= 0 || mes <= 0 || mes > 12 || anho <= 0) {
            System.out.println("Fecha no válida");
        } else {
            if (dia <= Ejercicio01.calcularDiasDelMes(mes, anho)) {
                System.out.println(dia + "/" + mes + "/" + anho + " => Fecha válida");
            } else {
                System.out.println(dia + "/" + mes + "/" + anho + " => Fecha no válida");
            }
        }
    }
}