package ejerciciosarraysunidimensionales;

import ejercicioscuentapropia.AjustesProgramas;

public class Ejercicio7 {
    /*
     * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
     * muestre por pantalla separados por espacios. El programa pedirá entonces por
     * teclado dos valores y a continuación cambiará todas las ocurrencias del
     * primer valor por el segundo en la lista generada anteriormente. Los números
     * que se han cambiado deben aparecer entrecomillados.
     */

    // iniciamos main
    public static void main(String[] args) {

        // creamos array de 100 numeros
        int[] valores1Al20 = new int[100];

        // bucle foreach para pasarle valores random del 1 al 20 por cada valor del
        // array creado previamente
        for (int i = 0; i < valores1Al20.length; i++)
            valores1Al20[i] = (int) (Math.random() * 20 + 1);

        // pides 2 valores por teclado
        int valorEnLista = AjustesProgramas.enterIntegerPorScanner("introduce numero 1 -> ");
        int valorRemplazador = AjustesProgramas.enterIntegerPorScanner("introduce numero 2 -> ");
        System.out.println(valorEnLista + ", " + valorRemplazador);

        // bucle foreach para cambiar el valor que coincida con el primero que pasamos
        // por Scanner por el segundo que pasamos por Scanner y mostrarlo entre comillas
        for (int i = 0; i < valores1Al20.length; i++) {
            if (valores1Al20[i] == valorEnLista) {
                valores1Al20[i] = valorRemplazador;
                System.out.print("\"" + valores1Al20[i] + "\" ");
            } else
                System.out.print(valores1Al20[i] + " ");
        }
    }
}
