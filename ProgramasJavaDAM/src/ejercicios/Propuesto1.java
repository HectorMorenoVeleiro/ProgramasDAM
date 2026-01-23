package ejercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Propuesto1 {

    /*
     * imaginate que los numeros estan ya ordenados (cosa muy improbable utilizando
     * numeros aleatorios). Modifica el ejercicio anterior para que el procedimiento
     * ordene y no de mas pasadas de las necesarias -->
     * 
     */

    public static void main(String[] args) {

        // declaramos el array de 50 posiciones -->
        int numeros[] = new int[50];
        Random random = new Random();

        // llenamos el array con el bucle -->
        for (int i = 0; i < numeros.length; i++)
            numeros[i] = 1 + random.nextInt(99);

        System.out.println("array desordenado :");
        System.out.println(Arrays.toString(numeros));

        // en vez de ordenar por buble ordenamos
        // por patilla -->

        // array ordenado -->
        System.out.println("array ordenado :");
        System.out.println(Arrays.toString(numeros));

    }
}
