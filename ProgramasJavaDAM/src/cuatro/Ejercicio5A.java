package cuatro;

import java.util.Scanner;

public class Ejercicio5A {

    /*
     * Hacer un programa que al recibir como datos dos cadenas de caracteres forme
     * una tercera cadena intercalando los caracteres de las palabras de las cadenas
     * recibidas.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String cadena1, cadena2, cadFinal;
        int length = 0, lengthMax = 0;

        System.out.println("Introduce una cadena de caracteres: ");
        cadena1 = sc.nextLine();
        System.out.println("Introduce otra cadena de caracteres: ");
        cadena2 = sc.nextLine();

        cadFinal = "";

        length = (cadena1.length() > cadena2.length()) ? cadena1.length() : cadena2.length();
        lengthMax = (cadena1.length() > cadena2.length()) ? cadena1.length() : cadena2.length();

        for (int i = 0; i < length; i++) {
            cadFinal += cadena1.toCharArray()[i];
            cadFinal += cadena2.toCharArray()[i];
        } // fori

        cadFinal += cadena1.substring(length, lengthMax);

        System.out.println(cadFinal);

        sc.close();

    } // main

} // Ejercicio5
