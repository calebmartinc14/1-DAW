import java.util.*;
public class Ejercicio30{
	public static void main(String[] args){
		//pedimos dos enteros por pantalla
		System.out.println("Introduzca el primer número entero");
		int numero1 = new Scanner(System.in).nextInt();
		System.out.println("Introduzca el segundo número entero");
		int numero2 = new Scanner(System.in).nextInt();
		
		//ponemos la condicional
		if(numero1 >= numero2){
			System.out.println("El primer número es mayor o igual que el segundo");
		}else{
			System.out.println("El primer número no es mayor o igual que el segundo");
		}
	}
}
