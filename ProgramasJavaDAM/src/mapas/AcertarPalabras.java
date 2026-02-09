package mapas;

import java.util.HashMap;
import java.util.Map;

public class AcertarPalabras {

    public static HashMap<String, String> generaDiccionario() {

        HashMap<String, String> mapDiccionario = new HashMap<>();

        mapDiccionario.put("gato", "cat");
        mapDiccionario.put("perro", "dog");
        mapDiccionario.put("casa", "house");
        mapDiccionario.put("libro", "book");
        mapDiccionario.put("coche", "car");
        mapDiccionario.put("árbol", "tree");
        mapDiccionario.put("comida", "food");
        mapDiccionario.put("agua", "water");
        mapDiccionario.put("fuego", "fire");
        mapDiccionario.put("cielo", "sky");

        System.out.println("--- contenido del diccionario ---");
        for (Map.Entry<String, String> entrada : mapDiccionario.entrySet()) {
            System.out.println(entrada.getKey() + " en ingles es: " + entrada.getValue());
        }

        return mapDiccionario;
    }

    public static void main(String[] args) {

    }
}
