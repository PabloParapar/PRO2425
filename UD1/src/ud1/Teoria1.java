package UD1.src.ud1;

import java.util.Arrays;

public class Teoria1 {
    public static void main(String[] args){
    //25 de Septiembre de 2024 | Operadores

    int i = 0;
    System.out.println(i);
    System.out.println(i);
    System.out.println(i);
    System.out.println(i);
    System.out.println(i);
    System.out.println(--i);

    i = 10;
    i+=1;
    System.out.println(i);

    //Operadores de Manejo de Bits
        /*
        Igual que en Binario trabajamos con dos valores 0 y 1
        En lógica trabajamos con True y False

        Operadores Lógicos

        - AND | Todos tienen que ser TRUE para ser TRUE
            TRUE AND FALSE = FALSE
            TRUE AND TRUE = TRUE
            FALSE AND FALSE = FALSE
            FALSE AND TRUE = FALSE

        - OR | Con tal de que exista un TRUE el resultado será TRUE
            TRUE AND FALSE = TRUE
            TRUE AND TRUE = TRUE
            FALSE AND FALSE = FALSE
            FALSE AND TRUE = TRUE

        - XOR | Un OR negado
            TRUE AND FALSE = TRUE
            TRUE AND TRUE = FALSE
            FALSE AND FALSE = FALSE
            FALSE AND TRUE = TRUE
        - NOT
            TRUE = FALSE
            FALSE = TRUE

            Para facilitarnos la vida podemos utilizar lo que se llama Tabla de Verdad

         TABLA DE VERDAD AND
         A B | AND
         ---------
         0 0 |  0
         0 1 |  0
         1 0 |  0
         1 1 |  1

         TABLA DE VERDAD OR
         A B | AND
         ---------
         0 0 |  0
         0 1 |  1
         1 0 |  1
         1 1 |  1

         TABLA DE VERDAD XOR
         A B | AND
         ---------
         0 0 |  0
         0 1 |  1
         1 0 |  1
         1 1 |  0
         */

        System.out.println(true);
        System.out.println(false);
        System.out.println(true && false); //AND
        System.out.println(true || false); //OR

        //Operadores de desplazamiento de bits
}
}
