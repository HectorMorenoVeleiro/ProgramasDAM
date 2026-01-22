package ordenamiento;

import java.util.Arrays;

public class BubbleSort {

    public static double[] burbujaFloat(double[] masDatos) {
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
        return masDatos;
    }

    public static int[] burbujaInteger(int[] Datos) {
        int swap = 0;
        for (int i = 1; i < Datos.length; i++) {

            for (int j = 0; j < i; j++) {

                if (Datos[j] > Datos[i]) {
                    swap = Datos[j];
                    Datos[j] = Datos[i];
                    Datos[i] = swap;
                }
            }
        }
        return Datos;
    }

    public static void main(String[] args) {
        int datos[] = { 2, 5, 0, 9, 3, 1, 8, 4, 7, 6, 2, 5, 9,
                0, 3, 1, 4, 7, 8, 2 };

        System.out.println(Arrays.toString(datos));

        burbujaInteger(datos);

        System.out.println(Arrays.toString(datos));

        System.out.println("\n\n");

        double[] masDatos = { 1.5, 4.2, 0.8, 9.1, 3.3, 1.9, 8.4,
                4.7, 7.0, 6.2, 2.1, 5.5, 9.9, 0.2, 3.8, 1.1, 4.4,
                7.6, 8.3, 2.9 };

        System.out.println(Arrays.toString(masDatos));

        burbujaFloat(masDatos);

        System.out.println(Arrays.toString(masDatos));
    }
}
