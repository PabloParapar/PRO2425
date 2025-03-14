package src.ud4.Boletin4.Vectores;

import java.util.Arrays;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Escribir una aplicación que almacene 30 notas de clase aleatorias\n" +
                "comprendidas entre 1 y 10 ambas inclusive. Con estas notas, realizar las\n" +
                "siguientes tareas:");

        int notasAlumnos [] = new int [30];

        for (int i = 0; i < notasAlumnos.length; i++) {
            notasAlumnos[i] = (int) Math.floor((Math.random()*10+1));
        }
        System.out.println("\nNotas de los alumnos:\n");
        for (int notasAlumno : notasAlumnos) {
            System.out.print(notasAlumno+" ");
        }
        System.out.println();

        System.out.println("\na)\tImprimir la Media");
        int sumaTotal = 0;
            for (int notasAlumno : notasAlumnos) {
                sumaTotal += notasAlumno;
            }
        double notaMedia = (double) sumaTotal / notasAlumnos.length;
        System.out.println("La nota media de los alumnos es "+notaMedia);

        System.out.println("\nb)\tImprimir la nota más baja y la más alta");
        Arrays.sort(notasAlumnos);
        System.out.println(Arrays.toString(notasAlumnos));
        System.out.println("La nota más baja es "+notasAlumnos[0]+".\nLa nota más alta es "+notasAlumnos[notasAlumnos.length-1]+".");

        System.out.println("\nc)\tUtilizando métodos con una alta cohesión, indicar cuál es la nota más frecuente.");

    }

    public static void contadorNotas(int [] notas){

    }
}
