package ordenamiento;

import java.util.Random;

public class Cocktail2 {

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
    }
}
