import java.util.*;
public class EjemploConcatenarIf{
	public static void main(String[] args){
		double nota = 0;
		double subida = 0;
		System.out.println("Introduzca tu primera nota");
		int nota1 = new Scanner(System.in).nextInt();
		System.out.println("Introduzca su segunda nota");
		int nota2 = new Scanner(System.in).nextInt();
		System.out.println("Introduzca la nota del trabajo");
		int notaTrabajo = new Scanner(System.in).nextInt();
		//nota final
		nota = (nota1+nota2)/2.0;
		System.out.println("La media de tus notas es: " + nota);
		//metemos condicional que delimita el uso del programa si introducen una nota que no esté entre los siguientes valores. Toma de control
		if(notaTrabajo<0 || notaTrabajo>10){
			System.out.println("Error: nota de trabajo incorrecta, solo puede introducir valores entre 0 y 10");
		}else{
		if(notaTrabajo<5){
			subida=0.1;
		}else if(notaTrabajo<7){
			subida=0.25;
		}else if(notaTrabajo<9){
			subida=0.5;
		}else{
			subida=1;
		}
		nota+=subida;
		System.out.println("Tu nota final es: " + nota);
		}
	}
}