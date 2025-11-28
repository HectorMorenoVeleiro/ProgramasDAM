package ejerciciosarraysunidimensionales;

import ejercicioscuentapropia.AjustesProgramas;

public class Ejercicio5 {
    /*
     * Escribe un programa que pida 10 números por teclado y que luego muestre los
     * números introducidos junto con las palabras “máximo” y “mínimo” al lado del
     * máximo y del mínimo respectivamente.
     */
    public static void main(String[] args) {
        int[] array10Numeros = new int[10];
        int maximo = 0, minimo = Integer.MAX_VALUE;

        for (int i = 0; i < array10Numeros.length; i++)
            array10Numeros[i] = AjustesProgramas
                    .enterNumPorScanner("Introduce el valor del numero " + (i + 1) + " del array --> ");

        for (int i = 0; i < array10Numeros.length; i++) {
            if (array10Numeros[i] > maximo)
                maximo = array10Numeros[i];
            if (array10Numeros[i] < minimo)
                minimo = array10Numeros[i];
        }

        for (int i = 0; i < array10Numeros.length; i++) {
            if (maximo == array10Numeros[i])
                System.out.println("maximo : " + array10Numeros[i] + " ");
            else if (minimo == array10Numeros[i])
                System.out.println("minimo : " + array10Numeros[i] + " ");
            else
                System.out.println(array10Numeros[i] + " ");
        }
    }
}
