package ejercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Resuelto9 {

    // empezamos por crear un main para hacer el ejercico -->
     public static void main(String[] args) {

        // iniciamos un Scanner sc (para usarlo mas tarde) -->
        Scanner sc = new Scanner(System.in);

        // creamos la variable numeros (array) de 50 posiciones -->
        int numeros[] = new int[50];

        // creamos un valor obj Random -->
        Random random = new Random();

        // iniciamos un for para darle valores random a cada
        // instancia del array -->
        for (int i = 0; i < numeros.length; i++)
            numeros[i] = 1 + random.nextInt(99);

        // muestras el array por pantalla -->
        Arrays.sort(numeros);
        System.out.println("Ordenado");
        System.out.println(Arrays.toString(numeros));

        // preguntas que numero dentro del array quieres buscar -->
        System.out.println("numero a buscar");

        // lo pides por Scanner -->
        int num = Integer.parseInt(sc.nextLine());

        // buscas el numero y la posicion del numero -->
        int indice = Arrays.binarySearch(numeros, num);

        /// si el indice es mayor que 0 (esta en el array) muestras
        // el numero y su posicion -->
        if (indice >= 0)
            System.out.println("encontrado el valor " + num +
                    " en la posición " + indice);

        // cerramos Scanner sc -->
        sc.close();

    }
}
