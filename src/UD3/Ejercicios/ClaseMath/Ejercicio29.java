package src.UD3.Ejercicios.ClaseMath;

public class Ejercicio29 {
    public static void ejercicio29() {

        System.out.println("\n\tBoletin 3 | Ejercicio 29\n" + "Escribe una aplicación en Java que genere números aleatorios entre 1 y 1000000 hasta que el número generado sea 25. Una vez generado, indicar cuántos números se generaron en la simulación e indicar el tiempo en segundos que tardó en obtenerse:\n");
        generador25();
    }

    public static void generador25() {
        int numeroGenerado, contadorGenerador = 0;
        long inicioGenerador = System.currentTimeMillis();
        do {
            numeroGenerado = (int) Math.floor(Math.random() * 999999 + 1);
            contadorGenerador++;
        } while (numeroGenerado != 25);
        long finGenerador = System.currentTimeMillis();
        System.out.println("Veces ejecutado: " + contadorGenerador);
        System.out.println("Tiempo transcurrido: " + (double) (finGenerador - inicioGenerador) / 1000 + " segundos");
    }
}