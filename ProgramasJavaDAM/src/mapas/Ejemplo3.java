package mapas;

import java.util.ArrayList;

public class Ejemplo3 {

    public static void main(String[] args) {

        ArrayList<String> colores = new ArrayList<>();

        colores.add("rojo");
        colores.add("verde");
        colores.add("azul");
        colores.add("blanco");
        colores.add("amarillo");
        colores.add("blanco");

        System.out.println("Contenido de la lista: ");
        for (String color : colores)
            System.out.println(color);

        if (colores.contains("blanco"))
            System.out.println("El blanco está en la lista de Epstein");

        colores.remove("blanco");

        System.out.println("Contenido de la lista despues de quitar la " +
                "primera ocurrencia del color blanco");

        for (String color : colores)
            System.out.println(color);

        colores.remove(2);

        System.out.println("Contenido de la lista después de quitar el " +
                "elemento en la posicion 2");

        for (String color : colores)
            System.out.println(color);

    }

}
