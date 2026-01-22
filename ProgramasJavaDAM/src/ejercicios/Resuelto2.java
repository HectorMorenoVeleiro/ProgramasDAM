package ejercicios;

import java.util.Arrays;
import java.util.Random;

public class Resuelto2 {

    /*
     * Ejercicio 2. Programa que genere un vector de 50 posiciones cargado con
     * valores aleatorios. Los valores aleatorios deberán estar entre el 1 y el 100,
     * una vez cargado el vector deberá ser ordenado mediante el método burbuja -->
     * 
     */

    public static void main(String[] args) {

        int[] numeros = new int[50];
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++)
            numeros[i] = 1 + random.nextInt(99);

        System.out.println("Array desordenado :");
        System.out.println(Arrays.toString(numeros));

        // "voy a ordenar en vez de por bubble por la patilla" Pepe, 1DAM
        Arrays.sort(numeros);
    }
}
