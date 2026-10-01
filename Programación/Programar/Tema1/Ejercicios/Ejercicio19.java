import java.util.*;
public class Ejercicio19{
	public static void main(String[] args){
		//en el programa se pide calcular con un nuevo camion cuantos viajes se darian segun el nuevo tonelaje
		int capacidadCamion = 3;
		int viajesCamion = 15;
		int cantidadArena = capacidadCamion * viajesCamion;
		
		System.out.println("Introduzca la capacidad del otro camión en toneladas");
		int capacidadOtro = new Scanner(System.in).nextInt();
		
		int viajesCompletos = cantidadArena / capacidadOtro;
		int arenaSobra = cantidadArena % capacidadOtro;
		
		System.out.println("Viajes que caben enteros: " + viajesCompletos);
		System.out.println("Toneladas que quedan sin transportar: " + arenaSobra);
	}
}
