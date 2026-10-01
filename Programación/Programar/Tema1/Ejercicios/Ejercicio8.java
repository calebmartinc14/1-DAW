import java.util.*;
public class Ejercicio8{
	public static void main(String[] args){
		//Definimos primero las variables que vamos a necesitar
		String dia = "Viernes";
		int numDia = 26;
		String mes = "Mayo";
		String curso = "1º";
		String asignatura = "Programación de aplicaciones web";
		String instituto = "IES Hlanz";
		String ciudad = "Granada";
		String hora = "20:30";
	
		//una vez tenemos todas estas variables pasamos a mostrar por pantalla
		System.out.println("El " + dia + " día " + numDia + " de " + mes + " tendrá lugar la reunión de evaluación del " + curso + " curso de " + asignatura + " en el " + instituto + " de " + ciudad + ". Los profesores calificarán al alumnado y se prevé que a las " + hora + " horas las notas estén publicadas en el tablón de anuncios del centro");
		
	}
}