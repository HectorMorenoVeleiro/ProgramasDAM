package boletinejerciciosrepaso2;

import java.util.Scanner;

public class Ejercicio2 {
    // Leer un numero e indicar si es positivo o negativo. El proceso se repetirá
    // hasta que se introduzca un 0

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 1;
        while (numero != 0) {
            numero = Integer.parseInt(sc.nextLine());
            if (numero < 0)
                System.out.println("negativo");
            if (numero > 0)
                System.out.println("positivo");
        }
        sc.close();
    }
}
