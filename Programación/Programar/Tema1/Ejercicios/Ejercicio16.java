import java.util.*;
public class Ejercicio16{
	public static void main(String[] args){
		//se pide introducir en 3 variables las horas, minutos y segundos para luego calcular el total de S
		System.out.println("Introduzca las horas");
		int horas = new Scanner(System.in).nextInt();
		System.out.println("Introduzca los minutos");
		int minutos = new Scanner(System.in).nextInt();
		System.out.println("Introduzca los segundos");
		int segundos = new Scanner(System.in).nextInt();
		
		int totalSegundos = horas * 3600 + minutos * 60 + segundos;
		System.out.println("El total de segundos es: " + totalSegundos);
	}
}
