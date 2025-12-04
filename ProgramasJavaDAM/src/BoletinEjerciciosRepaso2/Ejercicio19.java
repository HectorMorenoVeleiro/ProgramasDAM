package boletinejerciciosrepaso2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio19 {
    // 19. Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados
    // (=4) y suspensos.

    public static void main(String[] args) {

        // iniciamos Scanner
        Scanner sc = new Scanner(System.in);

        // creamos atributos
        int[] notas = new int[6];
        int contAprob = 0, contSusp = 0, contCond = 0;

        // pedir notas (bucle)
        for (int i = 0; i < notas.length; i++) {

            // introducir notas por Scanner
            notas[i] = Integer.parseInt(sc.nextLine());

            // subir contadores
            if (notas[i] >= 5)
                contAprob++;
            else if (notas[i] < 4)
                contSusp++;
            else
                contCond++;

        } // cerramos bucle

        System.out.println(Arrays.toString(notas));
        System.out.println(
                "hay " + contAprob + " aprobados, " + contSusp + " suspensos y " + contCond + " condicionados.");

        // cerramos Scanner
        sc.close();
    } // acabamos programa
}
