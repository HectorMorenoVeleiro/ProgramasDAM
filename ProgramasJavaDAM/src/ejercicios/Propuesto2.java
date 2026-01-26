package ejercicios;

import java.util.Arrays;
import java.util.Random;

public class Propuesto2 {

    /*
     * 2. Realiza un programa uqe cree dos vectores de 100 elementos. El primero
     * almacenará una serie de datos numéricos desordenados. Dichos datos serán
     * datos generados aleatoriamente. El segundo array contendrá los mismos datos
     * pero ordenados por el método insertion sort.
     * 
     */

    // Un método llamado insertion sort -->
    public static int[] insertionSort(int[] numbers) {

        // Iniciamos un fori del rango del array -->
        for (int i = 0; i < numbers.length; i++) {

            // Creamos la variable COPIA -->
            int copyNumber = numbers[i];

            // Creamos un index extra (j), del tamaño de i -->
            int j = i;

            // Bucle while para sustituir los numeros del array -->
            while (j > 0 && copyNumber < numbers[j - 1]) {

                // Sustitución
                numbers[j] = numbers[j - 1];

                // Proceso de regresión del index "j" a 0 -->
                j--;
            }

            // devuelta al array de la variable COPIA -->
            numbers[j] = copyNumber;
        }

        // Devolvemos el array ya ordenado -->
        return numbers;
    }

    public static void main(String[] args) {

        // introduces las variables (arrays de ints) de
        // 100 valores -->
        int[] original = new int[100];
        int[] ordenado = new int[100];

        // generados aleatoriamente -->
        Random random = new Random();
        for (int i = 0; i < original.length; i++) {
            original[i] = random.nextInt(99);
        }

        System.out.println(Arrays.toString(original));

        ordenado = insertionSort(original);

        System.out.println(Arrays.toString(ordenado));
    }

}
