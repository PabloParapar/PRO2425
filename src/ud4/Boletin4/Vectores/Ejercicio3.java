package src.ud4.Boletin4.Vectores;

import java.util.Arrays;

/**
 * @author lopparpab
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("""
                Escribir una aplicación que almacene 30 notas de clase aleatorias
                comprendidas entre 1 y 10 ambas inclusive. Con estas notas, realizar las
                siguientes tareas:""");

        int notasAlumnos[] = new int[30];

        for (int i = 0; i < notasAlumnos.length; i++) {
            notasAlumnos[i] = (int) Math.floor((Math.random() * 10 + 1));
        }
        System.out.println("\nNotas de los alumnos:\n");
        for (int notasAlumno : notasAlumnos) {
            System.out.print(notasAlumno + " ");
        }
        System.out.println();

        System.out.println("\na)\tImprimir la Media");
        int sumaTotal = 0;
        for (int notasAlumno : notasAlumnos) {
            sumaTotal += notasAlumno;
        }
        double notaMedia = (double) sumaTotal / notasAlumnos.length;
        System.out.println("La nota media de los alumnos es " + notaMedia);

        System.out.println("\nb)\tImprimir la nota más baja y la más alta");
        Arrays.sort(notasAlumnos);
        //System.out.println(Arrays.toString(notasAlumnos));
        System.out.println("La nota más baja es " + notasAlumnos[0] + ".\nLa nota más alta es " + notasAlumnos[notasAlumnos.length - 1] + ".");

        System.out.println("\nc)\tUtilizando métodos con una alta cohesión, indicar cuál es la nota más frecuente.");

        contadorNotas(notasAlumnos);
        //System.out.println(cantidadNotas);


    }

    /**
     * @param notas
     * @return Recorre un Array de enteros con valores del 1 al 10, incrementa en 1 un Array interno de enteros
     * que registra cada vez que se repite un entero en el Array.
     * int [] cantidadNotas = {cantidad1, cantidad2, cantidad3, cantidad4,
     * cantidad5, cantidad6, cantidad7, cantidad8, cantidad9, cantidad10}
     * Devolverá el valor que más se repita.
     */
    public static void contadorNotas(int[] notas) {
        int[] cantidadNotas = new int[10];
        for (int i = 0; i < notas.length; i++) {
            cantidadNotas[notas[i] - 1] += 1;
        }
        calcularNotaMasFrecuente(cantidadNotas);
    }

    /**
     * @param notas Dado un array de enteros entre 1 y 10, imprime en pantalla cuál es el que más se repite y cuántas veces
     */
    public static void calcularNotaMasFrecuente(int[] notas) {
        int maxNota = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > maxNota) {
                maxNota = notas[i];
            }
        }
        //System.out.println(Arrays.toString(notas));
        System.out.println("Las notas que más se repiten son: ");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == maxNota) {
                System.out.print("el "+(i+1)+" ");
            }
        }
        System.out.print("con un total de " + maxNota + " apariciones");
    }
}
