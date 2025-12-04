package boletinejerciciosrepaso2;

import java.util.Scanner;

public class Ejercicio21 {
    // Pedir 10 numeros y mostrar al final si se ha introducido alguno negativo

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bandera = false;
        double numero = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("introduce el numero " + i + " de 10 -> ");
            numero = Double.parseDouble(sc.nextLine());
            if (numero < 0)
                bandera = true;
        }

        if (bandera)
            System.out.println("Ha habido al menos uno negativo");
        else
            System.out.println("no hay numeros negativos");

        sc.close();
    }
}
