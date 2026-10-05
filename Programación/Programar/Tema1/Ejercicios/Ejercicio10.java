import java.util.*;
public class Ejercicio10 {
    public static void main(String[] args) {
        
        // 1. Pedimos los datos al usuario
        System.out.println("Introduce el día de la semana:");
        String diaSemana = new Scanner(System.in).nextLine();

        System.out.println("Introduce el número de día:");
        int dia = new Scanner(System.in).nextInt();

        System.out.println("Introduce el mes:");
        String mes = new Scanner(System.in).nextLine();

        System.out.println("Introduce el curso:");
        String curso = new Scanner(System.in).nextLine();

        System.out.println("Introduce el nombre de los estudios:");
        String estudios = new Scanner(System.in).nextLine();

        System.out.println("Introduce el centro:");
        String centro = new Scanner(System.in).nextLine();

        System.out.println("Introduce la ciudad:");
        String ciudad = new Scanner(System.in).nextLine();

        System.out.println("Introduce la hora:");
        String hora = new Scanner(System.in).nextLine();

        // 2. Mostrar el texto final concatenando las variables
        System.out.println("El " + diaSemana + " día " + dia + " de " + mes + " tendrá lugar la reunión de evaluación del " + curso + " curso de " + estudios + " en el " + centro + " de " + ciudad + ". Los profesores calificarán al alumnado y se prevé que a las " + hora + " horas las notas estén publicadas en el tablón de anuncios del centro.");
		
	}
}