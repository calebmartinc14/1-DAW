import java.util.*;
public class Ejercicio32{
	public static void main(String[] args){
		final int NUMERO = 28590;
		System.out.println("Introduzca un número entero");
		int numeroIntroducido = new Scanner(System.in).nextInt();
		
		if(numeroIntroducido != 0 && NUMERO % numeroIntroducido == 0){
			System.out.println(numeroIntroducido + " es un factor de " + NUMERO);
		}else{
			System.out.println(numeroIntroducido + " no es un factor de " + NUMERO);
		}
	}
}
