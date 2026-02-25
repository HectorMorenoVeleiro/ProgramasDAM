package ejercicioscuentapropia.Ejercicio17;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Elemento {

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

    Map<String, Double> nombre_precios = new HashMap<String, Double>() {
        {
            put("Tarjeta SD 64Gb", 19.95);
            put("Canon EOS 2000D", 449.00);
            put("Samsung Galaxy Tab", 597.00);
            put("Tarjeta SD 64GB", 19.95);
        }
    };

    int index = 0;

    Map<Integer, Map.Entry<String, Double>> index_nombre_precios = new HashMap<Integer, Map.Entry<String, Double>>() {
        {
            nombre_precios.entrySet().forEach(nmbr -> index_nombre_precios.put(index++, nmbr));
        }
    };

    String nombre;
    int unidades;
    double PVP; // (Precio de Venta al Publico en €)

    Elemento(String nombre, int unidades, double PVP, Random rd) {
        this.nombre = (nombre_precios.containsKey(nombre)) ? nombre
                : index_nombre_precios.get(rd.nextInt(index_nombre_precios.size())).getKey();
        this.unidades = unidades;

        this.PVP = PVP;

    }
}
