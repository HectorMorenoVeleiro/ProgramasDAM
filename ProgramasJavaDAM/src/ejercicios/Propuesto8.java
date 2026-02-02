package ejercicios;

import java.util.Random;
import java.util.Arrays;

public class Propuesto8 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] aleatorios = new int[1000];

        for (int i = 0; i < aleatorios.length; i++) {
            aleatorios[i] = random.nextInt(500);
        }

        System.out.println(Arrays.toString(aleatorios));

        // opcion1 -->
        Arrays.sort(aleatorios);

        // genero lista con 10 +altos -->
        int[] altos = new int[10];

        altos = Arrays.copyOfRange(aleatorios, 990, 999);
        System.out.println("Los 10 mas altos son --> ");
        System.out.println(Arrays.toString(aleatorios));

        
    }

}
