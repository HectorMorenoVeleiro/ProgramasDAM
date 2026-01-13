package segundo_trimestre;

public class Cadenas2 {

    public static void main(String[] args) {

        // --------------------------------------
        // Ejemplo : Constructor Cadenas en Java
        // --------------------------------------

        char[] letras = { 'h', 'o', 'l', 'a' };
        String saludo = new String(letras);
        // Resultado --> "Hola"

        byte[] bytes = { 74, 97, 118, 97 };
        String lenguaje = new String(bytes);
        // Resultado --> "Java"

        char[] datos = { 'a', 'b', 'c', 'd', 'e', 'f' };
        // Empezar en indice 2 (c) y tomar 3 caracteres
        String subcadena = new String(datos, 2, 3);
        // Resultado --> "cde"

        // Mostrar por pantalla
        System.out.println(saludo);
        System.out.println(lenguaje);
        System.out.println(subcadena);

        // ----------------------------------------------
        // Como hacer paso inverso de String a CharArray
        // ----------------------------------------------

    }
}
