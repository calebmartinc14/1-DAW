import java.util.*;
public class Ejercicio42{
	public static void main(String[] args){
		//escogemos un año cualquiera
		int año = 2024;
		//ponemos las condiciones para ver si es bisiesto
		boolean esBisiesto = año % 400 == 0 || (año % 4 == 0 && año % 100 != 0);
		
		System.out.println("¿El año " + año + " es bisiesto?: " + esBisiesto);
	}
}
