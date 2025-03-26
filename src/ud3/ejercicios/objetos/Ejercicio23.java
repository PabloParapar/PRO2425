package src.ud3.ejercicios.objetos;

import java.awt.*;

/**
 * @author lopparpab
 */
public class Ejercicio23 {
    private Ejercicio23() {
    }

    public static void ejercicio23() {

        System.out.println("""
            Boletin 3 | Ejercicio 23
        Completar el Siguiente Código:""");

        Point puntoOrigen = new Point(23, 94);
        //  Completar: mostrar coordenadas x e y utilizando un campo de la clase
        System.out.println("coordenada X: " + puntoOrigen.x);
        System.out.println("coordenada Y: " + puntoOrigen.y);

        //  Completar: mostrar coordenadas utilizando métodos de dos modos distintos
        System.out.println("coordenada X: " + puntoOrigen.getX());
        System.out.println("coordenada Y: " + puntoOrigen.getY());
        System.out.println("coordenada Y: " + puntoOrigen.getLocation());

        //  Traslada el punto incrementando las coordenadas x e y en 50 unidades cada una
        puntoOrigen.translate(50, 50);
        System.out.println("coordenada X: " + puntoOrigen.x);
        System.out.println("coordenada Y: " + puntoOrigen.y);

        //  ¿Qué hace la siguiente instrucción?
        int coordenadax = new Point(10, 10).x;

        ///  Almacena en la variable coordenadax el valor x de la instancia recién creada

        //  ¿Podría recuperarse la coordenada y del punto anterior?
        //  No se puede recuperar porque almacena la variable almacena solo el valor x de la instancia creada.
    }
}