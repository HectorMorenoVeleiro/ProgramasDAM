package cuatro;

import ejercicioscuentapropia.AjustesProgramas;

public class Potencia {
    // DEFINICION DE CLASE
    // Método para calcular de forma recursiva (repetitiva) la potencia de un número

    protected double base;
    protected double exponente;

    Potencia(double base, double exponente) {
        this.base = base;
        this.exponente = exponente;
    }

    protected double calcularPotencia() {
        return calcularPotencia(this.base, this.exponente);
    }

    protected double calcularPotencia(double base, double exponente) {
        if (exponente == 0)
            return base = 1.0;
        else if (exponente == 1.0)
            return base;
        else
            return calcularPotencia((base * this.base), exponente - 1);
    }

    public static void main(String[] args) {
        // Ejercicio cálculo de potencias
        double base = AjustesProgramas.enterDoublePorScanner("introduce una base -> ");
        double exponente = AjustesProgramas.enterDoublePorScanner("introduce su exponente -> ");
        Potencia baseExponente = new Potencia(base, exponente);
        System.out.println(
                "El exponente de " + base + " elevado a " + exponente + " es -> " + baseExponente.calcularPotencia());
    }
}
