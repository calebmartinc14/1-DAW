import java.util.*;

public class Ejercicio34 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca el primer número entero:");
		int numero1 = teclado.nextInt();
		System.out.println("Introduzca el segundo número entero:");
		int numero2 = teclado.nextInt();
		System.out.println("Introduzca el tercer número entero:");
		int numero3 = teclado.nextInt();

		// a) Solución con un solo bloque if-else
		int mayorA;
		if (numero1 >= numero2 && numero1 >= numero3) {
			mayorA = numero1;
		} else {
			mayorA = Math.max(numero2, numero3);
		}
		System.out.println("Mayor (un solo if-else): " + mayorA);

		// b) Solución con bloques if-else anidados
		int mayorB;
		if (numero1 >= numero2) {
			if (numero1 >= numero3) {
				mayorB = numero1;
			} else {
				mayorB = numero3;
			}
		} else {
			if (numero2 >= numero3) {
				mayorB = numero2;
			} else {
				mayorB = numero3;
			}
		}
		System.out.println("Mayor (if-else anidado): " + mayorB);
	}
}
