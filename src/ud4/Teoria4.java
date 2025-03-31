package src.ud4;

import src.ud4.colecciones.Articulito;
import src.ud5.Alumno;
import src.ud5.Persona;
import src.ud5.Profesor;

import java.util.*;
import java.util.function.IntUnaryOperator;

/**
 * @author lopparpab
 */
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
                    System.out.print("Vacío" + "\t\t");
                }
            }
        }

        //12 de Marzo de 2025

        System.out.println("\n12 de Marzo de 2025\n");

        ///Envío de Arrays a Métodos

        //1º Declaramos las variables de tipo Alumno, int e int []

        Alumno pablo = new Alumno("Pablo", "López Parapar");
        int entero = 2;
        int variosEnteros[] = {0, 1, 2, 3, 4, 5, 6};

        //2º Imprimimos sus respectivos valores por pantalla

        System.out.println(pablo);
        System.out.println(entero);
        for (int variosEntero : variosEnteros) {
            System.out.print(variosEntero + " ");
        }
        System.out.println();
        //System.out.println(Arrays.toString(variosEnteros));

        //3º Los modificamos mediante un mét0do

        miMetodo(pablo, entero, variosEnteros);

        //4º Imprimimos sus respectivos valores por pantalla

        System.out.println(pablo);
        System.out.println(entero);
        for (int variosEntero : variosEnteros) {
            System.out.print(variosEntero + " ");
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

        int enterosSeteados[] = new int[10];

        Arrays.setAll(enterosSeteados, IntUnaryOperator.identity());

        System.out.println(Arrays.toString(enterosSeteados));

        IntUnaryOperator generadorCuadrados = new IntUnaryOperator() {
            @Override
            public int applyAsInt(int operand) {
                return operand * operand;
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
        while (it.hasNext()) {                       //Mientras exista un elemento siguiente en el iterador
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

        while (alumnoIterator.hasNext()) {
            Persona temporal = alumnoIterator.next();
            if (temporal.getEdad() < 17) {
                System.out.println(temporal.getNombre());
            }
        }
        System.out.println();

        // 20 de Marzo de 2025

        /// List

        /// ArrayList

        //ArrayList<String> listaArray = new ArrayList<String>();
        //ArrayList<String> listaArray = new ArrayList<>();
        //ArrayList<String> listaArray = new ArrayList();

        ArrayList<String> listaArray = new ArrayList<>(Arrays.asList("Aa", "Bb", "Cc"));

        listaArray.add("Dd");
        for (String e : listaArray) {
            System.out.println(e);
        }

        ArrayList<String> sublista = new ArrayList<>(listaArray.subList(1, 3));
        for (String e : sublista) {
            System.out.println(e);
        }

        //BinarySearch

        ArrayList<Integer> listaEnteros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println("Índice de 3: " + Collections.binarySearch(listaEnteros, 3));

        System.out.println(listaEnteros.contains(0) + "\ncontains(#) devuelve un booleano conforme si existe o no el elemento en la lista");

        /// LinkedList

        LinkedList<String> listaAnidada = new LinkedList<>();

        listaAnidada.push("Primero");
        listaAnidada.push("Segundo");
        listaAnidada.push("Tercero");
        listaAnidada.push("Cuarto");
        listaAnidada.push("Quinto");

        while (!listaAnidada.isEmpty()) {
            System.out.println(listaAnidada.size() + " : " + listaAnidada.poll());
        }

        /*Decalara e inicializa una lista de persona que contengan ordenados alfabéticamente a todos los alumnos de la clase

        Inicializar
        Imprimir
        Ordenar
        Imprimir
         */

        System.out.println("\t\033[36mInicializar Lista de Alumnos\n\u001b[0m");
        ArrayList<Persona> listaAlumnado = new ArrayList<>(Arrays.asList(
                new Alumno("Pablo", "López Parapar"),
                new Alumno("Nabil", "Ait"),
                new Alumno("Héctor", "Trabado"),
                new Alumno("Carla", "Neira"),
                new Alumno("Diego", "Ferreiros"),
                new Alumno("África", "Méndez"),
                new Alumno("Pablo", "Pereira"),
                new Alumno("Liuber", "Díaz Perez"),
                new Alumno("Fabián", "Alvarez"),
                new Alumno("Andrés", "López Abella"),
                new Alumno("Manuel", "Pérez"),
                new Alumno("Hernán", "Coronel"),
                new Alumno("Iván", "Díaz Miragaya"),
                new Alumno("Cristian", "Rodríguez")));

        System.out.println("\t\033[36mImprimir Lista de Alumnos por orden de entrada\n\u001b[0m");
        for (Persona a : listaAlumnado) {
            System.out.println(a.getNombre() + " " + a.getApellido());
        }

        System.out.println("\t\033[36mOrdenar Lista de Alumnos por Apellido\n\u001b[0m");
        Collections.sort(listaAlumnado);

        System.out.println("\t\033[36mImprime Lista de Alumnos ordendo por Apellido\n\u001b[0m");
        for (Persona a : listaAlumnado) {
            System.out.println(a.getNombre() + " " + a.getApellido());
        }

        Scanner entrada = new Scanner(System.in);
        LinkedList<String> charcuteria = new LinkedList<>();
        int cola = 1;
        while (cola != 3) {
            System.out.println(
                    "\n===== Sistema de Turnos de Carnicería =====\n" +
                            "Turno Actual: " + turnoCharcuteria(charcuteria) +
                            "\n1. Agregar un nuevo cliente (turno #1)" +     //  Añade una persona al final
                            "\n2. Atender siguiente cliente" +               //  Elimina la persona del principio
                            "\n3. Salir");
            cola = entrada.nextInt();
            switch (cola) {
                case 1:
                    System.out.println("¿Quién está a la cola?");
                    charcuteria.addLast(entrada.next());
                    break;
                case 2:
                    charcuteria.pop();
                    break;
                case 3:
                    System.out.println("Turning off the system...");
                    break;
                default:
                    System.out.println("Caso no contemplado, Repita:");
                    break;
            }
        }

        /// Colas
        System.out.println("\t\033[36mColas\n\u001b[0m");
        ///PriorityQueue
        System.out.println("\t\033[36mPriorityQueue\n\u001b[0m");

        /*Crear tres colas. En las dos primeras alamacenamos medio millar de números generados
         * aleatoriamente entre el 0 y el 50. Luego recorremos simultáneamente ambas colas y
         * almacenamos en la tercera aquellos números que coinciden en valor y posición.*/

        ArrayDeque<Integer> cola1 = new ArrayDeque<>();
        ArrayDeque<Integer> cola2 = new ArrayDeque<>();
        ArrayDeque<Integer> colaFinal = new ArrayDeque<>();
        for (int i = 0; i < 500; i++) {
            cola1.add((int) (Math.random() * 50));
            cola2.add((int) (Math.random() * 50));
        }
        for (int i = 0; i < cola1.size(); i++) {
            if (cola1.peek() == cola2.peek()) {
                System.out.print("\033[36m" + cola1.peek() + "\t" + cola2.peek() + "\u001b[0m\t\t");
                colaFinal.add(cola1.peek());
            } else {
                System.out.print(cola1.peek() + "\t" + cola2.peek() + "\t\t");
            }
            cola1.poll();
            cola2.poll();
        }
        System.out.println();
        System.out.println(colaFinal);

        // 24 de Marzo de 2025


        // 28 de Marzo de 2025

        //Set<String> ingredientes= new HashSet<>();

        /*
        Crear y visualizar un HashSet de Strings de dos formas:
            1. Con un Iterator que muestre además una enumeración.
            2. Visualizarlo entero con cada elemento seguido de comas.
            Sandía, Pera, Manzana, Plátano, Naranja
         */
        System.out.println("\t\033[36mColecciones\n\u001b[0m");
        System.out.println("\t\033[36mEjercicio Diego 1\n\u001b[0m");
        System.out.println("\tPrimera Forma\n");
        Set<String> fruta = new HashSet<>();
        fruta.add("Sandía");
        fruta.add("Pera");
        fruta.add("Manzana");
        fruta.add("Plátano");
        fruta.add("Naranja");

        Iterator<String> frutaIterator = fruta.iterator();
        int contadorFruta = 0;
        while (frutaIterator.hasNext()) {
            String temporal = frutaIterator.next();
            System.out.println(++contadorFruta + " · " + temporal);
        }
        System.out.println("\tSegunda Forma\n");
        System.out.println(fruta);

        /*
        Controlar el inventario de un almacén mediante un HashSet
        Mostrar un menú con varias opciones qeu permite añadir, eliminar y
        mostrar un producto en concreto o mostrar tod0 el inventario.
        Opcionalmente añadir que se pueda modificar la cantidad de objetos una vez creado el artículo.


        Creamos una clase llamada Articulito
        Tendrá los atributos String nombre y int cantidad
        Crearemos Constructor, Getters y Setters, toString, equals y hashcode
         */

        System.out.println("\t\033[36mEjercicio Diego 2\n\u001b[0m");

        //inventarioHashSet(entrada);

        //31 de Marzo de 2025
        System.out.println("\t\033[36mMapas. HashMap, TreeMap, LinkedHashMap\n\u001b[0m");

        inventarioHashMap();

        System.out.println("\t\033[36mEjercicio Héctor\n\u001b[0m");

        resolverEjercicioMapa();
    }

    public static void resolverEjercicioMapa(){
        /*Imagina que trabajas en un almacén que gestiona productos electrónicos.
        Cada producto tiene un ID único, un nombre y su precio*/
        System.out.println("\t\033[36mGestión de Productos\n\u001b[0m");



        System.out.println("\t\033[36mOrden de Productos\n\u001b[0m");



        System.out.println("\t\033[36mGestión de Descuentos\n\u001b[0m");

    }

    public static void inventarioHashMap(){
        HashMap<String, Integer> inventarioMapa = new HashMap<>();
        inventarioMapa.put("Pablo",10);
        inventarioMapa.put("Nabil",5);
        inventarioMapa.put("Carla",0);
        inventarioMapa.put("Diego",7);
        inventarioMapa.put(null,7);
        System.out.println(inventarioMapa);
        inventarioMapa.remove(null);

        System.out.println("\033[35m" + "Recorremos el Mapa según la clave" + "\u001b[0m");

        for (String clave : inventarioMapa.keySet()){
            System.out.println(clave);
        }
        System.out.println("\033[35m" + "Recorremos el Mapa según el valor" + "\u001b[0m");
        for (Integer valor : inventarioMapa.values()){
            System.out.println(valor);
        }
        System.out.println("\033[35m" + "Recorremos el Mapa según la clave y el valor" + "\u001b[0m");
        for (Map.Entry<String, Integer> entidad : inventarioMapa.entrySet()){
            System.out.println(entidad);
            System.out.println(entidad.getKey()+"\t\t"+entidad.getValue());
        }

        TreeMap<String, Integer> inventarioTreeMap = new TreeMap<>();
        inventarioTreeMap.put("Pablo", 10);
        inventarioTreeMap.put("Nabil", 9);
        inventarioTreeMap.put("Héctor", 8);
        inventarioTreeMap.put("Carla", 7);
        inventarioTreeMap.put("Diego", 7);
        inventarioTreeMap.put("África", 8);
        inventarioTreeMap.put("Fabián", 9);

        System.out.println("\033[35m" + "Recorremos el TreeMap según la clave y el valor" + "\u001b[0m");
        for (Map.Entry<String, Integer> entidad: inventarioTreeMap.entrySet()){
            System.out.println(entidad);
        }
        /*Muestra las Claves y Valores ordenados por el String*/

    }

    public static void inventarioHashSet(Scanner entrada) {
        Set<Articulito> inventario = new HashSet<>();
        System.out.println("\033[35m" + "Creamos la Colección de Inventario" + "\u001b[0m");
        System.out.println(inventario);
        Articulito patata = new Articulito("Patata");
        Articulito tomate = new Articulito("Tomate");
        Articulito albahaca = new Articulito("Albahaca");
        Articulito nuez = new Articulito("Nuez");
        Articulito berenjena = new Articulito("Berenjena");

        System.out.println("\033[35m" + "Añadimos tomates:" + "\u001b[0m");
        inventario.add(tomate);
        System.out.println(inventario);
        System.out.println("\033[35m" + "Añadimos patatas:" + "\u001b[0m");
        inventario.add(patata);
        System.out.println(inventario);
        System.out.println("\033[35m" + "Añadimos patatas:" + "\u001b[0m");
        inventario.add(patata);
        System.out.println(inventario);
        System.out.println("\33[33m" + "No añade más Patata al ya haber una instancia Patata" + "\u001b[0m");

        System.out.println("\033[35m" + "Añadimos Albahaca:" + "\u001b[0m");
        inventario.add(albahaca);
        System.out.println(inventario);

        System.out.println("\033[35m" + "Añadimos Nueces:" + "\u001b[0m");
        inventario.add(nuez);
        System.out.println(inventario);

        System.out.println("\033[35m" + "Buscamos Berenjena:" + "\u001b[0m");
        if (inventario.contains(berenjena)) {
            System.out.println("\33[33m" + "Tenemos " + berenjena.getNombre() + "\u001b[0m");
        } else {
            System.out.println("\33[33m" + "No tenemos " + berenjena.getNombre() + "\u001b[0m");
        }
        System.out.println(inventario);

        System.out.println("\033[35m" + "Añadimos Berenjena:" + "\u001b[0m");
        inventario.add(berenjena);
        System.out.println(inventario);

        System.out.println("\033[35m" + "Buscamos Berenjena:" + "\u001b[0m");
        if (inventario.contains(berenjena)) {
            System.out.println("\33[33m" + "Tenemos " + berenjena.getNombre() + "\u001b[0m");
        } else {
            System.out.println("\33[33m" + "No tenemos " + berenjena.getNombre() + "\u001b[0m");
        }
        System.out.println(inventario);

        System.out.println("\033[35m" + "Eliminamos patatas:" + "\u001b[0m");
        inventario.remove(patata);
        System.out.println(inventario);

        System.out.println("\033[35m" + "Eliminamos tomate:" + "\u001b[0m");
        inventario.remove(tomate);
        System.out.println(inventario);

        System.out.println("\033[35m" + "Eliminamos tomate:" + "\u001b[0m");
        inventario.remove(tomate);
        System.out.println(inventario);
        System.out.println("\33[33m" + "Al no haber una instacia con esa referencia no elimina nada" + "\u001b[0m");

        System.out.println("\033[35m" + "Eliminamos nuez:" + "\u001b[0m");
        inventario.remove(nuez);
        System.out.println(inventario);

        System.out.println("\033[35m" + "Eliminamos albahaca:" + "\u001b[0m");
        inventario.remove(albahaca);
        System.out.println(inventario);

        System.out.println("\033[35m" + "Eliminamos berenjena:" + "\u001b[0m");
        inventario.remove(berenjena);
        System.out.println(inventario);
        // Por definición los elementos de un HashSet no tienen un orden específico
        System.out.println("\t\033[36mEjercicio Diego 2 | Control de Stock\n\u001b[0m");
        inventario.add(patata);
        inventario.add(tomate);
        inventario.add(albahaca);
        inventario.add(nuez);
        inventario.add(berenjena);
        System.out.println("\033[35m" + "Rellenamos el inventario" + "\u001b[0m");
        System.out.println(inventario);
        System.out.println("\033[35m" + "Modificamos las cantidades" + "\u001b[0m");
        System.out.println("Ingresa el nombre y la cantidad a modificar:");
        String articulo = entrada.next();
        int nuevaCantidad = entrada.nextInt();
        entrada.nextLine();
        while (nuevaCantidad != 0) {
            for (Articulito articulito : inventario) {
                if(!inventario.contains(new Articulito(articulo))) {
                    System.out.println("No existe el elemento "+articulo);
                    break;
                }else if (Objects.equals(articulito.getNombre().toLowerCase(), articulo.toLowerCase())) {
                    articulito.setCantidad(nuevaCantidad);
                }

            }
            System.out.println(inventario);
            System.out.println("Ingresa el nombre y la cantidad a modificar:");

            articulo = entrada.next();
            nuevaCantidad = entrada.nextInt();
            entrada.nextLine();
        }
    }


    /**
     * @param charcuteria
     * @return Devuelve la siguiente Persona de la cola
     * si la lista está vacía imprime un mensaje en pantalla conforme no hay nadie en la lista
     */
    public static String turnoCharcuteria(LinkedList charcuteria) {
        if (charcuteria.peek() == null) {
            return "No hay nadie a la cola";
        } else {
            return (String) charcuteria.peek();
        }
    }

    /**
     * @param alumno
     * @param entero
     * @param vector Modifica los valores de un entero, de una instancia y de un array para comprobar si se modifica el original o no
     */
    public static void miMetodo(Alumno alumno, int entero, int[] vector) {
        alumno.setNombre("Don " + alumno.getNombre());
        entero *= 3;
        for (int i = 0; i < vector.length; i++) {
            vector[i] *= i;
        }
    }


}
