import java.util.Scanner;

public class Ejercicio21 {

    /**
     * Calcula la nota sobre 10 de un test. Cada tres preguntas falladas quitan una bien
     * y las preguntas sin contestar no quitan puntos
     * @param bien Número de preguntas acertadas
     * @param mal Número de preguntas falladas
     * @param totalPreguntas Número total de preguntas del test
     * @return La nota sobre 10 del test
     */
    public static double calcularNota(int bien, int mal, int totalPreguntas) {
        return (bien - mal / 3.0) * 10 / totalPreguntas;
    }

    public static void main(String[] args) {
        int totalPreguntas = 30;

        System.out.print("¿Cuántas preguntas has tenido bien? ");
        int bien = new Scanner(System.in).nextInt();
        System.out.print("¿Cuántas preguntas has tenido mal? ");
        int mal = new Scanner(System.in).nextInt();

        double nota = calcularNota(bien, mal, totalPreguntas);

        System.out.println("Tu nota es: " + nota);
    }
}
