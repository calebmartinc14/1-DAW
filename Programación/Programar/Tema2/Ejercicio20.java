import java.util.Scanner;

public class Ejercicio20 {

    /**
     * Calcula la nota sobre 10 de una parte del examen
     * @param aciertos Número de preguntas acertadas
     * @param totalPreguntas Número total de preguntas de esa parte
     * @return La nota sobre 10 de esa parte
     */
    public static double calcularNota(int aciertos, int totalPreguntas) {
        return aciertos * 10.0 / totalPreguntas;
    }

    /**
     * Calcula la nota del examen completo (teoría 40% y problemas 60%)
     * @param notaTeoria Nota sobre 10 de la parte de teoría
     * @param notaProblemas Nota sobre 10 de la parte de problemas
     * @return La nota del examen en conjunto
     */
    public static double calcularNotaExamen(double notaTeoria, double notaProblemas) {
        return notaTeoria * 0.4 + notaProblemas * 0.6;
    }

    public static void main(String[] args) {
        int totalTeoria = 8;
        int totalProblemas = 4;

        System.out.print("¿Cuántas preguntas de teoría has tenido bien? ");
        int teoriaBien = new Scanner(System.in).nextInt();
        System.out.print("¿Cuántos problemas has tenido bien? ");
        int problemasBien = new Scanner(System.in).nextInt();

        double notaTeoria = calcularNota(teoriaBien, totalTeoria);
        double notaProblemas = calcularNota(problemasBien, totalProblemas);
        double notaExamen = calcularNotaExamen(notaTeoria, notaProblemas);

        System.out.println("Nota de teoría: " + notaTeoria);
        System.out.println("Nota de problemas: " + notaProblemas);
        System.out.println("Nota del examen: " + notaExamen);
    }
}
