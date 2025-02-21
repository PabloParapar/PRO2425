package src.UD3.Ejercicios.Objetos;

import java.awt.*;

public class Ejercicio24 {
    public static void ejercicio24() {

        System.out.println("\n\tBoletin 3 | Ejercicio 24\n" + "Completa el siguiente código:");
        // 1. Crear una instancia de la clase rectángulo.
        Rectangle Rectangulo = new Rectangle(1, 1, 161, 100);
        /* 2. Leer el ancho y alto utilizando campos. Almacenar los resultados
           en variables y mostrarlos. Observar el tipo devuelto para saber de
           qué tipo hay que declarar las variables.*/
        int anchoRectangulo = Rectangulo.width;
        int altoRectangulo = Rectangulo.height;
        System.out.println("altoRectangulo = " + altoRectangulo);
        System.out.println("anchoRectangulo = " + anchoRectangulo);
        // 3. Cambiar el ancho a 25 y el alto a 30 modificando los campos.
        Rectangulo.width = 25;
        Rectangulo.height = 30;
        System.out.println("Ancho = " + Rectangulo.width);
        System.out.println("Alto = " + Rectangulo.height);
        // 4. Mostrar el ancho y alto utilizando métodos.
        System.out.println("Ancho = " + Rectangulo.getWidth());
        System.out.println("Alto = " + Rectangulo.getHeight());
        // 5. Cambiar el ancho y alto a 200, 200 mediante un método y mostrarlo.
        Rectangulo.setSize(200, 200);

        System.out.println("Ancho = " + Rectangulo.getWidth());
        System.out.println("Alto = " + Rectangulo.getHeight());
        /* 6. Cambiar mediante un método la posición a 5,5, el ancho a 50 y el
           alto a 40.*/
        Rectangulo.setBounds(5, 5, 50, 40);
        System.out.println("Coordenada X = " + Rectangulo.getX());
        System.out.println("Coordenada Y = " + Rectangulo.getY());
        System.out.println("Ancho = " + Rectangulo.getWidth());
        System.out.println("Alto = " + Rectangulo.getHeight());
        /* 7. Cambiar mediante un método la posición a 10, 12, el ancho a 100 y
           el alto a 100*/
        Rectangulo.setBounds(10, 12, 100, 100);
        System.out.println("Coordenada X = " + Rectangulo.getX());
        System.out.println("Coordenada Y = " + Rectangulo.getY());
        System.out.println("Ancho = " + Rectangulo.getWidth());
        System.out.println("Alto = " + Rectangulo.getHeight());

    }
}