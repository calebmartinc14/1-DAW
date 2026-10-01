import java.util.*;
public class Ejercicio20{
	public static void main(String[] args){
		//ejercicio de introducir 3 notas y hacer la media
		System.out.println("Introduzca la primera nota");
		double nota1 = new Scanner(System.in).nextDouble();
		System.out.println("Introduzca la segunda nota");
		double nota2 = new Scanner(System.in).nextDouble();
		System.out.println("Introduzca la tercera nota");
		double nota3 = new Scanner(System.in).nextDouble();
		
		double media = (nota1 + nota2 + nota3) / 3.0;
		//con un booleano se comprueba la condición de si está aprobado o no.
		boolean aprobado = media >= 5;
		
		System.out.println("La media es: " + media);
		System.out.println("¿Está aprobado?: " + aprobado);
	}
}
