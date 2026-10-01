import java.util.*;
public class Ejercicio11{
    public static void main(String[] args){
		
		//Primero preguntaremos por pantalla los siguientes datos
		System.out.println("Introduzca su nombre ");
		String nombre = new Scanner(System.in).nextLine();
		
		System.out.println("Introduzca su primer apellido");
		String apellidoPrimer = new Scanner(System.in).nextLine();
		
		System.out.println("Introduzca su segundo apellido");
		String apellidoSegundo = new Scanner(System.in).nextLine();
	
		//Una vez tenemos toda la recolecta de datos procedemos a imprimir por pantalla
		
		System.out.println("La información introducida ha sido: " + apellidoPrimer + " " + apellidoSegundo + " " + nombre);
	}
}