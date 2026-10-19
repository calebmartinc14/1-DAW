public class Ejercicio19 {

    /**
     * Calcula la paga de un hijo de forma proporcional a su edad
     * @param pagaMayor Paga del hijo mayor
     * @param edadMayor Edad del hijo mayor
     * @param edad Edad del hijo cuya paga se quiere calcular
     * @return La paga correspondiente a la edad indicada
     */
    public static double calcularPaga(double pagaMayor, int edadMayor, int edad) {
        return pagaMayor * edad / edadMayor;
    }

    /**
     * Calcula qué porcentaje representa una cantidad respecto a un total
     * @param cantidad La cantidad parcial
     * @param total El total
     * @return El tanto por ciento que representa la cantidad sobre el total
     */
    public static double calcularPorcentaje(double cantidad, double total) {
        return cantidad * 100 / total;
    }

    public static void main(String[] args) {
        double pagaMayor = 12.75;
        int edadMayor = 20;
        int finesDeSemanaAlMes = 4;
        double sueldoPadre = 1200;

        double paga15 = calcularPaga(pagaMayor, edadMayor, 15);
        double paga18 = calcularPaga(pagaMayor, edadMayor, 18);
        double totalFinDeSemana = pagaMayor + paga15 + paga18;
        double totalMes = totalFinDeSemana * finesDeSemanaAlMes;
        double porcentaje = calcularPorcentaje(totalMes, sueldoPadre);

        System.out.println("Paga del hijo de 15 años: " + paga15 + " euros");
        System.out.println("Paga del hijo de 18 años: " + paga18 + " euros");
        System.out.println("Dinero total al mes en pagas: " + totalMes + " euros");
        System.out.println("Porcentaje del sueldo que se gasta en pagas: " + porcentaje + "%");
    }
}
