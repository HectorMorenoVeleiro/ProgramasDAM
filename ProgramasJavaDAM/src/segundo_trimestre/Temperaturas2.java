package segundo_trimestre;

import java.util.Scanner;

public class Temperaturas2 {

    private static int[] temperaturas1;
    final static int POS = 10; // num posiciones array

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = 0;
        temperaturas1 = new int[POS];

        for (int i = 0; i < POS; i++) {
            System.out.println("introduzca temperatura");
            temperaturas1[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < temperaturas1.length; i++) {
            total += temperaturas1[i];
        }

        System.out.println("La media es: " + ((double) total / POS));

        sc.close();

    } //
}
