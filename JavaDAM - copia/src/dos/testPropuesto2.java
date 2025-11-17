package dos;

import java.util.Scanner;

public class testPropuesto2 {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("dame un entero: ");
		Propuesto2 objeto = new Propuesto2(sc.nextInt());
		
		System.out.println("dame otro entero: ");
		Propuesto2 extraño = new Propuesto2(sc.nextInt());

		System.out.println(objeto.toString());
		System.out.println(extraño.toString());
		
		Propuesto2 otro = new Propuesto2(objeto);
		System.out.println(otro.toString());
		System.out.println(objeto.toString());
		
		System.out.println(otro.equals(objeto));
		 
		System.out.println(extraño.equals(objeto));
		
	}
}
