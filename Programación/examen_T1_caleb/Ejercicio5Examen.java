import java.util.*;
public class Ejercicio5Examen{
	public static void main(String[] args){
		System.out.println("Introduzca su nota media de expediente");
		double notaExpediente = new Scanner(System.in).nextDouble();
		if (notaExpediente>=7 && notaExpediente <9){
			int puntuacion /*habia que usar =+ */= 1;
			System.out.println("Ha sumado a la puntuacion final " + puntuacion);
		}else if(notaExpediente>=9 && notaExpediente<10){
			int puntuacion = 1.5;
			System.out.println("Ha sumado a la puntuacion final " + puntuacion);
		}else{
			int puntuacion = 2;
			System.out.println("Ha sumado a la puntuacion final " + puntuacion);
		}
		System.out.println("¿Cual es su número de horas de formación?");
		int horasFormacion = new Scanner(System.in).nextInt()
		
		if(horasFormacion>=20){
			bonusFormacion=0.1
			System.out.println("Ha ganado un 0.1 de bonus de formación");	
		}else{
			
	}
}