import java.util.*;
public class Ejercicio21{
	public static void main(String[] args){
		System.out.println("Introduzca un número");
		int numero = new Scanner(System.in).nextInt();
		
		boolean esPar = numero % 2 == 0;
		System.out.println("¿El número es par?: " + esPar);
	}
}
