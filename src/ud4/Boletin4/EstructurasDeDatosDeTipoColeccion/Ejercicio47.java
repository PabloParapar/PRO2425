package src.ud4.Boletin4.EstructurasDeDatosDeTipoColeccion;

import src.ud4.Boletin4.EstructurasDeDatosDeTipoColeccion.Clases47.Medallero;
import src.ud4.Boletin4.EstructurasDeDatosDeTipoColeccion.Clases47.Pais;

public class Ejercicio47 {
    public static void main(String[] args) {
        Medallero medallero = new Medallero();

        medallero.annadirPais(new Pais("Francia", 5, 2, 1));
        medallero.imprimirMedallero();
        medallero.annadirPais(new Pais("España", 3, 4, 6));
        medallero.imprimirMedallero();
        medallero.annadirPais(new Pais("Italia", 5, 1, 3));
        medallero.imprimirMedallero();
        medallero.annadirPais(new Pais("Japón", 2, 5, 4));
        medallero.imprimirMedallero();
        medallero.annadirPais(new Pais("Alemania", 5, 1, 3));
        medallero.imprimirMedallero();

    }
}
