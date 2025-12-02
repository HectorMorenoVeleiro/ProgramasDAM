package boletinejerciciosrepaso2;

import java.util.Scanner;

public class Ejercicio14 {
    // Pedir 10 sueldos. Mostrar su suma y cuales son mayores de 1000€

    // creamos el main
    public static void main(String[] args) {

        // instanciamos Scanner
        Scanner sc = new Scanner(System.in);

        // creamos variables
        double sueldo = 0, sumatorio = 0;

        // bucle para pasar 10 numeros (sueldos)
        for (int i = 0; i < 10; i++) {

            // llamamos al sueldo por scanner
            System.out.print("introduce el sueldo " + i);
            sueldo = Integer.parseInt(sc.nextLine());

            // incrementamos el contador sumatorio en base al sueldo introducido
            sumatorio += sueldo;

            // instrucción condicional que muestra los valores >1000
            if (sueldo > 1000)
                System.out.println(sueldo);

        } // cerramos bucle

        // mostramos por pantalla la suma de todos los sueldos
        System.out.print("la suma de los sueldos es -> " + sumatorio);

        // cerramos Scanner
        sc.close();

    }
}
