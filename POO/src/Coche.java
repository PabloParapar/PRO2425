public class Coche extends Vehiculo{
    private int numeroPuertas;
    public Coche(){

    }
    public Coche(String marca, String modelo, String matricula, double precio, Motor motor, int numeroPuertas) {
        super(marca, modelo, matricula, precio, motor);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String mostrarInformacion() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", matricula='" + matricula + '\'' +
                ", precio=" + precio +
                ", motor=" + motor + '\'' +
                ", numero puertas=" + numeroPuertas +
                ", propietario=" + propietario +
                '}';
    }

}
