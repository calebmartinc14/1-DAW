public class Ejercicio27{
	public static void main(String[] args){
		int a = 8;
		char b = 'x';
		boolean c = true;
		double d = 2.25;
		
		// double a int necesita casting; sin casting, conversion1 no compila
		int conversion1 = (int)d;
		System.out.println("conversion1: posible con casting (double a int)");
		
		// boolean no se puede convertir a float
		System.out.println("conversion2: no es posible (boolean a float)");
		
		// boolean no admite conversiones desde tipos numericos
		System.out.println("conversion3: no es posible (int a boolean)");
		
		// double a float necesita casting
		float conversion4 = (float)d;
		System.out.println("conversion4: posible con casting (double a float)");
		
		// int a double es una conversion implicita
		double conversion5 = a;
		System.out.println("conversion5: posible por conversion implicita (int a double)");
		
		// short es mas pequeño que int, por eso se hace casting
		short conversion6 = (short)a;
		System.out.println("conversion6: posible con casting (int a short)");
		
		// char a long es una conversion implicita
		long conversion7 = b;
		System.out.println("conversion7: posible por conversion implicita (char a long)");
		
		// double a int necesita casting
		int conversion8 = (int)d;
		System.out.println("conversion8: posible con casting (double a int)");
		
		// boolean a boolean no necesita conversion
		boolean conversion9 = c;
		System.out.println("conversion9: posible (boolean a boolean)");
		
		// double a char necesita casting
		char conversion10 = (char)d;
		System.out.println("conversion10: posible con casting (double a char)");
	}
}
