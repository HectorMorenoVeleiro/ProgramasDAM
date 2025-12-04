package boletinejerciciosrepaso2;

import java.util.Scanner;

public class Ejercicio21 {
    // Pedir 10 numeros y mostrar al final si se ha introducido alguno negativo

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bandera = false;
        double numero = 0;

        for (int i = 0; i < 10; i++) {
            numero = Double.parseDouble(sc.nextLine());
            if (numero < 0)
                bandera = true;
        }

        System.out.println("ha habido algun negativo ? -> " + bandera);

        sc.close();
    }
}
