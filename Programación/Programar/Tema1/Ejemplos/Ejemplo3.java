public class Ejemplo3{
	public static void main(String[] args){
		//números enteros
		byte num1 = 0;
		short num2 = 23;
		int num3 = 345;
		long num4 = 34567;
		long num5 = 34567889876544L;
		
		//números con decimales
		double real1 = 0.4324e2;
		//se escribe F al final para que sea float
		float real2 = 5.6F;
	
		//declarando final se vuelve constante y no cambia el valor
		//también se cambia el nombre de la variable todo a mayúscula
		final int DIAS_SEMANA = 7;
		final double pi = 3.1415;
		final String INSTITUTO = "IES Hlanz";
		//carácter
		char letra = 'A';
		//se le asigna el valor de la tabla ASCII
		char otraLetra = 25;
		//booleano sin mas, verdadero o falso
		boolean soltero = true;
		boolean estudiante = false;
		
		String nombre = "Pepe Mel";
		//utilizando 3 comillas se puede escribir de la siguiente forma
		String ficha = """
			Hola, aqui se puede
			Escribir en varias
			Líneas de texto
			""";
			
	}
}