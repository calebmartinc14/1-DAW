public class CalculosFiguras {

    public static double perimetroCirculo(double radio) {
        return 2 * 3.14159 * radio;
    }

    public static double areaCirculo(double radio) {
        return 3.14159 * radio * radio;
    }

    public static double perimetroTriangulo(double a, double b, double c) {
        return a + b + c;
    }

    public static double areaTriangulo(double a, double b, double c) {
        double semiperimetro = perimetroTriangulo(a, b, c) / 2;
        return Math.sqrt(semiperimetro * (semiperimetro - a)
                * (semiperimetro - b) * (semiperimetro - c));
    }

    public static double perimetroRectangulo(double base, double altura) {
        return 2 * (base + altura);
    }

    public static double areaRectangulo(double base, double altura) {
        return base * altura;
    }

    public static double perimetroCuadrado(double lado) {
        return 4 * lado;
    }

    public static double areaCuadrado(double lado) {
        return lado * lado;
    }
}

