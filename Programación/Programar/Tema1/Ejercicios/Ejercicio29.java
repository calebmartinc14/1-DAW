import java.util.*;
public class Ejercicio29{
	public static void main(String[] args){
		System.out.println("Introduzca su edad");
		String edadTexto = new Scanner(System.in).nextLine();
		
		// Convertimos el String que ha escrito el usuario a un numero entero
		int edad = Integer.parseInt(edadTexto);
		
		if(edad >= 18){
			System.out.println("Es mayor de edad");
		}else{
			System.out.println("No es mayor de edad");
		}
	}
}
