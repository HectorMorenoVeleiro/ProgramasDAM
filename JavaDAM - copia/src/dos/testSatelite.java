package dos;

public class testSatelite {

	public static void main(String[] args) {

		Satelite xabarin = new Satelite(-7.92, 42.1, 5.0);

		Satelite mir = new Satelite();
		mir.setPosicion(4.5, 52.7, 300.0);

		xabarin.printPosicion();
		mir.printPosicion();
	}
}
