public class Ejercicio18 {

    /**
     * Calcula el polinomio x^2 - x + 3, que aparece en las tres funciones
     * @param x Valor de x
     * @return El valor de x^2 - x + 3
     */
    public static double calcularPolinomio(double x) {

        return x * x - x + 3;
    }

    /**
     * Calcula f(x) = 3*(x/2)^3 / (x^2 - x + 3)
     * @param x Valor de x
     * @return El valor de f(x)
     */
    public static double f(double x) {

        return 3 * (x / 2) * (x / 2) * (x / 2) / calcularPolinomio(x);
    }

    /**
     * Calcula g(x) = x/5 - 1/(x^2 - x + 3)
     * @param x Valor de x
     * @return El valor de g(x)
     */
    public static double g(double x) {

        return x / 5 - 1 / calcularPolinomio(x);
    }

    /**
     * Calcula h(x, y) = g(y^2) + (x^2 - x + 3) * 4x / (6 - y)
     * @param x Valor de x
     * @param y Valor de y
     * @return El valor de h(x, y)
     */
    public static double h(double x, double y) {
        return g(y * y) + calcularPolinomio(x) * 4 * x / (6 - y);
    }

    public static void main(String[] args) {
        System.out.println("f(0) = " + f(0));
        System.out.println("f(1) = " + f(1));
        System.out.println("f(-2) = " + f(-2));
        System.out.println("g(3) = " + g(3));
        System.out.println("g(6) = " + g(6));
        System.out.println("h(0,1) = " + h(0, 1));
        System.out.println("h(-3,2) = " + h(-3, 2));
    }
}
