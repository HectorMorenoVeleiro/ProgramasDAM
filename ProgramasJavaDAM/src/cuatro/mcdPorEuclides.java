package cuatro;

public class mcdPorEuclides {

    // iniciar atributos
    private int numero1;
    private int numero2;

    // método constructor
    public mcdPorEuclides(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // método sobrecargado para acceder desde el objeto creado
    public int calcularMcdNumero() {
        return calcularMcdNumero(this.numero1, this.numero2);
    }

    // método que calcula el mcd entre 2 numeros que le entregues
    public int calcularMcdNumero(int numero1, int numero2) {
        if (numero2 == 0)
            return numero1;
        else
            return calcularMcdNumero(numero2, numero1 % numero2);
    }

    /*
     * public static void main(String[] args) {
     * mcdPorEuclides minComMul1 = new mcdPorEuclides(156, 120);
     * System.out.println(minComMul1.calcularMcdNumero());
     * }
     */
}
