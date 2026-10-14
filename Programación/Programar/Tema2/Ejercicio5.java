import java.util.Scanner;

public class Ejercicio5 {
    // Devuelve la ciudad correspondiente al prefijo.
    public static String ciudadPrefijo(int prefijo) {
        return prefijo==950 ? "Almería"
                :prefijo==958 ? "Granada"
                :prefijo==953 ? "Jaén"
                :(prefijo==951 || prefijo==952) ? "Málaga"
                :prefijo==957 ? "Córdoba"
                :(prefijo==954 || prefijo==955) ? "Sevilla"
                :prefijo==956 ? "Cádiz"
                :prefijo==959 ? "Huelva":"Prefijo desconocido";
    }

    public static void main(String[] args) {
        System.out.print("Introduce el número del prefijo: ");
        int prefijo = new Scanner(System.in).nextInt();
        String ciudad = ciudadPrefijo(prefijo);
        System.out.println("El prefijo " + prefijo + " corresponde a " + ciudad);
        }
    }

