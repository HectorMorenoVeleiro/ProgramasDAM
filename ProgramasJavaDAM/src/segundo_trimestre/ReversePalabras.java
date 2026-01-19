package segundo_trimestre;

public class ReversePalabras {

    public static void main(String[] args) {

        String frase = "Hola, me llamo Luca, soy una persona algo timida y vivo ene l piso dos.";

        String[] arrayPalabras = frase.split(" ");

        String vuelta = "";

        for (int i = arrayPalabras.length - 1; i >= 0; i--) {
            vuelta += " " + arrayPalabras[i];
        }
        System.out.println(vuelta);
    }
}
