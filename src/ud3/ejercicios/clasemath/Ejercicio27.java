package src.ud3.ejercicios.clasemath;

public class Ejercicio27 {
    private Ejercicio27() {
    }

    public static void ejercicio27() {

        System.out.println("""
            Boletin 3 | Ejercicio 27
        Escribir un programa que simule el lanzamiento de un dado y muestre por pantalla la frecuencia de los resultados de mil lanzamientos:""");
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        int contador5 = 0;
        int contador6 = 0;
        for (int i = 0; i < 1000; i++) {
            int tirada = lanzarDado();
            switch (tirada) {
                case 1:
                    contador1++;
                    break;
                case 2:
                    contador2++;
                    break;
                case 3:
                    contador3++;
                    break;
                case 4:
                    contador4++;
                    break;
                case 5:
                    contador5++;
                    break;
                default:
                    contador6++;
                    break;
            }
        }
        System.out.println(
                "Tiradas 1: " + contador1 + "\tFrecuencia: " + ((double) contador1 * 100 / 1000) + "%" +
                "\nTiradas 3: " + contador3 + "\tFrecuencia: " + ((double) contador3 * 100 / 1000) + "%" +
                "\nTiradas 2: " + contador2 + "\tFrecuencia: " + ((double) contador2 * 100 / 1000) + "%" +
                "\nTiradas 4: " + contador4 + "\tFrecuencia: " + ((double) contador4 * 100 / 1000) + "%" +
                "\nTiradas 5: " + contador5 + "\tFrecuencia: " + ((double) contador5 * 100 / 1000) + "%" +
                "\nTiradas 6: " + contador6 + "\tFrecuencia: " + ((double) contador6 * 100 / 1000) + "%" +
                "\nTiradas Totales: " + (contador1 + contador2 + contador3 + contador4 + contador5 + contador6));
    }

    public static int lanzarDado() {
        return (int) Math.floor(Math.random() * 6 + 1);
    }
}