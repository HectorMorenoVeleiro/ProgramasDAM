package segundo_trimestre;

public class Cadena6 {

    public static void main(String[] args) {

        // -------------------------
        // -- Referencia VS Valor --
        // -------------------------

        String cad1 = "EMMA";
        String cad2 = new String("EMMA");

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

    }
}
