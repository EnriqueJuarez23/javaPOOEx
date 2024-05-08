public class SecondsByDay {
// declaracion de las variables, encapsuladas
    private int dias;
    // metodo constructor de la clase con valores
    public SecondsByDay(int dias){
        this.dias=dias;
    }
    // metodos getters & setters
    public int getDias() {
        return dias;
    }
    public void setDias(int dias) {
        this.dias = dias;
    }
    // metodos que realizan operaciones
    private int segundosxDia() {
        return (24*60*60);
    }
    public int calcularSegundos() {
        return this.dias * this.segundosxDia();
    }
    // metodo to String
    @Override
    public String toString() {
        return "La cantidad de segundos por dia que digitalizaste son ---> " + dias + " dias " +  "= " + calcularSegundos() + " segundos";
    }
}