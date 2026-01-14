package ejerciciosarrayunidimensionales;

import java.util.Scanner;

public class Ejercicio9 {

    /*
     * Realiza un programa que pida 8 números enteros y que luego muestre esos
     * números junto con la palabra “par” o “impar” según proceda.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numerosEnt = new int[8];

        for (int i = 0; i < numerosEnt.length; i++)
            numerosEnt[i] = Integer.parseInt(sc.nextLine());

        for (int i : numerosEnt)
            if (i % 2 == 0)
                System.out.println(i + "--par");
            else
                System.out.println(i + "--impar");

        sc.close();
    }
}
