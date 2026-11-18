package Ejercicios;

public class Ejercicio39 {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        int procesadores = runtime.availableProcessors();
        System.out.println("El numero de procesadores es de: " + procesadores);
        long memoriaTotal = runtime.totalMemory();
        long memoriaMb = memoriaTotal / (1024*1024);
        System.out.println("El total de memoria es de " + memoriaMb + "MB");
    }
}
