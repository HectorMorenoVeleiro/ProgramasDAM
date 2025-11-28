package ejerciciosnumerosaleatorios;

import java.util.Scanner;

public class Ejercicio26 {
    // Realiza un programa que pinte una tableta de turrón con un bocado realizado
    // de forma aleatoria. El ancho y el alto de la tableta se pide por teclado. El
    // bocado se da alrededor del turrón, obviamente no se puede dar un bocado por
    // en medio
    // de la tableta.
    // Ejemplo 1:
    // Introduzca la anchura de la tableta: 6
    // Introduzca la altura de la tableta: 4
    // ******
    // *****
    // ******
    // ******
    // Ejemplo 2:
    // Introduzca la anchura de la tableta: 7
    // Introduzca la altura de la tableta: 3
    // *******
    // *******
    // ******
    // Ejemplo 3:
    // Introduzca la anchura de la tableta: 5
    // Introduzca la altura de la tableta: 5
    // ** **
    // *****
    // *****
    // *****
    // *****
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Que altura quieres que tenga el turron?");
        int alturaMaxima = Integer.parseInt(sc.nextLine());

        System.out.println("Que anchura quieres que tenga el turron?");
        int anchuraMaxima = Integer.parseInt(sc.nextLine());

        String[][] tableta = new String[alturaMaxima][anchuraMaxima];

        for (int altura = 0; altura <= alturaMaxima - 1; altura++) {
            for (int anchura = 0; anchura <= anchuraMaxima - 1; anchura++) {
                tableta[altura][anchura] = "*";
            }
        }

        int alturaRandom = (int) (Math.random() * alturaMaxima);

        if (alturaRandom == 0 || alturaRandom == alturaMaxima - 1) {
            int anchuraRandom = (int) (Math.random() * anchuraMaxima);
            tableta[alturaRandom][anchuraRandom] = " ";
        } else {
            int anchuraRandomLado = (int) (Math.random() * 2);
            if (anchuraRandomLado == 0)
                tableta[alturaRandom][0] = " ";
            else
                tableta[alturaRandom][anchuraMaxima - 1] = " ";
        }

        for (int altura = 0; altura <= alturaMaxima - 1; altura++) {
            for (int anchura = 0; anchura <= anchuraMaxima - 1; anchura++) {
                System.out.print(tableta[altura][anchura]);
            }

            System.out.println();
        }
    }
}
// What a pissOf
