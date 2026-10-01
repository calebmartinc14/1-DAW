import java.util.*;
public class Ejercicio17{
	public static void main(String[] args){
		//segun datos de lo que cobra un estudiante se piden calcular varias cosas
		final int EUROS_HORA = 7;
		final int SEMANAS_MES = 4;
		
		//variables para el calculo de cuanto gana al mes
		int horasAlumno1 = 2 * SEMANAS_MES;
		int horasAlumno2 = 3 * SEMANAS_MES;
		int horasTotales = horasAlumno1 + horasAlumno2;
		int gananciaMes = horasTotales * EUROS_HORA;
		
		System.out.println("a) En un mes ganará: " + gananciaMes + " euros");
		
		//¿cuántas horas necesita trabajar para cobrar 900€ al mes?
		double horasPara900 = 900.0 / EUROS_HORA;
		System.out.println("b) Debe dar " + horasPara900 + " horas al mes para ganar 900 euros");
	}
}
