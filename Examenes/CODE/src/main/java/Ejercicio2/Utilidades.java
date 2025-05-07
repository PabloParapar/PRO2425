package Ejercicio2;

public class Utilidades {

    public static String formatearNombre(String nombre) {
        String nombreNuevo = "";
        String nombreViejo = nombre;

        nombre.trim().replace("  ", " ");
        for (int i = 0; i < nombre.length(); i++) {
            if (i == 0){
                nombreNuevo += nombre.substring(0, 1).toUpperCase();
                nombreViejo = nombre.substring(1);
            }
            if (Character.isWhitespace(nombre.charAt(i))) {
                nombreNuevo += nombreViejo.substring(0, i).toLowerCase();
                nombreViejo = nombreViejo.substring(i);
                nombreNuevo += nombreViejo.substring(0,1).toUpperCase();
                nombreViejo = nombreViejo.substring(1);
            }
        }
        nombreNuevo+=nombreViejo.toLowerCase();

        return nombreNuevo;
    }
}
