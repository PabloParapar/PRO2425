package src.ud3.Ejercicios.ClasesEnvoltorio;

import java.util.Scanner;

public class Ejercicio46 {
    public static void ejercicio46(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 46\n" + ":");
        entrada.nextLine();
        String cadena = entrada.nextLine();
        //verificarCuentaBancaria(formatearNombre(cadena));
    }

    public static void verificarCuentaBancaria(String texto) {
        String codigoBanco = (texto.substring(0, 4));
        String codigoEntidad = (texto.substring(5, 9));
        String digitosControl = (texto.substring(10, 12));
        String numeroCuenta = texto.substring(13);
        System.out.println(texto + "\n" + codigoBanco + codigoEntidad + digitosControl + numeroCuenta);
        int aa = Integer.valueOf(codigoBanco.charAt(0)) * 4;
        int ab = Integer.valueOf(codigoBanco.charAt(1)) * 8;
        int ac = Integer.valueOf(codigoBanco.charAt(2)) * 5;
        int ad = Integer.valueOf(codigoBanco.charAt(3)) * 10;
        int ae = Integer.valueOf(codigoEntidad.charAt(0)) * 9;
        int af = Integer.valueOf(codigoEntidad.charAt(1)) * 7;
        int ag = Integer.valueOf(codigoEntidad.charAt(2)) * 3;
        int ah = Integer.valueOf(codigoEntidad.charAt(3)) * 6;
        Integer primerDigitoControl = 11 - ((aa + ab + ac + ad + ae + af + ag + ah) % 11);
        if (primerDigitoControl == 11) {
            primerDigitoControl = 0;
        } else if (primerDigitoControl == 10) {
            primerDigitoControl = 1;
        }
        System.out.println("primerDigitoControl = " + primerDigitoControl);
        System.out.println("digitosControl = " + digitosControl);
    }
}