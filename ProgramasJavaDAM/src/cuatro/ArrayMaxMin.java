package cuatro;

import java.util.Arrays;

public class ArrayMaxMin {

    public static void main(String[] args) {
        int[] datos = { 1, 2, 3, 3, 4, 4, 5, 2 };

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.println(Arrays.toString(datos));

        for (Integer entero : datos) {
            if (entero > max)
                max = entero;
            if (entero < min)
                min = entero;
        }
    }
}
