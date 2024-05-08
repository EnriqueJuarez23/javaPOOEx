public class AreadelCirculo {
    // declaracion de variables, encapsuladas
    private double area;
    private final static double pi=3.1416;
    //metodo constructor vacio
    public AreadelCirculo(){
    }
    // metodos setters & getters
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    // metodo que realiza la operacion
    public double mostrarArea() {
        return pi*Math.pow(this.area,2);
    }
    // metodo to String
    @Override
    public String toString() {
        return "AreadelCirculo [area=" + area + ",pi=" + pi+ "]";
    }
    
}