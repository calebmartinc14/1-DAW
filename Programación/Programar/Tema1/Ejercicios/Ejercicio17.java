import java.util.*;
public class Ejercicio17{
	public static void main(String[] args){
		final int EUROS_HORA = 7;
		final int SEMANAS_MES = 4;
		
		int horasAlumno1 = 2 * SEMANAS_MES;
		int horasAlumno2 = 3 * SEMANAS_MES;
		int horasTotales = horasAlumno1 + horasAlumno2;
		int gananciaMes = horasTotales * EUROS_HORA;
		
		System.out.println("a) En un mes ganará: " + gananciaMes + " euros");
		
		double horasPara900 = 900.0 / EUROS_HORA;
		System.out.println("b) Debe dar " + horasPara900 + " horas al mes para ganar 900 euros");
	}
}
