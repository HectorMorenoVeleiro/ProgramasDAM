package ordenamiento;

import java.util.Arrays;

public class BubbleSort {

    public static void burbujaFloat() {
        double[] masDatos = { 1.5, 4.2, 0.8, 9.1, 3.3, 1.9, 8.4, 4.7, 7.0, 6.2, 2.1, 5.5, 9.9, 0.2, 3.8, 1.1, 4.4, 7.6,
                8.3, 2.9 };
        double swap2 = 0;
        System.out.println(Arrays.toString(masDatos));

        for (int i = 1; i < masDatos.length; i++) {
            for (int j = 0; j < i; j++) {
                if (masDatos[j] > masDatos[i]) {
                    swap2 = masDatos[j];
                    masDatos[j] = masDatos[i];
                    masDatos[i] = swap2;
                }
            }
        }

        System.out.println(Arrays.toString(masDatos));
    }

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
        System.out.println("hola pepe");

        System.out.println("\n\n");

        burbujaFloat();
    }
}
