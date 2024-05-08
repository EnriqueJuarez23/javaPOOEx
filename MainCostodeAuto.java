import java.util.Scanner;
public class MainCostodeAuto {

    public static void main(String[] args) {
        //creacion del objeto Scanner
        Scanner obj = new Scanner(System.in);
        System.out.println("Ingrese el precio del coche:");
        double precio=obj.nextDouble();
        // creacion  del objeto de la clase
        CostodeAuto carro = new CostodeAuto(precio);
        // impresion de los datos ingresados
        System.out.println(carro.toString());
        System.out.println(carro.calcularPrecio());
    }
}