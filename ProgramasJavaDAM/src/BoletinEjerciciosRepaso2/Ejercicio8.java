package boletinejerciciosrepaso2;

import java.util.Scanner;

public class Ejercicio8 {
    // Pedir un numero N, y mostrar todos los numeros del 1 al N.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rango = Integer.parseInt(sc.nextLine());
        int[] array = new int[rango + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        for (int i : array) {
            System.out.println(array[i]);
        }
        sc.close();
    }
}
