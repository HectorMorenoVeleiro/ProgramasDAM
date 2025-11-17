package EjerciciosArraysUnidimensionales;

public class Ejercicio1 {
    /*
     * Define un array de 12 números enteros con nombre num y asigna los valores
     * según la tabla que se muestra a continuación. Muestra el contenido de todos
     * los elementos del array. ¿Qué sucede con los valores de los elementos que no
     * han sido inicializados?
     * ·_0___1___2___3___4___5___6___7___8___9___10___11_·
     * |·39|·-2|···|·0·|···|·14|···|·5·|120|···|····|····|
     * ·-------------------------------------------------·
     */
    public static void main(String[] args) {
        int[] arrayIntegers = new int[12];
        arrayIntegers[0] = 39;
        arrayIntegers[1] = -2;
        arrayIntegers[3] = 0;
        arrayIntegers[5] = 14;
        arrayIntegers[7] = 5;
        arrayIntegers[8] = 120;
        for (int i = 0; i < arrayIntegers.length; i++)
            System.out.println(arrayIntegers[i]);

        // CONCLUSION
        // aquellas instancias del array sin valor añadido se
        // inician a 0, pues un array sin valores definidos es
        // un array de 0's.
    }

}
