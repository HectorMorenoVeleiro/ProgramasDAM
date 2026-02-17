package mapas;

import java.util.ArrayList;

public class Ejemplo2 {
    public static void main(String[] args) {

        ArrayList<String> colores = new ArrayList<String>();

        colores.add("rojo");
        colores.add("azul");
        colores.add("verde");
        colores.add("blanco");
        colores.add("amarillo");

        System.out.println("Contenido de la lista: ");

        for (int i = 0; i < colores.size(); i++)
            System.out.println(colores.get(i));

        System.out.println("Contenido de la lista again: ");
        for (String lin : colores)
            System.out.println(lin); // ambos sirven

        // otra opcion
        colores.forEach(colo -> System.out.println("el color es: " + colo +
                " y esta en la posicion " + colores.indexOf(colo)));
    }

}
