package ejercicios;

import java.util.Arrays;
import java.util.Random;

public class Propuesto7b {

    /*
     * Reto: Fusion Eficiente de Arrays Ordenados.
     * 
     * Contexto: Se te proporcionan dos arreglos de numeros enteros, arr1 y arr2,
     * los cuales ya se encuentran ordenados de forma ascendente. Desafio:
     * 
     * Implementa una funcion (metodo) que combine ambos arreglos en un unico nuevo
     * arreglo, manteniendo el orden ascendente en todo momento
     * 
     * 
     * Pistas:
     * Debes recorer ambos arreglos simultaneamente usando punteros o indices
     * independientes.
     * 
     * En cada paso debes comparar los elementos actuales de cada arreglo y copiar
     * el menor al arreglo resultante.
     * 
     * Asegurate de gestionar correctamente los casos en los que un arreglo es mas
     * largo que el otro cuando uno de ellos esta vacio
     * 
     */

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

    public static int[] apretujaOrdenado(int[] arr1, int[] arr2) {

        int[] mezcla = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] <= arr2[j])
                mezcla[k++] = arr1[i++];
            else
                mezcla[k++] = arr2[j++];
        }

        while (i < arr1.length)
            mezcla[k++] = arr1[i++];

        while (j < arr2.length)
            mezcla[k++] = arr2[j++];

        return mezcla;
    }

    public static void main(String[] args) {

        // genera dos arrays de 100 posiciones entre 1 y
        // variable valor -->
        int[] uno = new int[70];
        int[] otro = new int[60];

        // generamos aleatoriamente UNO -->
        Random random = new Random();
        for (int i = 0; i < uno.length; i++)
            uno[i] = random.nextInt(350);
        System.out.println(Arrays.toString(uno));

        // generamos aleatoriamente DOS -->
        Random random2 = new Random();
        for (int i = 0; i < otro.length; i++)
            otro[i] = random2.nextInt(525);
        System.out.println(Arrays.toString(otro));

        insertionSort(uno);
        insertionSort(otro);

        System.out.println(Arrays.toString(apretujaOrdenado(uno, otro)));
    }

}
