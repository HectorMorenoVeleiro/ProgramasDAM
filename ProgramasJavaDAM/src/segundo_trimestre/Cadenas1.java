package segundo_trimestre;

import java.util.Arrays;

public class Cadenas1 {

    public static void main(String[] args) {

        // -----------------------------------------------------------------------
        // esto es un array de chars (en el fondo se parece a un String) -->
        // -----------------------------------------------------------------------

        char[] nombre1 = { 'p', 'e', 'p', 'e' }; // CharArray 4 chars (p,e,p,e)
        char[] nombre2 = { 112, 101, 112, 101 }; // CharArray 4 nums (112,101,112,101)
        char[] nombre3 = new char[4]; // Empty CharArray length(4)

        System.out.println(Arrays.toString(nombre1));
        System.out.println(Arrays.toString(nombre2));
        System.out.println(Arrays.toString(nombre3));

        // ---------------------------------------------------------------------------------
        // Como convierto directamente estos Arrays de caracteres a objetos String? -->
        // ---------------------------------------------------------------------------------

        // By Obj
        String cadena1 = new String(nombre1); // String Obj
        System.out.println(cadena1); // Show CharArray into String

        // By valueOf
        String cadena2 = String.valueOf(nombre2); // Value by String
        System.out.println(cadena2); // Show CharArray into String

        // By Looping&Adding
        String cadena3 = ""; // Empty String
        for (int i = 0; i < nombre3.length; i++) { // add Char from ArrayChar into String
            cadena3 += nombre3[i];
        }
        System.out.println(cadena3); // Show CharArray into String

    }
}
