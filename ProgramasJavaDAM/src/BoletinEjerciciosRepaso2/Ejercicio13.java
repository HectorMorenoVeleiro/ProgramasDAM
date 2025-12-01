package boletinejerciciosrepaso2;

import java.util.Scanner;

public class Ejercicio13 {
    // Pedir 10 numeros , mostrar la media de los numeros positivos, la media de los
    // numeros negativos y la cantidad de ceros
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero = 0;
        int contposit = 0;
        double positivario = 0;
        int contnegat = 0;
        double negativario = 0;
        int contcerot = 0;
        for (int i = 0; i < 10; i++) {
            numero = Double.parseDouble(sc.nextLine());
            if (numero > 0) {
                positivario += numero;
                contposit++;
            } else if (numero < 0) {
                negativario += numero;
                contnegat++;
            } else {
                contcerot++;
            }
        }
        System.out.println("media positivos -> " + (positivario / contposit) + "\tmedia negativos -> "
                + (negativario / contnegat) + "\tnum ceros -> " + contcerot);
        sc.close();
    }
}
