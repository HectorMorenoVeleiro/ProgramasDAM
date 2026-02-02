package ejercicios;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio1Interseccion {

    /*
     * Contexto: Tienes dos arrays de IDs de productos, almacenA y almacenB. Ambos
     * arrays están ordenados de forma ascendente. Tu tarea es encontrar qué
     * productos están presentes en ambos almacenes.
     * El Desafío: Escribe un método que devuelva un nuevo array con los elementos
     * comunes (intersección) de ambos arrays, sin duplicados.
     * Restricciones: * No puedes usar estructuras de datos adicionales como HashSet
     * o ArrayList
     * 
     */

    public static int[] insertionSort(int[] numbers) {

        // Iniciamos un fori del rango del array -->
        for (int i = 0; i < numbers.length; i++) {

            // Creamos la variable COPIA -->
            int copyNumber = numbers[i];

            // Creamos un index extra (j), del tamaño de i -->
            int j = i;

            // Bucle while para sustituir los numeros del array -->
            while (j > 0 && copyNumber < numbers[j - 1]) {

                // Sustitución
                numbers[j] = numbers[j - 1];

                // Proceso de regresión del index "j" a 0 -->
                j--;
            }

            // devuelta al array de la variable COPIA -->
            numbers[j] = copyNumber;
        }

        // Devolvemos el array ya ordenado -->
        return numbers;
    }

    public static int[] interseccionArrays(int[] arr1, int[] arr2) {

        int[] interseccion;

        // condicionas si uno es mayor que otro para tener claro el rango del array (y
        // que no sea menor) -->
        if (arr1.length > arr2.length)
            interseccion = new int[arr1.length];
        else
            interseccion = new int[arr2.length];

        // creas el index para arr1, arr2 y array interseccion -->
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {

            // comparas si los arrays son iguales -->
            if (arr1[i] == arr2[j]) {

                // haces una condicion para solo pasar aquellos valores
                // que no se repitan en el array (por ejemplo si
                // fuera {0, 0, 1, 2}, donde el 0 se repite 2 veces) -->
                if (k == 0 || interseccion[k - 1] != arr1[i]) {
                    interseccion[k++] = arr1[i];
                }

                // aumentas el contador en ambos porque se han cambiado
                // correctamente -->
                i++;
                j++;

                // si un valor de uno es mayor que el de otro, se
                // aumenta el contador de aquel que es mas pequeño
                // para ver si este es igual -->
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }

        // devuelves el array ya ordenado -->
        return interseccion;
    }

    public static void main(String[] args) {

        // array de valores B
        String[] almacenB = { "Adriana", "Alberto", "Alicia", "Amparo", "Ana", "Beatriz", "Berta", "Bruno", "Camila",
                "Carlos", "Carmen", "Clara", "Daniel", "Dario", "Diego", "Elena", "Emilia", "Ernesto", "Fabian",
                "Felipe", "Gabriel", "Gema", "Gonzalo", "Hector", "Hugo", "Irene", "Isabel", "Ivan", "Javier", "Jimena",
                "Jorge", "Julia", "Laura", "Lucia", "Luis", "Manuel", "Marcos", "Marta", "Mateo", "Miguel" };

        // array de valores A
        String[] almacenA = { "Aitana", "Alba", "Alejandro", "Alex", "Alvaro", "Barbara", "Benito", "Bernardo",
                "Bianca", "Borja", "Candela", "Carla", "Cecilia", "Celia", "Cristina", "Diana", "Domingo", "Eduardo",
                "Elias", "Emilio", "Esteban", "Eugenia", "Federico", "Fernando", "Francisco", "Gerardo", "Gloria",
                "Guillermo", "Ignacio", "Ines", "Jacobo", "Janet", "Joaquin", "Jon", "Jose", "Kevin", "Lara", "Leire",
                "Leo", "Lorena", "Marina", "Mario", "Nerea", "Nicolas", "Noelia" };

        int[] datosA = new int[almacenA.length];
        int[] datosB = new int[almacenB.length];
        int[] resultadoInt = new int[almacenA.length];

        // generamos aleatoriamente UNO -->
        Random random = new Random();
        for (int i = 0; i < almacenA.length; i++)
            datosA[i] = random.nextInt(0, almacenA.length);
        datosA = insertionSort(datosA);
        System.out.println(Arrays.toString(datosA));

        // generamos aleatoriamente DOS -->
        Random random2 = new Random();
        for (int i = 0; i < almacenB.length; i++)
            datosB[i] = random2.nextInt(0, almacenB.length);
        datosB = insertionSort(datosB);
        System.out.println(Arrays.toString(datosB));

        System.out.println(Arrays.toString(interseccionArrays(datosA, datosB)));

        resultadoInt = interseccionArrays(datosA, datosB);

        String[] resultadoString = new String[almacenA.length];

        for (int i = 0; i < almacenA.length; i++) {
            resultadoString[i] = almacenA[resultadoInt[i]];
        }

        System.out.println(Arrays.toString(resultadoString));

    }

}
