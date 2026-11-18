import java.util.*;
public class Ejercicio1Examen{
	public static void main(String[] args){
	System.out.println("Bienvenido al programa. Introduzca el precio del artículo: ");
	double precioProducto = new Scanner(System.in).nextDouble();
	System.out.println("Introduzca ahora el precio del artículo rebajado. ");
	double precioRebajado = new Scanner(System.in).nextDouble();
	double rebajaPrecio = precioProducto - precioRebajado;
	double porcentajeRebaja = (100*precioRebajado) / precioProducto;
	
	System.out.println("La cantidad de dinero rebajado ha sido de: " + rebajaPrecio);
	System.out.println("El porcentaje aplicado ha sido de: " + porcentajeRebaja);
	
	
	}

}