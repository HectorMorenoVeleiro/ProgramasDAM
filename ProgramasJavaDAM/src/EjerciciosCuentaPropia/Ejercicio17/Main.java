package ejercicioscuentapropia.Ejercicio17;

public class Main {

    /*
     * Una empresa de venta por internet de productos electrónicos nos ha encargado
     * implementar un carrito de la compra. Crea la clase Carrito. Al carrito se le
     * pueden ir agregando elementos que se guardarán en una lista, por tanto,
     * deberás crear la clase Elemento. Cada elemento del carrito deberá contener el
     * nombre del producto, su precio y la cantidad (número de unidades de dicho
     * producto). A continuación se muestra tanto el contenido del programa
     * principal
     * como la salida que debe mostrar el programa. Los métodos a implementar se
     * pueden deducir del main.
     */

    public static void main(String[] args) {
        System.out.println("Contenido del carrito");
        System.out.println("\n========================\n");

        Carrito miCarrito = new Carrito();
        miCarrito.agrega(new Elemento("Tarjeta SD 64Gb", 2));
        miCarrito.agrega(new Elemento("Canon EOS 2000D", 1));

        System.out.println(miCarrito.toString());

        System.out.print("Hay " + miCarrito.numeroDeElementos());

        System.out.println(" productos en la cesta.");

        System.out.println("El total asciende a "
                + String.format("%.2f", miCarrito.importeTotal()) + " euros");

        System.out.println("\nContinúa la compra...\n");
        System.out.println("\n\nContenido del carrito");
        System.out.println("\n========================\n");

        miCarrito.agrega(new Elemento("Samsung Galaxy Tab", 3));
        miCarrito.agrega(new Elemento("Tarjeta SD 64Gb", 1));

        System.out.println(miCarrito.toString());
        System.out.print("Ahora hay " + miCarrito.numeroDeElementos());

        System.out.println(" productos en la cesta.");
        System.out.println("El total asciende a "
                + String.format("%.2f", miCarrito.importeTotal()) + " euros");
    }
}
