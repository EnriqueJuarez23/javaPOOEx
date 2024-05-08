public class Gasolinera {
// declaraciones de variables, encapsuladas
    private double galones;
    private double precioxlt;
    private final double conversion_factor=3.78541;
    // metodo constructor vacio, aunque hace referencia a las variables comenzando desde 0
    public Gasolinera(){
        this.galones=0;
        this.precioxlt=0;
    }
    //metodos getters & setters
    public double getGalones() {
        return galones;
    }
    public void setGalones(double galones) {
        this.galones = galones;
    }
    public double getPrecioxlt() {
        return precioxlt;
    }
    public void setPrecioxlt(double precioxlt) {
        this.precioxlt = precioxlt;
    }
    // metodo que realiza el calculo del costo del combustible
    public double calcularCosto() {
        double litros= this.galones*conversion_factor;
        return litros*this.precioxlt;
    }
    // metodo to String
    @Override
    public String toString() {
        return "Gasolinera [galones=" + galones + ", precioxlt=" + precioxlt + ", costo=$" + String.format("%2f",calcularCosto())+"]";
    }
}