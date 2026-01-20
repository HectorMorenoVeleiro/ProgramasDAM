package ordenamiento;

import java.util.Arrays;
import java.util.Random;

public class Cocktail2 {

    public static float[] cocktailSortMethot(float[] numbers) {
        boolean swapped = true;
        int i = 0;
        int j = numbers.length - 1;
        while (i < j && swapped) {
            swapped = false;
            for (int k = i; k < j; k++) {
                if (numbers[k] > numbers[k + 1]) {
                    float temp = numbers[k];
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
                        float temp = numbers[k];
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

        // 1. Declaramos el array de 100 posiciones
        float[] notas = new float[100];
        Random random = new Random();

        // 2. Llenamos el array con el bucle for
        for (int i = 0; i < notas.length; i++) {
            // nextFloat() genera entre 0.0 y 1.0, por eso
            // multiplicamos por 10
            notas[i] = random.nextFloat() * 10;
        }

        System.out.println(Arrays.toString(notas));

        notas = cocktailSortMethot(notas);

    }
}
