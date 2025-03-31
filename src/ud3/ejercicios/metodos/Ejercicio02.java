package src.ud3.ejercicios.metodos;

import src.ud3.ejercicios.Ejercicio;

import java.util.Scanner;

public class Ejercicio02 extends Ejercicio {
    public static void resolverEjercicio(Scanner entrada) {
        System.out.println("""
            Boletin 3 | Ejercicio 2
        Ingresa una fecha en formato dd/mm/aaaa y valida si es correcta o no con el método del ejercicio 1:
        
        Ingresa la fecha (dd/mm/aaaa):""");
        String fecha = ingresarCadena(entrada);
        int dia = Integer.parseInt(fecha.substring(0, 2));
        int mes = Integer.parseInt(fecha.substring(3, 5));
        int anho = Integer.parseInt(fecha.substring(6, 10));

        if (dia <= 0 || mes <= 0 || mes > 12 || anho <= 0) {
            System.out.println("Fecha no válida");
        } else {
            System.out.printf("%02d/%02d/%4d", dia, mes, anho);
            if (dia <= Ejercicio01.calcularDiasDelMes(mes, anho)) {
                System.out.print(" => Fecha válida");
            } else {
                System.out.print(" => Fecha no válida");
            }
        }
    }

    private Ejercicio02() {
    }
}