import java.util.*;
public class EjemploAsignacionCondicional{
	public static void main(String [] args){
		System.out.println("Introduzca su edad");
		int edad = new Scanner(System.in).nextInt();
		//declaro variable para calcular el descuento
		//con esta forma de usar condicionales resumimos mucho el codigo
		//la ? funciona para comparar algo, si es verdadero seria true=6 y si falso false=4
		//int descuento = edad<18? 6:4; //<-----
		/*
		int descuento = 0;
		if(edad >= 18){
			descuento=4;
		}else{
			descuento=6;
		}
		*/
		int descuento = edad<18 ? 6:	//si edad <18 guardamos 6 
						edad>60 ? 5:4;  //si edad >60 guardamos 5 y resto de años 4 (>=18 || <=60)
		
		//ejemplos de conversion de distinto tipos de variable, en este caso UNICODE
		int a = 'Z';
		char b = 126;
	}
}