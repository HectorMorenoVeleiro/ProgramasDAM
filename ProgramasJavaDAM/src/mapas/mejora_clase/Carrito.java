package mapas.mejora_clase;

import java.util.HashMap;
import java.util.Map;

/**
 * Carrito de compra que almacena productos y cantidades.
 */
public class Carrito {

    private final Map<Producto, Float> items = new HashMap<>();

    public void agregarProducto(Producto producto, float cantidad) {
        items.merge(producto, cantidad, Float::sum);
    }

    public Map<Producto, Float> getItems() {
        return items;
    }

    public float calcularTotal() {
        float total = 0;
        for (Map.Entry<Producto, Float> entry : items.entrySet()) {
            total += entry.getKey().getPrecio() * entry.getValue();
        }
        return total;
    }
}
