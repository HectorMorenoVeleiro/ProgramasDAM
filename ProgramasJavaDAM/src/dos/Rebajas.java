package dos;

import java.util.Scanner;

public class Rebajas {

	public static double descubrePorcentaje(double original, double actual) {
		return (original - actual) * 100.0 / original;
	}

	// Metodo dado original y dado descuento
	// dime en cuanto me queda la broma (actual).

	public static double descubreActual(double original, double porcentaje) {
		return -((porcentaje * original) / 100.0) + original;
	}

	public static double descubreOriginal(double actual, double porcentaje) {
		return actual / (1 - (porcentaje / 100.0));
	}

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// System.out.println(descubrePorcentaje(100, 79));
		// System.out.println(descubrePorcentaje(100, 50));

		double original;
		double actual;
		double porcentaje;
		int resp;
		int salir;

		System.out.println("Que método quieres usar?\n(1)descubrePorcentaje\n(2)descubreActual\n(3)descubreOriginal: ");
		resp = sc.nextInt();

		do {
			if (resp == 1) { // PRIMER METODO
				System.out.println("METODO descubre porcentaje");

				System.out.println("dame original: ");
				original = sc.nextDouble();
				System.out.println("dame actual: ");
				actual = sc.nextDouble();
 
				System.out.println("el porcentaje de descuento es: " + descubrePorcentaje(original, actual) + "%");
			} else if (resp == 2) { // SEGUNDO METODO
				System.out.println("METODO descubre actual ");

				System.out.println("dame un original: ");
				original = sc.nextDouble();
				System.out.println("dame porcentaje: ");
				porcentaje = sc.nextDouble();

				System.out.println("el precio actual es: " + descubreActual(original, porcentaje));
			} else if (resp == 3) { // TERCER METODO
				System.out.println("METODO descubre original ");

				System.out.println("dame un actual: ");
				actual = sc.nextDouble();
				System.out.println("dame porcentaje: ");
				porcentaje = sc.nextDouble();

				System.out.println("el precio original es: " + descubreOriginal(actual, porcentaje));
			}
			System.out.println("quieres salir: (1)si n(0)o");
			salir = sc.nextInt();

		} while (salir == 0);

		System.out.println("chaooo");
	}
}
