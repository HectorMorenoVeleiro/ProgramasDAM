package ejercicios;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Resuelto9SINREP {

    public static int[] rellena(int numeros[]) {

        Random random = new Random();

        // iniciamos un for para darle valores random a cada
        // instancia del array -->

        int totalNumeros = numeros.length;
        int index = 0;

        numeros[0] = 1 + random.nextInt(99);

        do {

            int valor = 1 + random.nextInt(99);

            for (int i = 0; i < numeros.length; i++) {

                if (valor == numeros[i]) {

                    System.out.println("repe...");
                    break;
                } else {

                    System.out.println("insertado...");
                    numeros[index] = valor;
                    index++;
                }
            }

        } while (index < totalNumeros);

        // devolvemos el array -->
        return numeros;

    }

    public static int buscaBin(int[] a, int valor, int min, int max) {

        // salida -por defecto- del método cuando min = max -->
        if (min == max) {
            System.out.println("salida pq min = max");
            return -1;
        }

        // crea variable mitad = la mitad del minimo y el maximo -->
        int mitad = (min + max) / 2;

        // muestras todas las variables
        System.out.println("min" + min + " a[min]" + a[min] + " max" + max +
                " a[max]" + a[max] + " mitad" + mitad + " --> " + a[mitad]);

        // si la que sea mayor que valor en su posicion,
        // es ese valor mismo -->
        if (valor == a[mitad])
            return mitad;
        if (valor == a[min])
            return min;
        if (valor == a[max])
            return max;

        // si el valor es mayor que a en "mitad" -->
        if (valor > a[mitad])
            return buscaBin(a, valor, mitad + 1, max);
        // si el valor no es mayor que a en "mitad" -->
        else
            return buscaBin(a, valor, min, mitad - 1);
    }

    // empezamos por crear un main para hacer el ejercico -->
    public static void main(String[] args) {

        // iniciamos un Scanner sc (para usarlo mas tarde) -->
        Scanner sc = new Scanner(System.in);

        // creamos la variable numeros (array) de 50 posiciones -->
        int numeros[] = new int[50];

        numeros = rellena(numeros);

        /*
         * el metodo de ordenamiento es el que queramos pero es obligatorio
         * usar uno para realizar una busqeuda binaria -->
         * 
         */

        // muestras el array por pantalla (desordenado) -->
        System.out.println("Desordenado");
        System.out.println(Arrays.toString(numeros));

        // muestras el array por pantalla (ordenado) -->
        Arrays.sort(numeros);
        System.out.println("Ordenado");
        System.out.println(Arrays.toString(numeros));

        // preguntas que numero dentro del array quieres buscar -->
        System.out.println("numero a buscar");

        // lo pides por Scanner -->
        int num = Integer.parseInt(sc.nextLine());

        // buscas el numero y la posicion del numero (con el método recursivo) -->
        int indice = buscaBin(numeros, num, 0, numeros.length - 1);

        /// si el indice es mayor que 0 (esta en el array) muestras
        // el numero y su posicion -->
        if (indice >= 0)
            System.out.println("encontrado el valor " + num +
                    " en la posición " + indice);

        sc.close();

    }

}
