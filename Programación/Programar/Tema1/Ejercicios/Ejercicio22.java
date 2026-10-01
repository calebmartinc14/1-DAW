import java.util.*;
public class Ejercicio22{
	public static void main(String[] args){
		boolean A = true;
		boolean B = false;
		boolean C = false;
		boolean D = true;
		
		// a) A || (B && C)
		// B && C = false && false = false
		// true || false = true
		boolean a = A || (B && C);
		
		// b) (A && !B) || !(D && A)
		// !B = true
		// A && !B = true && true = true
		// D && A = true && true = true
		// !(D && A) = false
		// true || false = true
		boolean b = (A && !B) || !(D && A);
		
		// c) A || (B && (D && C || (!(A || B) && C)))
		// A || B = true
		// !(A || B) = false
		// (!(A || B) && C) = false && false = false
		// D && C = true && false = false
		// (D && C || (!(A || B) && C)) = false || false = false
		// B && ... = false && false = false
		// true || false = true
		boolean c = A || (B && (D && C || (!(A || B) && C)));
		
		// d) !(A || B) || (!A && !B)
		// A || B = true
		// !(A || B) = false
		// !A = false
		// !B = true
		// !A && !B = false && true = false
		// false || false = false
		boolean d = !(A || B) || (!A && !B);
		
		// e) (!C && (!A || !B)) || (D && (!(C && B)))
		// !C = true
		// !A = false
		// !B = true
		// !A || !B = false || true = true
		// !C && (!A || !B) = true && true = true
		// C && B = false && false = false
		// !(C && B) = true
		// D && (!(C && B)) = true && true = true
		// true || true = true
		boolean e = (!C && (!A || !B)) || (D && (!(C && B)));
		
		System.out.println("a) " + a);
		System.out.println("b) " + b);
		System.out.println("c) " + c);
		System.out.println("d) " + d);
		System.out.println("e) " + e);
	}
}
