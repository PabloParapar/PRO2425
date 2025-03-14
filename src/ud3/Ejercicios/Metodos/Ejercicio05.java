package src.ud3.Ejercicios.Metodos;

import java.util.Scanner;

public class Ejercicio05{
    public static void resolverEjercicio(Scanner entrada) {
        String texto = entrada.next();
        String textoMinus = texto.toLowerCase();
        int longitudTexto = texto.length();
        int contadorA = 0;
        int contadorE = 0;
        int contadorI = 0;
        int contadorO = 0;
        int contadorU = 0;
        for (int i = 0; i <= longitudTexto - 1; i++) {
            if (Ejercicio04.esVocal(String.valueOf(textoMinus.charAt(i)))) {
                switch (textoMinus.charAt(i)) {
                    case 'a':
                        contadorA++;
                        break;
                    case 'e':
                        contadorE++;
                        break;
                    case 'i':
                        contadorI++;
                        break;
                    case 'o':
                        contadorO++;
                        break;
                    case 'u':
                        contadorU++;
                        break;
                    default:
                }
            }
        }
        float porcentajeA = (float) contadorA / longitudTexto * 100;
        float porcentajeE = (float) contadorE / longitudTexto * 100;
        float porcentajeI = (float) contadorI / longitudTexto * 100;
        float porcentajeO = (float) contadorO / longitudTexto * 100;
        float porcentajeU = (float) contadorU / longitudTexto * 100;
        System.out.println("\nCantidad A:\t" + contadorA + "\t|\tPorcentaje A:\t" + porcentajeA +
                "\nCantidad E:\t" + contadorE + "\t|\tPorcentaje E:\t" + porcentajeE +
                "\nCantidad I:\t" + contadorI + "\t|\tPorcentaje I:\t" + porcentajeI +
                "\nCantidad O:\t" + contadorO + "\t|\tPorcentaje O:\t" + porcentajeO +
                "\nCantidad U:\t" + contadorU + "\t|\tPorcentaje U:\t" + porcentajeU);
    }
}