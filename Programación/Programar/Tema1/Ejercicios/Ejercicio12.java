import java.util.*;
public class Ejercicio12{
	public static void main(String [] args){
		//comenzamos a crear el programa pidiendo los datos en pantalla que posteriormente utilizaremos
		System.out.println("¿Cuál es el precio normal del artículo?: ");
		double precioNormal = new Scanner(System.in).nextDouble(); 
		System.out.println("¿Cuál es el porcentaje de rebaja aplicado?: ");
		double porcentajeRebaja = new Scanner(System.in).nextDouble();
		//calculamos el porcentaje de rebaja y precio final
		double descuento = precioNormal * (porcentajeRebaja / 100.0);
		double precioFinal = precioNormal - descuento;
		
		//comenzamos a mostrar todos los datos que ya hemos procesado por pantalla
	
		System.out.println("Precio normal del artículo: " + precioNormal + " euros");
		System.out.println("El porcentaje de rebaja aplicado es: " + porcentajeRebaja + "%");
		System.out.println("El descuento aplicado es de: " + descuento + " euros"); 	
		System.out.println("Precio final del artículo: " + precioFinal + " euros");
	}
}