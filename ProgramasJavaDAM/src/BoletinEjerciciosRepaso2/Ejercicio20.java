package boletinejerciciosrepaso2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio20 {
    // pedir un numero N, introducir N sueldos, y mostrar el sueldo máximo

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        System.out.print("cuantos sueldos vas a introducir -> ");
        numero = Integer.parseInt(sc.nextLine());

        double[] sueldos = new double[numero];

        for (int i = 0; i < sueldos.length; i++) {
            System.out.println("introduce un sueldo");
            sueldos[i] = Double.parseDouble(sc.nextLine());
        }

        System.out.println(Arrays.toString(sueldos));

        for (double d : sueldos) {

        }
    }
}
