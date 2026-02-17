package mapas;

import java.util.ArrayList;
import java.util.Vector;

public class EjemploVector {

    public static void main(String[] args) {
        // 1. Crear un Vector de Strings
        // El 10 es la capacidad inicial, el 5 es cuánto aumenta si se llena
        Vector<String> listaSuper = new Vector<>(10, 5);

        // 2. Añadir elementos
        listaSuper.add("Leche");
        listaSuper.add("Huevos");
        listaSuper.add("Pan");
        listaSuper.add("Café");

        // 3. Insertar en una posición específica
        listaSuper.insertElementAt("Fruta", 1);

        // 4. Eliminar un elemento
        listaSuper.remove("Huevos");

        // 5. Recorrer el Vector
        System.out.println("--- Lista de la Compra ---");
        for (String item : listaSuper) {
            System.out.println("Producto: " + item);
        }

        // 6. Datos curiosos del Vector
        System.out.println("\n--- Info del Vector ---");
        System.out.println("Tamaño actual (elementos): " + listaSuper.size());
        System.out.println("Capacidad total del contenedor: " + listaSuper.capacity());

        // como se pasa esto a una lista ->
        // en listaSuper.size tienes el tamaño actual del vector (el tamaño)
        // en listaSuper.capacity tienes el tamaño total (la capaidad)

        // está en listaSuper
        ArrayList<String> listaAArray = new ArrayList<>();

        listaAArray.add("Leche");
        listaAArray.add("Huevos");
        listaAArray.add("Pan");
        listaAArray.add("Cafe");

        // insertar o eliminar
        listaAArray.add(1, "Fruta");
        listaAArray.remove("Huevos");

        // recorrer
        listaAArray.forEach(item -> System.out.println("producto " + item));
    }
}
