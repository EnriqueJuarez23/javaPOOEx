public class AreaTriangulo {
    // Declaracion de variables, encapsuladas
    private int area;
    private int base;
    private int altura;
    private int r=2;
    // metodo constructor vacio
    public AreaTriangulo(){
    }
    // metodos getters & setters
    public int getArea() {
        return area;
    }
    public void setArea(int area) {
        this.area = area;
    }
    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getR() {
        return r;
    }
    public void setR(int r) {
        this.r = r;
    }
        public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    // metodo que realiza la operacion
    public int mostrarAreaTriangulo(){
        return this.area= this.base*this.altura/2;
    }
    // metodo to String
    @Override
    public String toString() {
        return "El Area de un Triangulo [base= " +base+ " altura= " +altura+ " /2" + "]";
    }
    }
