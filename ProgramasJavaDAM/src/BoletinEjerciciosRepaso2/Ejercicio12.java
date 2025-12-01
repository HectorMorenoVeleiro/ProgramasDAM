package boletinejerciciosrepaso2;

import java.util.Scanner;

public class Ejercicio12 {
    // Pedir un numero y calcular su factorial
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero = Double.parseDouble(sc.nextLine());
        double productorio = 1;
        for (double i = numero; i > 0; i--) {
            productorio *= i;
        }
        System.out.println("el factorial del numero es -> " + productorio);
        sc.close();
    }
}
