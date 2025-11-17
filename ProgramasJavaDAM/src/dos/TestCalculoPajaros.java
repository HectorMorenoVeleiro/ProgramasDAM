package dos;

public class TestCalculoPajaros {
	public static void main(String[] args) {
		
		CalculoPajaros pajaros = CalculoPajaros.pideDatos();
		CalculoPajaros.dimenumerodepajaros();

		CalculoPajaros antonio = new CalculoPajaros('T', 23, "Sistemas de programacion");
		antonio.mostrarInfo();
		CalculoPajaros.dimenumerodepajaros();
		
		System.out.println(pajaros);
	}
}
