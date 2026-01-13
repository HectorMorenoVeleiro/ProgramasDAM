package boletinejerciciosrepaso2;

public class Ejercicio17 {
    // Una empresa que se dedica a la venta de desinfectantes necesita un programa
    // para gestionar las facturas. En cada factura figura: el codigo del articulo,
    // la cantidad vendida en litros y el precio por litro.
    // Se pide de 5 facturas introducidas: Facturacion total,

    // creamos main
    public static void main(String[] args) {

        Linea[] factura = new Linea[5];

        // mock de datos para crear las lineas
        int[] CODIGOS = { 101, 102, 103, 104, 105 };
        double[] LITROS = { 15.5, 2.0, 50.0, 3.2, 10.0 };
        double[] PRECIOS = { 2.50, 10.00, 0.75, 5.00, 1.80 };

        for (int i = 0; i < factura.length; i++) {

            System.out.println("Posición " + i + " creada: " + factura[i].toString());
        }

        System.out.print(CODIGOS[1]);
        System.out.println(LITROS[1]);
        System.out.println(PRECIOS[1]);
        System.out.println();

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
