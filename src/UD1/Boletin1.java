package src.UD1;

public class Boletin1 {
    public static void main(String[] args){
        System.out.println("Hola Mundo");
        //EJERCICIO 1
        System.out.println("\n\tBoletín 1 | Ejercicio 1\n");
        System.out.println("\t|\tResuelto como comentario");
        /*
        línea 1  | Es un paquete llamado "math"
        línea 3  | Es un comentario multilínea con la documentación que utiliza javadoc del JDK para generar
                   documentación sobre el proyecto. En este caso aporta información sobre el autor gracias
                   al signo tipográfico @.
        línea 7  | Es una clase pública llamada "Perimetro"
        línea 9  | Es la definición del método estático main, el punto de inicio de la aplicación.
        línea 10 | Declaración e inicialización de un dato primitivo, un numeral real en coma flotante de 8 bytes
                   de longitud. Es una constante porque la declaración viene precedida por la palabra reservada
                   "final" y está escrita en mayúsculas.
        línea 12 | Declaración e inicialización de un dato primitivo, un numeral real en coma flotante de 8 bytes
                   de longitud. Es una variable llamada "radio".
        línea 15 | Comentario multilínea explicando la función del código de la clase Perimetro
        línea 22 | Comentario de una sola línea
         */
        //EJERCICIO 2
        System.out.println("\n\tBoletín 1 | Ejercicio 2\n");
        System.out.println("\t|\tResuelto como comentario");
        /*
        IDENTIFICADOR    |    JUSTIFICACIÓN
        ----------------------------------------------------------------------------------------------------------------
                MARIA   [X]   Un identificador no puede estar escrito en mayúsculas.
                María   [X]   Un identificador no puede tener caracteres especiales como la tilde.
         Salto_mortal   [X]   Un identificador no debería incluir caracteres como el subrayado para
                              separar dos palabras, debe emplearse el estilo de escritura Caml Case.
              "datos"   [X]   Un identificador no debe ir entrecomillado.
         sueldo bruto   [X]   Un identificador no puede ser palabras separadas por espacios.
          saltomortal   [X]   Un identificador debe respetar el estilo de escritura Caml Case.
                 cu_1   [X]   Un identificador debe ser claro y conciso, además no debe separarse mediante subrayados.
                   58   [X]   Un identificador no puede comenzar por un caracter numérico
         salto-mortal   [X]   Un identificador con varias palabras debe seguir el estilo de escritura Caml Case.
                   if   [X]   Un identificador no puede ser una palabra reservada
             _&precio   [X]   Un identificador no puede contener caracteres especiales como el '&'
                  año   [X]   Un identificador no puede contener caracteres diacríticos como la 'ñ'
         */
        //EJERCICIO 3
        System.out.println("\n\tBoletín 1 | Ejercicio 3\n");
        System.out.println("\t|\tResuelto como comentario");
        /*
            a) a = b    /   a = 'b'
            En este caso, la diferencia que habría es que al incluir las comillas simples estamos hablando de
            un literal de carácter, le estamos dando el valor ‘b’ en Unicode a la variable a.
            Al no incluirlas podría tratarse de una variable llamada b (aunque no ideal es que no se llamarse así),
            le estaríamos asignando a la variable "a" el valor de la variable "b".

            b) a = 7    /   a = '7'
            En este caso, la diferencia que habría es que al incluir las comillas simples le asignamos a
            la variable "a" el valor del literal de carácter, el símbolo del código Unicode ‘7’, mientras que sin ellas
            le asignamos el valor numérico 7.
         */

        //EJERCICIO 4
        System.out.println("\n\tBoletín 1 | Ejercicio 4\n");
        char aMinuscula = '\u0061';
        char zMinuscula = '\u007A';
        System.out.println("El código '\\u0061' representa el caracter "+aMinuscula);
        System.out.println("El código '\\u007A' representa el caracter "+zMinuscula);
        System.out.println("El número de caracteres en minúscula son "+(zMinuscula-aMinuscula+1)); //Esto entró en el examen

        //EJERCICIO 5
        System.out.println("\n\tBoletín 1 | Ejercicio 5\n");
        int a5 = 5, b5 = 10, intermediario = 0;
        System.out.println("1º\tDefino las variables \"a\", \"b\" y una tercera variable intermediaria\n\t\ta = "+a5+", b = "+b5+" e intermediario = "+intermediario);
        intermediario = a5;
        System.out.println("2º\tLe asigno el valor de la variable \"a\" a la variable intermediaria\n\t\ta = "+a5+", b = "+b5+" e intermediario = "+intermediario);
        a5 = b5;
        System.out.println("3º\tLe asigno el valor de la variable \"b\" a la variable \"a\"\n\t\ta = "+a5+", b = "+b5+" e intermediario = "+intermediario);
        b5 = intermediario;
        System.out.println("4º\tLe asigno el valor de la variable intermediaria a la variable \"b\"\n\t\ta = "+a5+", b = "+b5+" e intermediario = "+intermediario);

        //vuelvo a probarlo para comprobar que funcione

        intermediario = a5;
        a5 = b5;
        b5 = intermediario;
        System.out.println("5º\tSi repito el proceso las intercambia de nuevo\n\t\ta = "+a5+", b = "+b5+" e intermediario = "+intermediario);

        //EJERCICIO 6
        System.out.println("\n\tBoletín 1 | Ejercicio 6\n");
        char eVariado;
        eVariado = 'e';
        System.out.println("1ª forma de escribir '"+eVariado+"' con el sistema de codificación Unicode.");
        eVariado = 'a'; //Le asigno este valor previamente para comprobar que asignar un valor en octal funciona.
        eVariado = '\145';
        System.out.println("2ª forma de escribir '"+eVariado+"' con el sistema de codificación octal.");
        eVariado = 'a'; //Le asigno este valor previamente para comprobar que asignar un valor en hexadecimal funciona.
        eVariado = '\u0065';
        System.out.println("3ª forma de escribir '"+eVariado+"' con el sistema de codificación hexadecimal.");

        //EJERCICIO 7
        System.out.println("\n\tBoletín 1 | Ejercicio 7\n");
        int i1 = 10;
        int i2 = 3;
        double d1 = 12.5;
        double d2 = 2.0;

        System.out.println("a)  El resultado será "+ i1/i2 +"\n\tal no ser una variable real en coma flotante no incluye decimales\nb)  El resultado será "+ i1%i2 +"\n\tmuestra como entero la parte sobrante de la operación anterior\nc)  El resultado será "+ d1/d2 +"\n\tal ser una variable double incluye la parte decimal sin perder información\nd)  El resultado será "+ d1%d2 +"\n\tal ser una variable double incluye la parte decimal sin perder información\ne)  El resultado será "+ d1/i2 +"\n\tal ser una variable double incluye la parte decimal, en este caso pierde información por ser un decimal periódico puro\nf)  El resultado será "+ d1%i2 +"\n\tal ser una variable double incluye la parte decimal con la info que se pierde en la anterior");
        //EJERCICIO 8
        System.out.println("\n\tBoletín 1 | Ejercicio 8\n");
        int q = 2;
        int n = 10;
        System.out.println(q = ++n*3);
        System.out.println("a) Se asigna a q el valor de n incrementado en 1 y multiplicado después por 3");
        System.out.println(q = n++*3);
        System.out.println("b) Se asigna a q el valor de n multiplicado por 3 y después le incrementa 1");

        //EJERCICIO 9
        System.out.println("\n\tBoletín 1 | Ejercicio 9\n");
        //a) -6*7+2*3/4-8
        double operacion1 = -6*7+ (double) (2 * 3) /4-8;
        System.out.println("a) -6*7+2*3/4-8\n\t1º -> Multiplicaciones, Divisiones y Módulos de izquierda a derecha\n\t\t  -6*7+2*3/4-8 = -42+2*3/4-8 = -42+6/4-8 = -42+1.5-8\n\t2º -> Sumas y Restas de izquierda a a derecha\n\t\t  -42+1.5-8 = -40.5-8 = -48.5\n\ta) Según Java = "+operacion1);
        //b) ((3+2)%2-15)/2*5
        System.out.println("\nb) -6*7+2*3/4-8\n\t1º -> Operaciones dentro de paréntesis, suma\n\t\t  ((3+2)%-15)/2*5 = (5%2-15)/2*5\n\t2º -> Operaciones dentro de paréntesis, primero módulo y después resta\n\t\t  (5%2-15)/2*5 = (1-15)/2*5 = -14/2*5\n\t3º -> Multiplicaciones y Divisiones de Izquierda a Derecha\n\t\t  -14/2*5 = -7*5 = -35\n\tb) Según Java = "+(((3+2)%2-15)/2*5));
        //c) 3+6*14%3
        System.out.println("\nc) 3+6*14%3\n\t1º -> Multiplicaciones, Divisiones y Módulos de izquierda a derecha\n\t\t 3+6*14%3 = 3+84%3 = 3+0 = 3\n\tc) Según Java = "+(3 + 6 * 14 % 3));
        //d) 8+7*3+4*6/2%4
        System.out.println("\nd) 8+7*3+4*6/2%4\n\t1º -> Multiplicaciones, Divisiones y Módulos de izquierda a derecha\n\t\t 8+7*3+4*6/2%4 = 8+21+4*6/2%4 = 8+21+24%4 = 8+21+0 = 8+21\n\t2º -> Sumas y Restas de Izquierda a Derecha\n\t\t 8+21 = 29\n\td) Según Java " + (8+7*3+4*6/2%4));
        //EJERCICIO 10
        System.out.println("\n\tBoletín 1 | Ejercicio 10\n");
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
        System.out.println("a)   2 * x + 0.5 + y - 1 / 5 * z\n\t1º -> 2 * 1 + 0.5 + 4 - 1 / 5 * 10\n\t2º -> 2 + 0.5 + 4 - 1 / 5 * 10\n\t3º -> 2 + 0.5 + 4 - 0.2 * 10\n\t4º -> 2 + 0.5 + 4 - 2\n\t5º -> 2.5 + 4 - 2\n\t6º -> 6.5 - 2\n\t7º -> 4.5\t| Según Java = "+(2 * x + 0.5 +y - (double) 1 / 5 * z));
        /* b) 4 / y + PI * x / z
        1º -> 1 + PI * x / z
        2º -> 1 + PI / z
        3º -> 1 + 0.31416
        4º -> 1.31416
         */
        System.out.println("b)   4 / y + PI * x / z\n\t1º -> 4 / 4 + 3.1416 * 1 / 10\n\t2º -> 1 + 3.1416 * 1 / 10\n\t3º -> 1 + 3.1416 / 10\n\t4º -> 1 + 0.31416\n\t5º -> 1.31416\t| Según Java = "+(4 / y + PI * x / z));
        /* c) y - 2 / z + 4 * y / 2
        1º -> y - 0.2 + 16 / 2
        2º -> y - 0.2 + 8
        3º -> 3.8 + 8
        4º -> 11.8
         */
        System.out.println("c)   y - 2 / z + 4 * y / 2\n\t1º -> 4 - 2 / 10 + 4 * 4 / 2\n\t2º -> 4 - 0.2 + 4 * 4 / 2\n\t3º -> 4 -0.2 + 16 / 2\n\t4º -> 4 -0.2 + 8\n\t5º -> 3.8 +8\n\t6º -> 11.8\t| Según Java = "+(y - 2 / z + 4 * y / 2));
        //EJERCICIO 11
        System.out.println("\n\tBoletín 1 | Ejercicio 11\n");
        int ej11 = 50;
        //a)
        System.out.println("Valor inicial = "+ej11);
        ej11 = ej11 << 3;
        System.out.println("Multiplicado por 8 = "+ej11+" | Mediante un desplazamiento de bits a la izquierda");
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
        System.out.println("\n\tBoletín 1 | Ejercicio 12\n");
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
        System.out.println("\n\tBoletín 1 | Ejercicio 13\n");
        miDoble = 9.78d;
        miInt = (int)miDoble;
        System.out.println(miDoble);
        System.out.println(miInt);
/*
        Para que funcione correctamente hay que hacerle casting a la indentificación
        de miInt con el valor de miDoble, donde perderá la información decimal
*/
        //EJERCICIO 14
        System.out.println("\n\tBoletín 1 | Ejercicio 14\n");
        int segundos = 86455;
        int dia = segundos/(24*60*60);
        int hora = (segundos%(24*60*60))/(60*60);
        int minuto = (segundos%(60*60))/60;
        int segundo = segundos%60;
        System.out.println(segundos + " segundos corresponden a: " + dia + " dias, " + hora + " horas, " + minuto + " minutos y " + segundo + " segundos.");
        //EJERCICIO 15
        System.out.println("\n\tBoletín 1 | Ejercicio 15\n");
        int ej15 = 4321;
        int ej15millares = ej15/1000;
        int ej15centenas = (ej15 - ej15millares*1000)/100;
        int ej15decenas = (ej15 - ej15millares*1000 - ej15centenas*100)/10;
        int ej15unidades = ej15 - ej15millares*1000 - ej15centenas*100 - ej15decenas*10;
        System.out.println("El número " + ej15 + " son: \na)\t"+ ej15millares +"\tmillares\nb)\t" + ej15centenas + "\tcentenas\nc)\t" + ej15decenas + "\tdecenas\nd)\t" + ej15unidades + "\tunidades");

        //EJERCICIO 16
        System.out.println("\n\tBoletín 1 | Ejercicio 16\n");
        int contador = 8;
        contador = ++contador - (contador/10)*10;
        System.out.println(contador);
        contador = ++contador - (contador/10)*10;
        System.out.println(contador);
        contador = ++contador - (contador/10)*10;
        System.out.println(contador);
        contador = ++contador - (contador/10)*10;
        System.out.println(contador);

        //Revisalo, igual es más fácil con el módulo

        //EJERCICIO 17
        System.out.println("\n\tBoletín 1 | Ejercicio 17\n");
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
        ej17z += ej17n;
        System.out.println("4º\t"+ ej17z + "->\tse le suma y asigna a z el valor de la variable n");
        //e) ej17q *= ej17z;
        ej17q *= ej17z;
        System.out.println("5º\t"+ ej17q + "->\tse le multiplica y asigna a q el valor de la variable z");
        //f) ej17z += 2;
        ej17z += 2;
        System.out.println("6º\t"+ ej17z + "->\tse le suma y asigna a z el valor 2");



        //EJERCICIO 18
        System.out.println("\n\tBoletín 1 | Ejercicio 18\n");
        /*
        Crea un proyecto Java que declare e inicialice 4 variables de tipo int con cualquier valor y realice los siguientes cálculos
         */
        int primera = 100, segunda = 200, tercera = 300, cuarta = 400;
        //la suma de las cuatro variables
        System.out.println("a)\t" + (primera+segunda+tercera+cuarta));
        //el producto de la primera variable por 100
        System.out.println("b)\t" + (primera*100));
        //La división real de la segunda por 3
        System.out.println("c)\t" + (segunda/3));
        //La parte entera de la división de la tercera variable dividida por la cuarta
        System.out.println("d)\t" + (tercera/cuarta));
        //El resto de la división de la primera entre la segunda variable
        System.out.println("e)\t" + (primera%segunda));
        //EJERCICIO 19
        System.out.println("\n\tBoletín 1 | Ejercicio 19\n");
        System.out.println("\nEjercicio 19\n");
        double primeraD = 100, segundaD = 200, terceraD = 300, cuartaD = 400;
        //la suma de las cuatro variables
        System.out.println("a)\t" + (primeraD+segundaD+terceraD+cuartaD));
        //el producto de la primera variable por 100
        System.out.println("b)\t" + (primeraD*100));
        //La división real de la segunda por 3
        System.out.println("c)\t" + (segundaD/3));
        //La parte entera de la división de la tercera variable dividida por la cuarta
        System.out.println("d)\t" + (terceraD/cuartaD));
        //El resto de la división de la primera entre la segunda variable
        System.out.println("e)\t" + (primeraD%segundaD));
        //EJERCICIO 20
        System.out.println("\n\tBoletín 1 | Ejercicio 20\n");
        //Crea un proyecto que calcule la media real de tres números enteros

        int ej20a = 1, ej20b = 2, ej20c = 3;
        System.out.println("La media real entre " + ej20a + ", "+ej20b+" y "+ej20c +" es "+(double)(ej20a+ej20b+ej20c)/3);

        //EJERCICIO 21
        double ej21a = 1.1, ej21b = 2.2, ej21c = 3.3;
        System.out.println("\n\tBoletín 1 | Ejercicio 21\n");
        System.out.println("La media entre " + ej21a + ", "+ej21b+" y "+ej21c +" es "+(ej21a+ej21b+ej21c)/3);

        //EJERCICIO 22
        System.out.println("\n\tBoletín 1 | Ejercicio 22\n");
        double lado = 0.5;
        double area = lado*lado;
        double perimetro = 4*lado;
        System.out.println("lado = "+lado+" cm\narea = "+area+"cm^2\nperimetro = "+perimetro+" cm");
        //EJERCICIO 23
        System.out.println("\n\tBoletín 1 | Ejercicio 23\n");
        double ingreso = 5000;
        double intereses = 0.06;
        double dineroAnual = ingreso+(ingreso*intereses);
        System.out.println("tras un año tendremos "+ dineroAnual);

        //EJERCICIO 24
        System.out.println("\n\tBoletín 1 | Ejercicio 24\n");
        int casillasLado = 300000;
        long totalCasillas = (long) casillasLado *casillasLado;
        System.out.println("De un tablero de " +casillasLado+ " casillas de lado tendremos un total de "+totalCasillas+ " casillas");

        //EJERCICIO 25
        System.out.println("\n\tBoletín 1 | Ejercicio 25\n");
        int m25 = 1, n25 = 1, p25 = 1, q25 = 1, x25 = 1, y25 = 1, a25 = 2, b25 = 1;
        //a)
        double ej25a = (m25/n25)*(p25+q25);
        System.out.println(ej25a);
        //b)
        double ej25b = m25/n25+1;
        System.out.println(ej25b);
        //c)
        double ej25c = (m25+1)/n25;
        System.out.println(ej25c);
        //d)
        double ej25d = m25 + n25;
        System.out.println(ej25d);
        //e)
        double ej25e = ((x25+y25)*(x25+y25))*(a25-b25);
        System.out.println(ej25e);

        //EJERCICIO 26
        System.out.println("\n\tBoletín 1 | Ejercicio 26\n");
        double pie, pulgada, yarda, centimetro, metro;
        pie = 1;
        pulgada = pie/12;
        yarda = pie*3;
        centimetro = pulgada/2.54;
        metro = 100*centimetro;
        System.out.println(pie + " pies equivalen a:\n\t-\t"+pulgada+" pulgadas.\n\t-\t"+yarda+" yardas.\n\t-\t"+centimetro+" centímetros.\n\t-\t"+metro+" metros.");
        pie = 25;
        pulgada = pie/12;
        yarda = pie*3;
        centimetro = pulgada/2.54;
        metro = 100*centimetro;
        System.out.println(pie + " pies equivalen a:\n\t-\t"+pulgada+" pulgadas.\n\t-\t"+yarda+" yardas.\n\t-\t"+centimetro+" centímetros.\n\t-\t"+metro+" metros.");
        pie = 500;
        pulgada = pie/12;
        yarda = pie*3;
        centimetro = pulgada/2.54;
        metro = 100*centimetro;
        System.out.println(pie + " pies equivalen a:\n\t-\t"+pulgada+" pulgadas.\n\t-\t"+yarda+" yardas.\n\t-\t"+centimetro+" centímetros.\n\t-\t"+metro+" metros.");
        //EJERCICIO 27
        System.out.println("\n\tBoletín 1 | Ejercicio 27\n");
        //final double PI = 3.1416; lo dejo comentado porque ya está la constante PI en el proyecto, pero sería declarado e identificado de esta manera
        double radian, grados;
        radian = 1;
        grados = radian*PI/180;
        System.out.println(radian+" radianes son "+grados+"º");
        radian = 180;
        grados = radian*PI/180;
        System.out.println(radian+" radianes son "+grados+"º");
        //EJERCICIO 28
        System.out.println("\n\tBoletín 1 | Ejercicio 28\n");
        int a28 = 2, b28 = 10, c28 = 2, resultado;

        resultado = -b28 + (b28*b28 - 4*a28*c28)/(2*a28) + b28/a28;
        System.out.println("El resultado es "+resultado);
        //EJERCICIO 29
        System.out.println("\n\tBoletín 1 | Ejercicio 29\n");
        final double G = 6.673e-8;
        double masa1, masa2, distancia, fuerzaG;

        masa1 = 400000; //en gramos
        masa2 = 8000; //en gramos
        distancia = 25; //en centimetros
        fuerzaG = G*masa1*masa2/(distancia*distancia); // en dinas
        System.out.println("Entre dos objetos de "+masa1+" y "+masa2+" gramos,\na una distancia de "+distancia+" centímetros,\nexistirá una fuerza de "+fuerzaG+" dinas");
        //EJERCICIO 30
        System.out.println("\n\tBoletín 1 | Ejercicio 30\n");
        final double C = 2.997925e10; //en metros/segundo
        double masa30 = 50, energia; //en gramos / en ergios
        //según la fórmula del enunciado
        energia = masa30*masa30*masa30*C;
        System.out.println("Un objeto de "+masa30+" gramos se convierte en "+energia+" ergios");
        //EJERCICIO 31
        System.out.println("\n\tBoletín 1 | Ejercicio 31\n");
        int inversion = 10000; //en €
        inversion += inversion/10; //incremento del 10%
        System.out.println("1º año\t=\t"+inversion+"€");
        inversion -= 500; //pérdida de 500
        System.out.println("2º año\t=\t"+inversion+"€");
        inversion += inversion*12/100; //incremento del 12%
        System.out.println("3º año\t=\t"+inversion+"€");
        //EJERCICIO 32
        System.out.println("\n\tBoletín 1 | Ejercicio 32\n");
        int celsius, farenheit;
        float convertirACelsius, convertirAFarenheit;
        farenheit = 86;
        celsius = 33;
        convertirAFarenheit = (float) (celsius * 9) /5+32;
        convertirACelsius = (float) (farenheit - 32) /9*5;
        System.out.println("a)\t"+farenheit+" grados Fahrenheit son "+convertirACelsius+" grados Celsius.");
        System.out.println("b)\t"+celsius+" grados Celsius son "+convertirAFarenheit+" grados Fahrenheit.");
        //EJERCICIO 33
        System.out.println("\n\tBoletín 1 | Ejercicio 33\n");
        float notaEvaluacion1, notaEvaluacion2, notaEvaluacion3, notaMediaEvaluacion, notaExamenFinal, notaTrabajoFinal, notaFinal;
        notaEvaluacion1 = 5;
        notaEvaluacion2 = 7;
        notaEvaluacion3 = 8;
        notaMediaEvaluacion = (notaEvaluacion1+notaEvaluacion2+notaEvaluacion3)/3;
        notaExamenFinal = 8;
        notaTrabajoFinal = 7;
        notaFinal = notaMediaEvaluacion*55/100 + notaExamenFinal*30/100 + notaTrabajoFinal*15/100;
        System.out.println("Nota Final de Programación= "+ (int) notaFinal);
        //EJERCICIO 34
        System.out.println("\n\tBoletín 1 | Ejercicio 34\n");
        int estudiantesMujer = 3, estudiantesHombre = 22, totalEstudiantes = estudiantesHombre+estudiantesMujer;
        float porcentajeMujeres = (float) estudiantesMujer /totalEstudiantes*100;
        float porcentajeHombres = (float) estudiantesHombre /totalEstudiantes*100;
        System.out.println("En este grupo hay un "+porcentajeMujeres+"% de mujeres y un "+porcentajeHombres+"% de hombres.");
        //EJERCICIO 35
        System.out.println("\n\tBoletín 1 | Ejercicio 35\n");
        final double A35 = 20, B35 = -40;
        double x35 = -B35/A35;
        System.out.println(x35);
        //EJERCICIO 36
        System.out.println("\n\tBoletín 1 | Ejercicio 36\n");
        int horaActual= 14, minutoActual= 55, hastaMedianoche, segundosActual;
        segundosActual = horaActual*3600+minutoActual*60;
        hastaMedianoche = 86400 - segundosActual;
        System.out.println("A las "+horaActual+":"+minutoActual+" faltarán "+hastaMedianoche+" segundos hasta la medianoche");
        //EJERCICIO 37
        System.out.println("\n\tBoletín 1 | Ejercicio 37\n");
        int presupuestoAnual = 2000000;
        double presupuestoGinecologia = presupuestoAnual*40/100, presupuestoPediatria = presupuestoAnual*30/100, presupuestoTraumatologia = presupuestoAnual*30/100;
        System.out.println("Siendo el presupuesto anual del hospital "+presupuestoAnual+"€, a cada área le corresponderán:\n\t- Ginecología: "+presupuestoGinecologia+"€\n\t- Pediatría: "+presupuestoPediatria+"€\n\t- Traumatología: "+presupuestoTraumatologia+"€");
        //EJERCICIO 38
        System.out.println("\n\tBoletín 1 | Ejercicio 38\n");
        int precioCompra = 4587, precioVenta = precioCompra*130/100;
        System.out.println("Si de un producto comprado por "+precioCompra+"€ quiere sacar un beneficio de venta del 30% tendrá que venderlo por "+precioVenta+"€");
        //EJERCICIO 39
        System.out.println("\n\tBoletín 1 | Ejercicio 39\n");
        int sueldoFijo = 1134, ventas = 30000,comision = ventas*5/100, dietas = 25*30, seguridadSocial = 150;
        double kilometraje = 25*100*0.19; // 25 días al mes hace 100km de trayecto
        double sueldoBruto = sueldoFijo + comision + dietas + kilometraje, irpf = sueldoBruto*19/100;
        double sueldoLiquido = sueldoBruto-irpf-seguridadSocial;
        System.out.println("Sueldo líquido = "+sueldoLiquido);
        //EJERCICIO 40
        System.out.println("\n\tBoletín 1 | Ejercicio 40\n");
        System.out.println("\t|\t Resuelto en src.UD1.Figuras.triangulos.Operaciones");
        //EJERCICIO 41
        System.out.println("\n\tBoletín 1 | Ejercicio 41\n");
        System.out.println("\t|\t Resuelto en src.UD1.Invertir.inversiones.Calculo");
        //EJERCICIO 42
        System.out.println("\n\tBoletín 1 | Ejercicio 42\n");
        System.out.println("\t|\t Resuelto en src.UD1.Angulos.grados.Grados");
        //EJERCICIO 43
        System.out.println("\n\tBoletín 1 | Ejercicio 43\n");
        System.out.println("\t|\t Resuelto en src.UD1.Circulos.circulo.Calculos");
    }
}
