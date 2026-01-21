package ordenamiento;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] datos = new int[1000000];

        for (int i = 0; i < datos.length; i++) {
            datos[i] = (int) (Math.random() + 1) * 10;
        }

        System.out.println("datos desordenados: ");
        System.out.println(Arrays.toString(datos));

        quicksort(datos, 0, datos.length - 1);

        System.out.println("datos ordenados: ");
        System.out.println(Arrays.toString(datos));
    }

    public static void quicksort(int[] array, int izq, int der) {
        if (izq < der) {
            int indicePivote = particion(array, izq, der);
            quicksort(array, izq, indicePivote - 1);
            quicksort(array, indicePivote + 1, der);
        }
    }

    private static int particion(int[] arreglo, int izq, int der) {
        // Elegimos el último elemento como pivote
        int pivote = arreglo[der];
        int i = (izq - 1);

        for (int j = izq; j < der; j++) {
            if (arreglo[j] <= pivote) {
                i++;
                // Intercambio
                int temporal = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = temporal;
            }
        }

        // Colocar el pivote en su posición final
        int temporal = arreglo[i + 1];
        arreglo[i + 1] = arreglo[der];
        arreglo[der] = temporal;

        return i + 1;
    }
}
