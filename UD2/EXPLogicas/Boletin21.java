package UD2.EXPLogicas;

public class Boletin21 {
    public static void main(String[] args) {
        //EJERCICIO 1
        System.out.println("Boletin 1 | Ejercicio 1\n");
        //a) (true&&true)||false == true
        /*
        1º  Paréntesis
                true||false == true
        2º  Igualdad
                true||false
        3º  Operador lógico Or
                true
         */
        //b) (false||false)&&false==true
        /*
        1º  Paréntesis
                false&&false==true
        2º  Igualdad // Por cortocircuito terminaría de evaluar aquí como false
                false&&false
        3ª  Operador lógico And
                false
         */
        //c) (!(true&&false))==false
        /*
        1º  Paréntesis
                (!false)==false
        2ª  Paréntesis
                true==false
        3º  Igualdad
                false
         */
        /*d) i = 1, j = 0, k = -1
             i + k <= j - k * 3 && k >= 2*/
        /*
        1º  Multiplicaciones, Divisiones y Módulo de izquierda a derecha
                i + k <= j + 3 && k >= 2
        2º  Sumas y Restas de izquierda a derecha
                0 <= j + 3 && k >= 2
                0 <= 3 && k >= 2
        3ª  
         */


    }
}
