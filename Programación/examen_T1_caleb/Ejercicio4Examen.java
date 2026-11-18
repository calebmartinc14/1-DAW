import java.util.*;
public class Ejercicio4Examen{
	public static void main(String[] args){
		System.out.println("Bienvenido. Introduzca el primer número. ");
		int numeroA = new Scanner(System.in).nextInt();
		System.out.println("Bienvenido. Introduzca el segundo número. ");
		int numeroB = new Scanner(System.in).nextInt();
		
		if(numeroB == 0){
			System.out.println("No se puede dividir entre 0");
		
		}else{
			System.out.println("¿Quieres sacar decimales? (1= si / 2= no");
			boolean respuestaDecimal = new Scanner(System.in).nextBoolean();
			if (respuestaDecimal = 1){
				double divisionDecimal = A % B;
				System.out.println("La división de A / B da: " + divisionDecimal);	
			}else if(respuestaDecimal = 2){
				double divisionDecimal = A / B;
				double divisionDecimal1 = A % B;
				System.out.println("La división de A / B da: " + divisionDecimal + "y de resto " + divisionDecimal1);
			}else{
				System.out.println("Opción incorrecta ");
			}
		}
	}	
}