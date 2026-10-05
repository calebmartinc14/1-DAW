import java.util.*;

public class Ejercicio41 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("¿Conduce con carnet? (s/n):");
		boolean tieneCarnet = teclado.next().equalsIgnoreCase("s");
		System.out.println("¿Cuántos puntos tiene actualmente?");
		int puntosDisponibles = teclado.nextInt();
		System.out.println("Indique la tasa de alcoholemia en mg/l:");
		double alcohol = teclado.nextDouble();

		System.out.println("Seleccione la infracción cometida:");
		System.out.println("1 - Usar el móvil sujetándolo con la mano (6 puntos, 200 €)");
		System.out.println("2 - No llevar puesto el cinturón (4 puntos, 200 €)");
		System.out.println("3 - Saltarse un semáforo en rojo (4 puntos, 200 €)");
		System.out.println("4 - Circular en sentido contrario (6 puntos, 500 €)");
		System.out.println("5 - Conducción temeraria (6 puntos, 500 €)");
		System.out.println("6 - No respetar las señales de los agentes (4 puntos, 200 €)");
		int infraccion = teclado.nextInt();

		int puntosInfraccion;
		int multaInfraccion;
		if (infraccion == 1 || infraccion == 4 || infraccion == 5) {
			puntosInfraccion = 6;
		} else if (infraccion == 2 || infraccion == 3 || infraccion == 6) {
			puntosInfraccion = 4;
		} else {
			System.out.println("Número de infracción no válido.");
			return;
		}
		if (infraccion == 4 || infraccion == 5) {
			multaInfraccion = 500;
		} else {
			multaInfraccion = 200;
		}

		// Las sanciones por no llevar carnet o por alcohol se suman a la infracción elegida.
		int puntosTotales = tieneCarnet ? puntosInfraccion : 0;
		int multaTotal = multaInfraccion;
		if (!tieneCarnet) {
			multaTotal += 100;
		}
		if (alcohol >= 0.25 && alcohol <= 0.5) {
			puntosTotales += 4;
			multaTotal += 500;
		} else if (alcohol > 0.5) {
			puntosTotales += 6;
			multaTotal += 1000;
		}

		int puntosRetirados = Math.min(Math.max(puntosDisponibles, 0), puntosTotales);
		int puntosRestantes = Math.max(0, puntosDisponibles - puntosRetirados);
		System.out.println("Puntos retirados: " + puntosRetirados);
		System.out.println("Puntos restantes: " + puntosRestantes);
		System.out.println("Multa total: " + multaTotal + " €");
	}
}
