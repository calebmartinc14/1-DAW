import java.util.Scanner;

public class Ejercicio23 {

    public static void main(String[] args) {

        System.out.println("Elige una figura geométrica:");
        System.out.println("1 - Círculo");
        System.out.println("2 - Triángulo");
        System.out.println("3 - Rectángulo");
        System.out.println("4 - Cuadrado");
        int opcion = new Scanner(System.in).nextInt();

        double perimetro = 0;
        double area = 0;
        boolean datosValidos = false;

        if (opcion == 1) {
            System.out.print("Radio: ");
            double radio = new Scanner(System.in).nextDouble();
            datosValidos = ValidacionesFiguras.esCirculoValido(radio);
            if (datosValidos) {
                perimetro = CalculosFiguras.perimetroCirculo(radio);
                area = CalculosFiguras.areaCirculo(radio);
            }
        } else if (opcion == 2) {
            System.out.print("Lado a: ");
            double a = new Scanner(System.in).nextDouble();
            System.out.print("Lado b: ");
            double b = new Scanner(System.in).nextDouble();
            System.out.print("Lado c: ");
            double c = new Scanner(System.in).nextDouble();
            datosValidos = ValidacionesFiguras.esTrianguloValido(a, b, c);
            if (datosValidos) {
                perimetro = CalculosFiguras.perimetroTriangulo(a, b, c);
                area = CalculosFiguras.areaTriangulo(a, b, c);
            }
        } else if (opcion == 3) {
            System.out.print("Base: ");
            double base = new Scanner(System.in).nextDouble();
            System.out.print("Altura: ");
            double altura = new Scanner(System.in).nextDouble();
            datosValidos = ValidacionesFiguras.esRectanguloValido(base, altura);
            if (datosValidos) {
                perimetro = CalculosFiguras.perimetroRectangulo(base, altura);
                area = CalculosFiguras.areaRectangulo(base, altura);
            }
        } else if (opcion == 4) {
            System.out.print("Lado: ");
            double lado = new Scanner(System.in).nextDouble();
            datosValidos = ValidacionesFiguras.esCuadradoValido(lado);
            if (datosValidos) {
                perimetro = CalculosFiguras.perimetroCuadrado(lado);
                area = CalculosFiguras.areaCuadrado(lado);
            }
        } else {
            System.out.println("Opción incorrecta");
        }

        if (opcion >= 1 && opcion <= 4) {
            if (datosValidos) {
                System.out.println("Perímetro: " + perimetro);
                System.out.println("Área: " + area);
            } else {
                System.out.println("Los datos introducidos no son válidos");
            }
        }
    }
}



