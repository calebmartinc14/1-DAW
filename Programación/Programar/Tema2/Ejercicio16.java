public class Ejercicio16 {

    /**
     * Convierte un boolean en la palabra "Si" o "No"
     * @param valor El valor boolean a convertir
     * @return "Si" si el valor es true, "No" en caso contrario
     */
    public static String convertirASiNo(boolean valor) {
        return valor ? "Si" : "No";
    }

    public static void main(String[] args) {
        System.out.println("true -> " + convertirASiNo(true));
        System.out.println("false -> " + convertirASiNo(false));
    }
}
