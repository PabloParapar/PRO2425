package src.UD2;

public class Teoria2 {
    public static void main(String[] args) {
        // 07 de Octubre de 2024
        boolean verdadero = true;
        boolean falso = false;

        System.out.println(true);
        System.out.println(!true);
        System.out.println(false && false);
        System.out.println(!false);

        /*Miércoles 09 de Octubre de 2024

        ESTRUCTURAS CONDICIONALES | Sentencia if y switch-case

        Una secuencia if permite ejecutar código dada una condición
        */
        System.out.println("Buenas");
        int edad = 5;
        if(edad >= 18){
            System.out.println("Puede beber");

        }
        System.out.println("Adios\n");

        /*Si la secuencia if tiene solo una línea se podría poner sin llaves, para nosotros va a ser necesario.
          Java no distingue la indentación como una estructura funcional de código.

          Si un número es par imprime "Par", y si número es impar imprime "Impar"
        */
        int numero;
        numero = 2;
        if(numero%2 == 0) {
            System.out.println(numero+" es Par");
        }
        numero = 3;
        if(numero%2 == 0) {
            System.out.println(numero+" es Par");
        }
        if(!(numero%2 == 0)) {
            System.out.println(numero+" es Impar");
        }
        numero = 2;
        if(!(numero%2 == 0)) {
            System.out.println(numero+" es Impar");
        }

        /*
        Sentencia if-else

        Si la condición es cierta se ejecuta un bloque de sentencias, si es falsa se ejecuta otro bloque de sentencias.

        Un diagrama sobre if-else puede caer en el examen
         */
        System.out.println("Buenas");
        edad = 6;
        if(edad >= 18){
            System.out.println("Puede beber");
        } else {
            System.out.println("No puede beber");
        }
        System.out.println("Adios\n");

        edad = 15;

        if (edad >= 18) {
            System.out.println("Es mayor de edad, su edad es "+edad);
        } else {
            System.out.println("Es menor de edad, su edad es " + edad);
        }
        edad = 25;
        if (edad >= 18) {
            System.out.println("Es mayor de edad, su edad es "+edad);
        } else {
            System.out.println("Es menor de edad, su edad es " + edad);
        }
    }
}
