package ejercicioscuentapropia.Ejercicio17;

import java.util.ArrayList;
import java.util.List;
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

    private static final Random rd = new Random();

    private static final Map<String, Double> nombre_precios = Map.of(
            "Tarjeta SD 64Gb", 19.95,
            "Canon EOS 2000D", 449.00,
            "Samsung Galaxy Tab", 199.00);

    private static final List<String> nombres = new ArrayList<>(nombre_precios.keySet());

    private String nombre;
    private int cantidad;
    private double PVP;

    // Constructor aleatorio
    public Elemento() {
        this.nombre = nombres.get(rd.nextInt(nombres.size()));
        this.PVP = nombre_precios.get(this.nombre);
        this.cantidad = rd.nextInt(1, 10);
    }

    // Constructor con nombre
    public Elemento(String nombre, int cantidad) {
        this.nombre = nombre_precios.containsKey(nombre)
                ? nombre
                : nombres.get(rd.nextInt(nombres.size()));

        this.PVP = nombre_precios.get(this.nombre);
        this.cantidad = cantidad;
    }

    // getters y setters...
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPVP() {
        return PVP;
    }

    public void setPVP(double pVP) {
        PVP = pVP;
    }

}
