package BoletinEjerciciosRepaso2;

import java.util.Scanner;

public class Ejercicio4 {
    // Pedir numeros hasta que se teclee uno negativo, y mostrar cuántos numeros se
    // han introducido

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int contador = 0;
        while (numero >= 0) {
            numero = Integer.parseInt(sc.nextLine());
            contador++;
        }
        System.out.println(contador);
        sc.close();
    }
}
