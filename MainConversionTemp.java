import java.util.Scanner;
public class MainConversionTemp {
    public static void main(String[] args) {
        // creacion del objeto Scanner
        Scanner obj = new Scanner(System.in);
        System.out.println("Ingrese los grados centigrados a convertir");
        double grados=obj.nextDouble();
        //creacion del objeto de la clase
        ConversionTemp conve = new ConversionTemp();
        conve.setGrados(grados);
        //impresion de los datos obtenidos
        System.out.println(conve.toString());
        System.out.println("Este es la conversion de grados centigrados a fahrenheit");
        System.out.println(+ grados+ " grados centigrados   " + conve.mostrarConversion() + " grados fahrenheit");
    }
} 