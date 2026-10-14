import java.util.*;

public class Ejercicio2 {
    public static int mayor(int num1, int num2) {
       return (num1>num2)? num1:num2;
    }
    public static void main(String[] args) {
        System.out.println("Introduzca el primer número:");
        int num1 = new Scanner(System.in).nextInt();

        System.out.println("Introduzca el segundo número:");
        int num2 = new Scanner(System.in).nextInt();

        System.out.println("El mayor es: " + mayor(num1, num2));
    }
}