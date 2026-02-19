package mapas;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {

    /*
     * Crea ArrayList con nombres de 6 compañeros de clase. A continuacion muestra
     * esos nombres por pantalla. Utiliza para ello un bucle for que recorra todo el
     * array sin usar ningun indice
     */

    public static void main(String[] args) {

        List<String> compis = new ArrayList<>();
        compis.add("Yelmi");
        compis.add("Jorge");
        compis.add("Anxo Fonterosa");
        compis.add("Laura S");
        compis.add("Manuel C");
        compis.add("Fermin");
        compis.add("PollADura");

        System.out.println("enhanced");
        for (String puntero : compis)
            System.out.println(puntero); // es un puntero vale para apuntar y ya

        System.out.println("foreach");
        compis.forEach(item -> System.out.println(item));

    }
}
