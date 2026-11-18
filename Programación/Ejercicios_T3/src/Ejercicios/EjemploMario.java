package Ejercicios;
import bpc.daw.mario.*;

import java.util.Scanner;

public class EjemploMario {
    public static void main(String[] args) {
        Mario m1 = new Mario(100);
        m1.pensar();
        int x = m1.getX();
        int y = m1.getY();
        System.out.println("Coordenadas de Mario: (" + x + "," + y + ")");
        double distancia = m1.getDistanciaOrigen();
    }
}
