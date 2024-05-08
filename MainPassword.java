import java.util.Scanner;
public class MainPassword {

    public static void main(String[] args) {
        // creacion del objeto Scanner para entradas
        Scanner obj = new Scanner(System.in);
        System.out.println("Introduce un tamaño para el arreglo para almacenar las contraseñas");
        int tamaño=obj.nextInt();
        System.out.println("introduzca la longitud de la contraseña:");
        int longitud=obj.nextInt();
        //creaciones de los objetos de la clase en arreglos
        Password listaPassword[] = new Password[tamaño];
        boolean fortalezaPassword[] = new boolean[tamaño];
        // ciclo for para generar contraseñas y evaluaciones
        for(int i=0; i<listaPassword.length; i++){
            // creacion de objeto con la variable del ciclo
            listaPassword[i]= new Password(longitud);
            // impresion de los resultados obtenidos
            fortalezaPassword[i]=listaPassword[i].esFuerte();
            System.out.println(listaPassword[i].getContraseña() + "" +fortalezaPassword[i]);
        }

    }
}