import java.util.*;
public class Ejercicio36{
	public static void main(String[] args){
	//se nos pide un programa que por pantalla se introduzca su nota numérica
		
		System.out.println("Bienvenido. Introduzca su nota por pantalla por favor. ");
			double nota = new Scanner(System.in).nextDouble();
		//metemos un leve control de lo que se introduce como datos previamente.
		//ahora comenzamos con la logica general del programa
		if (nota < 0 || nota > 10) {
			System.out.println("La nota debe estar entre 0 y 10");
		} else if (nota < 5) {
			System.out.println("Suspenso");
		} else if (nota < 6) {
			System.out.println("Suficiente");
		} else if (nota < 7) {
			System.out.println("Bien");
		} else if (nota < 9) {
			System.out.println("Notable");
		} else if (nota < 10) {
			System.out.println("Sobresaliente");
		} else {
			System.out.println("Matrícula");
}	
	}
}