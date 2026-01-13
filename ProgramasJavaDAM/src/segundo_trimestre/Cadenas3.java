package segundo_trimestre;

import java.util.Arrays;

public class Cadenas3 {

    public static void main(String[] args) {

        // -------------------------------------------
        // Como hacer paso inverso de String a char[]
        // -------------------------------------------

        // 1. Definimos dos objetos String
        String cadena1 = "Hola";
        String cadena2 = "Java";

        // 2. Convertimos a CharArray usando ".toCharArray()"
        char[] array1 = cadena1.toCharArray();
        char[] array2 = cadena2.toCharArray();

        // 3. Verificación: imprimimos lo que queremos imprimir
        System.out.println("Primer caracter de Array1: " + array1[0]); // 'H'
        System.out.println("Segundo caracter de Array2: " + array2[array2.length - 1]); // 'a'

        System.out.println(Arrays.toString(array1));

    }

}