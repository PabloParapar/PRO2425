package src.ud5;

import src.ud5.capaNegocio.*;

public class Boletin5 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Samuel", 23456789);
        Cliente cliente2 = new Cliente("Fátima", 87654321);
        Factura factura1 = new Factura(cliente1);
        Factura factura2 = new Factura(cliente2);

        System.out.println(factura1.getIdFactura());
        System.out.println(factura2.getIdFactura());
        System.out.println(factura1.getCliente());

        Perecedero botella = new Perecedero("Botella de Agua 1 Litro", 120.0, 21);
        LineaDetalle linea1 = new LineaDetalle(botella, 50);
        System.out.println(linea1.getArticuloVendido());
        System.out.println(linea1.getCantidad());
        System.out.println(linea1.getPrecioTotal());

        Cliente cliente = new Cliente("Salvador", 12345678);
        System.out.println(cliente);

        //3)

        //7C)
        System.out.println("7 C");
        Proveedor aniceto = new Proveedor("Aniceto", "12345678C", "C/ Calle Falsa 123", 321654987);
        botella.setProveedor(aniceto);
        System.out.println(botella);
        System.out.println(aniceto);
        System.out.println("Proveedor de Botella= "+botella.getProveedor());
        System.out.println("Articulos de Aniceto= "+aniceto.getArticulo());

        // 9)
        System.out.println("\n9\n");
        // a)
        Cliente carmen = new Cliente("Carmen", 12345678);
        System.out.println(carmen);
        Perecedero albahaca = new Perecedero("Manojo de Albahaca fresca", 1, 21);
        NoPerecedero sojaTexturizada = new NoPerecedero("Bolsa 1KG Soja Texturizada", 1.5, 21);
        Factura perecedera = new Factura(carmen);
        Factura noPerecedera = new Factura(carmen);
        LineaDetalle lineaPerecedera = new LineaDetalle(albahaca, 2);
        LineaDetalle lineaNoPerecedera = new LineaDetalle(sojaTexturizada, 1);
        carmen.setFactura(perecedera);
        perecedera.setLineaDetalle(lineaPerecedera);
        System.out.println(carmen);
        carmen.setFactura(noPerecedera);
        noPerecedera.setLineaDetalle(lineaNoPerecedera);
        System.out.println(carmen);

        // b)
        System.out.println("\nb)\n");
        System.out.println(lineaPerecedera.imprimir());

        // c)
        System.out.println("\nc)\n");
        System.out.println(perecedera.imprimir());
        System.out.println(noPerecedera.imprimir());
        // d)
        System.out.println("\nd)\n");
        System.out.println(albahaca.imprimir());
        System.out.println(sojaTexturizada.imprimir());
        // e)
        System.out.println("\ne)\n");
        System.out.println(carmen.getFactura());
        // f)
        System.out.println("\nf)\n");



    }
}
