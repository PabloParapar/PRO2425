package src.UD2.EXPLogicas;

import java.util.Scanner;

public class Boletin21 {
    public static void main(String[] args) {
        Scanner boletin21 = new Scanner(System.in);
        System.out.println("Introduzca el número de ejercicio que desea ejecutar: ");
        int numeroEjercicio = boletin21.nextInt();
        switch (numeroEjercicio) {

            //EJERCICIO 1
            case 1:
                System.out.println("\tBoletin 2 1 | Ejercicio 1\nCalcula el resultado de las siguientes expresiones indicando paso a paso cómo se ejecuta el proceso el proceso\n");
                System.out.println("a)    (true&&true)||false == true\n" +
                        "        1º  Paréntesis\n" +
                        "                true||false == true\n" +
                        "        2º  Igualdad\n" +
                        "                true||false\n" +
                        "        3º  Operador lógico Or\n" +
                        "                true");

                System.out.println("b)    (false||false)&&false==true\n" +
                        "        1º  Paréntesis\n" +
                        "                false&&false==true\n" +
                        "        2º  Igualdad // Por cortocircuito terminaría de evaluar aquí como false\n" +
                        "                false&&false\n" +
                        "        3ª  Operador lógico And\n" +
                        "                false");

                System.out.println("c)      (!(true&&false))==false\n" +
                        "        1º  Paréntesis -> Operador Lógico &&\n" +
                        "                (!false)==false\n" +
                        "        2ª  Paréntesis -> Operador Lógico !\n" +
                        "                true==false\n" +
                        "        3º  Igualdad\n" +
                        "                false");

                System.out.println("d)    i = 1, j = 0, k = -1\n" +
                        "                i + k <= j - k * 3 && k >= 2\n" +
                        "        1º  Multiplicaciones, Divisiones y Módulo de izquierda a derecha\n" +
                        "                i + k <= j + 3 && k >= 2\n" +
                        "        2º  Sumas y Restas de izquierda a derecha\n" +
                        "                0 <= j + 3 && k >= 2\n" +
                        "                0 <= 3 && k >= 2\n" +
                        "        3ª  Expresiones relacionales < <= > >=\n" +
                        "                true && k >= 2\n" +
                        "                true && false\n" +
                        "        4º  Expresiones lógicas And\n" +
                        "                false");

                System.out.println("e)      i == 3 || j <= 2 && k > 0\n" +
                        "        1º  Operadores Relacionales < <= > >=\n" +
                        "                i == 3 || true && k > 0\n" +
                        "                i == 3 || true && false\n" +
                        "        2º  Operadores Relacionales == !=\n" +
                        "                true || true && false\n" +
                        "        3º  Operador Lógico &&\n" +
                        "                true || false\n" +
                        "        4º  Operador Lógico ||\n" +
                        "                true");

                System.out.println("f)      3 == 2 || 5 > i + i\n" +
                        "        1º  Operador Aritmético Suma\n" +
                        "                3 == 2 || 5 > 2\n" +
                        "        2º  Operador Relacional >\n" +
                        "                3 == 2 || true\n" +
                        "        3º  Operador Relacional ==\n" +
                        "                false || true\n" +
                        "        4º  Operador Lógico ||\n" +
                        "                true");
                System.out.println("g)\n" +
                        "            1)  PI * x * x > y || 2 * PI * x <= z\n" +
                        "        1º  Operador aritmético Multiplicación\n" +
                        "                PI * x > y || 2 * PI * x <= z\n" +
                        "                PI > y || 2 * PI * x <= z\n" +
                        "                PI > y || 6.2832 * x <= z\n" +
                        "                PI > y || 6.2832 <= z\n" +
                        "        2º  Operador Relacional < <= > >=\n" +
                        "                false || 6.2832 <= z\n" +
                        "                false || true\n" +
                        "        3º  Operador Lógico ||\n" +
                        "                true\n" +
                        "\n" +
                        "            2)  x > 3 && ( y == 4 || x + y <= z )\n" +
                        "        1º  Paréntesis -> Suma\n" +
                        "                x > 3 && ( y == 4 || 5 <= z )\n" +
                        "        2º  Paréntesis -> Operador relacional < <= > >=\n" +
                        "                x > 3 && ( y == 4 || true )\n" +
                        "        3º  Paréntesis -> Operador relacional == !=\n" +
                        "                x > 3 && ( true || true )\n" +
                        "        4º  Paréntesis -> Operador Lógico ||\n" +
                        "                x > 3 && true\n" +
                        "        5º  Operador Relacional < <= > >=\n" +
                        "                false && true\n" +
                        "        6º  Operador Lógico &&\n" +
                        "                false\n");
                System.out.println("\tResumen\n\n" + "a)\t( true && true ) || false == true\t=\t" + ((true && true) || false == true) + "\n" +
                        "b)\t( false || false ) && false == true\t=\t" + ((false || false) && false == true) + "\n" +
                        "c)\t( !( true && false )) == false\t=\t\t" + ((!(true && false)) == false));
                int i = 1, j = 0, k = -1;
                System.out.println("d)\ti + k <= j - k * 3 && k >= 2\t=\t\t" + (i + k <= j - k * 3 && k >= 2));
                i = 3;
                j = 2;
                System.out.println("e)\ti == 3 || j <= 2 && k > 0\t=\t\t\t" + (i == 3 || j <= 2 && k > 0));
                i = 1;
                System.out.println("f)\t3 == 2 || 5 > i + i\t=\t\t\t\t\t" + (3 == 2 || 5 > i + i));
                int x = 1, y = 4, z = 10;
                final double PI = 3.1416;
                System.out.println("g)\t1)\tPI * x * x > y || 2 * PI * x <= z = " + (PI * x * x > y || 2 * PI * x <= z) + "\n\t2)\tx > 3 && ( y == 4 || x + y <= z ) = " + (x > 3 && (y == 4 || x + y <= z)) + "\n");
                break;

            //EJERCICIO 2
            case 2:
                System.out.println("\n\tBoletin 2 1 | Ejercicio 2\n" + "Indica si un número 'a' es divisible entre un número 'b'\n");
                Scanner ejercicio2 = new Scanner(System.in);
                System.out.println("Indica el número 'a': ");
                int a = ejercicio2.nextInt();
                System.out.println("Indica el número 'b': ");
                int b = ejercicio2.nextInt();
                System.out.println("¿" + a + " es divisible entre " + b + "? " + (a % b == 0));
                break;

            //EJERCICIO 3
            case 3:
                System.out.println("\n\tBoletin 2 1 | Ejercicio 3\nEn un juego a dos jugadores, A y B. Determina el turno del jugador A en cada ronda.");
                boolean turnoA = true;
                System.out.println("\nTurno 1\n¿Es el turno del jugador A? " + turnoA + "\n¿Es el turno del jugador B? " + !turnoA);
                turnoA = !turnoA;
                System.out.println("\nTurno 2\n¿Es el turno del jugador A? " + turnoA + "\n¿Es el turno del jugador B? " + !turnoA);
                turnoA = !turnoA;
                System.out.println("\nTurno 3\n¿Es el turno del jugador A? " + turnoA + "\n¿Es el turno del jugador B? " + !turnoA);
                turnoA = !turnoA;
                break;

            //EJERCICIO 4
            case 4:
                System.out.println("\n\tBoletin 2 1 | Ejercicio 4\nLee por teclado las coordenadas de un elemento de una matriz 5*5. Indica si el elemento está dentro de la matriz.");

                Scanner ejercicio4 = new Scanner(System.in);
                System.out.println("Indica la fila del elemento: ");
                int lecturaFila = ejercicio4.nextInt();
                System.out.println("Indica la columna del elemento: ");
                int lecturaColumna = ejercicio4.nextInt();

                //boolean lecturaMatriz = lecturaFila > 1 && lecturaFila < 6 && lecturaColumna > 1 && lecturaColumna < 6;
                System.out.println("¿El elemento está dentro de la matriz? " + (lecturaFila > 1 && lecturaFila < 6 && lecturaColumna > 1 && lecturaColumna < 6));
                break;

            //EJERCICIO 5
            case 5:
                System.out.println("\n\tBoletin 2 1 | Ejercicio 5\nIndica un número entero que represente las opciones de un menú");
                Scanner ejercicio5 = new Scanner(System.in);
                System.out.println("Inserte su número de pedido: ");
                int cantidadMenu = 10, entrada = ejercicio5.nextInt();

                boolean numeroValido = entrada >= 1 && entrada <= cantidadMenu;
                System.out.println("Su pedido " + entrada + " es " + numeroValido);
                break;

            //EJERCICIO 6
            case 6:
                System.out.println("\n\tBoletin 2 1 | Ejercicio 6\nEscribe las expresiones Java para las situaciones de cada apartado\n");
                //a)
                System.out.println("a)\tUn alumno tiene 3 notas correspondientes a las 3 unidades didácticas del curso. Determina si el alumno apruba la materia\n\nIngresa las notas del examen 1, 2 y 3:");
                Scanner ejercicio6 = new Scanner(System.in);
                int notaUnidad1 = ejercicio6.nextInt(), notaUnidad2 = ejercicio6.nextInt(), notaUnidad3 = ejercicio6.nextInt();
                double notaMedia = (notaUnidad1 + notaUnidad2 + notaUnidad3) / 3;
                boolean alumnoAprueba = notaMedia >= 5;
                System.out.println("El alumno ha aprobado? " + alumnoAprueba);
                //b)
                System.out.println("b)\tEl profesor da puntuación extra por el trabajo realizado, a la nota media se le suma la puntuación extra. Determina si así el alumno aprueba:\n\nIngresa la puntuación extra: ");
                int puntosExtra = ejercicio6.nextInt();
                alumnoAprueba = notaMedia + puntosExtra >= 5;
                System.out.println("El alumno ha aprobado con los puntos extra? " + alumnoAprueba);
                //c)
                System.out.println("Para que el alumno pueda aprobar la nota media debe ser, mayor que 4");
                alumnoAprueba = notaMedia + puntosExtra >= 5 && notaMedia >= 4;
                System.out.println("El alumno ha aprobado? " + alumnoAprueba);
                //d)
                int trabajoUnidad1 = 5, trabajoUnidad2 = 7, trabajoUnidad3 = 6;
                double notaMediaTrabajos = (trabajoUnidad1 + trabajoUnidad2 + trabajoUnidad3) / 3, notaMediaTotal = (notaUnidad1 + notaUnidad2 + notaUnidad3 + notaMediaTrabajos) / 4;
                alumnoAprueba = notaMediaTotal >= 5 && notaMedia >= 4;
                System.out.println("El alumno ha aprobado? " + alumnoAprueba);
                //e)
                notaMediaTotal = notaMedia * 0.8 + notaMediaTrabajos * 0.2;
                alumnoAprueba = notaMediaTotal >= 5 && notaMedia >= 4;
                System.out.println("El alumno ha aprobado? " + alumnoAprueba);
                //f)
                alumnoAprueba = notaMediaTotal >= 5 && notaMedia >= 4 && notaMediaTrabajos <= 4;
                System.out.println("El alumno ha aprobado? " + alumnoAprueba);
                break;
        }
    }
}