package ejercicio15;
import java.util.Scanner;
public class JuegoAdivinarNumero {
    public static boolean probarNumero(int num){
        return num == 53 ? true:false;
    }

    public static void jugar(){
        System.out.println("Introduzca un número entre el 0 y el 100");
        int num = new Scanner(System.in).nextInt();
        if (num == 53){
            System.out.println("Adivinaste el número. Ganaste");
        }else{
            System.out.println("No lo ganaste. Perdiste");
        }
    }
}
