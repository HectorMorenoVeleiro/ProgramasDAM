package ejerciciosarrayunidimensionales;

import java.util.Scanner;

public class Ejercicio8 {
    /*
     * Realiza un programa que pida la temperatura media que ha hecho en cada mes
     * de un determinado año y que muestre a continuación un diagrama de barras
     * horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
     * de asteriscos o cualquier otro carácter.
     */

    // Creamos un main
    public static void main(String[] args) {

        // iniciamos Scanner
        Scanner sc = new Scanner(System.in);

        // creamos atributos
        double[] tempMediaMes = new double[12]; // temperatura media (ºC)
        String[] mesAño = { "ENE", "FEB", "MAR", "ABR", "MAY", "JUN", "JUL", "AGO", "SEP",
                "OCTE", "NOV", "DIC" }; // meses del año
        char[] caracterAUsar = { '=', '|' }; // caracter para barras

        // inciamos bucle para dar valores
        for (int i = 0; i < tempMediaMes.length; i++) {

            // le damos valor a cada instancia del array de temp por Scanner
            System.out.print("introduce la media temperatura de " + mesAño[i] + " -> ");
            tempMediaMes[i] = Double.parseDouble(sc.nextLine());

        } // cerramos bucle

        // tabulamos
        System.out.println();

        // for para cada mes del año
        for (int i = 0; i < mesAño.length; i++) {

            // mostramos el mes del año por pantalla
            System.out.print(mesAño[i] + "\t\t" + caracterAUsar[1]);

            // for para la cantidad de temp en el eje x
            for (int j = 0; j < tempMediaMes[i]; j++) {

                // mostramos por pantalla "=" por cada grado de la temperatura media del mes
                System.out.print(caracterAUsar[0]);

            } // cerramos bucle j

            // tabular al acabar cada iteración
            System.out.println();

        } // cerramos bucle i

        // cerramos Scanner
        sc.close();
    }
}
