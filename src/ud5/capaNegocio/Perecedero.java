package src.ud5.capaNegocio;

public class Perecedero extends Articulo{
    private static int id = 0;
    private double precioSinIVA;
    private double precioConIVA;

    public Perecedero(String descripcion, double precio, Integer iva) {
        super(descripcion, precio, iva);
        precioSinIVA = precio;
        precioConIVA = precioSinIVA+(precioSinIVA*iva/100);
        id++;
    }

    public double getPrecioSinIVA() {
        return precioSinIVA;
    }

    public void setPrecioSinIVA(double precioSinIVA) {
        this.precioSinIVA = precioSinIVA;
    }

    public double getPrecioConIVA() {
        return precioConIVA;
    }

    public void setPrecioConIVA(double precioConIVA) {
        this.precioConIVA = precioConIVA;
    }

    @Override
    public String imprimir() {
        return super.imprimir()+", Artículo Perecedero";
    }
}
