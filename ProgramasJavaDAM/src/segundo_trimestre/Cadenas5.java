package segundo_trimestre;

public class Cadenas5 {

    public static void main(String[] args) {

        // ---------------------------------
        // Método Equals y metodo CompareTo
        // ---------------------------------

        String cad1 = "EMMA";
        String cad2 = "MARIA";
        System.out.println(cad1.compareTo("emma")); // negativo (< 0)
        System.out.println(cad1.compareTo("EMMA")); // equals? (= 0)
        System.out.println(cad2.compareTo("EMMA MORENO")); // negativo (+ Char)
        System.out.println(cad2.compareTo("MARIA AMPARO")); // negativo (< 0)
        System.out.println(cad2.compareTo("MAREA")); // positivo (> 0)

        // Los resultados mostrados por pantalla serán: -32, 0, -7, -7 y 4

    }
}
