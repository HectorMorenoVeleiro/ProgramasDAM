package ejercicios;

import java.util.Random;

public class Propuesto8 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] aleatorios = new int[1000];

        for (int i = 0; i < aleatorios.length; i++) {
            aleatorios[i] = random.nextInt(500);
        }
    }

}
