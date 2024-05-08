public class CostodeAuto {
    // declaracion de las variables, encapsuladas
private double precio;
private double ganancia=0.12;
private double impuesto=0.06;
// metodo constructor con valores
public CostodeAuto(double precio){
this.precio=precio;
this.ganancia=0.12;
this.impuesto=0.06;
}
// metodos getters & setters
public double getPrecio() {
    return precio;
}
public double getGanancia() {
    return ganancia;
}
public double getImpuesto() {
    return impuesto;
}
// metodo que hace la operacion
public double calcularPrecio(){
    return this.precio - (this.precio * this.ganancia + this.precio * this.impuesto);
}
// metodo to String
@Override
public String toString() {
    return "CostodeAuto [precio=" + precio + ", ganancia=" + this.precio*this.ganancia + ", impuesto=" + this.precio*this.impuesto + "]";
}
}