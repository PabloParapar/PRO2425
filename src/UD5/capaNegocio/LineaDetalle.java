package src.UD5.capaNegocio;

public class LineaDetalle {
    private Articulo articuloVendido;
    private Integer cantidad;
    private Double precioUnitario = articuloVendido.getPrecioIva();
    private Double precioTotal = precioUnitario*cantidad;


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

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public Double getPrecioTotal() {
        return precioTotal;
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
