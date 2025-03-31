package src.ud3.ejercicios.clasemath;

import src.ud3.ejercicios.Ejercicio;

public class Ejercicio32 extends Ejercicio {
    private Ejercicio32() {
    }

    public static void resolverEjercicio() {

        System.out.println("""
            Boletin 3 | Ejercicio 32
        Escribe una función que devuelva los resultados de la función f(x) para los enteros de x entre [-100, 100]:
        """);
        System.out.println("x\tf(x)");
        for (int i = -100; i <= 100; i++) {
            System.out.println(i + "    " + funcionF(i));
        }
    }

    public static double funcionF(int gradoEntero) {
        return Math.sin(4 * Math.toRadians(gradoEntero)) + Math.cos(2 * Math.toRadians(gradoEntero));
    }
}