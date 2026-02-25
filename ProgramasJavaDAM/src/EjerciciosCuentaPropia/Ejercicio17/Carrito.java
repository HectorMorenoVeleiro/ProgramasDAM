package ejercicioscuentapropia.Ejercicio17;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

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

    List<Elemento> lista = new ArrayList<Elemento>();

    // Agrega Elementos
    public void agrega(Elemento obj) {
        this.lista.add(obj);
    }

    // Muestra numero elementos
    public int numeroDeElementos() {
        return lista.size();
    }

    // Muestra el precio
    public double importeTotal() {
        double sumatorio = 0;
        for (Elemento elemento : lista) {
            sumatorio += (elemento.getPVP() * elemento.getCantidad());
        }
        return sumatorio;
    }

    // toString que pasa lo pedido
    @Override
    public String toString() {
        String listaCarrito = "";
        for (Elemento elemento : lista) {
            listaCarrito += elemento.getNombre() + " PVP: " + elemento.getPVP() + " Unidades: "
                    + elemento.getCantidad()
                    + " Subtotal: " + (elemento.getPVP() * elemento.getCantidad()) + "\n";
        }
        return listaCarrito;
    }
}
