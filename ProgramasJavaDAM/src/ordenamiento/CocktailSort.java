package ordenamiento;

import java.util.Arrays;

public class CocktailSort {

    public static int[] cocktailSortMethot(int[] numbers) {
        boolean swapped = true;
        int i = 0;
        int j = numbers.length - 1;
        while (i < j && swapped) {
            swapped = false;
            for (int k = i; k < j; k++) {
                if (numbers[k] > numbers[k + 1]) {
                    int temp = numbers[k];
                    numbers[k] = numbers[k + 1];
                    numbers[k + 1] = temp;
                    swapped = true;
                }
            }
            j--;
            if (swapped) {
                swapped = false;
                for (int k = j; k > i; k--) {
                    if (numbers[k] < numbers[k - 1]) {
                        int temp = numbers[k];
                        numbers[k] = numbers[k - 1];
                        numbers[k - 1] = temp;
                        swapped = true;
                    }
                }
            }
            i++;
        }
        return numbers;
    }

    public static void main(String[] args) {
        // a.k.a. Burbuja bidireccional

        int datos[] = { 2, 5, 0, 9, 3, 1, 8, 4, 7, 6, 2, 5, 9, 0, 3, 1, 4, 7, 8, 2 };

        System.out.println(Arrays.toString(datos));

        System.out.println(Arrays.toString(cocktailSortMethot(datos)));

    }

}
