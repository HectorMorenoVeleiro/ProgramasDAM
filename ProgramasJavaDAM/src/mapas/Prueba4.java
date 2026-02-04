package mapas;

import java.util.Map;
import java.util.TreeMap;

public class Prueba4 {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        {
            // create instances TreeMap inside Map library (extended)
            map.put(924, "Amapalia Núñez");
            map.put(921, "Cindy Nero");
            map.put(700, "César Vázquez");
            map.put(219, "Víctor Tilla");
            map.put(537, "Añan Brito");
            map.put(605, "Esteban Quito");

            // show in terminal
            for (Map.Entry<Integer, String> mapPar : map.entrySet()) {
                System.out.println(mapPar.getKey() + " -> " + mapPar.getValue());
            }
        }
    }
}
