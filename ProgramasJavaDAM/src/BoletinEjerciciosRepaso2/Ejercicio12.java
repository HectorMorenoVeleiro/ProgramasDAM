package boletinejerciciosrepaso2;

import java.util.Scanner;

public class Ejercicio12 {
    // Pedir un numero y calcular su factorial
    public static void main(String[] args) {

        // iniciamos Scanner
        Scanner sc = new Scanner(System.in);

        // creamos variables
        System.out.print("introduce un numero -> ");
        double numero = Double.parseDouble(sc.nextLine()); // pasamos número por Scanner
        double productorio = 1;

        // bucle for para calcular de n(numero) a 0
        for (double i = numero; i > 0; i--) {

            // incrementamos el contador con el producto de cada n tal que (n -> 0) n--.
            productorio *= i;
        }

        // mostramos el factorial por pantalla
        System.out.println("el factorial del numero es -> " + productorio);

        // cerramos Scanner
        sc.close();
    }
}
