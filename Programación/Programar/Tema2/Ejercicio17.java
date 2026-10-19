public class Ejercicio17 {

    /**
     * Comprueba si un número es par
     * @param numero El número a comprobar
     * @return true si el número es par, false si es impar
     */
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    /**
     * Muestra por pantalla si un número es par, usando "Si" o "No"
     * @param numero El número a comprobar
     */
    public static void mostrarSiEsPar(int numero) {
        boolean par = esPar(numero);
        System.out.println("El " + numero + " es par ? " + Ejercicio16.convertirASiNo(par));
    }

    public static void main(String[] args) {
        mostrarSiEsPar(5);
        mostrarSiEsPar(8);
        mostrarSiEsPar(26);
        mostrarSiEsPar(0);
        mostrarSiEsPar(-3);
        mostrarSiEsPar(9);
    }
}
