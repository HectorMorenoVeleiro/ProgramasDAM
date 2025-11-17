package dos;

public class TestPajaro {

	public static void main(String[] args) {

		Pajaro paj1 = new Pajaro('R', 8, "periquito");
		Pajaro paj2 = new Pajaro('A', 3, "comilon");
		Pajaro paj3 = new Pajaro('J', 9, "javielin");

		System.out.println("\n");

		paj1.mostrarInfo();
		paj2.mostrarInfo();
		paj3.mostrarInfo();

		System.out.println("\n");

		paj1.cantar();
		paj2.cantar();
		paj3.cantar();
	}

}