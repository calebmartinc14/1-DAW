public class ValidacionesFiguras {

    public static boolean esCirculoValido(double radio) {
        return radio > 0;
    }

    public static boolean esTrianguloValido(double a, double b, double c) {
        return a > 0 && b > 0 && c > 0
                && a + b > c && a + c > b && b + c > a;
    }

    public static boolean esRectanguloValido(double base, double altura) {
        return base > 0 && altura > 0;
    }

    public static boolean esCuadradoValido(double lado) {
        return lado > 0;
    }
}
