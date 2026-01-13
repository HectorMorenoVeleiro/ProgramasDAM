package boletinejerciciosrepaso2;

public class Ejercicio17 {
    // Una empresa que se dedica a la venta de desinfectantes necesita un programa
    // para gestionar las facturas. En cada factura figura: el codigo del articulo,
    // la cantidad vendida en litros y el precio por litro.
    // Se pide de 5 facturas introducidas: Facturacion total,

    // creamos main
    /**
     * @param args
     */
    public static void main(String[] args) {
        // 1. Crear una instancia de Linea
        // Datos: Código 101, 5.5 litros, precio 1.20 por litro
        Linea factura = new Linea(101, 5.5, 1.20);

        factura.setCodigo(0);
        System.out.println(factura.getCodigo());

        System.out.println("--- Prueba de Creación ---");
        // 2. Comprobar si el subtotal se calculó en el constructor (5.5 * 1.20 = 6.6)
        System.out.println(factura.toString());

        if (factura.getSubtotal() == 6.6) {
            System.out.println("Resultado: ✅ Subtotal inicial correcto.");
        } else {
            System.out.println("Resultado: ❌ Error en el cálculo inicial.");
        }

        System.out.println("\n--- Prueba de Modificación ---");
        // 3. Modificar valores y recalcular
        factura.setLitros(10.0);
        factura.setPrecioL(2.0);

        // Llamamos al método manual de cálculo
        double nuevoSubtotal = factura.calcularSubtotal();

        System.out.println("Nuevos litros: " + factura.getLitros());
        System.out.println("Nuevo precio: " + factura.getPrecioL());
        System.out.println("Nuevo subtotal: " + nuevoSubtotal);

        if (nuevoSubtotal == 20.0) {
            System.out.println("Resultado: ✅ Recálculo correcto.");
        } else {
            System.out.println("Resultado: ❌ Error en el recálculo.");
        }
    }

    // inner class
    private static class Linea {

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
