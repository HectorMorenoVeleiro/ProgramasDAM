package dos;

public class Pajaro {

	// *** atributos o propiedades ****
	private char color; // propiedad o atributo color
	private int edad; // propiedad o atributo edad
	private String nombre; // ejemplo de tercer atributo

	// Constructor completo
	public Pajaro(char color, int edad, String nombre) {
		this.color = color;
		this.edad = edad;
		this.nombre = nombre;
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