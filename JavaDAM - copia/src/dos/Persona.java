package dos;

public class Persona {

	// atributos
	private String nombre;
	private String apellidos;
	private int edad;

	// constructor POR DEFECTO
	public Persona() {
		// se pueden inicializar valores por defecto si quieres
		this.nombre = "";
		this.apellidos = "";
		this.edad = 0;
	}

	// constructor con todos los parametros
	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellidos = apellido;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";
	}

	public void firmaPapel(String nombre) {
		System.out.println(nombre + " no viene el jueves ");
	}

	public String tengoSueño(int horas) {
		return "tengo horas de sueño atrasadas: " + horas;
	}

	public void canto() {
		System.out.println("hoy soy Pavarotti y canto la traviata");
	}

	// metodos propios de una persona

}
