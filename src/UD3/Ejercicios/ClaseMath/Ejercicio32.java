package src.UD3.Ejercicios.ClaseMath;

public class Ejercicio32 {
    public static void ejercicio32() {

        System.out.println("\n\tBoletin 3 | Ejercicio 32\n" + "Escribe una función que devuelva los resultados de la función f(x) para los enteros de x entre [-100, 100]:");
        System.out.println("x\tf(x)");
        for (int i = -100; i <= 100; i++) {
            System.out.println(i + "    " + funcionF(i));
        }
    }

    public static double funcionF(int gradoEntero) {
        return Math.sin(4 * Math.toRadians(gradoEntero)) + Math.cos(2 * Math.toRadians(gradoEntero));
    }
}