public class Ejercicio7 {
    // Convierte el carácter a su código Unicode.
    public static int codigoUnicode(char caracter) {
        return (int) caracter;
    }

    public static void main(String[] args) {
        int suma = codigoUnicode('A')
                + codigoUnicode('d')
                + codigoUnicode('i')
                + codigoUnicode('o')
                + codigoUnicode('s');

        System.out.println("La suma de los códigos Unicode es: " + suma);
    }
}
