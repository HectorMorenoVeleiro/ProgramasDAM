package ejerciciosarrayunidimensionales;

import java.util.Scanner;

public class Ejercicio11 {

    /*
     * Realiza un programa que pida 10 números por teclado y que los almacene en
     * un array. A continuación se mostrará el contenido de ese array junto al
     * índice (0 – 9) utilizando para ello una tabla. Seguidamente el programa
     * pasará los primos a las primeras posiciones, desplazando el resto de números
     * (los que no son primos) de tal forma que no se pierda ninguno. Al final se
     * debe mostrar el array resultante.
     * Por ejemplo:
     * ArrayInicial : {20, 5, 7, 4, 32, 9, 2, 14, 11, 6}
     * ArrayFinal : {5, 7, 2, 11, 20, 4, 32, 9, 14, 6}
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];
        int[] arrayF = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] % 3 == 0 && array[i] % 5 == 0 && array[i] % 7 == 0) {
                arrayF[i] = array[i];
            }
        }

        sc.close();
    }
}
