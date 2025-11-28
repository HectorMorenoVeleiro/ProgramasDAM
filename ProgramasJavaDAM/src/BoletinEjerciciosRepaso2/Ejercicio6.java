package boletinejerciciosrepaso2;

import java.util.Scanner;

public class Ejercicio6 {
    // Pedir numeros hasta que se teclee un 0, mostrar la suma de todos los numeros
    // introducidos.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 1;
        int sumatorio = 0;
        while (numero != 0) {
            numero = Integer.parseInt(sc.nextLine());
            sumatorio = sumatorio + numero;
        }
        System.out.println("la suma de los numeros es -> " + sumatorio);
        sc.close();
    }

}
