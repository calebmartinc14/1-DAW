import java.util.*;

public class Ejercicio37 {
    public static void main(String[] args) {
        //empezamos a pedir los datos por pantalla
		System.out.println("Introduce el lado A (el mayor):");
        double a = new Scanner(System.in).nextDouble();

        System.out.println("Introduce el lado B:");
        double b = new Scanner(System.in).nextDouble();

        System.out.println("Introduce el lado C:");
        double c = new Scanner(System.in).nextDouble();
		//una vez que tenemos la toma de datos empezamos a utilizar lo que se nos da de cada tipo de triángulo.
        if (a * a == b * b + c * c) {
            System.out.println("Triángulo rectángulo");
        } else if (a * a < b * b + c * c) {
            System.out.println("Triángulo acutángulo");
        } else {
            System.out.println("Triángulo obtusángulo");
        }
    }
}
