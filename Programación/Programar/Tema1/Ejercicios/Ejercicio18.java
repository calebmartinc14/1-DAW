import java.util.*;
public class Ejercicio18{
	public static void main(String[] args){
		//mismo estudiante de antes ahora cobra sueldo fijo + dinero por alumno
		final int SUELDO_FIJO = 200;
		final int EUROS_POR_ALUMNO = 15;
		int alumnos = 30;
		final int PAGO_ALUMNOS = 100;
		
		int dineroEstudiante = SUELDO_FIJO + EUROS_POR_ALUMNO * alumnos;
		int ingresosAcademia = alumnos * PAGO_ALUMNOS;
		//con esto se calcula cuanto gana la academia
		int dineroAcademia = ingresosAcademia - dineroEstudiante;
		
		System.out.println("a) El estudiante gana: " + dineroEstudiante + " euros");
		System.out.println("b) La academia gana: " + dineroAcademia + " euros");
	}
}
