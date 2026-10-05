import java.util.*;
public class Ejercicio24{
	public static void main(String[] args){
		System.out.println("¿La persona que llega es adulta? (true/false)");
		boolean esAdulta = new Scanner(System.in).nextBoolean();
		System.out.println("¿Va acompañada? (true/false)");
		boolean acompanada = new Scanner(System.in).nextBoolean();
		
		boolean llegaNinoAcompanado = !esAdulta && acompanada;
		boolean abrirPuerta = esAdulta || llegaNinoAcompanado;
		
		System.out.println("¿Se abre la puerta?: " + abrirPuerta);
	}
}
