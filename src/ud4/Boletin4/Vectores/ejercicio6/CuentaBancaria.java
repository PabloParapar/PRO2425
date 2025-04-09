package src.ud4.Boletin4.Vectores.ejercicio6;

public abstract class CuentaBancaria {
    private String id;
    private int ident = 0;
    private double saldo;

    public CuentaBancaria() {
        this.id = "A"+String.format("%d3",ident);
        this.saldo = 0;
        ident++;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
