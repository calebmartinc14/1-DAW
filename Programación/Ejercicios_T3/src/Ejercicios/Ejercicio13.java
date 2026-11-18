package Ejercicios;
import java.lang.String;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        System.out.println("Introduzca su nombre por pantalla");
        String nombre = new Scanner(System.in).nextLine();

        String mayuscula = nombre.toUpperCase();
        String minuscula = nombre.toLowerCase();
        int caracteres = nombre.length();

        System.out.println(nombre);
        System.out.println("Tu nombre en mayuscula es: " + mayuscula);
        System.out.println("Tu nombre en minúscula es: " + minuscula);
        System.out.println("Total de carácteres en tu nombre: " + caracteres);
    }
}
