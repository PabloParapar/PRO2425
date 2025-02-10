package src.UD5;

import src.UD5.capaNegocio.Articulo;
import src.UD5.capaNegocio.Cliente;
import src.UD5.capaNegocio.Factura;
import src.UD5.capaNegocio.LineaDetalle;

public class Boletin5 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Samuel", 23456789);
        Cliente cliente2 = new Cliente("Fátima", 87654321);
        Factura factura1 = new Factura(cliente1);
        Factura factura2 = new Factura(cliente2);

        System.out.println(factura1.getIdFactura());
        System.out.println(factura2.getIdFactura());
        System.out.println(factura1.getCliente());

        Articulo botella = new Articulo("Botella de Agua 1 Litro", 120.0, 21);
        LineaDetalle linea1 = new LineaDetalle(botella, 50);
        System.out.println(linea1.getArticuloVendido());
        System.out.println(linea1.getCantidad());
        System.out.println(linea1.getPrecioTotal());

        Cliente cliente = new Cliente("Salvador", 12345678);
        System.out.println(cliente);

        //3)


    }
}
