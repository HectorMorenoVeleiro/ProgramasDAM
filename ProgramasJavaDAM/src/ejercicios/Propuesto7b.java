package ejercicios;

public class Propuesto7b {

    /*
     * Reto: Fusion Eficiente de Arrays Ordenados.
     * 
     * Contexto: Se te proporcionan dos arreglos de numeros enteros, arr1 y arr2,
     * los cuales ya se encuentran ordenados de forma ascendente. Desafio:
     * 
     * Implementa una funcion (metodo) que combine ambos arreglos en un unico nuevo
     * arreglo, manteniendo el orden ascendente en todo momento
     * 
     * 
     * Pistas:
     * Debes recorer ambos arreglos simultaneamente usando punteros o indices
     * independientes.
     * 
     * En cada paso debes comparar los elementos actuales de cada arreglo y copiar
     * el menor al arreglo resultante.
     * 
     * Asegurate de gestionar correctamente los casos en los que un arreglo es mas
     * largo que el otro cuando uno de ellos esta vacio
     * 
     */

    public static int[] apretujaOrdenado(int[] arr1, int[] arr2) {

        int[] mezcla = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;

        while (i < mezcla.length && j < mezcla.length) {

            if (i < arr1.length)

                if (arr1[i] < arr2[j])
                    mezcla[k++] = arr1[i++];

                else if (j < arr2.length)

                    if (arr1[i] > arr2[j])
                        mezcla[k++] = arr2[j++];

                    else {
                        mezcla[k++] = arr2[j++];
                        i++;
                    }

        }

        System.out.println(i + " " + j + " " + k);

        return mezcla;
    }
}
