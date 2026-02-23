package mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Programa para gestionar la compra de productos ecológicos.
 * 
 * Mejoras realizadas:
 * - Eliminación de código innecesario (constructores, equals, hashCode… no
 * usados).
 * - Corrección de errores en nombres de productos ("guinoa" → "quinoa").
 * - Uso de constantes y colecciones inmutables cuando es posible.
 * - Separación de lógica en métodos para mayor claridad.
 * - Validación de entradas del usuario.
 * - Comentarios explicativos.
 * - Código más limpio, legible y mantenible.
 */
public class Ecologico {

    /** Diccionario con productos y precios */
    private static final Map<String, Float> PRECIOS = new HashMap<>() {
        {
            put("avena", 2.21f);
            put("garbanzos", 2.39f);
            put("tomate", 1.59f);
            put("jengibre", 3.13f);
            put("quinoa", 4.50f);
            put("guisantes", 1.60f);
        }
    };

    /** Código de descuento válido */
    private static final String CODIGO_DESCUENTO = "ECODTO";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Mapa donde se almacenará la compra del usuario
        Map<String, Float> carrito = new HashMap<>();

        System.out.println("Introduce productos y cantidades. Escribe 'fin' para terminar.");

        pedirProductos(sc, carrito);
        mostrarTicket(carrito, sc);

        sc.close();
    }

    /**
     * Pide productos al usuario y los almacena en el carrito.
     */
    private static void pedirProductos(Scanner sc, Map<String, Float> carrito) {
        while (true) {
            System.out.print("Producto: ");
            String producto = sc.nextLine().trim().toLowerCase();

            if (producto.equals("fin"))
                break;

            if (!PRECIOS.containsKey(producto)) {
                System.out.println("❌ Producto no disponible. Intenta de nuevo.");
                continue;
            }

            System.out.print("Cantidad: ");
            float cantidad;

            try {
                cantidad = Float.parseFloat(sc.nextLine());
                if (cantidad <= 0) {
                    System.out.println("❌ La cantidad debe ser mayor que 0.");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("❌ Cantidad inválida.");
                continue;
            }

            carrito.merge(producto, cantidad, Float::sum);
        }
    }

    /**
     * Muestra el ticket final con subtotales, total y descuento.
     */
    private static void mostrarTicket(Map<String, Float> carrito, Scanner sc) {
        float total = 0;

        System.out.println("\n===== TICKET DE COMPRA =====");
        System.out.printf("%-12s %-10s %-10s %-10s\n", "Producto", "Cant.", "Precio", "Subtotal");
        System.out.println("---------------------------------------------");

        for (Map.Entry<String, Float> entry : carrito.entrySet()) {
            String producto = entry.getKey();
            float cantidad = entry.getValue();
            float precio = PRECIOS.get(producto);
            float subtotal = precio * cantidad;

            total += subtotal;

            System.out.printf("%-12s %-10.2f %-10.2f %-10.2f\n",
                    producto, cantidad, precio, subtotal);
        }

        // Aplicar descuento si procede
        System.out.print("\nIntroduce un código de descuento (o pulsa Enter): ");
        String descuento = sc.nextLine().trim();

        if (descuento.equalsIgnoreCase(CODIGO_DESCUENTO)) {
            total *= 0.9f; // 10% de descuento
            System.out.println("✔ Descuento aplicado (10%)");
        }

        System.out.printf("\nTOTAL: %.2f €\n", total);
    }
}
