package segundo_trimestre;

import java.util.StringTokenizer;

public class Tokenizer {

    public static void main(String[] args) {

        // Un parrafo sobre ti
        String parrafo = "Hola, me llamo Luca, soy una persona algo timida y vivo en el piso 2";

        // Creamos el objeto StringTokenizer
        // El segundo parámetro son los delimitadores (espacio, coma y punto)
        StringTokenizer st = new StringTokenizer(parrafo, " ,.");
        int toques = st.countTokens();

        System.out.println("--- Desglosando el párrafo ---");

        while (st.hasMoreTokens())
            System.out.println("Palabra: " + st.nextToken());

        System.out.println("Total de elementos procesados: " + toques);
    }

}
