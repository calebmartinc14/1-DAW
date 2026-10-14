import java.util.Scanner;

public class Ejercicio5 {
    // Devuelve la ciudad correspondiente al prefijo.
    public static String ciudadPrefijo(int prefijo) {
        if (prefijo == 950) {
            return "Almería";
        } else if (prefijo == 958) {
            return "Granada";
        } else if (prefijo == 953) {
            return "Jaén";
        } else if (prefijo == 951 || prefijo == 952) {
            return "Málaga";
        } else if (prefijo == 957) {
            return "Córdoba";
        } else if (prefijo == 954 || prefijo == 955) {
            return "Sevilla";
        } else if (prefijo == 956) {
            return "Cádiz";
        } else if (prefijo == 959) {
            return "Huelva";
        } else {
            return "Prefijo desconocido";
        }
    }

    public static void main(String[] args) {
        System.out.print("Introduce el número del prefijo: ");
        int prefijo = new Scanner(System.in).nextInt();
        String ciudad = ciudadPrefijo(prefijo);

        if (ciudad == ("Prefijo desconocido")) {
            System.out.println(ciudad);
        } else {
            System.out.println("El prefijo " + prefijo
                    + " corresponde a " + ciudad);
        }
    }
}
