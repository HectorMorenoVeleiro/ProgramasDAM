package segundo_trimestre;

public class Cadena6 {

    public static void main(String[] args) {

        // -------------------------
        // -- Referencia VS Valor --
        // -------------------------

        String cad1 = "EMMA";
        String cad2 = new String("EMMA");
        String cad3 = cad1;

        System.out.println(cad3);

        // Compara contenido de cadena
        if (cad1.equals(cad2))
            System.out.println("SON IGUALES"); // Resultado : SON IGUALES

        // Compara referencia de cadena
        if (cad1 == cad2)
            System.out.println("SON IGUALES");
        else
            System.out.println("SON DIFERENTES"); // Resultado : SON DIFERENTES

        // -----------------------------------------------------------------------------
        // Son diferentes pero como el contenido es el mismo entonces las cojemos y las
        // tomamos como si fueran "equals" (iguales).
        // -----------------------------------------------------------------------------

        System.out.println(cad1.length());
        String cade1 = "Andy";
        cade1 = cade1.concat(" Rosique");
        System.out.println(cade1);
        System.out.println(cad1.substring(5));

    }
}
