package src.UD5.capaNegocio;

import java.time.LocalDate;

public class Factura {
    private static Integer numeracion = 0;
    private Integer idFactura;
    private Cliente cliente;
    private LocalDate fechaActual;

    public Integer getIdFactura() {
        return idFactura;
    }

    public Factura(Cliente cliente) {
        this.idFactura=numeracion;
        numeracion++;
        this.cliente = cliente;
        fechaActual = LocalDate.now();
    }

    public LocalDate getFechaActual(){
        return fechaActual;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "idFactura=" + idFactura +
                "Cliente=" + cliente +
                '}';
    }
}
