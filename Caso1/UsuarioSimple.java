import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        // Solicita y guarda el nombre
        System.out.print("Ingrese su Nombre: ");
        String nombre = sc.nextLine();

        // Solicita y guarda el apellido
        System.out.print("Ingrese su Apellido: ");
        String apellido = sc.nextLine();

        // Muestra el resultado
        System.out.println("Hola, " + nombre + " " + apellido);

        sc.close();
    }
}
