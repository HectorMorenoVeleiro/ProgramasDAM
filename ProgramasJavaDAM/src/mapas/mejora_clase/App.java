package mapas.mejora_clase;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Clase principal que gestiona la interacción con el usuario.
 */
public class App {

    private static final Map<String, Producto> CATALOGO = new HashMap<>() {
        {
            put("avena", new Producto("avena", 2.21f));
            put("garbanzos", new Producto("garbanzos", 2.39f));
            put("tomate", new Producto("tomate", 1.59f));
            put("jengibre", new Producto("jengibre", 3.13f));
            put("quinoa", new Producto("quinoa", 4.50f));
            put("guisantes", new Producto("guisantes", 1.60f));
        }
    };

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Carrito carrito = new Carrito();

        System.out.println("Introduce productos y cantidades. Escribe 'fin' para terminar.");

        while (true) {
            System.out.print("Producto: ");
            String nombre = sc.nextLine().trim().toLowerCase();

            if (nombre.equals("fin"))
                break;

            if (!CATALOGO.containsKey(nombre)) {
                System.out.println("ERROR: Producto no disponible.");
                continue;
            }

            System.out.print("Cantidad: ");
            float cantidad;

            try {
                cantidad = Float.parseFloat(sc.nextLine());
                if (cantidad <= 0) {
                    System.out.println("ERROR: La cantidad debe ser mayor que 0.");
                    continue;
                }
            } catch (Exception e) {
                System.out.println("ERROR: Cantidad inválida.");
                continue;
            }

            carrito.agregarProducto(CATALOGO.get(nombre), cantidad);
        }

        System.out.print("\nIntroduce un código de descuento (o Enter): ");
        String descuento = sc.nextLine();

        Ticket.imprimir(carrito, descuento);

        sc.close();
    }
}
