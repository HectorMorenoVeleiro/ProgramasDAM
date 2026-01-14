package ejerciciosarrayunidimensionales;

public class Ejercicio10 {

    /*
     * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
     * y que los almacene en un array. El programa debe ser capaz de pasar todos
     * los números pares a las primeras posiciones del array (del 0 en adelante) y
     * todos los números impares a las celdas restantes. Utiliza arrays auxiliares
     * si es necesario.
     */

    public static void main(String[] args) {

        int[] numerosEntAl = new int[20];
        int[] numerosParesArray = new int[20];
        int[] numerosImparesArray = new int[20];

        for (int i = 0; i < numerosEntAl.length; i++)
            numerosEntAl[i] = (int) (Math.random() * 100);

        for (int i = 0, j = 0, k = 0; i < numerosEntAl.length; i++) {
            if (numerosEntAl[i] % 2 == 0) {
                numerosParesArray[j] = numerosEntAl[i];
                j++;
            } else {
                numerosImparesArray[k] = numerosEntAl[i];
                k++;
            }
        }

        int[] resultado = java.util.Arrays.copyOf(numerosParesArray,
                numerosParesArray.length + numerosImparesArray.length);
        System.arraycopy(numerosImparesArray, 0, resultado, numerosParesArray.length, numerosImparesArray.length);

        System.out.println(resultado);
    }
}
