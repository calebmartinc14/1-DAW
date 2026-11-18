package Ejercicios;
import java.lang.String;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        System.out.println("Introduzca una frase cualquiera");
        String frase = new Scanner(System.in).nextLine();
        int longitud = frase.length();
        int mitad = longitud / 2;
        char letra = frase.charAt(mitad);

        System.out.println("La letra de la mitad es: " + letra);
    }
}

