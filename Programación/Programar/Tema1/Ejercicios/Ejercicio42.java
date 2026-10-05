import java.util.*;
public class Ejercicio42{
	public static void main(String[] args){
		//escogemos por ejemplo el año 2024
		int año = 2024;
		//con este booleano ponemos las siguientes condiciones
		boolean esBisiesto = año % 400 == 0 || (año % 4 == 0 && año % 100 != 0);
		
		System.out.println("¿El año " + año + " es bisiesto?: " + esBisiesto);
	}
}
