import java.util.*;
public class Ejercicio2Examen{
	public static void main(String[] args){
		System.out.println("Bienvenido. Introduzca por favor el radio de una esfera.");
		double radioEsfera = new Scanner(System.in).nextDouble();
	
		if(radioEsfera>0){
			radioEsfera = (4/3) * 3.14159 * (radioEsfera*radioEsfera*radioEsfera);
			System.out.println("El volumen del radio calculado es: " + radioEsfera);
		}else{
			System.out.println("El radio debe ser positivo. ");
		}
	}
}