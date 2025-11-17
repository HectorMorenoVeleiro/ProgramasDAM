package dos;

import java.util.Scanner;

public class Resuelto1 {

	// Fahrenheit a Celsius C = (F - 32) / 1.8
	// Celsius a Fahrenheit F = (1.8) * C + 32

	public static double centigradosToFahrenheit(double temper) {
		return (9D * temper / 5) + 32;
	}

	public static double fahrenheitToCentigrados(double temper) {
		return (temper - 32) * 5D / 9;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean respuesta=true;

		do {

			System.out.println("Que quieres hacer?: (1)caf(2)fac(3)salir");
			String seleccion = sc.nextLine();
			 
			switch (seleccion) {
			
			case "1":
				// De grados a farenheit
				System.out.println("introduce una temp en C: ");
				double c = sc.nextDouble();
				System.out.println("transformada a fahrenheit es: " + centigradosToFahrenheit(c) + "\n");
				sc.nextLine();
				break;
				
			case "2":
				// De farenheit a grados
				System.out.println("introduce una temp en F: ");
				double f = sc.nextDouble();
				System.out.println("transformada a centigrados es: " + fahrenheitToCentigrados(f) + "\n");
				sc.nextLine();
				break;
				
			case "3":
				// Salir del bucle
				respuesta = false;
				break;
				
			default:
				// Cualquierotracosa
				System.out.println("Tu eres tonto Simón, y no tienes elección");
				break;
			}
			
			} while (respuesta);

		System.out.println("\nChao");
		
		sc.close();
	}
}
