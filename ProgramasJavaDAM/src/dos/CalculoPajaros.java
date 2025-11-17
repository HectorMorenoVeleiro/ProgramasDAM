package dos;

import java.util.Scanner;

public class CalculoPajaros {

	private static Scanner sc = new Scanner(System.in);

	public static void dimenumerodepajaros() {
		System.out.println("Hay creados: " + cuentapajaros + " pajaros hasta ahora");
	}

	// metodo de clase
	public static CalculoPajaros pideDatos() {

		System.out.println("dame un color");
		char col = sc.nextLine().charAt(0);

		System.out.println("Dame edad: ");
		int edad = sc.nextInt();

		sc.nextLine();

		System.out.println("dame un nombre: ");
		String nombre = sc.nextLine();

		return new CalculoPajaros(col, edad, nombre);
	}

	// *** atributos o propiedades ****
	private char color; // propiedad o atributo color
	private int edad; // propiedad o atributo edad
	private String nombre; // ejemplo de tercer atributo

	// atributo ESTATICO
	private static int cuentapajaros = 0;

	// Constructor completo
	public CalculoPajaros(char color, int edad, String nombre) {
		this.color = color;
		this.edad = edad;
		this.nombre = nombre;
		// por cada pajaro creado incremento en uno el contador de pajaros
		// que no depende de los objetos sino que lo mantiene la propia clase
		cuentapajaros++;
	}

	// Métodos públicos de acceso (getters y setters)
	public char getColor() {
		return color;
	}

	public void setColor(char color) {
		this.color = color;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Método para hacer que el pájaro cante
	public void cantar() {
		switch (color) {
		case 'R': // Rojo
			System.out.println("El pájaro rojo canta melodías alegres.");
			break;
		case 'A': // Azul
			System.out.println("El pájaro azul canta notas suaves.");
			break;
		default:
			System.out.println("El pájaro canta una canción única.");
			break;
		}
	}

	// Método para mostrar información del pájaro PUDIMOS HABER USADO UN toString()
	public void mostrarInfo() {
		System.out.println("Pájaro " + nombre + ", color: " + color + ", edad: " + edad + " años.");
	}
	
}
