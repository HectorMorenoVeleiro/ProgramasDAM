package EjerciciosArraysUnidimensionales;

import EjerciciosCuentaPropia.AjustesProgramas;

public class Ejercicio7 {
    /*
     * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
     * muestre por pantalla separados por espacios. El programa pedirá entonces por
     * teclado dos valores y a continuación cambiará todas las ocurrencias del
     * primer valor por el segundo en la lista generada anteriormente. Los números
     * que se han cambiado deben aparecer entrecomillados.
     */
    public static void main(String[] args) {
        int[] valores1Al20 = new int[100];
        for (int i : valores1Al20) {
            valores1Al20[i] = (int) (Math.random() * 20 + 1);
        }

    }
}
