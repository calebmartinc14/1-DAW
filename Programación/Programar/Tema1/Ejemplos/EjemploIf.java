import java.util.*;
public class EjemploIf{
	public static void main(String[] args){
		//añadimos la lectura de datos + variables	
		System.out.println("Introduce el dividendo: ");
		int dividendo = new Scanner(System.in).nextInt();
		System.out.println("Introduce el divisor: ");
		int divisor = new Scanner(System.in).nextInt();
			
		if(divisor==0){
			System.out.println("No se puede dividir por 0");
		}else{
			int division = dividendo / divisor;
			System.out.println("El resultado de la división es: " + division);
		}
	}

}
