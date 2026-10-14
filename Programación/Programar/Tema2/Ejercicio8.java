import java.util.Scanner;

public class Ejercicio8 {
    // Muestra un saludo con el nombre recibido.
    public static void saludar(String nombre) {
        System.out.println("¡Bienvenido al curso " + nombre + "!");
    }

    public static void main(String[] args) {
        System.out.print("Introduce tu nombre: ");
        // nextLine() lee el nombre hasta el primer espacio.
        String nombre = new Scanner(System.in).nextLine();
        saludar(nombre);
    }
}
