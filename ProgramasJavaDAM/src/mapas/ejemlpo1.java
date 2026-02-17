package mapas;

import java.util.ArrayList;

public class ejemlpo1 {

    public static void main(String[] args) {

        ArrayList<String> colores = new ArrayList<String>();

        System.out.println("N de elementos: " + colores.size());

        colores.add("roojo");
        colores.add("verdee");
        colores.add("azull");

        System.out.println("N de elementos: " + colores.size());

        colores.add("blanco");

        System.out.println("N de elementos: " + colores.size());

        System.out.println("El elemento en la posicion 0 es: " + colores.get(0));
        System.out.println("El elemento en la posicion 3 es: " + colores.get(3));

        colores.forEach(
                colo -> System.out.println("el colo res " + colo + " y esta en la posicion " + colores.indexOf(colo)));

    }
}
