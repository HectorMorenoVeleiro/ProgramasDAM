package segundo_trimestre;

public class Cadenas4 {

    public static void main(String[] args) {

        String cad1 = "Pepe";
        String cad2 = new String("Lionel");
        String cad3 = new String(cad2);
        String cad4 = cad2;

        System.out.println(cad1);
        System.out.println(cad2);
        System.out.println(cad3);
        System.out.println(cad4);

        System.out.println(cad2.equals(cad3)); // Cuidado con el equals & cadenas
        System.out.println(cad2.hashCode());
        System.out.println(cad3.hashCode());
        System.out.println(cad4.equals(cad4));

        String cadena1 = "CHELO";
        System.out.println(cadena1.length()); // muestra 5 por pantalla

        String cade1 = "Andy";
        cade1 = cade1.concat("Rosique");
        System.out.println(cade1); // Muestra "Andy Rosique"
    }

}