package src.UD5.capaNegocio;

public class Perecedero extends Articulo{
    private int id;
    private double precioSinIVA;
    private double precioConIVA;

    public Perecedero(int id,String descripcion, double precio, Integer iva) {
        super(descripcion, precio, iva);
        precioSinIVA = precio;
        precioConIVA = precioSinIVA+(precioSinIVA*iva/100);
        this.id=id;
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
}
