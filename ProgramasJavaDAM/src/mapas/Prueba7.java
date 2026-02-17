package mapas;

import java.util.HashMap;
import java.util.Scanner;

public class Prueba7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(924, "Amalia Nuñez");
        map.put(921, "Cindy Nero");
        map.put(700, "César Vázquez");
        map.put(219, "Víctor Tilla");
        map.put(537, "Alan Brito");
        map.put(605, "Esteban Quito");

        System.out.print("Por favor, introduzca el código --> ");
        int codigoIntroducido = Integer.parseInt(sc.nextLine());
        System.out.println();

        if (map.containsKey(codigoIntroducido)) {
            System.out.println("El codigo " + codigoIntroducido + " corresponde a: ");
            System.out.println(map.get(codigoIntroducido));

        } else {
            System.out.println("El dodigo no existe.");

        }
        sc.close();
    }
}
