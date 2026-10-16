package ejercicio15;
import java.util.Scanner;
public class ProgramaJuegos {

    public static void mostrarMenu(){
        System.out.println("""
                ¿A qué quieres jugar? Elige una opción:
                1. Adivinar el número secreto.
                2. Resolver una suma.
                3. El ahorcado.
                """);
    }

    public static void main(String[] args) {
        mostrarMenu();
        int opcion = new Scanner(System.in).nextInt();
        if (opcion <1 || opcion >3) {
            System.out.println("Opción incorrecta");
        }

        if (opcion == 1) {
            int num = 0;
            JuegoAdivinarNumero.jugar();
        } else if (opcion == 2) {
            JuegoAcertarSuma.jugar();
        }else{
            JuegoAhorcado.jugar();
        }
    }
}
