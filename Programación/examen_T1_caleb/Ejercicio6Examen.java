import java.util.*;
public class Ejercicio6Examen{
	public static void main(String[] args){
		System.out.println("Introduzca el valor de la hora 1");
		int hora = new Scanner(System.in).nextInt();
		System.out.println("Introduzca el valor de los minutos 1");
		int minutos = new Scanner(System.in).nextInt();
		System.out.println("Introduzca el valor de la hora 2");
		int hora2 = new Scanner(System.in).nextInt();
		System.out.println("Introduzca el valor de los minutos 2");
		int minutos2 = new Scanner(System.in).nextInt();
		
		//esto va al reves los signos
		//minutos += hora*60
		//minutos2 += hora2*60
		if((hora <0 && hora > 23 || minutos < 0 && minutos > 59) || (hora2 <0 && hora2 > 23 || minutos2 < 0 && minutos2 > 59)){
			System.out.println("Datos incorrectos. Programa finalizado.");
		}else{
			if(hora>hora2 && minutos>minutos2){
				System.out.println("La primera hora es posterior a la segunda");
				diferenciaHora = hora-hora2;
				diferenciaMinutos = minutos-minutos2;
				System.out.println("La diferencia de horas y minutos es de: " + diferenciaHora + diferenciaMinutos);
			}else if(hora2>hora && minutos2>minutos){
					System.out.println("La segunda hora es posterior a la primera");
					diferenciaHora1 = hora2-hora;
					diferenciaMinutos1 = minutos2-minutos;
					System.out.println("La diferencia de horas y minutos es de: " + diferenciaHora1 + diferenciaMinutos1);
				}
			}else if(hora==hora2 && minutos==minutos2){
				System.out.println("Las dos horas son iguales");	
			}
	}
}
