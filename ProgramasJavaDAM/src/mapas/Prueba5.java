package mapas;

import java.util.HashMap;
import java.util.Map;

public class Prueba5 {

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

        System.out.println("HashMap doesn't save order inside it");
        System.out.println(map.entrySet());

        System.out.println("to see it oredered without using " +
                "TREE I can use apiStream to make a stream...");

        // inside an entrySet -->
        map.entrySet()
                .stream() // makes a stream
                .sorted(Map.Entry.comparingByKey()) // orderers it in ascending order
                .forEach(Entry -> System.out.println(Entry.getKey() + ": " + Entry.getValue())); // shows it by forEach

    }
}
