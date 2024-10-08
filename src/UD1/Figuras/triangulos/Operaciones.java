package src.UD1.Figuras.triangulos;

public class Operaciones {
    public static void main(String[] args) {
    /*Este programa calcula:
        - el área de un triángulo dada una base y una altura.
        - el perímetro de un triángulo dada la medida de los tres lados.
     */
        System.out.println("\n\tEjercicio 40 \n");
        int baseTriangulo = 10, alturaTriangulo = 12; //Estas son las variables necesarias para calcular el área del triángulo
        int ladoTriangulo1 = 10, ladoTriangulo2 = 12, ladoTriangulo3 = 12; // Estas son las variables necesarias para calcular el perímetro del triángulo
        int areaTriangulo = baseTriangulo*alturaTriangulo/2; //Cálculo del área del triángulo
        int perimetroTriangulo =ladoTriangulo1+ladoTriangulo2+ladoTriangulo3; //Cálculo del perímetro del triángulo
        System.out.println("Área del triángulo: (Base * Altura /2)\n\tBase = "+baseTriangulo+"\n\tAltura = "+alturaTriangulo+"\n\n\tÁrea = "+areaTriangulo+"\n\nPerímetro del tríangulo: (lado1 + lado2 + lado3)\n\tLado 1 = "+ladoTriangulo1+"\n\tLado 2 = "+ladoTriangulo2+"\n\tLado 3 = "+ladoTriangulo3+"\n\n\tPerímetro = "+perimetroTriangulo);
    }
}
