package dos;

public class TestSatelite2 {

    public static void main(String[] args) {

        Satelite2 xabarin = new Satelite2(-7.92, 42.1, 5.0);
        Satelite2 mir = new Satelite2(4.5, 52.7, 0);

        System.out.println(xabarin.toString());
        System.out.println(mir.toString());

        System.out.println(xabarin.enOrbita());
        System.out.println(mir.enOrbita());

        xabarin.variaPosicion(100, 200);
        System.out.println(xabarin.toString());

        mir.variaAltura(-20);
        System.out.println(mir.toString());
    }
}
