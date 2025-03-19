package src.ud3.ejercicios.objetos;

import java.awt.*;

public class Ejercicio24 {
    private Ejercicio24() {
    }

    public static void ejercicio24() {

        System.out.println("""
            Boletin 3 | Ejercicio 24
        Completa el siguiente código:""");
        // 1. Crear una instancia de la clase rectángulo.
        Rectangle rectangulo = new Rectangle(1, 1, 161, 100);
        /* 2. Leer el ancho y alto utilizando campos. Almacenar los resultados
           en variables y mostrarlos. Observar el tipo devuelto para saber de
           qué tipo hay que declarar las variables.*/
        int anchoRectangulo = rectangulo.width;
        int altoRectangulo = rectangulo.height;
        System.out.println("altoRectangulo = " + altoRectangulo);
        System.out.println("anchoRectangulo = " + anchoRectangulo);
        // 3. Cambiar el ancho a 25 y el alto a 30 modificando los campos.
        rectangulo.width = 25;
        rectangulo.height = 30;
        System.out.println("Ancho = " + rectangulo.width);
        System.out.println("Alto = " + rectangulo.height);
        // 4. Mostrar el ancho y alto utilizando métodos.
        System.out.println("Ancho = " + rectangulo.getWidth());
        System.out.println("Alto = " + rectangulo.getHeight());
        // 5. Cambiar el ancho y alto a 200, 200 mediante un mét0do y mostrarlo.
        rectangulo.setSize(200, 200);

        System.out.println("Ancho = " + rectangulo.getWidth());
        System.out.println("Alto = " + rectangulo.getHeight());
        /* 6. Cambiar mediante un mét0do la posición a 5,5, el ancho a 50 y el
           alto a 40.*/
        rectangulo.setBounds(5, 5, 50, 40);
        System.out.println("Coordenada X = " + rectangulo.getX());
        System.out.println("Coordenada Y = " + rectangulo.getY());
        System.out.println("Ancho = " + rectangulo.getWidth());
        System.out.println("Alto = " + rectangulo.getHeight());
        /* 7. Cambiar mediante un mét0do la posición a 10, 12, el ancho a 100 y
           el alto a 100*/
        rectangulo.setBounds(10, 12, 100, 100);
        System.out.println("Coordenada X = " + rectangulo.getX());
        System.out.println("Coordenada Y = " + rectangulo.getY());
        System.out.println("Ancho = " + rectangulo.getWidth());
        System.out.println("Alto = " + rectangulo.getHeight());

    }
}