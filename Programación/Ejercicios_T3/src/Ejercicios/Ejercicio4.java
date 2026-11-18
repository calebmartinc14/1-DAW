package Ejercicios;
import bpc.daw.objetos.*;
public class Ejercicio4 {
    public static void main(String[] args) {
        DepositoAgua deposito1 = new DepositoAgua(15, 50);
        deposito1.dibujar();
        int cantidadInicial = deposito1.getCantidadActual();
        int cantidadMaxima =deposito1.getCapacidadMaxima();
        double porcentaje =  (cantidadInicial*100 / cantidadMaxima);
        System.out.println("El depósito está ocupado en un " + porcentaje + "%");
    }
}
