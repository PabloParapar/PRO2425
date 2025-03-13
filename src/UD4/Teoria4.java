package src.UD4;

import com.sun.security.jgss.GSSUtil;
import src.UD5.Alumno;
import src.UD5.Persona;
import src.UD5.Profesor;

import java.util.*;
import java.util.function.IntUnaryOperator;

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

        Persona[] personas1 = new Persona[5];

        //Añadir valores al array

        int[] dobles = {1, 2, 4, 5};      //Declaramos un array con unos valores determinados, aporta ya su medida de manera implícita
        enteros[1] = 100;               ///El índice 1, el segundo del array, almacena el valor entero 100

        String[] alumnos = {"Nabil", "Hector", "Pablo"};
        alumnos[0] = "Jacinto";

        Persona[] aula = {
                //new Profesor("Victor", "Blanco"),
                new Alumno("Fabián", "aa"),
                new Alumno("Adrián", "bb"),
                new Alumno("Andrés", "cc")};
        //Es recomendable crear primero los objetos y luego asignarlo

        String[] posicion = new String[10];

        for (int i = 0; i < posicion.length; i++) {
            posicion[i] = "Esta es la posición " + i;
            //System.out.println(posicion[i]);
        }

        //Bucle For each     Para cada uno
        //Ejecutará el bucle para cada uno de los elementos de un array
        for (String s : posicion) { //s es una variable auxiliar con el que identificamos las posiciones del array
            System.out.println(s);
        }
        //System.out.println(Arrays.toString(posicion));

        // 10 de Marzo de 2025

        /// Arrays Multidimensionales

        double tabla1[][] = new double[3][2];

        int tabla2[][] = new int[2][];

        tabla2[0] = new int[2];
        tabla2[1] = new int[3];

        System.out.println("Tabla1:");
        System.out.println("Número de Filas : " + tabla1.length);
        System.out.println("Número de Columnas : " + tabla1[0].length);

        System.out.println("Tabla2:");
        System.out.println("Número de Filas : " + tabla2.length);
        System.out.println("Número de Columnas de tabla2[0] : " + tabla2[0].length);
        System.out.println("Número de Columnas de tabla2[1] : " + tabla2[1].length);

        //Matriz de 2 Dimensiones

        int matriz1[][] = new int[4][];

        matriz1[0] = new int[]{1, 1, 1, 1};
        matriz1[1] = new int[]{0, 1, 0, 0};
        matriz1[2] = new int[]{0, 1, 1, 0};
        matriz1[3] = new int[]{0, 0, 0, 1};

        int matriz2[][] = {{1, 1, 1, 1}, {0, 1, 0, 0}, {0, 1, 1, 0}, {0, 0, 0, 1}};

        int matriz3[][] = new int[4][4];

        matriz3[0][0] = 1;
        matriz3[0][1] = 1;
        matriz3[0][2] = 1;
        matriz3[0][3] = 1;
        matriz3[1][0] = 0;
        matriz3[1][1] = 1;
        matriz3[1][2] = 0;
        matriz3[1][3] = 0;
        matriz3[2][0] = 0;
        matriz3[2][1] = 1;
        matriz3[2][2] = 1;
        matriz3[2][3] = 0;
        matriz3[3][0] = 0;
        matriz3[3][1] = 0;
        matriz3[3][2] = 0;
        matriz3[3][3] = 1;

        System.out.println("\nmatriz1:");
        for (int i = 0; i < matriz1.length; i++) {
            System.out.println();
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
        }

        System.out.println("\n\nmatriz2:");
        for (int i = 0; i < matriz2.length; i++) {
            System.out.println();
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
        }

        System.out.println("\n\nmatriz3:");
        for (int i = 0; i < matriz3.length; i++) {
            System.out.println();
            for (int j = 0; j < matriz3[i].length; j++) {
                System.out.print(matriz3[i][j] + " ");
            }
        }

        //Defina una estructura que almacene e imprima alumnado de este aula:

        String aula103[][] = {
                {"PabloL.", "Nabil", "Héctor", "Carla", "Diego", "África"},
                {"PabloP.", null, "Liuber", "Fabián", null, null},
                {null, null, "Andrés", null, null, null},
                {"Manuel", null, "Hernán", "Iván", null, "Cristian"}
        };

        System.out.println("\n\nDistribución Aula 103:");

        for (String[] strings : aula103) {
            System.out.println();
            for (String string : strings) {
                System.out.print(string + "\t\t");
            }
        }

        String aula103dos[][] = new String[4][6];
        aula103dos[0][0] = "PabloL.";
        aula103dos[0][1] = "Nabil";
        aula103dos[0][2] = "Héctor";
        aula103dos[0][3] = "Carla";
        aula103dos[0][4] = "Diego";
        aula103dos[0][5] = "África";
        aula103dos[1][0] = "PabloP.";
        aula103dos[1][1] = null;
        aula103dos[1][2] = "Liuber";
        aula103dos[1][3] = "Fabián";
        aula103dos[1][4] = null;
        aula103dos[1][5] = null;
        aula103dos[2][0] = null;
        aula103dos[2][1] = null;
        aula103dos[2][2] = "Andrés";
        aula103dos[2][3] = null;
        aula103dos[2][4] = null;
        aula103dos[2][5] = null;
        aula103dos[3][0] = "Manuel";
        aula103dos[3][1] = null;
        aula103dos[3][2] = "Hernán";
        aula103dos[3][3] = "Iván";
        aula103dos[3][4] = null;
        aula103dos[3][5] = "Cristian";


        System.out.println("\n\nDistribución Aula 103 dos");
        for (String[] strings : aula103dos) {
            System.out.println();
            for (String string : strings) {
                System.out.print(string + "\t\t");
            }
        }

        Persona aula103tres[][] = {
                {new Profesor("Victor", "Blanco")},
                {new Alumno("Pablo", "Parapar"), new Alumno("Nabil", "aa"), new Alumno("Héctor", "aa"), new Alumno("Carla", "aa"), new Alumno("Diego", "aa"), new Alumno("África", "aa")},
                {new Alumno("Pablo", "aa"), new Alumno(), new Alumno("Liuber", "aa"), new Alumno("Fabián", "aa"), new Alumno(), new Alumno()},
                {new Alumno(), new Alumno(), new Alumno("Andrés", "aa"), new Alumno(), new Alumno(), new Alumno()},
                {new Alumno("Manuel", "aa"), new Alumno(), new Alumno("Héctor", "aa"), new Alumno("Iván", "aa"), new Alumno(), new Alumno("Cristian", "aa")},
        };

        System.out.println("\n\nDistribución Aula 103 con Clases");
        for (int i = 0; i < aula103tres.length; i++) {
            System.out.println();
            for (int j = 0; j < aula103tres[i].length; j++) {
                if (aula103tres[i][j].getNombre() != null) {
                    System.out.print(aula103tres[i][j].getNombre() + "\t\t");
                } else {
                    System.out.print("Vacío"+ "\t\t");
                }
            }
        }

        //12 de Marzo de 2025

        System.out.println("\n12 de Marzo de 2025\n");

        ///Envío de Arrays a Métodos

        //1º Declaramos las variables de tipo Alumno, int e int []

        Alumno pablo = new Alumno("Pablo", "López Parapar");
        int entero = 2;
        int variosEnteros [] = {0, 1, 2, 3, 4, 5, 6};

        //2º Imprimimos sus respectivos valores por pantalla

        System.out.println(pablo);
        System.out.println(entero);
        for (int variosEntero : variosEnteros) {
            System.out.print(variosEntero+" ");
        }
        System.out.println();
        //System.out.println(Arrays.toString(variosEnteros));

        //3º Los modificamos mediante un mét0do

        miMetodo(pablo, entero, variosEnteros);

        //4º Imprimimos sus respectivos valores por pantalla

        System.out.println(pablo);
        System.out.println(entero);
        for (int variosEntero : variosEnteros) {
            System.out.print(variosEntero+" ");
        }
        System.out.println();

        //Vemos que el valor del entero se mantiene, pero los valores del Objeto y del Array han sido modificados

        //Modifica los datos que tabajan con Referencia

        ///Clase arrays. Utilidades
        System.out.println("\n\033[36mClase Arrays. Utilidades\n\u001b[0m");

        //Mét0do Sort
        System.out.println("\033[36mMétodo Sort\n\u001b[0m");

        System.out.println("String de Alumnos sin ordenar");
        for (String alumno : alumnos) {
            System.out.println(alumno);
        }
        Arrays.sort(alumnos);
        System.out.println("\nString de Alumnos en orden Ascendente");
        for (String alumno : alumnos) {
            System.out.println(alumno);
        }
        Arrays.sort(alumnos, Collections.reverseOrder());
        System.out.println("\nString de Alumnos en orden Descendente");
        for (String alumno : alumnos) {
            System.out.println(alumno);
        }

        ///Comparadores

        /*
        * Para comparar objetos deberemos implementar una interfaz Comparable<[Clase]>
        * Nos hará implementar el métod0 compareTo() en la clase, donde definiremos en el
        * return en base a qué queremos comparar las dos instancias de la clase
        *
        * */

        //Comparar Instancias de un Objeto
        System.out.println("\n\033[36mComparar Instancias de un Objeto\n\u001b[0m");

        System.out.println("Instancias de Alumnos sin ordenar");
        for (Persona persona : aula) {
            System.out.println(persona);
        }
        Arrays.sort(aula);
        System.out.println("\nInstancias de Alumnos en orden Ascendente");
        for (Persona persona : aula) {
            System.out.println(persona);
        }
        Arrays.sort(aula, Collections.reverseOrder());
        System.out.println("\nInstancias de Alumnos en orden Descendente");
        for (Persona persona : aula) {
            System.out.println(persona);
        }

        //Glosario del Aula Virtual

        int enterosSeteados [] = new int[10];

        Arrays.setAll(enterosSeteados, IntUnaryOperator.identity());

        System.out.println(Arrays.toString(enterosSeteados));

        IntUnaryOperator generadorCuadrados = new IntUnaryOperator() {
            @Override
            public int applyAsInt(int operand) {
                return operand*operand;
            }
        };

        Arrays.setAll(enterosSeteados, generadorCuadrados);
        System.out.println(Arrays.toString(enterosSeteados));

        // 13 de Marzo de 2025

        /// Colecciones
        System.out.println("\n\033[36mColecciones\n\u001b[0m");

        /// ArrayList
        System.out.println("\t\033[36mArrayList\n\u001b[0m");

        ArrayList<String> coches = new ArrayList<>();

        coches.add("Volvo"); //con el métod0 add() añadimos elementos a la colección
        coches.add("BMW");
        coches.add("Ford");
        coches.add("Audi");
        coches.add("Seat");

        Iterator<String> it = coches.iterator();    //Definición de un Iterador para la Colección coches

        System.out.println("ArrayList de Coches\n");
        while (it.hasNext()){                       //Mientras exista un elemento siguiente en el iterador
            System.out.println(it.next());          //Imprimirá el siguiente elemento
        }

        ///Define un ArrayList de Personas y añade 5 Personas e imprimir el nombre de esas Personas

        ArrayList<Persona> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(new Alumno("Pablo", 23));
        listaAlumnos.add(new Alumno("Paula", 34));
        listaAlumnos.add(new Alumno("Jairo", 54));
        listaAlumnos.add(new Alumno("Jaime", 12));
        listaAlumnos.add(new Alumno("Xavier", 3));
        Iterator<Persona> alumnoIterator = listaAlumnos.iterator();

        System.out.println("\nArrayList de Personas\n\tMenores de edad\n");

        while(alumnoIterator.hasNext()){
            Persona temporal = alumnoIterator.next();
            if (temporal.getEdad()< 17){
            System.out.println(temporal.getNombre());
            }
        }
        System.out.println();


    }
    public static void miMetodo (Alumno alumno, int entero, int [] vector) {
        alumno.setNombre("Don "+alumno.getNombre());
        entero *= 3;
        for (int i = 0; i < vector.length; i++){
            vector[i] *= i;
        }
    }



}
