public class Ejercicio33{
	public static void main(String[] args){
		//se añade el valor del caracter. No se pide que metamos uno por pantalla
		char caracter = 'x';
		
		// El char se convierte a int para consultar su codigo ASCII
		int codigo = caracter;
		System.out.println("El caracter es: " + caracter);
		System.out.println("Su codigo es: " + codigo);
		
		// Las letras mayusculas estan entre 65 y 90 y las minusculas entre 97 y 122
		if((codigo >= 65 && codigo <= 90) || (codigo >= 97 && codigo <= 122)){
			System.out.println("El caracter corresponde a una letra");
		}else{
			System.out.println("El caracter no corresponde a una letra");
		}
	}
}
