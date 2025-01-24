package src.UD5;

import src.UD5.capaNegocio.Articulo;
import src.UD5.capaNegocio.Factura;
import src.UD5.capaNegocio.LineaDetalle;

public class Boletin5 {
    public static void main(String[] args) {
        Factura factura1 = new Factura();
        Factura factura2 = new Factura();

        System.out.println(factura1.getIdFactura());
        System.out.println(factura2.getIdFactura());

        Articulo botella = new Articulo("Botella de Agua 1 Litro", 120.0, 21);
        LineaDetalle linea1 = new LineaDetalle(botella, 50);
        System.out.println(linea1.getArticuloVendido());
        System.out.println(linea1.getCantidad());
        System.out.println(linea1.getPrecioTotal());
    }
}
