package ejercicios;

import java.util.Random;

public class Propuesto7 {

    /*
     * 7. Realiza un metodo que tome como parametros de entrada dos arrays de
     * enteros y devuelva como salida un unico array con los elementos de los
     * anteriores arrays ordenados
     * 
     */

    public static void main(String[] args) {

        // genera dos arrays de 100 posiciones entre 1 y
        // variable valor -->
        int[] uno = new int[70];
        int[] otro = new int[60];

        // generamos aleatoriamente UNO -->
        Random random = new Random();
        for (int i = 0; i < uno.length; i++) {
            uno[i] = random.nextInt();
        }
    }
}
