import java.util.Scanner;

public class Ejercicio4 {
    // Comprueba que la nota esté entre 0 y 10.
    public static boolean notaCorrecta(int nota) {
        return nota >= 0 && nota <= 10;
    }

    public static void main(String[] args) {
        System.out.print("Introduce una nota: ");
        int nota = new Scanner(System.in).nextInt();

        if (notaCorrecta(nota)) {
            System.out.println("La nota es correcta.");
        } else {
            System.out.println("La nota no es correcta.");
        }
    }
}
