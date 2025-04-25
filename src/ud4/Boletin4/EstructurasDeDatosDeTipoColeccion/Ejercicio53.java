package src.ud4.Boletin4.EstructurasDeDatosDeTipoColeccion;

import src.ud4.Boletin4.EstructurasDeDatosDeTipoColeccion.Clases53.Radio;

public class Ejercicio53 {
    public static void main(String[] args) {
        Radio radio = new Radio();

        radio.add("Unha foto");
        radio.add("Movendo ferro");
        radio.add("Escándalo no escuro");
        radio.add("Arriscalo todo");
        radio.add("Neste sofá");
        radio.add("Skit A");
        radio.add("Misericordia");
        radio.add("Skit A");
        radio.add("Estou no centro");
        radio.add("La fama");
        radio.add("Lobishome");
        radio.add("Mellor só");
        radio.add("Desafinar");
        radio.add("Skit B");
        radio.add("Chao Chao");

        for (int i = 0; i < 30; i++) {
            radio.play(radio.suggest());
        }

        radio.reset();

        System.out.println(radio.suggest());
    }
}
