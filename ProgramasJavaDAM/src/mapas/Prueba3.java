package mapas;

import java.util.HashMap;
import java.util.Map;

public class Prueba3 {

    public static void main(String[] args) {

        // example to take values -->
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        // give entrys to each key created from HashMap -->
        map.put(924, "Amapalia Núñez");
        map.put(921, "Cindy Nero");
        map.put(700, "César Vázquez");
        map.put(219, "Víctor Tilla");
        map.put(537, "Añan Brito");
        map.put(605, "Esteban Quito");

        System.out.println("every entry from dictionary extracted by entrySet: ");
        System.out.println(map.entrySet());

        System.out.println(" \nentry from dictionary extracted one by one: ");
        for (Map.Entry<Integer, String> mapPar : map.entrySet()) {
            System.out.println(mapPar);
        }

        // personalized visualization
        for (Map.Entry<Integer, String> mapPar2 : map.entrySet()) {
            System.out.print(mapPar2.getKey());
            System.out.print(" -->> ");
            System.out.print(mapPar2.getValue() + "\n");
        }

    }
}
