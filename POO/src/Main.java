public class Main {
    public static void main(String[] args) {
        Concesionario concesionario;
        Empleado gerente;
        Coche coche;
        Moto moto;
        Propietario propietario;
        gerente = new Empleado("Marcos", "12345678C", "123123123", "Gerente");
        concesionario = new Concesionario("Nombre S.L.", "Calle Falsa", gerente);
        Motor motorCoche = new Motor(120, "Diesel");
        Motor motorMoto = new Motor(140, "Gasolina");
        coche = new Coche("Toyota", "Original", "4332LU", 15000.0, motorCoche , 5);
        moto = new Moto("Honda", "Original", "5468LU", 10000.00, motorMoto, 180);
        propietario = new Propietario("Daniel", "87654321V", "321321321");
        coche.setPropietario(propietario);

        System.out.println(concesionario.mostrarInformacion());
        System.out.println(coche.mostrarInformacion());
        System.out.println(moto.mostrarInformacion());

    }
}