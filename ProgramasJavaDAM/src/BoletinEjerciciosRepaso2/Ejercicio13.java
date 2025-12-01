package boletinejerciciosrepaso2;

import java.util.Scanner;

public class Ejercicio13 {
    // Pedir 10 numeros , mostrar la media de los numeros positivos, la media de los
    // numeros negativos y la cantidad de ceros
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contposit = 0, contnegat = 0, contcerot = 0;
        double numero = 0, positivario = 0, negativario = 0;
        for (int i = 0; i < 10; i++) {
            numero = Double.parseDouble(sc.nextLine());
            if (numero > 0) {
                positivario += numero;
                contposit++;
            } else if (numero < 0) {
                negativario += numero;
                contnegat++;
            } else
                contcerot++;
        }
        System.out.println("media positivos -> " + (positivario / contposit) + "\tmedia negativos -> "
                + (negativario / contnegat) + "\tnum ceros -> " + contcerot);
        sc.close();
    }
}
