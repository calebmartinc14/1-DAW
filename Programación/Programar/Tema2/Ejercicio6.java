import java.util.Scanner;

public class Ejercicio6 {
    // Eleva el número al cuadrado.
    public static int cuadrado(int numero) {
        return numero * numero;
    }

    // Devuelve el valor de pi indicado en el enunciado.
    public static double obtenerPi() {

        return 3.14159;
    }

    // Calcula el diámetro de la circunferencia.
    public static int diametroCircunferencia(int radio) {
        return 2 * radio;
    }

    // La longitud se calcula usando el diámetro.
    public static double longitudCircunferencia(int radio) {
        return obtenerPi() * diametroCircunferencia(radio);
    }

    // Calcula el área del círculo.
    public static double areaCirculo(int radio) {
        return obtenerPi() * radio * radio;
    }

    public static void main(String[] args) {
        System.out.print("Introduce el radio del círculo: ");
        int radio = new Scanner(System.in).nextInt();

        if (radio > 0) {
            System.out.println("Diámetro: "
                    + diametroCircunferencia(radio));
            System.out.println("Longitud de la circunferencia: "
                    + longitudCircunferencia(radio));
            System.out.println("Área del círculo: " + areaCirculo(radio));
        }
    }
}
