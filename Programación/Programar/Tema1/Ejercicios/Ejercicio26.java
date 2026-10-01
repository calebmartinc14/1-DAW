import java.util.*;
public class Ejercicio26{
	public static void main(String[] args){
		//definimos constantes de las horas de las asignaturas
		final int HORAS_LENGUAJES = 128;
		final int HORAS_REDES = 192;
		final int HORAS_HARDWARE = 96;
		
		//calculamos el maximo de faltas posibles por asignatura
		double maxFaltasLenguajes = HORAS_LENGUAJES * 20.0 / 100;
		double maxFaltasRedes = HORAS_REDES * 20.0 / 100;
		double maxFaltasHardware = HORAS_HARDWARE * 20.0 / 100;
		
		//escribimos por pantalla
		System.out.println("a) Faltas máximas permitidas:");
		System.out.println("Lenguajes de marcas: " + maxFaltasLenguajes);
		System.out.println("Redes: " + maxFaltasRedes);
		System.out.println("Hardware: " + maxFaltasHardware);
		
		//pedimos los datos de cuantas faltas tiene x alumno en Redes
		System.out.println("b) Introduzca el número de faltas del alumno en Redes");
		int faltasRedes = new Scanner(System.in).nextInt();
		boolean haSuperado = faltasRedes > maxFaltasRedes;
		System.out.println("¿Ha superado las faltas permitidas en Redes?: " + haSuperado);
	}
}
