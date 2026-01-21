package ordenamiento;

import java.util.Arrays;
import java.util.Random;

public class MergeSort2 {

    /*
     * Pasado el algoritmo de ordenamiento MergeSort vamos a tratar de acoplar el
     * algoritmo y volver a repetir el ejercicio del merge con cadenas
     * 
     */

    public static String[] mergeSort(String array[])
    // pre: array is full, all elements are valid integers (not null)
    // post: array is sorted in ascending order (lowest to highest)
    {

        // if the array has more than 1 element, we need to split it and merge the
        // sorted halves
        if (array.length > 1) {

            // number of elements in sub-array 1
            // if odd, sub-array 1 has the smaller half of the elements
            // e.g. if 7 elements total, sub-array 1 will have 3, and sub-array 2 will have
            // 4
            int elementsInA1 = array.length / 2;

            // we initialize the length of sub-array 2 to
            // equal the total length minus the length of sub-array 1
            int elementsInA2 = array.length - elementsInA1;

            // declare and initialize the two arrays once we've determined their sizes
            String arr1[] = new String[elementsInA1];
            String arr2[] = new String[elementsInA2];

            // copy the first part of 'array' into 'arr1', causing arr1 to become full
            for (int i = 0; i < elementsInA1; i++)

                arr1[i] = array[i];

            // copy the remaining elements of 'array' into 'arr2', causing arr2 to become
            // full
            for (int i = elementsInA1; i < elementsInA1 + elementsInA2; i++)
                arr2[i - elementsInA1] = array[i];

            // recursively call mergeSort on each of the two sub-arrays that we've just
            // created
            // note: when mergeSort returns, arr1 and arr2 will both be sorted!
            // it's not magic, the merging is done below, that's how mergesort works :)
            arr1 = mergeSort(arr1);
            arr2 = mergeSort(arr2);

            // the three variables below are indexes that we'll need for merging
            // [i] stores the index of the main array. it will be used to let us
            // know where to place the smallest element from the two sub-arrays.
            // [j] stores the index of which element from arr1 is currently being compared
            // [k] stores the index of which element from arr2 is currently being compared
            int i = 0, j = 0, k = 0;

            // the below loop will run until one of the sub-arrays becomes empty
            // in my implementation, it means until the index equals the length of the
            // sub-array
            while (arr1.length != j && arr2.length != k) {

                // if the current element of arr1 is less than current element of arr2
                if (arr1[j].compareTo(arr2[k]) < 0) {

                    // copy the current element of arr1 into the final array
                    array[i] = arr1[j];

                    // increase the index of the final array to avoid replacing the element
                    // which we've just added
                    i++;

                    // increase the index of arr1 to avoid comparing the element
                    // which we've just added
                    j++;
                }
                // if the current element of arr2 is less than current element of arr1
                else {

                    // copy the current element of arr2 into the final array
                    array[i] = arr2[k];

                    // increase the index of the final array to avoid replacing the element
                    // which we've just added
                    i++;

                    // increase the index of arr2 to avoid comparing the element
                    // which we've just added
                    k++;
                }
            }

            // at this point, one of the sub-arrays has been exhausted and there are no more
            // elements in it to compare. this means that all the elements in the remaining
            // array are the highest (and sorted), so it's safe to copy them all into the
            // final array.
            while (arr1.length != j) {
                array[i] = arr1[j];
                i++;
                j++;
            }

            while (arr2.length != k) {
                array[i] = arr2[k];
                i++;
                k++;
            }
        }
        return array;
    }

    public static void main(String[] args) {

        String[] hombres = { "Alejandro", "Carlos", "Javier", "Diego", "Pablo", "Sergio", "David", "Rubén", "Manuel",
                "Adrián", "Iván", "Óscar", "Raúl", "Álvaro", "Mario", "Tomás", "Samuel", "Gonzalo", "Hugo", "Mateo",
                "Bruno", "Nicolás", "Lucas", "Martín", "Rafael", "Fernando", "Jorge", "Luis", "Enrique", "Víctor",
                "Jaime",
                "Andrés", "Eduardo", "Iker", "Saúl", "Ángel", "Cristian", "Marcos", "Joel", "Sebastián", "Thiago",
                "Gael",
                "Adriel", "Damián", "Elías", "Max", "Leo", "Héctor" };

        // Creamos el array de mujeres -->
        String[] mujeres = { "María", "Lucía", "Sofía", "Laura", "Elena", "Ana", "Carmen", "Paula", "Claudia", "Irene",
                "Sara", "Marta", "Julia", "Noelia", "Natalia", "Alicia", "Beatriz", "Rocío", "Patricia", "Eva",
                "Verónica",
                "Daniela", "Andrea", "Marina", "Isabel", "Teresa", "Lidia", "Nerea", "Ariadna", "Silvia", "Lorena",
                "Ainhoa", "Esther", "Alba", "Mónica", "Pilar", "Belén", "Helena", "Jimena", "Olga", "Amaya", "Carla",
                "Manuela", "Violeta", "Luna", "Valeria", "Emma", "Clara" };

        // Creamos el array de 100 posiciones -->
        String[] nombresMezclados = new String[100];
        Random random = new Random();

        // Rellenamos el array nuevo -->
        for (int i = 0; i < nombresMezclados.length; i++) {

            // Decidimos al azar si toca hombre o mujer -->
            int genero = random.nextInt(2);

            // Elegimos un nombre al azar de la lista correspondiente -->
            int indiceNombre = random.nextInt(10);

            // ifelse para asignar valores al array -->
            if (genero == 0)
                nombresMezclados[i] = hombres[indiceNombre];
            else
                nombresMezclados[i] = mujeres[indiceNombre];

        }

        System.out.println(Arrays.toString(nombresMezclados));

        nombresMezclados = mergeSort(nombresMezclados);

        System.out.println(Arrays.toString(nombresMezclados));

    }

}
