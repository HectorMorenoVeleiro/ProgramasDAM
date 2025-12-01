package boletinejerciciosrepaso2;

import java.util.Scanner;

public class Ejercicio11 {
    // Diseñar un programa que muestre el producto de los 10 primeros numeros
    // impares
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero = 0;
        int index = 0;
        double productorio = 1;
        while (index < 10) {
            numero = Double.parseDouble(sc.nextLine());
            if (numero % 2 != 0) {
                index++;
                productorio *= numero;
            }
        }
        System.out.println(productorio);
        sc.close();
    }
}
