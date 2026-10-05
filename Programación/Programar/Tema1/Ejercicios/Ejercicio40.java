import java.util.*;

public class Ejercicio40 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el número del DNI (sin la letra):");
		int dni = teclado.nextInt();

		if (dni < 0 || dni > 99999999) {
			System.out.println("El número del DNI debe estar entre 0 y 99999999.");
			return;
		}

		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		char letra = letras.charAt(dni % 23);
		System.out.println("La letra del DNI es: " + letra);
	}
}
