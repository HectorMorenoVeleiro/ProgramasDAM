package ejercicioscuentapropia;

import java.util.HashMap;
import java.util.Map;

public class EjMap01 {
    /*
     * Dado un String, cuenta cuántas veces aparece cada palabra usando un
     * Map<String, Integer>.
     */

    public static void main(String[] args) {

        String palabra = null;

        for (int i = 0; i < ((Math.random() * 26) + 'A'); i++) {
            palabra += (char) i;
            palabra += " ";
        }

        String[] palabras = palabra.split(" ");

        Map<String, Integer> mapaString = new HashMap<>();

        for (String i : palabras) {
            if (mapaString.containsKey(i)) {
                mapaString.put(i, mapaString.get(i) + 1);
            } else {
                mapaString.put(i, 1);
            }
        }

        System.out.println(mapaString.toString());

    }
}
