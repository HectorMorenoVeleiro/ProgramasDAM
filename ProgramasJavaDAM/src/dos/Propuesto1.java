package dos;

import java.util.Scanner;

public class Propuesto1 {

	// Realiza una clase finanzas dolares/euros euros/dolares
	//
	// tiene que tener cnst finanzas() y finanzas(double)
	// (el cambio que desees)

	public static Scanner sc = new Scanner(System.in);

	public final static double DOLAR_POR_EURO = 1.17;

	public static double eurosADolares(double euros) {
		return DOLAR_POR_EURO * euros;
	}

	public static double dolaresAEuros(double dolares) {
		return (1 / DOLAR_POR_EURO) * dolares;
	}

	public static void main(String[] args) {

		int decision = 0;
		
		while (decision != 3) {
			
			System.out.println("quieres pasar de euros a dolares (1) o de dolares a euros (2)/ salir(3)?: ");
			decision = sc.nextInt();

			if (decision == 1) {
				System.out.println("introduce dolares: ");
				double dolares = sc.nextDouble();
				System.out.println(dolares + " dolares son exactamente " + dolaresAEuros(dolares) + " euros");
				
			} else if (decision == 2) {
				System.out.println("introduce euros: ");
				double euros = sc.nextDouble();
				System.out.println(euros + " euros son exactamente " + eurosADolares(euros) + " dolares");
			} 
		}
		System.out.println("chaito");
	}
}
