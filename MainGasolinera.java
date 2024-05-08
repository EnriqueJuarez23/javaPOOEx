import java.util.Scanner;
public class MainGasolinera {

    public static void main(String[] args) {
        // creacion del objeto Scanner
        Scanner obj = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de galones:");
        double galones=obj.nextDouble();
        System.out.println("Ingrese el costo por litro:");
        double precioxlt=obj.nextDouble();
        // creacion del objeto de la clase
        Gasolinera combustible = new Gasolinera();
        combustible.setGalones(galones);
        combustible.setPrecioxlt(precioxlt);
        // impresion de los datos obtenidos
        System.out.println(combustible.toString());
        System.out.println(combustible.calcularCosto());
    }
}