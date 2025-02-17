public class Motor {
    private Integer potencia;
    private String tipoCombustible;
    //Todo aquello que sea susceptible de ser un enumerado será un enumerado
    public Motor(){

    }

    public Motor(int potencia, String tipoCombustible) {
        this.potencia = potencia;
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "potencia=" + potencia +
                ", tipoCombustible='" + tipoCombustible + '\'' +
                '}';
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
}
