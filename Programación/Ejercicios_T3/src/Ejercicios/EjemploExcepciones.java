package Ejercicios;
import bpc.daw.ascensor.*;
import java.util.Scanner;

public class EjemploExcepciones {
    public static void main(String[] args) {
        Ascensor a = new Ascensor(-1,5,200);
        System.out.println("¿A qué planta desea ir? (-1 a 5)");
        int planta = new Scanner(System.in).nextInt();
        System.out.println("Introduce tu nombre");
        String nombre = new Scanner(System.in).nextLine();
        System.out.println("Introduce tu peso");
        double peso = new Scanner(System.in).nextDouble();
        Persona persona = new Persona(nombre, peso);
        try {
            a.añadir(persona);
            System.out.println("Persona añadida");
            a.mover(planta);
            System.out.println("El ascensor ha llegado a la planta " + planta);
            a.mover(0);
            System.out.println("El ascensor vuelve a la planta 0");
        }catch (PlantaIncorrectaException | PesoMaximoException exc){
            System.out.println(exc.getMessage());
        }
        System.out.println("Fin del programa");
    }
}
