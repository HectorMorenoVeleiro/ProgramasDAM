package mapas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class EjercicioPropuesto10 {

    /*
     * 10.
     * Realiza un programa que cree un array de 100 posiciones con numeros
     * aleatorios entre 1 y 100. Una vez creado el array el programa debera
     * ordenarlo y mostrar los numeros entre 1 y 100 que no han aparecido.
     */

    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++)
            array[i] = 1 + random.nextInt(99);

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        List<Integer> faltantes = new ArrayList<Integer>();

        for (Integer num : array) {
            if (!Arrays.binarySearch(array, num)) {
                faltantes.add(num);
            }

        }
    }
}
