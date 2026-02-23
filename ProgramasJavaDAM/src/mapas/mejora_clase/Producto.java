package mapas.mejora_clase;

/**
 * Representa un producto ecológico con nombre y precio.
 */
public class Producto {

    private final String nombre;
    private final float precio;

    public Producto(String nombre, float precio) {
        this.nombre = nombre.toLowerCase();
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }
}
