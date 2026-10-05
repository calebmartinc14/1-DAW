public class Ejercicio43 {
	public static void main(String[] args) {
		// Cantidad de ejemplo en euros; los céntimos se ignoran.
		int dinero = 1687;
		int resto = dinero;

		System.out.println("Cantidad: " + dinero + " €");
		resto = mostrarBilletesYMonedas(resto, 500, "billete(s) de 500 €");
		resto = mostrarBilletesYMonedas(resto, 100, "billete(s) de 100 €");
		resto = mostrarBilletesYMonedas(resto, 50, "billete(s) de 50 €");
		resto = mostrarBilletesYMonedas(resto, 20, "billete(s) de 20 €");
		resto = mostrarBilletesYMonedas(resto, 10, "billete(s) de 10 €");
		resto = mostrarBilletesYMonedas(resto, 2, "moneda(s) de 2 €");
		mostrarBilletesYMonedas(resto, 1, "moneda(s) de 1 €");
	}

	private static int mostrarBilletesYMonedas(int resto, int valor, String descripcion) {
		int cantidad = resto / valor;
		System.out.println(cantidad + " " + descripcion);
		return resto % valor;
	}
}
