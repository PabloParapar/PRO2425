package src.ud4.Boletin4.Vectores.ejercicio6;

import java.util.ArrayList;

public class Banco {
    private String identificador;
    private Cliente [] listaClientes;
    private CuentaBancaria [] listaCuentas;

    public Banco() {
    }

    public Banco(String identificador) {
        this.identificador = identificador;
        this.listaClientes = new Cliente[100];
        this.listaCuentas = new CuentaBancaria[500];
    }
}
