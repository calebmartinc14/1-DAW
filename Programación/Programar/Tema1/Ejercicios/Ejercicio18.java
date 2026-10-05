import java.util.*;
public class Ejercicio18{
	public static void main(String[] args){
		int sueldoFijo = 200;
		int eurosPorAlumno = 15;
		int alumnos = 30;
		int pagoAlumno = 100;
		
		int dineroEstudiante = sueldoFijo + eurosPorAlumno * alumnos;
		int ingresosAcademia = alumnos * pagoAlumno;
		int dineroAcademia = ingresosAcademia - dineroEstudiante;
		
		System.out.println("a) El estudiante gana: " + dineroEstudiante + " euros");
		System.out.println("b) La academia gana: " + dineroAcademia + " euros");
	}
}
