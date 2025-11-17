package dos;

public class MiPrimeraExcepcionAritmetica {
	public static void main(String[] args) {

		int a = 7, b = 0, c;

		try {
			c = a / b;
		} catch (ArithmeticException excep) {

			System.err.println("Error: " + excep.getMessage());
			return;
		}

		System.out.println("el resultado es ---> c");
		System.out.println("a / b = " + c);

	}

}
