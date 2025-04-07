package src.ud4.coche;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Mapas {
    public static void main(String[] args) {
        HashMap<Marca, List<Modelo>> coches = new HashMap<>();
        /*
        Para tener la información almacenada de una forma más natural para nosotros utilizamos los mapas.
        En este caso práctico usaremos como clave una Marca de coches y en el valor una lista de modelos de esa marca

        En un mapa, al cargar dos veces la misma clave con un valor distinto, sobreescribirá los datos anteriores
         */
        Marca vw = new Marca("VolksWagen");
        Marca seat = new Marca("SEAT");

        Modelo ibiza = new Modelo("Ibiza");
        Modelo polo = new Modelo("Polo");
        Modelo golf = new Modelo("Golf");

        List<Modelo> cochesVW = new ArrayList<>();
        List<Modelo> cochesSeat = new ArrayList<>();
        cochesSeat.add(ibiza);
        cochesVW.add(polo);
        cochesVW.add(golf);
        coches.put(vw, cochesVW);
        coches.put(seat, cochesSeat);

        System.out.println(coches);

        System.out.println(coches.get(seat));
        System.out.println(coches.get(vw));



        System.out.println("");
    }
}
