package src.UD1.Circulos.circulo;

public class Calculos {
    public static void main(String[] args) {
        /*
        Este programa calculará:
        - El área del círculo de radio dado
        - El perímetro de la circunferencia de radio dado
         */
        final double PI = 3.1416;
        double radio = 10.5;
        double areaCirculo, perimetroCircunferencia;
        areaCirculo = PI*radio*radio;
        perimetroCircunferencia = 2*PI*radio;
        System.out.println("Perímetro de la circunferencia de radio "+radio+": "+perimetroCircunferencia);
        System.out.println("Área del círculo de radio "+radio+": "+areaCirculo);
        radio -= 5;
        areaCirculo = PI*radio*radio;
        perimetroCircunferencia = 2*PI*radio;

        System.out.println("Perímetro de la circunferencia de radio "+radio+": "+perimetroCircunferencia);
        System.out.println("Área del círculo de radio "+radio+": "+areaCirculo);
    }
}
