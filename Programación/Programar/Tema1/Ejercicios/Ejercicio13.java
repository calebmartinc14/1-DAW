import java.util.*;
public class Ejercicio13{
	public static void main(String[] args){
		//Se pide un programa que al introducir una cantidad de euros muestre su conversión a otra moneda elegida
		//Para ello primero crearemos la variable euros
		double tasa1 = 1.42;
		double tasa2 = 0.8713;
		double tasa3 = 113.86;
		double tasa4 = 166.386;
		System.out.println("¿Qué cantidad de euros quieres convertir?");
		double Euro = new Scanner(System.in).nextDouble();
		
		System.out.println("La traducción de moneda es ");
		System.out.println("En dolar: " + Euro + " euros son" + Euro*tasa1 + " dólares");
		System.out.println("En libras: " + Euro + " euros son" + Euro*tasa2 + " libras");
		System.out.println("En yenes: " + Euro + " euros son" + Euro*tasa3 + " yenes");
		System.out.println("En pesetas: " + Euro + " euros son" + Euro*tasa4 + " pesetas");
	
	
	
	}
}