package src.ud4.Boletin4.EstructurasDeDatosDeTipoColeccion;

import java.util.HashSet;

public class Ejercicio55 {
    public static void main(String[] args) {
        String cadenaADN1 = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        String cadenaADN2 = "AAAAAAAAAAAAA";
        comprobarCadenasRepetidas(cadenaADN1);
        comprobarCadenasRepetidas(cadenaADN2);
    }

    private static void comprobarCadenasRepetidas(String cadenaADN) {
        HashSet<String> listaADN = new HashSet<>();
        System.out.println("\nCadena "+cadenaADN);

        for (int i = 0; i < cadenaADN.length() - 9; i++) {
            String cadena1 = cadenaADN.substring(i, i + 10);
            if (!listaADN.contains(cadena1)) {
                for (int j = i + 1; j < cadenaADN.length() - 9; j++) {
                    String cadena2 = cadenaADN.substring(j, j + 10);
                    if (cadena1.equals(cadena2)) {
                        listaADN.add(cadena1);
                    }
                }
            }
        }
        System.out.println("\nCadenas Repetidas:");
        for (String cadena : listaADN) {
            System.out.println(cadena);
        }
    }
}
