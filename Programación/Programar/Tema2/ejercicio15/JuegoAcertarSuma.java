package ejercicio15;
import java.util.Scanner;
public class JuegoAcertarSuma {

    public static int sumar(int n1, int n2) {
        return n1 + n2;
    }

    public static void jugar(){
        System.out.println("Introduzca el resultado de la suma 35 + 87");
        int resultadoSuma = new Scanner(System.in).nextInt();
        if (resultadoSuma == 122){
            System.out.println("Ganaste el juego.");
        }else{
            System.out.println("Perdiste. No sumaste bien.");
        }
    }
}
