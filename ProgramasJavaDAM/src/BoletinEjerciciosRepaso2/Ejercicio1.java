package BoletinEjerciciosRepaso2;

import java.util.Scanner;

public class Ejercicio1 {
    // Leer un numero y mostrar su cuadrado, repetir el proceso hasta que se
    // introduzca un número negativo

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        while (numero > 0) {
            numero = Integer.parseInt(sc.nextLine());
            System.out.println(Math.pow(numero, 2));
        }
        sc.close();
    }
}
