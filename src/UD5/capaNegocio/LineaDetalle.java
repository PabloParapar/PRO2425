package src.UD5.capaNegocio;

public class LineaDetalle implements Impresion {
    private Articulo articuloVendido;
    private Integer cantidad;
    private double precioUnitario;
    private double precioTotal;


    public LineaDetalle(Articulo articuloVendido, Integer cantidad) {
        this.articuloVendido = articuloVendido;
        this.cantidad = cantidad;
        precioUnitario = getPrecioUnitario();
        precioTotal = getPrecioTotal();
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
        return getPrecioUnitario() * cantidad;
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

    @Override
    public String imprimir() {
        return "LineaDetalle{" +
                "articuloVendido=" + articuloVendido +
                ", cantidad=" + cantidad +
                ", precio con IVA=" + articuloVendido.getPrecioIva() +
                ", precio sin IVA=" + articuloVendido.getPrecio() +
                '}';
    }
}
