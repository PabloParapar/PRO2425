package src.UD2.EXPLogicas;

import java.util.*;

public class Boletin23 {
    public static void main(String[] args) {
        //ESTRUCTURA REPETITIVA FOR
        System.out.println("Estructura repetitiva for\n--------------------------------");
        //EJERCICIO 1
        System.out.println("\n\tBoletin 2 3 | Ejercicio 1\n");
/*
        int n = 0;
        for (int i = 1; i <= 100; i++) {
            n += i;
        }
        System.out.println(n);

        //EJERCICIO 2
        System.out.println("\n\tBoletin 2 3 | Ejercicio 2\n");

        Scanner ejercicio2 = new Scanner(System.in);

        int numero = 0;
        System.out.println("Introduzca 5 números para obtener la media:");
        for (int i = 5; i > 0; i--) {
            System.out.println("Quedan " + i + " números por introducir: ");
            numero += ejercicio2.nextInt();
        }
        System.out.println("La media es " + (numero / 5));

        //EJERCICIO 3
        System.out.println("\n\tBoletin 2 3 | Ejercicio 3\n");

        System.out.println("¿A cuántos números le harás la media?");
        Scanner ejercicio3 = new Scanner(System.in);
        int i3 = ejercicio3.nextInt();
        numero = 0;
        for (int i = i3; i > 0; i--) {
            System.out.println("Introduzca un número, quedan " + i + " números por introducir: ");
            numero += ejercicio3.nextInt();
        }
        System.out.println("La media entre los " + i3 + " números dados es: " + (numero / i3));

        //EJERCICIO 4
        System.out.println("\n\tBoletin 2 3 | Ejercicio 4\n");

        Scanner ejercicio4 = new Scanner(System.in);
        System.out.println("Introduzca 2 valores para sumar los números pares del intervalo que forman: ");
        int i4inicio = ejercicio4.nextInt();
        int i4fin = ejercicio4.nextInt();
        int sumasPares = 0;
        if (i4inicio < i4fin) {
            for (int i = i4inicio; i <= i4fin; i++) {
                if (i % 2 == 0) {
                    sumasPares += i;
                }
            }
        } else {
            for (int i = i4fin; i <= i4inicio; i++) {
                if (i % 2 == 0) {
                    sumasPares += i;
                }
            }
        }
        System.out.println(sumasPares);

        //EJERCICIO 5
        System.out.println("\n\tBoletin 2 3 | Ejercicio 5\n");
        System.out.println("¿Cuántos términos de la suma armónica quiere sumar?");
        Scanner ejercicio5 = new Scanner(System.in);
        int i5 = ejercicio5.nextInt();
        double serieArmonica = 0;
        for (int i = 1; i <= i5; i++) {
        serieArmonica += (double) 1 /i;
        }
        System.out.println("Resultado de la suma de los primeros "+i5+" términos de la serie armónica:\n"+serieArmonica);

        //EJERCICIO 6
        System.out.println("\n\tBoletin 2 3 | Ejercicio 6\n");

        System.out.println("¿Cuántos términos de la siguiente serie quiere sumar?");
        Scanner ejercicio6 = new Scanner(System.in);
        int i6 = ejercicio6.nextInt();
        double sumaSerie = 0;

        for (int i = 1; i <= i6; i++){
            sumaSerie += (double) (5*i) /(2*Math.pow(3, i));
            //System.out.println(sumaSerie);
        }
        System.out.println(sumaSerie);

        //EJERCICIO 7
        System.out.println("\n\tBoletin 2 3 | Ejercicio 7\n");

        System.out.println("¿Cuántos términos de la serie quiere sumar?");
        Scanner ejercicio7 = new Scanner(System.in);
        int i7 = ejercicio7.nextInt();
        double sumaSerie7 = 0;

        for (int i = 1; i<=i7; i++){
            sumaSerie7 += i/Math.pow(2, i);
            System.out.println(sumaSerie7);
        }
        System.out.println("Resultado de la suma de los primeros "+i7+" términos de la serie:\n"+sumaSerie7);

        //EJERCICIO 8
        System.out.println("\n\tBoletin 2 3 | Ejercicio 8\n");

        System.out.println("Conversor de Temperaturas\nIntroduzca los grados en Fahrenheit (desde / hasta):");
        Scanner ejercicio8 = new Scanner(System.in);
        int desde = ejercicio8.nextInt();
        int hasta = ejercicio8.nextInt();
        float temperaturaC, temperaturaR, temperaturaK;
        DecimalFormat tabla = new DecimalFormat("##0.00");
        if (desde < hasta) {
            System.out.println("Temperaturas desde " + desde + "Fº hasta " + hasta + "Fº:\n┏━━━━━━━━━━━━━━━┯━━━━━━━━━━━┯━━━━━━━━━━━┯━━━━━━━━━━━┓\n┃\tFahrenheit\t│\tCelsius\t│\tRankine\t│\tKelvin\t┃\n┠───────────────┼───────────┼───────────┼───────────┨");
            for (int i = desde; i <= hasta; i++) {
                temperaturaC = (float) (5 * (i - 32)) / 9;
                temperaturaR = (float) (i + 459.67);
                temperaturaK = (float) (temperaturaC + 273.15);
                System.out.println("┃\t" + tabla.format(i) + "\t\t│\t" + tabla.format(temperaturaC) + "\t│\t" + tabla.format(temperaturaR) + "\t│\t" + tabla.format(temperaturaK) + "\t┃");
            }
        } else {
            System.out.println("Temperaturas desde " + hasta + "Fº hasta " + desde + "Fº:\n┏━━━━━━━━━━━━━━━┯━━━━━━━━━━━┯━━━━━━━━━━━┯━━━━━━━━━━━┓\n┃\tFahrenheit\t│\tCelsius\t│\tRankine\t│\tKelvin\t┃\n┠───────────────┼───────────┼───────────┼───────────┨");
            for (int i = hasta; i <= desde; i++) {
                temperaturaC = (float) (5 * (i - 32)) / 9;
                temperaturaR = (float) (i + 459.67);
                temperaturaK = (float) (temperaturaC + 273.15);
                System.out.println("┃\t" + tabla.format(i) + "\t\t│\t" + tabla.format(temperaturaC) + "\t│\t" + tabla.format(temperaturaR) + "\t│\t" + tabla.format(temperaturaK) + "\t┃");
            }
        }
        System.out.println("┗━━━━━━━━━━━━━━━┷━━━━━━━━━━━┷━━━━━━━━━━━┷━━━━━━━━━━━┛");

        //EJERCICIO 9
        System.out.println("\n\tBoletin 2 3 | Ejercicio 9 a)\n");
        System.out.println("¿De qué número quiere calcular su factorial?");
        Scanner ejercicio9 = new Scanner(System.in);
        int factorial = ejercicio9.nextInt();
        int resultadoFactorial = 1;
        switch (factorial) {
            case 0:
            case 1:
                System.out.println("El Factorial de "+factorial+" es 1");
                break;
            default:
                for (int i = 1; i <= factorial; i++) {
                    resultadoFactorial *= i;
                    System.out.println(resultadoFactorial);
                }
                break;
        }

        System.out.println("\n\tBoletin 2 3 | Ejercicio 9 b)\n");
        long factorial20 = 1;
        for (int i = 1; i <=20; i++){
            factorial20 *= i;
            //System.out.println(factorial20);
        }
        System.out.println(factorial20);

        //EJERCICIO 10
        System.out.println("\n\tBoletin 2 3 | Ejercicio 10\n");

        Scanner ejercicio10 = new Scanner(System.in);
        int numeroSerie = ejercicio10.nextInt();
        for (int i = 0; i <= numeroSerie; i++){
            System.out.println((int) Math.pow(-2, i));
        }

        //EJERCICIO 11
        System.out.println("\n\tBoletin 2 3 | Ejercicio 11\n");



        //EJERCICIO 12
        System.out.println("\n\tBoletin 2 3 | Ejercicio 12 a)\n");

        Scanner ejercicio12 = new Scanner(System.in);
        int numeroTabla = ejercicio12.nextInt();
        if (numeroTabla >= 1 && numeroTabla <= 9){
            for (int i = 1; i <= 10; i++){
                System.out.println(numeroTabla +" * "+i+" = "+(numeroTabla*i));
            }
        } else {
            System.out.println("El número no es correcto");
        }

        System.out.println("\n\tBoletin 2 3 | Ejercicio 12 b)\n");

        for(int i = 1; i <= 9; i++){
            System.out.println("┏━━━━━━━━━━━━━━━━━━━┓\n┃\t  Tabla del "+i+"  \t┃\n┠───────────────────┨");
            for(int j = 1; j<=10; j++){
                System.out.println("┃\t"+i +" * "+j+"\t=\t"+(i*j)+"\t┃");
            }
            System.out.println("┗━━━━━━━━━━━━━━━━━━━┛\n\n");
        }
*/
        //EJERCICIO 13
        /*SIN TERMINAR
        System.out.println("\n\tBoletin 2 3 | Ejercicio 13\n");

        Scanner ejercicio13 = new Scanner(System.in);
        int numeroSumatorio = ejercicio13.nextInt();
        double sumatorio, productorio;
        sumatorio = 0;
        productorio = 1;
        for (int i = 1; i <= numeroSumatorio; i++) {
            for (int j = numeroSumatorio; j <= i; j++) {
                productorio *= j;
                System.out.println(i+", "+j+", productorio: "+productorio);
            }
            sumatorio += (double) 1 /i + productorio;
            System.out.println(i+", sumatorio: "+sumatorio);
        }
        SIN TERMINAR*/

        //EJERCICIO 14
    /*    System.out.println("\n\tBoletin 2 3 | Ejercicio 14\n");

        Scanner ejercicio14 = new Scanner(System.in);
        int numeroDivisores = ejercicio14.nextInt();
        System.out.println("Los divisores de "+numeroDivisores+" son:");
        for (int i = numeroDivisores; i>=1; i--) {
            if(numeroDivisores % i == 0){
                System.out.println("\t· "+i);
            }
        }

        //EJERCICIO 15
        System.out.println("\n\tBoletin 2 3 | Ejercicio 15\n");

        System.out.println("El cuadrado de los primeros 10 números pares son:");
        for(int i = 2; i <=20; i += 2){
            System.out.println("\t· "+(int)Math.pow(i, 2));
        }

        //EJERCICIO 16
        System.out.println("\n\tBoletin 2 3 | Ejercicio 16\n");
        Scanner ejercicio16 = new Scanner(System.in);
        System.out.println("¿De qué número quiere calcular las potencias?");
        int base = ejercicio16.nextInt();
        System.out.println("Indique la potencia más alta a la que desea elevar "+base);
        int potencia = ejercicio16.nextInt();
        for (int i = 1; i<=potencia; i++){
            System.out.println(base+" ^ "+i+" = "+Math.pow(base, i));
        }

        //EJERCICIO 17
        System.out.println("\n\tBoletin 2 3 | Ejercicio 17\n");

        long tiempoInicio1 = System.currentTimeMillis();
        for (int i = 1; i <= 1000000; i++){
            if(i % 2 == 0){
                System.out.println("Par");
            } else {
                System.out.println("Impar");
            }
        }
        long tiempoFinal1 = System.currentTimeMillis();
        long tiempoInicio2 = System.currentTimeMillis();
        for (int i = 1; i <= 1000000; i++){
            if((i & 1) == 0){
                System.out.println("Par");
            } else {
                System.out.println("Impar");
            }
        }
        long tiempoFinal2 = System.currentTimeMillis();
        System.out.println("Método 1:\nTiempo inicio = "+tiempoInicio1+"\tTiempo final = "+tiempoFinal1+"\t\tTiempo total = "+(tiempoFinal1-tiempoInicio1)+"\n\nMétodo 2:\nTiempo inicio = "+tiempoInicio2+"\tTiempo final = "+tiempoFinal2+"\t\tTiempo total = "+(tiempoFinal2-tiempoInicio2));
        if(tiempoFinal1-tiempoInicio1 > tiempoFinal2-tiempoInicio2){
            System.out.println("El segundo método es más rápido");
        } else{
            System.out.println("El primer método es más rápido");
        }


        //EJERCICIO 18
        System.out.println("\n\tBoletin 2 3 | Ejercicio 18\n");

        Scanner ejercicio18 = new Scanner(System.in);
        System.out.println("Indica el primer número del intervalo a comprobar");
        int inicioIntervaloCubo = ejercicio18.nextInt();
        System.out.println("Indica el último número del intervalo a comprobar");
        int finalIntervaloCubo = ejercicio18.nextInt();
        for (int i = inicioIntervaloCubo; (i <= finalIntervaloCubo) && (i - inicioIntervaloCubo < 20); i++) {
            if ((i & 1) != 0) {
                System.out.println("\t· " + (long) Math.pow(i, 3));
            }
        }

        //EJERCICIO 19
        System.out.println("\n\tBoletin 2 3 | Ejercicio 19\n");

        Scanner ejercicio19 = new Scanner(System.in);
        System.out.println("Indica el año del incio del intervalo a comprobar");
        int anhoInicio = ejercicio19.nextInt();
        System.out.println("Indica el año del final del intervalo a comprobar");
        int anhoFinal = ejercicio19.nextInt();
        System.out.println("Los años comprendidos entre "+anhoInicio+" y "+anhoFinal+" son:");
        for (int i = anhoInicio; i <= anhoFinal; i++){
            if (i % 4 == 0){
                if (i % 100 == 0){
                    if (i % 400 == 0){
                        System.out.println("\t· "+i);
                    } //else no es bisiesto
                } else { //es bisiesto
                    System.out.println("\t· "+i);
                }
            } //else no es bisiesto
        }

        //EJERCICIO 20
        System.out.println("\n\tBoletin 2 3 | Ejercicio 20\n");
        System.out.println("Indica cuántas filas tendrá el triángulo de Floyd");
        Scanner ejercicio20 = new Scanner(System.in);
        int filasFloyd = ejercicio20.nextInt();
        int numeroFloyd = 1;
        System.out.println("\nAscendente\n");
        for (int i = 1; i <= filasFloyd; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("\t"+numeroFloyd);
                numeroFloyd++;
            }
            System.out.println();
        }
        System.out.println("\nDescendente\n");
        numeroFloyd = 1;
        for (int i = 1; i <= filasFloyd; i++){
            for (int j = filasFloyd; j >= i; j--){
                System.out.print("\t"+numeroFloyd);
                numeroFloyd++;
            }
            System.out.println();
        }

        //EJERCICIO 21
        System.out.println("\n\tBoletin 2 3 | Ejercicio 21\n");

        System.out.println("\t1.\tCuadrado.\n\t2.\tRectángulo.\n\t3.\tTriángulo\n\t4.\tCírculo.\n\t0.\tSalir.\n\nSeleccione una opción del menú");
        Scanner ejercicio21 = new Scanner(System.in);
        int menu = ejercicio21.nextInt();
        switch(menu){
            case 1:
                System.out.println("Cuadrado.");
                break;
            case 2:
                System.out.println("Rectángulo.");
                break;
            case 3:
                System.out.println("Triángulo.");
                break;
            case 4:
                System.out.println("Círculo");
                break;
            case 0:
                System.out.println("Salir");
                break;
            default:
                System.out.println("ERROR | OPCIÓN NO VÁLIDA");
        }

        //EJERCICIO 22
        System.out.println("\n\tBoletin 2 3 | Ejercicio 22\n");

        Scanner ejercicio22 = new Scanner(System.in);
        int numeroBase = ejercicio22.nextInt();
        int numeroCuadrado = 0;

        for (int i = 0; i < numeroBase; i ++){
            numeroCuadrado += (1+2*i);
        }
        System.out.println(numeroCuadrado);

        //EJERCICIO 23
        System.out.println("\n\tBoletin 2 3 | Ejercicio 23\n");

        Scanner ejercicio23 = new Scanner(System.in);
        int producto1 = ejercicio23.nextInt();
        int producto2 = ejercicio23.nextInt();
        int productoFinal = 0;
        for (int i = 1; i<=producto2; i++){
            productoFinal += producto1;
        }
        System.out.println(productoFinal);
*/
        //EJERCICIO 24
        System.out.println("\n\tBoletin 2 3 | Ejercicio 24\n");

        Scanner ejercicio24 = new Scanner(System.in);
        int entradaDividendo = ejercicio24.nextInt();
        int dividendo = entradaDividendo;
        int divisor = ejercicio24.nextInt();


        for (int i = 0; ;i++){
            if(dividendo > divisor){
                dividendo -= divisor;
            } else {
                System.out.println(entradaDividendo+"/"+divisor+" =>\tEntero: "+i+"\tResto: "+dividendo);
                break;
            }
        }
/*
        //ESTRUCTURA REPETITIVA WHILE
        System.out.println("Estructura repetitiva while\n--------------------------------");
        //EJERCICIO 25
        System.out.println("\n\tBoletin 2 3 | Ejercicio 25\n");



        //EJERCICIO 26
        System.out.println("\n\tBoletin 2 3 | Ejercicio 26\n");



        //EJERCICIO 27
        System.out.println("\n\tBoletin 2 3 | Ejercicio 27\n");



        //EJERCICIO 28
        System.out.println("\n\tBoletin 2 3 | Ejercicio 28\n");



        //EJERCICIO 29
        System.out.println("\n\tBoletin 2 3 | Ejercicio 29\n");



        //EJERCICIO 30
        System.out.println("\n\tBoletin 2 3 | Ejercicio 30\n");



        //EJERCICIO 31
        System.out.println("\n\tBoletin 2 3 | Ejercicio 31\n");



        //EJERCICIO 32
        System.out.println("\n\tBoletin 2 3 | Ejercicio 32\n");



        //EJERCICIO 33
        System.out.println("\n\tBoletin 2 3 | Ejercicio 33\n");



        //EJERCICIO 34
        System.out.println("\n\tBoletin 2 3 | Ejercicio 34\n");



        //ESTRUCTURA REPETITIVA DO-WHILE
        System.out.println("\nEstructura repetitiva do-while\n--------------------------------");
        //EJERCICIO 35
        System.out.println("\n\tBoletin 2 3 | Ejercicio 35\n");



        //EJERCICIO 36
        System.out.println("\n\tBoletin 2 3 | Ejercicio 36\n");



        //EJERCICIO 37
        System.out.println("\n\tBoletin 2 3 | Ejercicio 37\n");



        //EJERCICIO 38
        System.out.println("\n\tBoletin 2 3 | Ejercicio 38\n");



        //EJERCICIO 39
        System.out.println("\n\tBoletin 2 3 | Ejercicio 39\n");



        //EJERCICIOS DE ESTRUCTURA REPETITIVA LIBRE
        System.out.println("\nEjercicios de estructura repetitiva libre\n--------------------------------");
        //EJERCICIO 40
        System.out.println("\n\tBoletin 2 3 | Ejercicio 40\n");



        //EJERCICIO 41
        System.out.println("\n\tBoletin 2 3 | Ejercicio 41\n");



        //EJERCICIO 42
        System.out.println("\n\tBoletin 2 3 | Ejercicio 42\n");



        //EJERCICIO 43
        System.out.println("\n\tBoletin 2 3 | Ejercicio 43\n");



        //EJERCICIO 44
        System.out.println("\n\tBoletin 2 3 | Ejercicio 44\n");



        //EJERCICIO 45
        System.out.println("\n\tBoletin 2 3 | Ejercicio 45\n");



        //EJERCICIO 46
        System.out.println("\n\tBoletin 2 3 | Ejercicio 46\n");



        //EJERCICIO 47
        System.out.println("\n\tBoletin 2 3 | Ejercicio 47\n");



        //EJERCICIO 48
        System.out.println("\n\tBoletin 2 3 | Ejercicio 48\n");



         */
    }
}
