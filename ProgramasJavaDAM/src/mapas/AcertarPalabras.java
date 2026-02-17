package mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class AcertarPalabras {

    public static HashMap<String, String> mapDiccionario;

    public static HashMap<String, String> generaDiccionario() {

        mapDiccionario = new HashMap<>();

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

        Scanner sc = new Scanner(System.in);

        generaDiccionario();

        System.out.println(mapDiccionario.keySet());

        String[] palabras = mapDiccionario.keySet().toArray(new String[0]);

        // contador de aciertos
        int contador = 0;

        for (int i = 0; i < palabras.length; i++) {
            int indice = new Random().nextInt(palabras.length);
            String palabra = palabras[indice];
            System.out.println("traduce la siguiente palabra al ingles --> " + palabra);
            String respuesta = sc.nextLine();
            if (respuesta.equals(mapDiccionario.get(palabra))) {
                contador++;
            }
        }
        System.out.println("Has acertado : " + contador + " palabras");

        sc.close();
    }

}
