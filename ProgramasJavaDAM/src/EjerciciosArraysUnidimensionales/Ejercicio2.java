package ejerciciosarraysunidimensionales;

public class Ejercicio2 {
    /*
     * Define un array de 10 caracteres con nombre simbolo y asigna valores a los
     * elementos según la tabla que se muestra a continuación. Muestra el contenido
     * de todos los elementos del array. ¿Qué sucede con los valores de los
     * elementos
     * que no han sido inicializados?
     * ·_0___1___2___3___4___5___6___7___8___9_·
     * |'a'|'x'|···|···|'@'|···|·''|'+'|'Q'|···|
     * ·---------------------------------------·
     */
    public static void main(String[] args) {
        char[] arrayCharacters = new char[10];
        arrayCharacters[0] = 'a';
        arrayCharacters[1] = 'x';
        arrayCharacters[4] = '@';
        arrayCharacters[6] = ' ';
        arrayCharacters[7] = '+';
        arrayCharacters[8] = 'Q';
        for (int i = 0; i < arrayCharacters.length; i++)
            System.out.println(arrayCharacters[i]);
        // CONCLUSION
        // aquellas instancias del array sin valor añadido se
        // inician a null (sin valor), pues un array sin valores definidos es
        // un array nulo (sin valor tmb : ' ').
    }
}
