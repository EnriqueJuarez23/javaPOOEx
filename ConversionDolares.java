public class ConversionDolares {
    // Declaracion de variables, encapsuladas
    private double pesos, dolares;
    // metodo constructor vacio
    ConversionDolares(){
    }
    // metodos getters & setters
    public double getPesos() {
        return pesos;
    }
    public void setPesos(double pesos) {
        this.pesos = pesos;
    }
    public double getDolares() {
        return dolares;
    }
    public void setDolares(double dolares) {
        this.dolares = dolares;
        
    }
    // metodo que realiza la operacion del programa
    public double mostrarCambio(){
            return this.pesos/this.dolares;
        }
        // metodo to String
    @Override
    public String toString() {
        return "ConversionDolares [Pesos=" + pesos + ", dolares=" + mostrarCambio() + "]";
    }
}