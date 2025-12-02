package boletinejerciciosrepaso2;

import java.util.Scanner;

public class Ejercicio16 {
    // Pide un numero (que debe estar entre 0 y 10) y mostrar la tabla de
    // multiplicar de dicho numero

    // cremamos main
    public static void main(String[] args) {

        // iniciamos Scanner
        Scanner sc = new Scanner(System.in);

        // creamos variables
        int numero1Al10 = 0;

        // bucle para condicionar rango previo
        while (true) {

            // pasar valor por Scanner
            System.out.print("introduce un número (del 1 al 10) -> ");
            numero1Al10 = Integer.parseInt(sc.nextLine());

            // instrucción condicional para que esté en el rango
            if (numero1Al10 > 10 || numero1Al10 <= 0)

                // si no está lo decimos por pantalla
                System.out.println("El número no está en el rango deseado\n");

            else // si no se cumple la condición dentro del if

                break; // salimos del bucle

        } // fin bucle

        // creamos bucle para tabla de multiplicar (del 1 al 10 supongo)
        for (int i = 0; i <= 10; i++) {

            // mostramos por pantalla la tabla de multiplicar del numero
            System.out.println("[" + numero1Al10 + " * " + i + "] = " + (i * numero1Al10));
        }

        // cerramos Scanner
        sc.close();
    }
}
