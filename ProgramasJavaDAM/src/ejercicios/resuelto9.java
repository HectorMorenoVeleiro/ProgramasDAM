package ejerciciosclase;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class resuelto9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numeros[] = new int[50];
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = 1 + random.nextInt(99);
        }
        Arrays.sort(numeros);
        System.out.println("Ordenado");
        System.out.println(Arrays.toString(numeros));

        System.out.println("numero a buscar");
        int num = Integer.parseInt(sc.nextLine());

        int indice = Arrays.binarySearch(numeros, num);

        if (indice >= 0) {
            System.out.println("encontrado el valor " + num + " en la posición " + indice);
        }

        sc.close();

    }
}
