package src.UD4.Boletin4.Vectores;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Escribir una aplicación que almacene 30 notas de clase aleatorias\n" +
                "comprendidas entre 1 y 10 ambas inclusive. Con estas notas, realizar las\n" +
                "siguientes tareas:");

        int notasAlumnos [] = new int [30];

        for (int i = 0; i < notasAlumnos.length; i++) {
            notasAlumnos[i] = (int) Math.floor((Math.random()*10));
        }
        for (int notasAlumno : notasAlumnos) {
            System.out.print(notasAlumno+" ");
        }

        System.out.println("\na)\tImprimir la Media");

        System.out.println("\nb)\tImprimir la nota más baja y la más alta");

        System.out.println("\nc)\tUtilizando métodos con una alta cohesión, indicar cuál es la nota más frecuente.");

    }
}
