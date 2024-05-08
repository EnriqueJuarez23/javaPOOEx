import java.util.Scanner;
public class MainAreadelCirculo{
    public static void main(String[]args){
        //objeto Scanner para la lectura de entradas
        Scanner obj = new Scanner(System.in);
        int a;
        // inicio del do while, para tener recursividad
        do {
            System.out.println("Elija una opcion");
            System.out.println("1. Area del circulo");
            System.out.println("0. Salir ");
            a = obj.nextInt();
            // sentencia de control que al cumplirse, se ejecutara el programa
            if (a==1){
                System.out.println("Ingresa el radio:");
                double area=obj.nextDouble();
                /*creacion del objeto, referenciando a la variable con el metodo setters 
                dando entender que esta encapsulado*/
                AreadelCirculo figura = new AreadelCirculo();
                figura.setArea(area);
                // impresion de los resultados de los datos obtenido en las entradas
                System.out.println(figura.toString());
                System.out.println("El area es:"+ String.format("%.2f",figura.mostrarArea())+ "cm");
            }
            // cierre de la sentencia de control
        } while (a > 0);
    }
}