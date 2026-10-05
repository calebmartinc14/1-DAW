import java.util.*;
public class Ejercicio26{
	public static void main(String[] args){
		int horasLenguajes = 128;
		int horasRedes = 192;
		int horasHardware = 96;
		
		double maxFaltasLenguajes = horasLenguajes * 20.0 / 100;
		double maxFaltasRedes = horasRedes * 20.0 / 100;
		double maxFaltasHardware = horasHardware * 20.0 / 100;
		
		System.out.println("a) Faltas máximas permitidas:");
		System.out.println("Lenguajes de marcas: " + maxFaltasLenguajes);
		System.out.println("Redes: " + maxFaltasRedes);
		System.out.println("Hardware: " + maxFaltasHardware);
		
		System.out.println("b) Introduzca el número de faltas del alumno en Redes");
		int faltasRedes = new Scanner(System.in).nextInt();
		boolean haSuperado = faltasRedes > maxFaltasRedes;
		System.out.println("¿Ha superado las faltas permitidas en Redes?: " + haSuperado);
	}
}
