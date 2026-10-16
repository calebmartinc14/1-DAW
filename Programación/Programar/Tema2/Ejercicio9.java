import java.util.Scanner;

public class Ejercicio9 {
    public static String notaAlumno(double nota){
        return nota<5 ? "Suspenso"
                :nota<6 ? "Suficiente"
                :nota<7 ? "Bien"
                :nota<9 ? "Notable"
                :nota<10 ? "Sobresaliente"
                :nota == 10 ? "Matrícula de honor": "No entra tu nota en el rango.";
    }

    public static String aprueba(double nota){
        return nota>=5 ? "Aprobado":"Suspenso";
    }

    public static void main(String[] args) {
        System.out.println("Bienvenido al programa. Introduzca su nota");
        double nota = new Scanner(System.in).nextDouble();
        System.out.println("Su nota es: " + notaAlumno(nota));
        System.out.println("El alumno ha: " + aprueba(nota));
    }
}


