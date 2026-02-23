package mapas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/*
  * Un supermercado de productos ecologicos nos ha pedido hacer un programa para
  * vender su mercancia. En esta primera version del programa se tendran en
  * cuenta los productos que se indican en la tabla junto con su precio. Los
  * productos se venden en vote, brick, etc. Cuando se realiza la compra, hay que
  * indicar el producto y el numero de unidades que se compran, por ejemplo
  * "guisantes" si se quiere comprar un bote de guisantes y la cantidad, por
  * ejemplo "3" si se queiren comprar 3 botes. La compra se termina con la
  * palabra "fin". Suponemos que el usuario no va a intentar comprar un producto
  * que no existe. Utiliza un diccionario para almacenar los nombres y precios de
  * los productos y una o varias listas para almacenar la compra que realiza el
  * usuario. A continuacion se muestra una tabla con los productos disponibles y
  * sus respectivos precios:
  * avena: 2.21
  * grabanzos: 2.39
  * tomate: 1.59
  * jengibre: 3.13
  * quinoa: 4.50
  * guistantes: 1.60
  */

public class Ecologico {

    public static HashMap<String, Float> contar = new HashMap<String, Float>() {
        {
            put("avena", 2.21f);
            put("garbanzos", 2.39f);
            put("tomate", 1.59f);
            put("jengibre", 3.13f);
            put("quinoa", 4.50f);
            put("guisantes", 1.60f);
        }
    };

    static String productos[] = { "avena", "garbanzos", "tomate", "jengibre", "guinoa", "guisantes" };

    String producto;
    float cantidad;

    Ecologico() {
        Random r = new Random();
        this.producto = productos[r.nextInt(6)];
    }

    Ecologico(String producto, float cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public static HashMap<String, Float> getContar() {
        return contar;
    }

    public static void setContar(HashMap<String, Float> contar) {
        Ecologico.contar = contar;
    }

    public static String[] getProductos() {
        return productos;
    }

    public static void setProductos(String[] productos) {
        Ecologico.productos = productos;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((producto == null) ? 0 : producto.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Ecologico other = (Ecologico) obj;
        if (producto == null) {
            if (other.producto != null)
                return false;
        } else if (!producto.equals(other.producto))
            return false;
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Listas para almacenar la compra
        Map<String, Float> productosJuntos = new HashMap<String, Float>();

        System.out.println("Introduce productos y cantidades. Escribe 'fin' para terminar.");

        String producto = "a";

        while (true) {
            System.out.print("Producto: ");
            producto = sc.nextLine();
            if (producto.equals("fin")) {
                break;
            }
            System.out.println("Cantidad: ");
            float cantidad = Float.parseFloat(sc.nextLine());

            if (productosJuntos.containsKey(producto)) {
                float cantidadAnterior = productosJuntos.get(producto);
                productosJuntos.put(producto, cantidadAnterior + cantidad);
            } else {
                productosJuntos.put(producto, cantidad);
            }
        }

        // Mostrar ticket
        float total = 0;

        System.out.println("\n===== TICKET DE COMPRA =====");
        System.out.printf("%-12s %-10s %-10s %-10s\n", "Producto", "Cant.", "Precio", "Subtotal");
        System.out.println("---------------------------------------------");

        for (Map.Entry<String, Float> product : productosJuntos.entrySet()) {
            String prod = product.getKey();
            float cant = product.getValue();
            float precio = contar.get(prod);
            float subtotal = precio * cant;
            total += subtotal;

            System.out.printf("%-12s %-10.2f %-10.2f %-10.2f\n", prod, cant, precio, subtotal);
        }

        System.out.println("---------------------------------------------");
        System.out.printf("Subtotal: %.2f\n", total);
        System.out.println("---------------------------------------------");
        System.out.printf("Subtotal: %.2f\n", total);

        System.out.println("introduce un descuento: ");
        String descuento = sc.nextLine();

        if (descuento.equals("ECODTO"))
            total = total - (total * 0.1f);

        System.out.printf("TOTAL: %.2f\n", total);

        sc.close();
    }

}
