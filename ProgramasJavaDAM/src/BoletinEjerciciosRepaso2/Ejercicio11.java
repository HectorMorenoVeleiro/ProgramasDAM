package boletinejerciciosrepaso2;

import java.util.Scanner;

public class Ejercicio11 {
    // Diseñar un programa que muestre el producto de los 10 primeros numeros
    // impares
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 10; i++) {
            System.out.println(2 * i - 1);
        }
        sc.close();
    }
}
