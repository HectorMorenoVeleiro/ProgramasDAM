package mapas;

import java.util.HashMap;
import java.util.Map;

public class Prueba1 {

    // tests with maps -->

    public static void main(String[] args) {

        // declare how to import and how to iterate -->

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(924, "Amapalia Núñez");
        if (map.containsKey(921))
            map.put(921, "Cindy Nero");
        map.put(700, "César Vázquez");
        map.put(219, "Víctor Tilla");
        map.put(537, "Añan Brito");
        map.put(605, "Esteban Quito");

        // visualice -->
        System.out.println("\nThe elements of \"m\" are: \n" + map);

        // visualization in pairs in map
        for (Map.Entry<Integer, String> mapInstance : map.entrySet()) {
            System.out.println(mapInstance);
        }

    }
}
