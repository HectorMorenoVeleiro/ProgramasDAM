package boletinejerciciosrepaso2;

import java.util.Scanner;

public class Ejercicio13 {
    // Pedir 10 numeros , mostrar la media de los numeros positivos, la media de los
    // numeros negativos y la cantidad de ceros

    // creamos main
    public static void main(String[] args) {

        // inicias Scanner
        Scanner sc = new Scanner(System.in);

        // creamos varibales
        int contposit = 0, contnegat = 0, contcerot = 0;
        double numero = 0, positivario = 0, negativario = 0;

        // bucle que cuente hasta 10
        for (int i = 0; i < 10; i++) {

            // pasamos valor por Scanner
            numero = Double.parseDouble(sc.nextLine());

            if (numero > 0) { // instruccion condicional si numero mayor que cero

                // aumentamos contadores en (sumatorioN + N) y (contador + 1)
                positivario += numero;
                contposit++;

            } else if (numero < 0) { // instruccion condicional si numero menor que cero

                // aumentamos contadores en (sumatorioN + N) y (contador + 1)
                negativario += numero;
                contnegat++;

            } else // instruccion condicional si numero igual a cero

                // aumentamos contador en (contador + 1)
                contcerot++;

        } // cerramos bucle

        // mostramos las medias y el numCeros por pantalla
        System.out.println("media positivos -> " + (positivario / contposit) + "\tmedia negativos -> "
                + (negativario / contnegat) + "\tnum ceros -> " + contcerot);

        // cerramos Scanner
        sc.close();
    }
}
