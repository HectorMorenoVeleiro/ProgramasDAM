package ordenamiento;

import java.util.Arrays;

public class InsertionSort {

    /*
     * 
     * El mecanismo de ordenamiento por inserción -->
     *
     * Se basa en como una persona ordena las cartas en la mano:
     * vas tomando cada carta nueva y la insertas en la posición
     * correcta respecto a las que ya tienes ordenadas.
     * En cada iteración, el algoritmo toma el primer elemento
     * de la zona desordenada y lo inserta en la posición correcta.
     * 
     */

    // Creamos el metodo pasandole un array de Integers -->
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

    // Creamos un main para probar el método -->
    public static void main(String[] args) {

        // Creamos un array de 20 numeros aleatorios -->
        int[] datos = { 2, 5, 0, 9, 3, 1, 8, 4, 7, 6, 2,
                5, 9, 0, 3, 1, 4, 7, 8, 2 };

        // Mostramos ese array para compararlo con su ordenado -->
        System.out.println(Arrays.toString(datos));

        // Ordenamos el array y lo guardamos en si mismo -->
        datos = insertionSort(datos);

        // Mostramos el array ya ordenado -->
        System.out.println(Arrays.toString(datos));

    }
}
