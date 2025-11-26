package BoletinEjerciciosRepaso2;

import java.util.Scanner;

public class Ejercicio3 {
    // Leer numeros hasta que se introduzca un 0. Para cada uno indicar si es par o
    // impar
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 1;
        while (numero != 0) {
            numero = Integer.parseInt(sc.nextLine());
            if (numero % 2 == 0)
                System.out.println("par");
            else if (numero != 0)
                System.out.println("impar");
        }
        sc.close();
    }
}
