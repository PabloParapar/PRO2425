package src.ud4.Boletin4.EstructurasDeDatosDeTipoColeccion.Clases47;

import java.util.Collections;
import java.util.LinkedList;

public class Medallero {
    private LinkedList<Pais> listaPaises;

    public Medallero() {
        this.listaPaises = new LinkedList<>();
    }

    public void annadirPais(Pais pais) {
        listaPaises.add(pais);
        Collections.sort(listaPaises);
    }

    public void imprimirMedallero() {
        Collections.sort(listaPaises);
        System.out.println();
        System.out.println("Posición\tPaís\t\t\tOro\t\tPlata\tBronce");

        int posicion = 1;
        int contador = 1;
        Pais anterior = null;

        for (Pais actual : listaPaises) {
            if (anterior != null) {
                if (actual.getOro() == anterior.getOro() &&
                        actual.getPlata() == anterior.getPlata() &&
                        actual.getBronce() == anterior.getBronce()) {

                } else {
                    posicion = contador;
                }
            }

            System.out.printf("\t%d\t\t%-15s\t%d\t\t%d\t\t%d\n",
                    posicion, actual.getNombrePais(), actual.getOro(), actual.getPlata(), actual.getBronce());

            anterior = actual;
            contador++;
        }
    }
}
