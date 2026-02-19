package mapas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Ejercicio2 {

    /*
     * Realiza un programa que introduzca valores aleatorios entre 0 y 100 en un
     * arraylist y que luego calcule la suma, la media, el maximo y el minimo de
     * esos numeros. El tamaño de la lista tambien sera aleatorio y podra oscilar
     * entre 10 y 20 elementos ambos inclusive
     */
    static int adicion = 0;

    public static void main(String[] args) {
        Random rand = new Random();

        int elementos = (rand.nextInt(11)) + 10;
        System.out.println("el numero de elementos de la lista es un: " + elementos);

        List<Integer> numeros = new ArrayList<Integer>();

        for (int i = 0; i < elementos; i++)
            numeros.add(rand.nextInt(100));

        System.out.println(numeros);

        int pequeño = Collections.min(numeros);
        int grande = Collections.max(numeros);

        System.out.println("\nEl pequeños es: " + pequeño + ", \ny el mayor es: " + grande);

        int sumatorio = 0;

        for (int i = 0; i < elementos; i++) {
            sumatorio += numeros.get(i);
        }

        System.out.println("la suma es -> " + sumatorio);
        System.out.println("el promedio es: " + sumatorio / (double) elementos);

        numeros.forEach(item -> adicion += item);
        System.out.println(adicion);

        int adition = numeros.stream().mapToInt(Integer::intValue).sum();

    }
}
