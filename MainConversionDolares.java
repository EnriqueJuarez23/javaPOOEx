import java.util.Scanner;
public class MainConversionDolares{
    public static void main(String[] args) {
        // creacion  del obnjeto Scanner
        Scanner obj = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de pesos que quieres convertir por dolares");
        double pesos=obj.nextDouble();
        // creacion del objeto con el nombre de la clase
        ConversionDolares dinero = new ConversionDolares();
        dinero.setPesos(pesos);
        dinero.setDolares(16.90);
        //impresion de los datos obtenidos
        System.out.println(dinero.toString());
        System.out.println(pesos+ " pesos  " + String.format("%.2f", dinero.mostrarCambio()) + " dolares");
    }
}