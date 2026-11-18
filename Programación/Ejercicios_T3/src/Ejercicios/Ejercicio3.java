package Ejercicios;
import bpc.daw.mario.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        Cañon cañon1 = new Cañon(100,100);
        Cañon cañon2 = new Cañon(100, 300);
        cañon1.disparar(1000,100);
        cañon1.disparar(1000, 250);
        cañon2.disparar(1000,300);
        cañon2.disparar(1000,400);
        cañon2.disparar(1000, 600);
        int disparos = cañon1.getTotalDisparosRealizados();
        int disparos2 = cañon2.getTotalDisparosRealizados();

        System.out.println("El total de disparos del cañon 1 es: " + disparos);
        System.out.println("El total de disparos del cañon 2 es: " + disparos2);
    }


}
