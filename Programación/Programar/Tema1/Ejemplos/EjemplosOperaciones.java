
public class EjemplosOperaciones{
	public static void main(String [] args){
		//asignamos variables y valores
		int total = 0;
		int aula1 = 25;
		int aula2 = 30;
		//asignacion de valor
		total = aula1 + aula2;
		//mostramos por pantalla
		System.out.println("El total de alumnos entre las dos aulas es de: " + total);
		
		//usando el double podemos mostrar las divisiones con decimales
		double nota1 = 4.5;
		double nota2 = 3.6;
		double media = (nota1 + nota2) / 2;
		System.out.println("La media de las notas es " + media);
		
		
		//ahora hacemos un ejemplo con cociente y sin decimales
		int numNiños = 7;
		int numCaramelos = 20;
		int cantidad = numCaramelos / numNiños;
		System.out.println("Cada niño tiene " + cantidad + " caramelos");
		
		
		//otro ejemplo con media de notas sin usar double en la asignacion de las notas enteras
		int nota3 = 7;
		int nota4 = 8;
		//dos opciones, se divide por el entero añadiendo el .0 o se multiplica una variable entera por 1.0)
		double notaMedia = (nota3 + nota4) / 2.0;
		System.out.println("La media de las notas es " + notaMedia);
		
		//ahora en este ejemplo utilizamos una variable extra en la que se le asigna el resto de la division
		int numNiños1 = 8;
		int numCaramelos1 = 35;
		int cantidad1 = numCaramelos1 / numNiños1;
		//variable extra con la asignación del valor del resto de la division usando %
		int sobran = numCaramelos1 % numNiños1;
		System.out.println("Tocan a " + cantidad1 + " caramelos, y sobran " + sobran + " caramelos");
		
		//ahora empezamos con incrementos y decrecimientos
		int sueldoAntonio = 1500;
		System.out.println("Sueldo de Antonio: " + sueldoAntonio);
		//incrementamos el sueldoAntonio
		sueldoAntonio += 250;
		System.out.println("El nuevo sueldo de Antonio con crecimiento es: " +sueldoAntonio);
	
		
		int sueldoAntonio1 = 1500;
		System.out.println("Sueldo de Antonio: " + sueldoAntonio1);
		//decremento del sueldo de Antonio
		sueldoAntonio1 -= 250;
		System.out.println("El nuevo sueldo de Antonio con decremento es: " + sueldoAntonio1);
		
		int sueldoAntonio2 = 1500;
		System.out.println("Sueldo de Antonio: " + sueldoAntonio2);
		//incremento del sueldo de Antonio en 1
		sueldoAntonio2++;
		System.out.println("El nuevo sueldo de Antonio con incremento ++ es: " + sueldoAntonio2	);
		
		
		//Pasamos con las comparaciones
		int sueldoPepe = 1200;
		int sueldoJuan = 1500;
		//compara si son iguales, si cambiasemos a != podemos decir si son diferentes
		boolean sonIguales = sueldoPepe == sueldoJuan;
		System.out.println("Es el sueldo de Pepe " + sueldoPepe + " igual al sueldo de Juan " + sueldoJuan);
		System.out.println("¿Son iguales?: " + sonIguales);
		
		//ahora ponemos con el != para ver si son diferentes o nota1
		int sueldoPepe1 = 1200;
		int sueldoJuan1 = 1500;
		boolean sonDiferentes = sueldoPepe1 != sueldoJuan1;
		System.out.println("Es el sueldo de Pepe " + sueldoPepe1 + " diferente al sueldo de Juan" + sueldoJuan1);
		System.out.println("¿Son diferentes?: " + sonDiferentes);
		
		//ahora pasamos con las comparaciones <> <= >= etc
		int sueldoPaco = 1500;
		int sueldoPedro = 1100;
		boolean esMayor = sueldoPaco > sueldoPedro;
		System.out.println("Cobra más Paco?: " + esMayor);
		
		//
		int sueldoPaco1 = 1500;
		int sueldoPedro1 = 1100;
		boolean esMenor = sueldoPaco1 < sueldoPedro1;
		System.out.println("Cobra menos Paco?: " + esMenor);
	}
}