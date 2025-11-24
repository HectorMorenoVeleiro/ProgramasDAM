package cuatro;

public class Factorial {
    private double numero;
    private double resultado;
    private final double valorResultado = 0;

    public Factorial(double numero) {
        this.numero = numero;
        this.resultado = valorResultado;
    }

    public double factorialIterativo() {
        double productorio = 1;
        for (int i = (int) this.numero; i > 0; i--) {
            productorio *= i;
        }
        this.resultado = productorio;
        return this.resultado;
    }

    public double factorialRecursivo() {
        return factorialRecursivo(this.numero);
    }

    public double factorialRecursivo(double numero) {
        if (numero == 1 || numero == 0)
            return 1;
        else
            return numero * factorialRecursivo(numero - 1);
    }
}
