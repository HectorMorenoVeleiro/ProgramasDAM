package ejercicios;

import java.util.Arrays;
import java.util.Random;

public class Propuesto9 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] aleatorios = new int[100];

        for (int i = 0; i < aleatorios.length; i++) {
            aleatorios[i] = 10 + random.nextInt(100);
        }

        System.out.println(Arrays.toString(aleatorios));

        // ordeno
        // Arrays.sort(Aleatorio);
        // System.out.println(Arrays.toString(aleatorios));
        int max = aleatorios[0], min = aleatorios[0];
        int total = 0;

        for (int i : aleatorios) {
            if (i >= max) {
                max = i;
            }
            if (i <= min) {
                min = i;
            }
            total += i;
        }

        System.out.println("máximo es -> " + max);
        System.out.println("mínimo es -> " + min);
        System.out.println("la media es -> " + (double) (total / aleatorios.length));
    }
}
