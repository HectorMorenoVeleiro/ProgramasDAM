package cuatro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2Repaso {

    /*
     * Ingresar una cadena y determinar cuantas palabras se encuentran en la cadena.
     * Cada pàlabra se separa por medio de un espacio en blanco.
     */

    public String cadena;
    public int contadorPalabras = 0;
    public static Scanner sc = new Scanner(System.in);

    Ejercicio2Repaso(String cadena) { // constructor
        setCadena(cadena);
    }

    public String getCadena() { // getter
        return cadena;
    }

    public void setCadena(String cadena) { // setter
        this.cadena = cadena;
    }

    // metodo para contar cuantas palabras tiene una frase
    public int cuentaPalabras() {

        // pasas el String que recibes a un array[]
        char[] arrayCad = getCadena().toCharArray();

        // haces un bucle que incremente su contador cada
        // vez que aparezca un espacio
        for (int i = 0; i < arrayCad.length; i++) {
            if (arrayCad[i] == ' ') // comparas con espacio
                contadorPalabras++; // aumentas contador
        }

        // devuelves el contador sumandole la primera palabra
        // de la frase
        return contadorPalabras + 1;
    }

    public String invertirPalabras() {

        String string = "";
        List<Character> arraylist = new ArrayList<Character>();
        int bot = getCadena().length();
        String respuesta = "";

        // le das la vuelta al orden de las palabras
        for (int i = getCadena().length() - 1; i >= 0; i--) {
            if (getCadena().charAt(i) == ' ') {
                string += getCadena().substring(i, bot);
                bot = i;
            }
            if (i == 0)
                string += " " + getCadena().substring(i, bot);

        }

        char[] arrayCad = string.toCharArray();

        // le das la vuelta a la cadena entera
        for (int i = arrayCad.length - 1; i >= 0; i--) {
            arraylist.add(arrayCad[i]);
        }

        // colorin colorado la cadena queda ordenada
        for (Character character : arraylist) {
            respuesta += character;
        }

        return respuesta;
    }

    public static void main(String[] args) {

        // recibes por scanner una frase
        System.out.println("introduce una frasecita: ");
        String cadena = sc.nextLine();
        // creas obj con la cadena
        Ejercicio2Repaso ER1 = new Ejercicio2Repaso(cadena);
        // la muestras
        System.out.println(ER1.cuentaPalabras());
        System.out.println("\n" + ER1.invertirPalabras());

    }

}
