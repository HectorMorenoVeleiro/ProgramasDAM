package ordenamiento;

import java.util.Arrays;

public class SelectionSort {

    public static int[] selectionSort(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {

            int index = i;

            // encuentra numero + pequeño
            for (int j = i + 1; j < numbers.length; j++)
                if (numbers[j] < numbers[index])
                    index = j;

            // intercambio
            int smallerNumber = numbers[index];
            numbers[index] = numbers[i];
            numbers[i] = smallerNumber;
            // finIntercambio
        }

        return numbers;
    }

    public static void main(String[] args) {

        int[] datos = { 2, 5, 0, 9, 3, 1, 8, 4, 7, 6, 2, 5, 9, 0, 3, 1, 4, 7, 8, 2 };

        System.out.println(Arrays.toString(datos));

        datos = selectionSort(datos);

        System.out.println(Arrays.toString(datos));

    }

}
