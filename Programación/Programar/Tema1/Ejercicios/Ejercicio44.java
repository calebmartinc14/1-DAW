public class Ejercicio44 {
	public static void main(String[] args) {
		int numero = 12345;
		int numeroPremiado = 19345;

		//mostramos los numeros por pantalla
		System.out.println("Número: " + numero);
		System.out.println("Número premiado: " + numeroPremiado);

		//comparativa si el numero ha sido premiado o no.
		if (numero == numeroPremiado) {
			System.out.println("El número coincide con el número premiado.");
		}else{
			System.out.println("El número no coincide con el número premiado.");
		}
		
		//procedemos a la lógica de sacar cociente y resto de primera cifra y última respectivamente.
		int primeraCifra = numero / 10000;
		int primeraCifraPremiada = numeroPremiado / 10000;
		int ultimaCifra = numero % 10;
		int ultimaCifraPremiada = numeroPremiado % 10;		
		//si se cumple esta condicion entonces el numero tiene reintegro.
		if (primeraCifra == primeraCifraPremiada && ultimaCifra == ultimaCifraPremiada) {
			System.out.println("El número tiene reintegro.");
		}
	}
}
