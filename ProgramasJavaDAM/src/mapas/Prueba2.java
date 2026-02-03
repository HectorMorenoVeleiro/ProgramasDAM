package mapas;

import java.util.HashMap;
import java.util.Scanner;

public class Prueba2 {

    private static Scanner sc = new Scanner(System.in);

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

        // show corresponding value (to each key).
        System.out.println(map.get(921)); // not value, key=921.
        System.out.println(map.get(605)); // value=Esteban Quito, key=605.
        System.out.println(map.get(888)); // not value, key=888.

        // condition to show value by given key -->
        int i = 0;
        while (i < 5) {
            System.out.println("Enter key: ");
            int key = Integer.parseInt(sc.nextLine());
            if (map.containsKey(key)) {
                System.out.println("your key --> " + key + "\s corresponds to --> " + map.get(key));
            } else {
                System.out.println("key not corresponding.");
            }
            i++;
        }
    }
}
