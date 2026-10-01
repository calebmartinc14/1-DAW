import java.util.*;
public class Ejercicio13{
	public static void main(String[] args){
		//Se pide un programa que al introducir una cantidad de euros muestre su conversión a otra moneda elegida
		//Para ello primero crearemos la variable euros
		final double TASA1 = 1.42;
		//dividiendo entre 100 el valor de las libras respecto a los euros nos muestra lo que vale 1 euro en libras
		final double TASA2 = 0.8713;
		final double TASA3 = 113.86;
		final double TASA4 = 166.386;
		System.out.println("¿Qué cantidad de euros quieres convertir?");
		double Euro = new Scanner(System.in).nextDouble();
		
		System.out.println("La traducción de moneda es ");
		System.out.println("En dolar: " + Euro + " euros son " + Euro*TASA1 + " dólares $");
		System.out.println("En libras: " + Euro + " euros son " + Euro*TASA2 + " libras £");
		System.out.println("En yenes: " + Euro + " euros son " + Euro*TASA3 + " yenes ¥");
		System.out.println("En pesetas: " + Euro + " euros son " + Euro*TASA4 + " pesetas");
	
	}
}