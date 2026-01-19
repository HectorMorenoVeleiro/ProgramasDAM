package ordenamiento;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int datos[] = { 2, 5, 0, 9, 3, 1, 8, 4, 7, 6, 2, 5, 9, 0, 3, 1, 4, 7, 8, 2 };
        int swap = 0;

        System.out.println(String.valueOf(swap) + " " + Arrays.toString(datos));

        for (int i = 1; i < datos.length; i++) {

            for (int j = 0; j < i; j++) {

                if (datos[j] > datos[i]) {
                    swap = datos[j];
                    datos[j] = datos[i];
                    datos[i] = swap;
                }
            }
        }

        System.out.println(String.valueOf(swap) + " " + Arrays.toString(datos));
    }
}
