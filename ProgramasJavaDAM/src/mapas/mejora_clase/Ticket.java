package mapas.mejora_clase;

import java.util.Map;

/**
 * Genera y muestra el ticket de compra.
 */
public class Ticket {

    public static void imprimir(Carrito carrito, String codigoDescuento) {

        float total = carrito.calcularTotal();

        System.out.println("\n===== TICKET DE COMPRA =====");
        System.out.printf("%-12s %-10s %-10s %-10s\n", "Producto", "Cant.", "Precio", "Subtotal");
        System.out.println("---------------------------------------------");

        for (Map.Entry<Producto, Float> entry : carrito.getItems().entrySet()) {
            Producto p = entry.getKey();
            float cant = entry.getValue();
            float subtotal = p.getPrecio() * cant;

            System.out.printf("%-12s %-10.2f %-10.2f %-10.2f\n",
                    p.getNombre(), cant, p.getPrecio(), subtotal);
        }

        if ("ECODTO".equalsIgnoreCase(codigoDescuento)) {
            total *= 0.9f;
            System.out.println("\n✔ Descuento aplicado (10%)");
        }

        System.out.printf("\nTOTAL: %.2f euros\n", total);
    }
}
