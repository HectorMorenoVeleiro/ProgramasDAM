package ejerciciosclase;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class resuelto9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = {};
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = 1 + random.nextInt(99);
        }

        // método de ordenamiento en el que queramos
        Arrays.sort(numeros);
        System.out.println("array ordenado");
        System.out.println(Arrays.toString(numeros));

        System.out.println("TRAS ordenar dame el numero a buscar");
        int num = Integer.parseInt(sc.nextLine());

        // Llamamos al método busqueda binaria ??
        Arrays.binarySearch(numeros, num);

        sc.close();

    }
}
