package src.UD4;

import src.UD5.Alumno;
import src.UD5.Persona;
import src.UD5.Profesor;

import java.util.Arrays;

public class Teoria4 {
    public static void main(String[] args) {
        System.out.println(Semaforo.AMBAR);
        System.out.println(Semaforo.AMBAR.ordinal());
        System.out.println(Semaforo.AMBAR.ordinal() + 1);

        Semaforo color = Semaforo.ROJO;
        System.out.println("El color del Semáforo es " + color);
        switch (color) {
            case ROJO:
                color = Semaforo.VERDE;
                break;
            case AMBAR:
                color = Semaforo.ROJO;
            case VERDE:
                color = Semaforo.AMBAR;

        }
        System.out.println("El Semáforo ha pasado a " + color);

        Numero n = Numero.DOS;
        System.out.println(n.getValue());

        Comida comida = Comida.PlatoPrincipal.BACALAO;
        comida = Comida.Postre.HELADO;

        // 06 de Marzo de 2025
        System.out.println("\nClase 06 de Marzo de 2025\n");

        //Arrays

        //Declarar un Array

        ///Tipo de dato | Símbolo del array | identificador

        int[] enteros;

        Persona[] personas;

        int numeroEntero;

        //Inicializar un Array
        ///
        enteros = new int[5];

        //Declarar e inicializar

        Persona [] personas1 = new Persona [5];

        //Añadir valores al array

        int [] dobles = {1,2,4,5};      //Declaramos un array con unos valores determinados, aporta ya su medida de manera implícita
        enteros[1] = 100;               ///El índice 1, el segundo del array, almacena el valor entero 100

        String [] alumnos = {"Nabil", "Hector", "Pablo"};
        alumnos [0] = "Jacinto";

        Persona [] aula = {
                new Profesor("Victor","Blanco"),
                new Alumno("1º DAM"),
                new Alumno("2º DAM"),
                new Alumno("1º DAW"),
                new Alumno("2º DAW")};
        //Es recomendable crear primero los objetos y luego asignarlo

        String [] posicion= new String [10];

        for (int i = 0; i< posicion.length; i++){
            posicion[i] = "Esta es la posición "+i;
            //System.out.println(posicion[i]);
        }

        //Bucle For each     Para cada uno
        //Ejecutará el bucle para cada uno de los elementos de un array
        for (String s : posicion) { //s es una variable auxiliar con el que identificamos las posiciones del array
            System.out.println(s);
        }
        //System.out.println(Arrays.toString(posicion));


    }
}
