import java.util.*;	
public class ejemplosueldo{
	public static void main(String[] args){
		int sueldoAntonio = 1200;
		int sueldoPedro = 1500;
		System.out.println("El sueldo de Antonio es: " + sueldoAntonio + " euros");
		System.out.println("El sueldo de Pedro es: " + sueldoPedro + " euros");
		
		//igualamos el sueldo de antonio para que sea igual que el sueldo de Pedro
		sueldoAntonio = sueldoPedro;
		System.out.println("El nuevo sueldo de Antonio es: " + sueldoAntonio + " euros");
		System.out.println("El nuevo sueldo de Pedro es: " +sueldoPedro + " euros");
		
		//Se asigna a Pedro un sueldo de 2000
		sueldoPedro = 2000;
		System.out.println("El nuevo sueldo de Antonio es: " + sueldoAntonio + " euros");
		System.out.println("El nuevo sueldo de Pedro es: " +sueldoPedro + " euros");
		
	}
}
