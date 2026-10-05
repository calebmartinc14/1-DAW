public class Ejercicio45 {
	public static void main(String[] args) {
		//definimos variables
		int dedosPedro = 4;
		int dedosLuis = 5;
		int dedosMiguel = 1;
		int dedosJorge = 0;
		int dedosJuan = 3;
		int dedosManolo = 2;
		int dedosPepe = 3;
		
		//logica del programa
		int totalDedos = dedosPedro + dedosLuis + dedosMiguel + dedosJorge
				+ dedosJuan + dedosManolo + dedosPepe;
		/*con el cociente sabemos las vueltas enteras que se dan en los amigos, si es 18 % 7 por ejemplo sabemos que da 2 vueltas y 
		gracias al resto sabemos que luego cae en el numero 4 puesto que no completa otra vuelta.
		*/
		int posicion = totalDedos % 7;
		
		//Hacemos la comparacion.
		if (posicion == 0) {
			System.out.println("Pepe se pone de portero.");
		} else if (posicion == 1) {
			System.out.println("Pedro se pone de portero.");
		} else if (posicion == 2) {
			System.out.println("Luis se pone de portero.");
		} else if (posicion == 3) {
			System.out.println("Miguel se pone de portero.");
		} else if (posicion == 4) {
			System.out.println("Jorge se pone de portero.");
		} else if (posicion == 5) {
			System.out.println("Juan se pone de portero.");
		} else {
			System.out.println("Manolo se pone de portero.");
		}
	}
}
