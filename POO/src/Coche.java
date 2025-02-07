public class Coche extends Vehiculo{
    private int numeroPuertas;
    public Coche(){

    }
    public Coche(String marca, String modelo, String matricula, double precio, Motor motor, int numeroPuertas) {
        super(marca, modelo, matricula, precio, motor);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String mostrarInformacion() {
        return "Coche{" +
                "marca='" + super.getMarca() + '\'' +
                ", modelo='" + super.getModelo() + '\'' +
                ", matricula='" + super.getMatricula() + '\'' +
                ", precio=" + super.getPrecio() +
                ", motor=" + super.getMotor() + '\'' +
                ", numero puertas=" + numeroPuertas +
                '}';
    }

}
