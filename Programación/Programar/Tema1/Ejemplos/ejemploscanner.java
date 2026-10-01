import java.util.*;	
public class ejemploscanner{
	public static void main(String[] args){
		System.out.println("Introduzca su edad");
		int edad = new Scanner(System.in).nextInt();
		System.out.println("Querido usuario, tienes " + edad + " años");		
	}
}