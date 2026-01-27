package ejercicios;

import java.util.Arrays;
import java.util.Random;

public class Propuesto7 {

    /*
     * 7. Realiza un metodo que tome como parametros de entrada dos arrays de
     * enteros y devuelva como salida un unico array con los elementos de los
     * anteriores arrays ordenados -->
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

    public static int[] ordenaYJunta(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int j = a.length, k = 0; j < c.length; j++, k++) {
            c[j] = b[k];
        }

        return insertionSort(c);
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

        int[] ordenadasYJuntas = ordenaYJunta(uno, otro);

        System.out.println(Arrays.toString(ordenadasYJuntas));
    }
}
