package boletinejerciciosrepaso2;

import java.util.Scanner;

public class Ejercicio7 {
    // Pedir numeros hasta que se introduzca un numero negativo, y luego calcular la
    // media

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 1;
        int sumatorio = 0;
        int contador = 0;
        while (numero > 0) {
            numero = Integer.parseInt(sc.nextLine());
            sumatorio += numero;
            contador++;
        }
        System.out.println("la media es -> " + (sumatorio / contador));
        sc.close();
    }

}
