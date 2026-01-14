package segundo_trimestre;

public class Cadena8 {

    public static void main(String[] args) {
        String cad1 = "MAYKA MORENO";
        System.out.println(cad1.startsWith("JUAN"));
        System.out.println(cad1.startsWith("MAY"));

        String cad2 = "MARIA AMPARO";
        System.out.println(cad2.endsWith("paro"));
        System.out.println(cad2.endsWith("PARO"));
        System.out.println(cad2.endsWith("ARIA"));

        String cad3 = "AMPARO HEREDIA";
        System.out.println(cad3.charAt(0) + " " + cad3.charAt(7));
    }
}
