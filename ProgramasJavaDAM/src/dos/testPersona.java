package dos;

public class testPersona {

	public static void main(String[] args) {

		Persona uno = new Persona();

		uno.setNombre("Wilfredo");
		uno.setApellidos("Pino");
		uno.setEdad(30);

		System.out.println(uno.toString());

		uno.canto();
		uno.firmaPapel("Willi");
		System.out.println(uno.tengoSueño(7));

		Persona dos = new Persona("Javi", "Denis", 19);

		System.out.println("\n" + dos.toString());
		System.out.println(dos.getApellidos());

	}

}
