package src.UD5.capaNegocio;

public class LineaDetalle {
    private Articulo articuloVendido;
    private Integer cantidad;
    private double precioUnitario;
    private double precioTotal;


    public LineaDetalle(Articulo articuloVendido, Integer cantidad) {
        this.articuloVendido = articuloVendido;
        this.cantidad = cantidad;
    }



    public Articulo getArticuloVendido() {
        return articuloVendido;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public double getPrecioUnitario() {
        return articuloVendido.getPrecioIva();
    }

    public double getPrecioTotal() {
        return getPrecioUnitario()*cantidad;
    }

    @Override
    public String toString() {
        return "LineaDetalle{" +
                "articuloVendido=" + articuloVendido +
                ", cantidad=" + cantidad +
                ", precioUnitario=" + precioUnitario +
                ", precioTotal=" + precioTotal +
                '}';
    }
}
