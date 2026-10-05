import java.util.*;
public class Ejercicio25{
	public static void main(String[] args){
		System.out.println("Introduzca el porcentaje de tinta");
		double porcentajeTinta = new Scanner(System.in).nextDouble();
		System.out.println("Introduzca los folios que hay en la impresora");
		int foliosImpresora = new Scanner(System.in).nextInt();
		System.out.println("Introduzca los folios que se desean imprimir");
		int foliosImprimir = new Scanner(System.in).nextInt();
		System.out.println("¿La impresora está encendida? (true/false)");
		boolean impresoraEncendida = new Scanner(System.in).nextBoolean();
		
		boolean tieneTinta = porcentajeTinta > 0;
		boolean hayFolios = foliosImpresora > foliosImprimir;
		boolean sePuedeImprimir = impresoraEncendida && tieneTinta && hayFolios;
		
		System.out.println("¿Se puede imprimir?: " + sePuedeImprimir);
	}
}
