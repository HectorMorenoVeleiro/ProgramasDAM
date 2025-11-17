package EjerciciosNumerosAleatorios;

import java.util.Scanner;

public class Ejercicio24 {
    //Escribe un programa que, dado un número introducido por teclado, elija al azar
    //uno de sus dígitos.
    //Ejemplo 1:
    //Por favor, introduzca un número entero positivo: 406783
    //7
    //Ejemplo 2:
    //Por favor, introduzca un número entero positivo: 406783
    //3
    //Ejemplo 3:
    //Por favor, introduzca un número entero positivo: 406783
    //0
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Por favor, introduzca un numero entero positivo: ");
        int numeroEntero = Integer.parseInt(sc.nextLine());
        char caracterAlAzar = Integer.toString(numeroEntero).charAt((int)(Math.random()* Integer.toString(numeroEntero).length()));
        int digitoAlAzar = Character.getNumericValue(caracterAlAzar);
        System.out.println(digitoAlAzar);
    }
}
