package src.UD5.capaNegocio;

public class Factura {
    private static Integer numeracion = 0;
    private Integer idFactura;

    public Integer getIdFactura() {
        return idFactura;
    }

    public Factura() {
        this.idFactura=numeracion;
        numeracion++;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "idFactura=" + idFactura +
                '}';
    }
}
