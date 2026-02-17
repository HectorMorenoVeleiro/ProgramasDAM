package mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Propuesto2 {

    /*
     * Ejercicio10
     * Crea un mini-diccionario de palabras traducidas del español al ingles y
     * viceversa
     * Con su correspondiente traducción ( hashmap )
     */
    static void main(String[] args) {

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

        System.out.println(mapDiccionario.keySet());

        Random random = new Random();
        String[] palabras = (String[]) mapDiccionario.keySet().toArray(new String[0]);
        int indice = new Random().nextInt(99);
        // buscar palabra especifica
        String buscar = palabras[random.nextInt(palabras.length)];

        System.out.println("\nBusqueda de " + buscar + " : " + mapDiccionario.get(buscar) + " in " + indice);

    }
}
