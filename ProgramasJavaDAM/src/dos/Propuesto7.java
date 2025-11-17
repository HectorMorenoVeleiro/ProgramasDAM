package dos;

import java.util.Scanner;

public class Propuesto7 {

    public static float millasAMetros(float millasMarinas) {
        return millasMarinas * 1852;
    }

    public static float millasAKilometros(float millasMarinas) {
        return millasAMetros(millasMarinas) / 1000;
    }

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        float millasMarinas;

        System.out.println("millas marinas a convertir en metros: ");
        millasMarinas = Float.parseFloat(sc.nextLine());
        System.out.println("\nen metros es : " + millasAMetros(millasMarinas));

        System.out.println("millas marinas a convertir kilometros: ");
        millasMarinas = Float.parseFloat(sc.nextLine());
        System.out.println("\nen kilometros es : " + millasAKilometros(millasMarinas));
    }
}