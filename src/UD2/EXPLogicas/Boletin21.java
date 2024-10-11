package src.UD2.EXPLogicas;

public class Boletin21 {
    public static void main(String[] args) {

        //EJERCICIO 1
        System.out.println("\tBoletin 2 1 | Ejercicio 1\n");
        /*a)    (true&&true)||false == true
        1º  Paréntesis
                true||false == true
        2º  Igualdad
                true||false
        3º  Operador lógico Or
                true
         */
        System.out.println("a)\t( true && true ) || false == true\t=\t"+((true&&true)||false == true));
        /*b)    (false||false)&&false==true
        1º  Paréntesis
                false&&false==true
        2º  Igualdad // Por cortocircuito terminaría de evaluar aquí como false
                false&&false
        3ª  Operador lógico And
                false
         */
        System.out.println("b)\t( false || false ) && false == true\t=\t"+((false||false)&&false==true));
        /*
        c)      (!(true&&false))==false
        1º  Paréntesis -> Operador Lógico &&
                (!false)==false
        2ª  Paréntesis -> Operador Lógico !
                true==false
        3º  Igualdad
                false
         */
        System.out.println("c)\t( !( true && false )) == false\t=\t\t"+((!(true&&false))==false));
        /*d)    i = 1, j = 0, k = -1
                i + k <= j - k * 3 && k >= 2
        1º  Multiplicaciones, Divisiones y Módulo de izquierda a derecha
                i + k <= j + 3 && k >= 2
        2º  Sumas y Restas de izquierda a derecha
                0 <= j + 3 && k >= 2
                0 <= 3 && k >= 2
        3ª  Expresiones relacionales < <= > >=
                true && k >= 2
                true && false
        4º  Expresiones lógicas And
                false
         */
        int i = 1, j = 0, k = -1;
        System.out.println("d)\ti + k <= j - k * 3 && k >= 2\t=\t\t"+(i + k <= j - k * 3 && k >= 2));
        /*
        e)      i == 3 || j <= 2 && k > 0
        1º  Operadores Relacionales < <= > >=
                i == 3 || true && k > 0
                i == 3 || true && false
        2º  Operadores Relacionales == !=
                true || true && false
        3º  Operador Lógico &&
                true || false
        4º  Operador Lógico ||
                true
         */
        i = 3; j = 2;
        System.out.println("e)\ti == 3 || j <= 2 && k > 0\t=\t\t\t"+(i == 3 || j <= 2 && k > 0));
        /*
        f)      3 == 2 || 5 > i + i
        1º  Operador Aritmético Suma
                3 == 2 || 5 > 2
        2º  Operador Relacional >
                3 == 2 || true
        3º  Operador Relacional ==
                false || true
        4º  Operador Lógico ||
                true
         */
        i = 1;
        System.out.println("f)\t3 == 2 || 5 > i + i\t=\t\t\t\t\t"+(3 == 2 || 5 > i + i));
        /*
        g)
            1)  PI * x * x > y || 2 * PI * x <= z
        1º  Operador aritmético Multiplicación
                PI * x > y || 2 * PI * x <= z
                PI > y || 2 * PI * x <= z
                PI > y || 6.2832 * x <= z
                PI > y || 6.2832 <= z
        2º  Operador Relacional < <= > >=
                false || 6.2832 <= z
                false || true
        3º  Operador Lógico ||
                true

            2)  x > 3 && ( y == 4 || x + y <= z )
        1º  Paréntesis -> Suma
                x > 3 && ( y == 4 || 5 <= z )
        2º  Paréntesis -> Operador relacional < <= > >=
                x > 3 && ( y == 4 || true )
        3º  Paréntesis -> Operador relacional == !=
                x > 3 && ( true || true )
        4º  Paréntesis -> Operador Lógico ||
                x > 3 && true
        5º  Operador Relacional < <= > >=
                false && true
        6º  Operador Lógico &&
                false
         */
        int x = 1, y = 4, z = 10;
        final double PI = 3.1416;
        System.out.println("g)\t1)\tPI * x * x > y || 2 * PI * x <= z = "+(PI * x * x > y || 2 * PI * x <= z)+"\n\t2)\tx > 3 && ( y == 4 || x + y <= z ) = "+(x > 3 && ( y == 4 || x + y <= z )));

        //EJERCICIO 2
        System.out.println("\n\tBoletin 2 1 | Ejercicio 2\n");
        int a = 25, b = 5;
        System.out.println("¿"+a +" es divisible entre "+b+"? "+(a%b == 0));
        a = 26; b = 3;
        System.out.println("¿"+a +" es divisible entre "+b+"? "+(a%b == 0));
        a = 20_985_561; b = 4581;
        System.out.println("¿"+a +" es divisible entre "+b+"? "+(a%b == 0));

        //EJERCICIO 3
        System.out.println("\n\tBoletin 2 1 | Ejercicio 3\n");
        boolean turnoA = true;
        System.out.println("\nTurno 1\n¿Es el turno del jugador A? "+turnoA+"\n¿Es el turno del jugador B? "+!turnoA);
        turnoA = !turnoA;
        System.out.println("\nTurno 2\n¿Es el turno del jugador A? "+turnoA+"\n¿Es el turno del jugador B? "+!turnoA);
        turnoA = !turnoA;
        System.out.println("\nTurno 3\n¿Es el turno del jugador A? "+turnoA+"\n¿Es el turno del jugador B? "+!turnoA);
        turnoA = !turnoA;

        //EJERCICIO 4
        System.out.println("\n\tBoletin 2 1 | Ejercicio 4\n");

        int lecturaFila = 4, lecturaColumna = 0;

        //boolean lecturaMatriz = lecturaFila > 1 && lecturaFila < 6 && lecturaColumna > 1 && lecturaColumna < 6;
        System.out.println("¿El elemento está dentro de la matriz? "+(lecturaFila > 1 && lecturaFila < 6 && lecturaColumna > 1 && lecturaColumna < 6));
        lecturaFila =3; lecturaColumna = 4;
        System.out.println("¿El elemento está dentro de la matriz? "+(lecturaFila > 1 && lecturaFila < 6 && lecturaColumna > 1 && lecturaColumna < 6));


        //EJERCICIO 5
        System.out.println("\n\tBoletin 2 1 | Ejercicio 5\n");

        int cantidadMenu = 10, entrada = 5;

        boolean numeroValido = entrada >= 1 && entrada <= cantidadMenu;
        System.out.println("Inserte su pedido:\n"+entrada+"\nSu pedido es "+numeroValido);

        //EJERCICIO 6
        System.out.println("\n\tBoletin 2 1 | Ejercicio 6\n");
        //a)
        int notaUnidad1 = 3, notaUnidad2 = 5, notaUnidad3 = 5;
        double notaMedia = (notaUnidad1+notaUnidad2+notaUnidad3)/3;
        boolean alumnoAprueba = notaMedia >= 5;
        System.out.println("El alumno ha aprobado? "+alumnoAprueba);
        //b)
        int puntosExtra = 3;
        alumnoAprueba = notaMedia+puntosExtra >= 5;
        System.out.println("El alumno ha aprobado? "+alumnoAprueba);
        //c)
        alumnoAprueba = notaMedia+puntosExtra >= 5 && notaMedia >= 4;
        System.out.println("El alumno ha aprobado? "+alumnoAprueba);
        //d)
        int trabajoUnidad1 = 5, trabajoUnidad2 = 7, trabajoUnidad3 = 6;
        double notaMediaTrabajos = (trabajoUnidad1+trabajoUnidad2+trabajoUnidad3)/3, notaMediaTotal = (notaUnidad1+notaUnidad2+notaUnidad3+notaMediaTrabajos)/4;
        alumnoAprueba = notaMediaTotal >= 5 && notaMedia >= 4;
        System.out.println("El alumno ha aprobado? "+alumnoAprueba);
        //e)
        notaMediaTotal = notaMedia*0.8+notaMediaTrabajos*0.2;
        alumnoAprueba = notaMediaTotal >= 5 && notaMedia >= 4;
        System.out.println("El alumno ha aprobado? "+alumnoAprueba);
        //f)
        alumnoAprueba = notaMediaTotal >= 5 && notaMedia >= 4 && notaMediaTrabajos <= 4;
        System.out.println("El alumno ha aprobado? "+alumnoAprueba);
    }
}
