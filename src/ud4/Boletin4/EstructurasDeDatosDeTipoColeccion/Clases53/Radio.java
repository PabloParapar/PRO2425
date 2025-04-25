package src.ud4.Boletin4.EstructurasDeDatosDeTipoColeccion.Clases53;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Radio {
    private HashMap<String, Integer> radio;

    public Radio() {
    this.radio = new HashMap<>();
    }

    public void reset(){
        System.out.println("Reset...");
        this.radio.clear();
    }

    public void add(String cancion){
        if (cancion != null) {
            if (!this.radio.containsKey(cancion)) {
                this.radio.put(cancion, 0);
                System.out.println(cancion+ " añadida a la lista");
            } else {
                System.out.println(cancion+" ya está en la lista");
            }
        }
    }

    public String suggest(){
        String cancion = "";
        List<Map.Entry<String, Integer>> lista = new ArrayList<>(this.radio.entrySet());
        Integer menorReproduccion = null;
        for (Map.Entry<String, Integer> entry : lista) {
            if (menorReproduccion == null) {
                cancion = entry.getKey();
                menorReproduccion = entry.getValue();
            } else if (menorReproduccion > entry.getValue()) {
                menorReproduccion = entry.getValue();
                cancion = entry.getKey();
            }
        }
        return cancion;
    }

    public void play(String cancion){
        if (!this.radio.containsKey(cancion)){
            System.out.println("No tenemos esa canción, la añadimos a la lista");
            this.radio.put(cancion, 0);
        } else {
            System.out.println("Reproduciendo "+cancion+"...");
            this.radio.put(cancion, this.radio.get(cancion) + 1);
        }
    }
}
