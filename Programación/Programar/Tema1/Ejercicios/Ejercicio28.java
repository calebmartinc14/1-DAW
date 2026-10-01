public class Ejercicio28{
	public static void main(String[] args){
		int totalAlumnos = 26;
		
		// Convertimos el porcentaje a numero de alumnos y quitamos los decimales
		int alumnosAprobados = (int)(totalAlumnos * 66.0 / 100);
		int alumnosSuspendidos = (int)(totalAlumnos * 19.5 / 100);
		
		// Los que no se han presentado son los que quedan hasta completar la clase
		int alumnosNoPresentados = totalAlumnos - alumnosAprobados - alumnosSuspendidos;
		
		System.out.println("Alumnos aprobados: " + alumnosAprobados);
		System.out.println("Alumnos suspendidos: " + alumnosSuspendidos);
		System.out.println("Alumnos no presentados: " + alumnosNoPresentados);
	}
}
