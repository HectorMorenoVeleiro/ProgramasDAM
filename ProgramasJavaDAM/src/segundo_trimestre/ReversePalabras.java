package segundo_trimestre;

import java.util.StringTokenizer;

public class ReversePalabras {

    public static void main(String[] args) {

        String frase = "Hola, me llamo Luca, soy una persona algo timida y vivo ene l piso dos.";

        StringTokenizer st = new StringTokenizer(frase, " ,.");
        int toques = st.countTokens();

        StringBuilder reves = new StringBuilder();
        while (st.hasMoreTokens()) {
            reves.append("" + st.nextToken());
            // Object object = (Object) st.nextElement();
        }
        System.out.println(reves);
        System.out.println(toques + "toques");
    }
}
