public class ConversionTemp {
    // Declaracion de variables, encapsuladas
    private double grados;
    // metodo constructor vacio
    ConversionTemp(){
    }
    // metodos getters & setters
public double getGrados() {
    return grados;
}

public void setGrados(double grados) {
    this.grados = grados;
}
// metodo que realizan operacion
public double mostrarConversion(){
    return this.grados*9/5+32;
}
//metodo to string
@Override
public String toString() {
    return "ConversionTemp [grados=" + grados + "]";
}
}
