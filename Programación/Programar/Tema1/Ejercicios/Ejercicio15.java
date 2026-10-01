import java.util.*;
public class Ejercicio15{
	public static void main(String[] args){
		//como no van a cambiar valor las definimos como constantes !!
		final double EL_PADRINO = 3.5;
		final double ODISEA_2001 = 2.95;
		final double SUMA_PELICULAS = 6.45;
		System.out.println("Qué cantidad de días desea alquilar las dos películas?");
		int diasAlquiler = new Scanner(System.in).nextInt();
		System.out.println("Qué dinero tienes para alquilar las peliculas?");
		double dineroAlquiler = new Scanner(System.in).nextDouble();
		
		//esta es la logica para dictaminar si es suficiente o no
		double totalAlquiler = SUMA_PELICULAS * diasAlquiler;
		boolean dineroSuficiente = dineroAlquiler >= totalAlquiler;
		
		System.out.println("¿Es tu dinero de alquiler suficiente?: " + dineroSuficiente);
		
	}
}