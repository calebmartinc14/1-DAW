package Ejercicios;
import bpc.daw.objetos.*;
public class Ejercicio5 {
    public static void main(String[] args) {
        DepositoAgua deposito1 = new DepositoAgua(15, 20);
        DepositoAgua deposito2 = new DepositoAgua(5, 20);
        System.out.println("Primer deposito");
        deposito1.dibujar();
        System.out.println("Segundo deposito");
        deposito2.dibujar();

        deposito1.retirarLitro();
        deposito1.retirarLitro();
        deposito1.retirarLitro();
        deposito1.retirarLitro();
        deposito1.retirarLitro();

        System.out.println("Ahora que hemos quitado del deposito1 5 litros se queda de la siguiente forma: ");
        deposito1.dibujar();

        deposito2.añadirLitro();
        deposito2.añadirLitro();
        deposito2.añadirLitro();
        deposito2.añadirLitro();
        deposito2.añadirLitro();

        System.out.println("Ahora que hemos añadido del deposito1 al deposito2 5 litros el deposito2 queda de la siguiente forma: ");
        deposito2.dibujar();

        System.out.println("Ambos después de la actualización quedan así: ");
        deposito1.dibujar();
        deposito2.dibujar();
    }
}
