package src.ud5.capaNegocio;

/**
 * @author lopparpab
 */
public class NoPerecedero extends Articulo{
    private static int id;
    private double precioSinIVA;
    private double precioConIVA;
    private int stock;

    public NoPerecedero(String descripcion, double precio, Integer iva) {
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String imprimir() {
        return super.imprimir()+", Artículo No Perecedero";
    }


}
