package dos;

public class Satelite {

	// ATRIBUTOS
	private double meridiano;
	private double paralelo;
	private double distancia_tierra;

	Satelite(double m, double p, double d) {
		this.meridiano = m;
		this.paralelo = p;
		this.distancia_tierra = d;
	}

	Satelite() {
		meridiano = paralelo = distancia_tierra = 0;
	}

	public void setPosicion(double m, double p, double d) {
		meridiano = m;
		paralelo = p;
		distancia_tierra = d;
	}

	public void printPosicion() {
		System.out.println("El satélite se encuentra en el: \nparalelo " + paralelo + " \nmeridiano " + meridiano
				+ " \na una distancia de la tierra de: \n" + distancia_tierra + " kilometros.");
	
	}
}
