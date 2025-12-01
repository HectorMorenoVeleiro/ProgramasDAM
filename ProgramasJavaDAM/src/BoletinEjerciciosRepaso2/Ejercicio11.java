package boletinejerciciosrepaso2;

import java.util.Scanner;

public class Ejercicio11 {
    // Diseñar un programa que muestre el producto de los 10 primeros numeros
    // impares
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero = 0, productorio = 1;
        for (int i = 1; i < 10; i++) {
            numero = 2 * i - 1;
            System.out.println(numero);
            productorio *= numero;
        }
        System.out.println("el producto de los impares es " + productorio);
        sc.close();
    }
}
