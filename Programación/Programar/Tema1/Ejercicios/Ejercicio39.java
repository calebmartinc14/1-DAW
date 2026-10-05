import java.util.*;

public class Ejercicio39 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca el precio del artículo:");
		double precio = teclado.nextDouble();
		if (precio < 0) {
			System.out.println("El precio no puede ser negativo.");
			return;
		}

		System.out.println("¿Cómo va a pagar? (efectivo, tarjeta o Bizum):");
		teclado.nextLine(); // Consumimos el salto de línea pendiente
		String metodo = teclado.nextLine().trim().toLowerCase();

		if (metodo.equals("tarjeta")) {
			System.out.println("Introduzca su PIN:");
			String pin = teclado.nextLine();
			System.out.println("Pago con tarjeta realizado. Cantidad cobrada: " + precio + " €");
		} else if (metodo.equals("bizum")) {
			System.out.println("Introduzca su número de teléfono:");
			String telefono = teclado.nextLine();
			System.out.println("Bizum enviado al número " + telefono + ". Cantidad cobrada: " + precio + " €");
		} else if (metodo.equals("efectivo")) {
			System.out.println("¿Cuánto dinero entrega?");
			double entregado = teclado.nextDouble();
			if (entregado == precio) {
				System.out.println("Ha pagado el precio exacto.");
			} else if (entregado > precio) {
				System.out.printf("Su cambio es: %.2f €%n", entregado - precio);
			} else {
				System.out.printf("Le falta por pagar: %.2f €%n", precio - entregado);
			}
		} else {
			System.out.println("Método de pago no válido.");
		}
	}
}
