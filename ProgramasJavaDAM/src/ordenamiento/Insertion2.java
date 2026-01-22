package ordenamiento;

import java.util.Arrays;
import java.util.Random;

public class Insertion2 {

    public static String[] insertionSort(String[] numbers) {

        // Iniciamos un fori del rango del array -->
        for (int i = 0; i < numbers.length; i++) {

            // Creamos la variable COPIA -->
            String copyNumber = numbers[i];

            // Creamos un index extra (j), del tamaño de i -->
            int j = i;

            // Bucle while para sustituir los numeros del array -->
            while (j > 0 && copyNumber.compareTo(numbers[j - 1])/*
                                                                 * El método compareTo se utiliza para comparar dos
                                                                 * Strings dando un número mayor o menor que 0
                                                                 */ < 0) {

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

    public static void main(String[] args) {

        // Creamos el array de hombres -->
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

        // Mostramos el resultado -->
        System.out.println(Arrays.toString(nombresMezclados));

        // Ordenamos la cadena -->
        nombresMezclados = insertionSort(nombresMezclados);

        // Mostramos la cadena corregida -->
        System.out.println(Arrays.toString(nombresMezclados));
    }
}
