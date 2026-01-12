package segundo_trimestre;

import java.util.Arrays;
import java.util.Scanner;

public class Temperaturas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] temperaturas;

        temperaturas = new int[10];

        System.out.println(Arrays.toString(temperaturas));

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("dame un entero para el indice :" + i);
            temperaturas[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.println(Arrays.toString(temperaturas));

        sc.close();
    }
}
