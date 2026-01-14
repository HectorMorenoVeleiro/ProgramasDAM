package segundo_trimestre;

public class Cadena7 {

    public static void main(String[] args) {
        String cad1 = "MAYKA", cad2 = cad1.trim();
        System.out.println(cad2.toString());

        String cad3 = "PEDRO ruiz", cad4 = cad3.toLowerCase();
        System.out.println(cad4.toString());

        String cad5 = "JUAN SUAREZ", cad6 = cad5.replace('U', 'O');
        System.out.println(cad6.toString());

        String cad7 = "JUAN CARLOS MORENO";
        System.out.println(cad7.substring(5, 11));
        System.out.println(cad7.substring(5));
    }
}
