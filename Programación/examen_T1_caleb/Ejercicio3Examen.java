import java.util.*;
public class Ejercicio3Examen{
	public static void main(String[] args){
		System.out.println("Bienvenido. Introduzca la cantidad de alumnos que participaron en la encuesta. ");
		int numeroAlumnos = new Scanner(System.in).nextInt();
		double porcentajeSatisfecho = 86.5;
		double porcentajeNoResponde = 2.5;
		double porcentajeInsatisfecho = 100 - porcentajeSatisfecho - porcentajeNoResponde;
		
		double alumnoSatisfecho = (numeroAlumnos*porcentajeSatisfecho) / 100;
		System.out.println("La cantidad de los alumnos satisfechos son: " + alumnoSatisfecho);
		double alumnoNoResponde = (numeroAlumnos*porcentajeNoResponde) / 100;
		System.out.println("La cantidad de los alumnos que no responde son: " + alumnoNoResponde);
		double alumnoInsatisfecho = (numeroAlumnos*porcentajeInsatisfecho) / 100;
		System.out.println("La cantidad de los alumnos insatisfechos son: " + alumnoInsatisfecho);
	}	
}