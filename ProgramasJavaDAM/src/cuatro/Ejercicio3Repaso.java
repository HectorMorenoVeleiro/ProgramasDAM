package cuatro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Ejercicio3Repaso {

    /*
     * Genera un array de 50 posiciones FLOTANTES que tomaran valores entre -100 y
     * 100. Separe en dos matrices los valores positivos y negativos. Ordene ambos
     * arrays por el metodo Merge Sort.
     * 
     * Considere el cero positivo. A continuacion, separe el array de positivos en
     * dos arrays, uno de pares y otro de impares (use casteo); muestre ambos
     */

    public static Float[] mergeSort(Float[] flotantes) {

        // creamos un booleano q nos marque el final del bucle -->
        boolean verdadero;

        // entramos en un do-while para no inicializar el booleano -->
        do {
            // lo instanciamos a falso, ya que si no se cumple ninguna condicion saldremos
            // del bucle -->
            verdadero = false;

            for (int i = 0; i < flotantes.length; i++) {
                // escoge 2 valores seguidos en el bucle y los compara, si el de adelante
                // es mas pequeño se sustituyen -->
                if (i < flotantes.length - 1 && flotantes[i] > flotantes[i + 1]) {
                    float auxiliar = flotantes[i];
                    flotantes[i] = flotantes[i + 1];
                    flotantes[i + 1] = auxiliar;
                    // si hace falta ordenar el bucle salimos automaticamente
                    verdadero = true;
                } // if
            } // fori
        } while (verdadero); // do-while

        return flotantes;
    } // mergeSort

    public static void main(String[] args) {

        // creamos un random para aleatorizar -->
        Random rd = new Random();

        // lo primero crear un array de 50 posiciones -->
        Float[] flotantes = new Float[50];

        // creamos los arrays y listas posit y negat sin instanciar -->
        Float[] positArr;
        Float[] negatArr;
        List<Float> positList = new ArrayList<>();
        List<Float> negatList = new ArrayList<>();

        // ordenamiento de flotantes -->
        for (int i = 0; i < flotantes.length; i++)
            flotantes[i] = rd.nextFloat(-100, 100);

        System.out.println(Arrays.toString(flotantes));
        System.out.println("---------------------------------");

        // ordenamos -->
        flotantes = mergeSort(flotantes);

        // mostramos por pantalla -->
        System.out.println(Arrays.toString(flotantes));

        // guardamos los positivos y negativos en sus respectivas listas -->

        for (Float flotito : flotantes)
            if (flotito < 0)
                negatList.add(flotito);
            else
                positList.add(flotito);

        // casteamos a arrayFloat -->
        positArr = positList.toArray(new Float[0]);
        negatArr = negatList.toArray(new Float[0]);

        // mostramos por pantalla -->
        System.out.println(Arrays.toString(positArr));
        System.out.println(Arrays.toString(negatArr));

        System.out.println("ahora hay que volver a crear un método asi aura arua: ");

    } // main

} // class
