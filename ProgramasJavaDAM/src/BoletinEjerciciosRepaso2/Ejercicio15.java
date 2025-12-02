package boletinejerciciosrepaso2;

import java.util.Scanner;

public class Ejercicio15 {
    // Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media,
    // la cantidad de alumnos mayores de 18 años y la cantidad de alumnos que miden
    // mas de 1.75

    // creamos main
    public static void main(String[] args) {

        // iniciamos Scanner
        Scanner sc = new Scanner(System.in);

        // creamos variables
        double[] edad = new double[5], alturas = new double[5];
        int contador = 0;
        int sumatorioEdad = 0, sumatorioAltura = 0, contAlumnMay18 = 0, contAlumnMay175 = 0;

        // bucle for para pasar valores a los arrays
        for (int i = 0; i < edad.length || i < alturas.length; i++) {

            // pasamos los atribuos por Scanner
            System.out.print("introduce una edad -> ");
            edad[i] = Double.parseDouble(sc.nextLine());
            System.out.print("introduce una altura -> ");
            alturas[i] = Double.parseDouble(sc.nextLine());

            // incrementamos los contadores respecticamente
            // (contador + 1) & (2 veces -> sumatorioN + N)
            contador++;
            sumatorioAltura += alturas[i];
            sumatorioEdad += edad[i];

            // instruccion condicional si edad mayor que 18
            if (edad[i] >= 18)

                // aumentas contador en 1
                contAlumnMay18++;

            // instruccion condicional si altura mayor a 175
            if (alturas[i] > 175)

                // aumentas contador en 1
                contAlumnMay175++;

        } // cerramos bucle

        // mostramos medias por pantalla
        System.out.println("la media de sus alturas es -> " + (sumatorioAltura / contador)
                + "\nLa media de sus edades es -> " + (sumatorioEdad / contador));

        // mostramos alumnos mayores de 18 o que miden mas de 175 cm por pantalla
        System.out.println("hay " + contAlumnMay18 + " alumnos mayores de 18\nHay " +
                contAlumnMay175 + " alumnos de mas de 175 cm de altura");

        // cerramos Scanner
        sc.close();
    }
}
