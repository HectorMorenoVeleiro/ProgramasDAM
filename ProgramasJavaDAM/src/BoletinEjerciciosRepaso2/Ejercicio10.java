package boletinejerciciosrepaso2;

import java.util.Scanner;

public class Ejercicio10 {
    // Pedir 15 numeros y escribir la suma total
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int sumatorio = 0;
        for (int i = 0; i < 15; i++) {
            numero = Integer.parseInt(sc.nextLine());
            sumatorio += numero;
        }
        System.out.println("la suma de los numeros es igual a -> " + sumatorio);
        sc.close();
    }

}
