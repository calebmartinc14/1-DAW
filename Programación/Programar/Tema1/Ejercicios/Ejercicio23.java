import java.util.*;
public class Ejercicio23{
	public static void main(String[] args){
		System.out.println("Introduzca la edad");
		int edad = new Scanner(System.in).nextInt();
		
		boolean menorEdad = edad < 18;
		boolean mayor60 = edad > 60;
		boolean tieneDescuento = menorEdad || mayor60;
		
		System.out.println("¿Tiene descuento?: " + tieneDescuento);
	}
}
