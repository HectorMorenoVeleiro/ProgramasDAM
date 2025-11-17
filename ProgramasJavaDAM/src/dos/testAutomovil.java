package dos;
		
public class testAutomovil {
		
	public static void main(String[] args) {
		
		// Crear dos objetos Automovil con diferentes atributos
		Automovil auto1 = new Automovil("Toyota", "Rojo", 50);
		Automovil auto2 = new Automovil("Ford", "Azul", 30);
		
		// Usar el metodo acelerarConCariño para aumentar la velocidad
		auto1.acelerarConCariño(20);
		auto2.acelerarConCariño(40);
		
		// Usar el metodo claxonCariñoso para saludar
		auto1.claxonCariñoso();
		auto2.claxonCariñoso();
		
		// toString los objetos
		System.out.println(auto1.toString());
		System.out.println(auto2.toString());
		
		// Es auto1 equals auto2
		System.out.println(auto1.equals(auto2));
		
		// Creando coches 
		Automovil ford = new Automovil("forito", "celeste", 100);
		System.out.println(ford.toString());
		ford.acelera(60);
		System.out.println(ford);
		
		Automovil yoyota = new Automovil("pasos", "hotpink", 10);
		System.out.println(yoyota.toString());
		yoyota.frena(50);
		System.out.println(yoyota);
	}	
		
}		
		
// (mejora los metodos acelera y frena de la clase Auto con if-else) //
		