package dos;

public class Automovil extends Object {

	final static int LIMITE_SUPERIOR = 120;
	final static int LIMITE_INFERIOR = 0;

	// Atributos
	String marca;
	String color;
	int velocidad;

	// Constructor
	public Automovil(String marca, String color, int velocidad) {
		this.marca = marca;
		this.color = color;
		this.velocidad = velocidad;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	// void acelera(int cantidad)

	public void acelera(int cantidad) {
		velocidad += cantidad;
		if (velocidad > LIMITE_INFERIOR && velocidad < LIMITE_SUPERIOR) {
			System.out.println("la nueva velocidad" + this.getVelocidad());
		} else if (velocidad < LIMITE_INFERIOR) {
			System.out.println("ammm, debes estar llendo marcha atrás o algo");
		} else if (velocidad > LIMITE_SUPERIOR) {
			System.out.println("te estas pasando un poquito no");
		}
	}

	// void frena(int cantidad)

	public void frena(int cantidad) {
		velocidad -= cantidad;
		if (velocidad > LIMITE_INFERIOR && velocidad < LIMITE_SUPERIOR) {
			System.out.println("la nueva velocidad" + this.getVelocidad());
		} else if (velocidad < LIMITE_INFERIOR) {
			System.out.println("ammm, debes estar llendo marcha atrás o algo");
		} else if (velocidad > LIMITE_SUPERIOR) {
			System.out.println("te estas pasando un poquito no");
		}
	}

	// Metodo para acelerar con cariño
	public void acelerarConCariño(int aumento) {
		velocidad += aumento;
		System.out.println("El " + marca + " acelera con cariño a " + velocidad + "km/h");
	}

	// Metodo para tocar el claxon con alegria
	public void claxonCariñoso() {
		System.out.println("¡Pip pip! El " + color + " " + marca + " te saluda con cariño");
	}

	@Override
	public String toString() {
		return "Automovil [marca=" + marca + ", color=" + color + ", velocidad=" + velocidad + "]";
	}

}

/*
 * Añade a la clase coche los siguientes métodos: int getVelocidad(). Este
 * método devuelve la velocidad actual.
 * 
 * void acelera (int cantidad). Este método actualiza la velocidad a la que
 * llevaba mas una cantidad pasada como parámetro.
 * 
 * void frena (int cantidad). Este método actualiza la velocidad a la que
 * llevaba menos una cantidad pasada como parámetro
 */
