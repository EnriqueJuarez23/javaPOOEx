public class Estudiante {
    private String nombre;
    private int edad;
    private int promedio;

    // Constructor
    public Estudiante() {
    }

    // Getter y Setter para el nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter para la edad
    public int getedad() {
        return edad;
    }

    public void setedad(int edad) {
        if (edad < 0) {
            System.out.println("Edad inválida. Se asignará 0.");
            this.edad = 0;
        } else {
            this.edad = edad;
        }
    }

    // Getter y Setter para la calificación
    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        if (promedio < 0) {
            System.out.println("Calificación inválida. Se asignará 0.");
            this.promedio = 0;
        } else {
            this.promedio = promedio;
        }
    }

    // Método toString para la impresion de los datos
    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", edad=" + edad + ", promedio=" + promedio + "]";
    }
}