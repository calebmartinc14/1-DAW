package Ejercicios;
import bpc.daw.ascensor.*;
import java.util.Scanner;
public class EjemploExcepciones2 {
    public static void main(String[] args) {
        System.out.println("Introduce tu edad");
        String edad = new Scanner(System.in).nextLine();
        if(edad.matches("\\d+")){
            int edadNumerica = Integer.parseInt(edad);
            if (edadNumerica>=18){
                System.out.println("Eres mayor de edad");
            }else{
                System.out.println("Eres menor de edad");
            }
        }else{
            System.out.println("Edad incorrecta. Debe ser un número");
        }
    }
}
