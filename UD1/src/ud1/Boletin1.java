package UD1.src.ud1;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Boletin1 {
    public static void main(String[] args){
        System.out.println("Hola Mundo");

        //1)

        //2)

        //3)

        //4)
        System.out.println("\n\tEjercicio 4\n");
        char aMin = '\u0061';
        char zMin = '\u007A';
        System.out.println(aMin);
        System.out.println(zMin);
        System.out.println(zMin-aMin+1);

        //5)
        System.out.println("\n\tEjercicio 5\n");
        int a = 5, b = 10, intermediario = 0;
        System.out.println(a+" y "+b+" con "+intermediario);
        intermediario = a;
        a = b;
        b = intermediario;
        System.out.println(a+" y "+b+" con "+intermediario);

        //vuelvo a probarlo para comprobar que funcione

        intermediario = a;
        a = b;
        b = intermediario;
        System.out.println(a+" y "+b+" con "+intermediario);

        //6)
        System.out.println("\n\tEjercicio 6 \n");
        char eVariado;
        eVariado = 'e';
        System.out.println("1ª forma de escribir "+eVariado+" con Unicode");
        eVariado = '\144';
        eVariado = '\145';
        System.out.println("2ª forma de escribir "+eVariado+" con sistema de codificación octal");
        eVariado = '\u0064';
        eVariado = '\u0065';
        System.out.println("3ª forma de escribir "+eVariado+" con sistema de codificación hexadecimal");

        //7)
        int i1 = 10;
        int i2 = 3;
        double d1 = 12.5;
        double d2 = 2.0;

        System.out.println("|\ta) El resultado será "+ i1/i2 +", al no ser una variable real en coma flotante no incluye decimales");
        System.out.println("|\tb) El resultado será "+ i1%i2 +", muestra como entero la parte sobrante de la operación anterior");
        System.out.println("|\tc) El resultado será "+ d1/d2 +", al ser una variable double incluye la parte decimal sin perder información");
        System.out.println("|\td) El resultado será "+ d1%d2 +", al ser una variable double incluye la parte decimal sin perder información");
        System.out.println("|\te) El resultado será "+ d1/i2 +", al ser una variable double incluye la parte decimal, en este caso pierde información por ser un decimal periódico puro");
        System.out.println("|\tf) El resultado será "+ d1%i2 +", al ser una variable double incluye la parte decimal con la info que se pierde en la anterior");

        //8)
        System.out.println("\n\tEjercicio 8 \n");
        int q = 2;
        int n = 10;
        System.out.println(q = ++n*3);
        System.out.println(q = n++*3);

        System.out.println("a) Se asigna a q el valor de n incrementado en 1 y multiplicado después por 3");
        System.out.println("b) Se asigna a q el valor de n multiplicado por 3 e incrementado después en 1");

        //9)
        System.out.println("\n\tEjercicio 9 \n");
        //a) -6*7+2*3/4-8
        double op1 = -6*7+ (double) (2 * 3) /4-8;
        System.out.println("|\ta) -6*7+2*3/4-8");
        System.out.println("|\t\t Primer paso -> Multiplicaciones y Divisiones de izquierda a derecha\r\t\t -6*7+2*3/4-8 = -42+1.5-8");
        System.out.println("|\t\t Segundo paso -> Sumas y Restas de izquierda a a derecha\r\t\t -42+1.5-8 = -48.5");
        System.out.println("a) Según Java "+op1);

        /*b) ((3+2)%2-15)/2*5
        Primer paso -> Operaciones dentro de paréntesis
        ((3+2)%2-15)/2*5 -> (5%2-15)/2*5
        Segundo paso -> Operaciones dentro de paréntesis, Primero módulo y después restas
        (5%2-15)/2*5 -> -14/2*5
        Tercer paso -> Multiplicaciones y divisiones de izquierda a derecha
        -14/2*5 -> -35
        */
        System.out.println("b) Según Java "+ ((3+2)%2-15)/2*5);

        /*c) 3 + 6 * 14 % 3
        Primer paso -> Multiplicaciones y Módulo de izquierda a derecha
        3+6*14%3 -> 3+84%3 -> 3+0 -> 3
        */
        System.out.println("c) Según Java "+ 3+6*14%3);

        /*d) 8 + 7 * 3 + 4 * 6 / 2 % 4
        Primer paso -> Multiplicaciones, Divisiones y Módulo
        8+7*3+4*6/2%4 -> 8+21+24/2%4 -> 8+21+12%4 -> 8+21+0
        Segundo Paso -> Sumas y restas de izquierda a derecha
        8+21 -> 29
         */
        System.out.println("d) Según Java " + (8+7*3+4*6/2%4));

        //Ejercicio 10

        double x = 1, y = 4, z = 10;
        final double PI = 3.1416;

        /* a) 2 * x + 0.5 + y - 1 / 5 * z
        1º -> 2 + 0.5 + y - 1 / 5 * z ->
        2º -> 2 + 0.5 + y - 0.2 * z ->
        3ª -> 2 + 0.5 + y - 2 ->
        4ª -> 2.5 + y - 2 ->
        5ª -> 6.5 - 2 ->
        6ª -> 4.5
        */
        System.out.println(2 * x + 0.5 +y - (double) 1 / 5 * z);

        /* b) 4 / y + PI * x / z
        1º -> 1 + PI * x / z
        2º -> 1 + PI / z
        3º -> 1 + 0.31416
        4º -> 1.31416
         */
        System.out.println(4 / y + PI * x / z);

        /* c) y - 2 / z + 4 * y / 2
        1º -> y - 0.2 + 16 / 2
        2º -> y - 0.2 + 8
        3º -> 3.8 + 8
        4º -> 11.8
         */
        System.out.println(y - 2 / z + 4 * y / 2);

        //EJERCICIO 11
        System.out.println("\n\tEjercicio 11 \n");
        int ej11 = 50;
        //a)
        System.out.println(ej11);
        ej11 = ej11 << 3;
        System.out.println(ej11);
        //b)
        byte ej11b;
        ej11b = (byte) ej11;
        System.out.println(ej11b);
        /*el valor de la variable es 400, es mayor que el rango disponible en el primitivo byte,
        que va de -128 a 127, el complemento a 2 de 400 es 144, al "llenar" los bits hasta +127
        salta un bit que se "pierde" y cubre los 16 sobrante llegando al valor de -112
        -128 + 16 -> -112
        */

        //EJERCICIO 12
        System.out.println("\n\tEjercicio 12 \n");
        int miInt = 9;
        double miDoble = miInt;

        System.out.println(miDoble);
        System.out.println(miInt);

        /*
        El código funciona correctamente, muestra el valor de miDoble y el valor de miInt
        El valor de miDoble viene dado por miInt, muestra los decimales y el valor entero
        donde no se ve pérdida de información.
         */

        //EJERCICIO 13
        System.out.println("\n\tEjercicio 13 \n");
        miDoble = 9.78d;
        miInt = (int)miDoble;
        System.out.println(miDoble);
        System.out.println(miInt);
/*
        Para que funcione correctamente hay que hacerle casting a la indentificación
        de miInt con el valor de miDoble, donde perderá la información decimal
*/
        //EJERCICIO 14
        System.out.println("\n\tEjercicio 14 \n");
        int segundos = 86455;
        int dia = segundos/(24*60*60);
        int hora = (segundos%(24*60*60))/(60*60);
        int minuto = (segundos%(60*60))/60;
        int segundo = segundos%60;
        System.out.println(segundos + " segundos corresponden a: " + dia + " dias, " + hora + " horas, " + minuto + " minutos y " + segundo + " segundos.");

        //EJERCICIO 15
        System.out.println("\n\tEjercicio 15 \n");
        int ej15 = 4321;
        int ej15millares = ej15/1000;
        int ej15centenas = (ej15 - ej15millares*1000)/100;
        int ej15decenas = (ej15 - ej15millares*1000 - ej15centenas*100)/10;
        int ej15unidades = ej15 - ej15millares*1000 - ej15centenas*100 - ej15decenas*10;
        System.out.println("El número " + ej15 + " son: \na)\t"+ ej15millares +"\tmillares\nb)\t" + ej15centenas + "\tcentenas\nc)\t" + ej15decenas + "\tdecenas\nd)\t" + ej15unidades + "\tunidades");

        //EJERCICIO 16
        System.out.println("\n\tEjercicio 16 \n");
        int contador = 8;
        contador = ++contador - (contador/10)*10;
        System.out.println(contador);
        contador = ++contador - (contador/10)*10;
        System.out.println(contador);
        contador = ++contador - (contador/10)*10;
        System.out.println(contador);
        contador = ++contador - (contador/10)*10;
        System.out.println(contador);

        //EJERCICIO 17
        System.out.println("\n\tEjercicio 17 \n");
        int ej17n = 10, ej17p = 4, ej17q = 2;
        double ej17z;
        //a) ej17z = ej17n / ej17p;
        ej17z = ej17n / ej17p;
        System.out.println("1º\t"+ ej17z + "->\tse le asigna a z el valor de la division de los enteros n y p,\n" +
                "\t\t\tal ser enteros guardará la división sin la parte decimal aunque después z muestre su valor decimal");
        ej17z = (double) ej17n / ej17p;
        System.out.println("2º\t"+ ej17z + "->\tse le asigna a z el valor de la division de los enteros n y p,\n" +
                "\t\t\tal hacer casting en el numerador para que sea double guarda la parte decimal de la operación");
        ej17z = (double) (ej17n / ej17p);
        System.out.println("3º\t"+ ej17z + "->\tse le asigna a z el valor de la division de los enteros n y p,\n" +
                "\t\t\tal haber una operación con paréntesis se hace antes de aplicar el casting");
        //d) ej17z += ej17n;
        //e) ej17q *= ej17z;
        //f) ej17z += 2;

    }
}
