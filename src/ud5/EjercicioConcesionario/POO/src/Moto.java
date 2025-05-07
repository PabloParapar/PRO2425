public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto() {

    }

    public Moto(String marca, String modelo, String matricula, double precio, Motor motor, int cilindrada) {
        super(marca, modelo, matricula, precio, motor);
        this.cilindrada = cilindrada;
    }

/*    @Override
    public String mostrarInformacion() {
        return "Moto{" +
                "marca='" + super.getMarca() + '\'' +
                ", modelo='" + super.getModelo() + '\'' +
                ", matricula='" + super.getMatricula() + '\'' +
                ", precio=" + super.getPrecio() +
                ", motor=" + super.getMotor() + '\'' +
                ", cilindrada="+ cilindrada+
                ", propietario="+ getPropietario()+
                '}';
    }*/


    @Override
    public String mostrarInformacion() {
        return "Moto{" +
                "cilindrada=" + cilindrada +
                "} " + super.mostrarInformacion();
    }


    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
