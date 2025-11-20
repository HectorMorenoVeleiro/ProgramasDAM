package EjerciciosArraysUnidimensionales;

import EjerciciosCuentaPropia.AjustesProgramas;

public class Ejercicio6 {
    /*
     * Escribe un programa que lea 15 números por teclado y que los almacene en un
     * array. Rota los elementos de ese array, es decir, el elemento de la posición
     * 0 debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se
     * encuentra en la última posición debe pasar a la posición 0. Finalmente,
     * muestra el contenido del array.
     */
    public static void main(String[] args) {
        int[] arrayPorTeclado = new int[15];
        for (int i : arrayPorTeclado) {
            arrayPorTeclado[i] = AjustesProgramas.enterIntegerPorScanner("introduce un numero + -> ");
        }
        int numLargeArray = arrayPorTeclado[arrayPorTeclado.length];
        for (int i = arrayPorTeclado.length; i > 0; i++) {
            arrayPorTeclado[i] = arrayPorTeclado[i - 1];
        }
        arrayPorTeclado[0] = numLargeArray;
        for (int i : arrayPorTeclado) {
            System.out.println(arrayPorTeclado[i]);
        }
        System.out.println("hola chicos");
        int numeroGuardado = 0;
        for (int i : arrayPorTeclado) {
            arrayPorTeclado[i] = AjustesProgramas.enterIntegerPorScanner("introduce el numero --> ");
        }
        for (int i = 0; i < arrayPorTeclado.length; i++) {
            if (i == 1)
                arrayPorTeclado[i + 1] = arrayPorTeclado[i];
            else
                arrayPorTeclado[i] = numeroGuardado;
            numeroGuardado = arrayPorTeclado[i];
        }
    }
}
/*
 * Vale, esta es la correccion, mi razonamiento era mas o menos correcto, pero
 * falle en ciertos detallitos que no habia tenido en cuenta sobre como funciona
 * un array dentro de un bucle, y tuve que haber sacado atributos definidos
 * fuera del for en vez de implementarlo dentro cuando era innecesario, intente
 * automatizar demasiado cuando no lo precisaba el programa.
 */