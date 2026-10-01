import java.util.*;
public class Ejercicio31{
	public static void main(String[] args){
		//pedimos el numero
		System.out.println("Introduzca un número entero comprendido entre 10 y 56");
		int numero = new Scanner(System.in).nextInt();
		//ponemos la condicional
		if(numero >= 10 && numero <= 56){
			System.out.println("El número es correcto");
		}else{
			System.out.println("El número no es correcto");
		}
	}
}
