package src.ud1.Invertir.inversiones;

public class Calculo {
    public static void main(String[] args) {
        System.out.println("\n\tEjercicio 41 \n");
        float inversion = 20000f; // Valor inicial de la inversión
        System.out.println("Inversión Inicial = "+inversion+"€");
        inversion += 100; // Asigna a la izquierda el valor de la variable + 100
        System.out.println("\t- 1º año = "+inversion+"€");
        inversion *= 1.07; // Asigna a la izquierda el valor de la variable multiplicado por 1.07; que equivale al 107% del valor de la variable, o a la suma del 7% al valor total
        System.out.println("\t- 2º año = "+inversion+"€");
        inversion -= 50; // Asigna a la izquierda el valor de la variable -50
        System.out.println("\t- 3º año = "+inversion+"€");
        inversion *= 1.02; // Asigna a la izquierda el valor de la variable multiplicado por 1.02, lo que equivale al incremento del 2% del valor total.
        System.out.println("\t- 4º año = "+inversion+"€");

    }
}
