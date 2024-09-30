package UD1.src.ud1;

import java.util.Arrays;

public class Ejercicio18 {
    public static void main(String[] args){
        System.out.println("Ejercicio 18 \n");
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

    }
}
