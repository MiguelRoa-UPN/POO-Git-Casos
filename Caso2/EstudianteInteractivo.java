import java.util.Scanner; 

class Estudiante {
    private String nombre; 
    private String apellido; 
    private int edad;     
    // Constructor para inicializar atributos
    public Estudiante(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    // Métodos para obtener los datos
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public int getEdad() { return edad; }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Nombre: ");
        String nombre = sc.nextLine(); // Leer nombre

        System.out.print("Apellido: ");
        String apellido = sc.nextLine(); // Leer nombre
        
        System.out.print("Edad: ");
        int edad = sc.nextInt(); // Leer edad

        Estudiante est = new Estudiante(nombre, apellido, edad); 

        // Mostrar datos del estudiante
        System.out.println("Estudiante: " + est.getNombre() + " " + est.getApellido() + ", Edad: " + est.getEdad());
        
        sc.close();
    }
}
