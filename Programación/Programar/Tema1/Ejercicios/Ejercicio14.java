import java.util.*;
public class Ejercicio14{
	public static void main(String[] args){
	
		System.out.println("¿Que temperatura en Cº quieres convertir a Fº? ");
		double gradosCentigrados = new Scanner(System.in).nextDouble();
		
		//fallaba en portatil por version antigua del compilador
		double temperaturaF = gradosCentigrados * (9.0/5.0) + 32;
		System.out.println("Su temperatura traducida a Farenheint es de: " + temperaturaF + "Fº");
	}
}