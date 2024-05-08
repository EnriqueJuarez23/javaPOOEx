import java.util.Scanner;
public class MainSecondsByDay {

    public static void main(String[] args) {
        // creacion del objeto Scanner
        Scanner obj = new Scanner(System.in);
        System.out.println("Ingresa la cantidad dias");
        int dias=obj.nextInt();
        // creacion del objeto de la clase
        SecondsByDay segs = new SecondsByDay(dias);
        // imprecion de los datos ingresados
        System.out.println(segs.toString());
        System.out.println(segs.calcularSegundos() + " segundos");
    }
}