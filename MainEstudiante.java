import java.util.Scanner;
public class MainEstudiante {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
          // Solicitar al usuario los datos del estudiante
          System.out.println("Ingresa el nombre de un estudiante: ");
          String nombre = obj.nextLine();
  
          System.out.println("Ingresa la edad del estudiante: ");
          int edad = obj.nextInt();
  
          System.out.println("Ingrese la calificación del estudiante: ");
          int promedio = obj.nextInt();
  
          // Crear objeto Estudiante con los datos ingresados
          Estudiante datos = new Estudiante();
          datos.setNombre(nombre);
          datos.setedad(edad);
          datos.setPromedio(promedio);
          System.out.println(datos.toString());
      }
  }