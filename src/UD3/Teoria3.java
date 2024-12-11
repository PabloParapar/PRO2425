package src.UD3;

import java.awt.*;
import java.math.*;
import java.time.*;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Random;

import static java.lang.Math.PI;

public class Teoria3 {
    //Viernes 15/11/2024
    private static void imprimeTablaMultiplicar(int valor) {
        System.out.println("Tabla de multiplicar del " + valor);
        for (int i = 1; i <= 10; i++) {
            System.out.println(valor + " * " + i + " = " + valor * i);
        }
        /*
         * Código que teníamos en el main
         *
         * for (int valor = 1; valor <= 2; valor++) {
         *    imprimeTablaMultiplicar(valor);
         * }
         */
    }

    private static int sumar(int numero1, int numero2) {
        //int resultado = numero1 + numero2;
        return numero1 + numero2;    //Siempre que el método no sea void debe tener return
    }

    private static double hacerMedia(int numero1, int numero2) {
        return (double) (numero1 + numero2) / 2;
    }

    private static void hacerPresentacion() {
        System.out.println("Pablo, edad 27, Vegadeo");
        ;
    }

    private static void imprimirPresentacion(String nombre, String lugarNacimiento, int edad) {
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(lugarNacimiento);
    }

    public static void main(String[] args) {
        //Cualquier código que queramos utilizar debemos llamarlo desde el método main
        System.out.println(sumar(10, 10));
        System.out.println(hacerMedia(9, 8));
        hacerPresentacion();
        imprimirPresentacion("Pablo", "Vegadeo", 27);

        System.out.println(factorial(5));
        objetos();
        System.out.println("\n\n4 de Diciembre de 2024");
        claseMath();
        claseRandom();
        claseString();
        claseEnvoltorio();

        System.out.println("\n11 de Diciembre de 2024\n");
        clasesManejoDeFechas();
    }

    //25 de Noviembre de 2024

    private static double sumar2(int a, int b) {
        return 2.0D;
    }

    private static void presentar(int edad, String nombre) {
        System.out.println(nombre + "tiene" + edad + "años");
    }

    private static void metodo() {
        int b = 10;
        for (int i = 0; i <= b; i++) {
            System.out.println(i * b);
        }
    }

    //28 de noviembre de 2024

    public static int factorial(int n){
        if(n <= 1){
            return 1;
        } else {
            return n * factorial(n-1);
        }

        //return factorial(n);   //Si solo hubiera esta llamada habría un error llamado StackOveflowError
    }

    //2 de Diciembre de 2024
    public static void objetos(){
        int valor = Math.abs(10);
        System.out.println(valor);

        Point puntoOrigen = new Point(5, 10);
        System.out.println(puntoOrigen.x);
        int ejeX = puntoOrigen.x;
    }

    //4 de Diciembre de 2024
    //La Clase Math

    public static void claseMath(){
        double r= 2;
        double longitudCircunferencia = 2*PI*r;
        System.out.println("\nClase Math\n"+longitudCircunferencia);
    }

    //La Clase Random
    public static void claseRandom(){
        System.out.println("\nClase Random");
        Random aleatorio = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.println(aleatorio.nextInt());
        }
        System.out.println("\nDos constructores Random distintos generan el mismo número si tienen la misma semilla");
        Random aleatorio1 = new Random(123);
        Random aleatorio2 = new Random(123);

        for (int i = 0; i < 5; i++){
            System.out.println(aleatorio1.nextInt() +"\t"+aleatorio2.nextInt());
        }

        String texto = "data";
        System.out.println(texto.charAt(texto.length()-1));
    }

    //05 de Diciembre de 2024
    //La Clase String
    public static void claseString(){
        System.out.println();
        String cadena = "String de Ejemplo";
        System.out.println(cadena);

        String cadena1 = "programación";
        String cadena2 = "programación";

        if (cadena1 == cadena2){
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintas");
        }


        String cadena3 = new String("programación");
        String cadena4 = new String("ProgramacióN");
        System.out.println("Al comparar dos Strings creados mediante 'new' aun teniendo el mismo contenido serán distintos a nivel de espacio de memoria");
        if (cadena3 == cadena4){
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintas");
        }

        System.out.println("\nPara comparar dos Strings utilizaríamos el método .equals()");
        if(cadena3.equals(cadena4)){
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintas");
        }
        System.out.println("\n Para compararlos ignorando la altura de caja de la letra utilizaremos el método .equalsIgnoreCase()");

        if(cadena3.equalsIgnoreCase(cadena4)){
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintos");
        }

        String cadena5 = "        hola " + "profe       ";
        String cadena6 = "        hola ";
        String cadena7 = "profe       ";

        System.out.println("\nCon el método .trim() eliminaremos los espacios en blanco al inicio y al final de la cadena");
        System.out.println(cadena5);
        System.out.println(cadena5.trim());
        System.out.println(cadena6.trim()+cadena7.trim());
        System.out.println((cadena6+cadena7).trim());

        //Concatenar Strings

        //String Buffer
    }

    private static void claseEnvoltorio(){
        //Clases envoltorio

        //deprecated quiere decir que está obsoleto y puede que en nuevas versiones se eliminen
        //Integer i = new Integer(5); Esta forma está deprecada

        Integer i = 5;
        int x = 5;

        int aa = Integer.parseInt("5");
        String.valueOf(i);
        //ignoraremos de momento la diapositiva 159

        Boolean b = new Boolean(false);
        System.out.println("b = "+b);
        Boolean b2 = false;
        System.out.println("b2 = "+b2);
        Boolean c = new Boolean("TrUe");
        System.out.println("c = "+c);
        //Boolean c2 = "TrUe";

        Boolean d = new Boolean("No");
        System.out.println("d = "+d);

        String s = "5";
        System.out.println("s = "+s);
        int i2 = Integer.parseInt(s);
        System.out.println("i2 = "+i);

        Integer j = new Integer(5);
        System.out.println("j = "+j);
        s = j.toString();
        System.out.println("s = "+s);

        float f = j.floatValue();
        System.out.println("f = "+f);

        //Procuraremos utilizar la versión no deprecada

        //valueOf es un modo de construir una clase envoltorio.
        //El segundo parámetro es opcional e indica la base.
        Integer binario = Integer.valueOf("1010", 2);

        //Las clases envoltorio nos permiten coger tipos primitivos, tratarlos como objetos y añadirles nuevas funcionalidades
        //En las clases envoltorio tendremos la opción NULL
        //En la clase Boolean tenemos 3 posibilidades: True, False o NULL


    }
    // 11 de Diciembre de 2024
    private static void clasesManejoDeFechas(){

        //Método now()
        System.out.println("Fecha actual " + LocalDate.now());
        System.out.println("Hora actual " + LocalTime.now());
        System.out.println("Fecha y Hora actual " + LocalDateTime.now());   //Utiliza la hora y fecha del dispositivo
        System.out.println("El instante actual es: " + Instant.now());      //Almacenado en formato de UNIX
        System.out.println("En zona horaria son: " + ZonedDateTime.now());  //Fecha + Hora + Meridiano

        //Método of()
        System.out.println("Fecha Cumple " + LocalDate.of(1970, 1, 1));
        System.out.println("Fecha Cumple " + LocalDate.of(1970, Month.JANUARY, 1));

        LocalDate fecha = LocalDate.now();
        Month mes = fecha.getMonth();
        System.out.println(fecha.getMonth());
        System.out.println(fecha.getDayOfMonth());
        String nombreMes = mes.getDisplayName(TextStyle.NARROW,
                            Locale.forLanguageTag("es-ES"));
        String nombreMes2 = mes.getDisplayName(TextStyle.FULL,
                            Locale.forLanguageTag("es-ES"));
        System.out.println(nombreMes);
        System.out.println(nombreMes2);
    }
}

