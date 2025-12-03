package boletinejerciciosrepaso2;

import static org.junit.Assert.assertThrows;

import java.util.Scanner;

public class Ejercicio17 {
    // Una empresa que se dedica a la venta de desinfectantes necesita un programa
    // para gestionar las facturas. En cada factura figura: el codigo del articulo,
    // la cantidad vendida en litros y el precio por litro.
    // Se pide de 5 facturas introducidas: Facturacion total,

    // creamos main
    public static void main(String[] args) {

        // iniciamos Scanner
        Scanner sc = new Scanner(System.in);

        // creamos atributos
        int codigo;
        double litros;
        double precioL;
    }

    // inner class
    private class Linea {

        // Atributos
        int codigo;
        double litros;
        double precioL; // Precio por litro
        double subtotal; // Nuevo: Calculado

        // Constructor con atributos
        public Linea(int codigo, double litros, double precioL) {
            this.codigo = codigo;
            this.litros = litros;
            this.precioL = precioL;
            this.subtotal = litros * precioL; // Cálculo automático al crear la línea
        }

        // Método calcular subtotal
        public double calcularSubtotal() {
            this.subtotal = this.litros * this.precioL;
            return this.subtotal;
        }

        // Getter subtotal
        public double getSubtotal() {
            return subtotal;
        }

        // Método toString()
        @Override
        public String toString() {
            return "Linea [Código=" + codigo +
                    ", Litros=" + litros +
                    ", Precio/L=" + precioL +
                    ", Subtotal=" + subtotal + "]";
        }

        // Getters y Setters

        public int getCodigo() {
            return codigo;
        }

        public void setCodigo(int codigo) {
            this.codigo = codigo;
        }

        public double getLitros() {
            return litros;
        }

        public void setLitros(double litros) {
            this.litros = litros;
        }

        public double getPrecioL() {
            return precioL;
        }

        public void setPrecioL(double precioL) {
            this.precioL = precioL;
        }
    }

}
