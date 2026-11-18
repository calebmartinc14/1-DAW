package Ejercicios;

import java.util.Random;

public class Ejercicio41 {
    public static void main(String[] args) {
        //creamos constructor Random
        Random numRandom = new Random();
        //con numRandom.nextInt damos valor inicial y final de los números al azar.
        int numerosAzar = numRandom.nextInt(29,65);
        System.out.println("El numero al azar generado es: " + numerosAzar);
    }
}
