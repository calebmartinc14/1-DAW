import java.util.*;
public class Ejercicio21{
	public static void main(String[] args){
		System.out.println("Introduzca un número");
		int numero = new Scanner(System.in).nextInt();
		//usando boleano se compara que si el resto de un nº dividido por 2 es = 0
		boolean esPar = numero % 2 == 0;
		System.out.println("¿El número es par?: " + esPar);
	}
}
