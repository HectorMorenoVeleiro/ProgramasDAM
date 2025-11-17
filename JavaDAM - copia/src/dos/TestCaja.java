package dos;

public class TestCaja {

    public static void main(String[] args) {

        Caja caja1 = new Caja(4, 3, 2);
        Caja caja2 = new Caja();
        Caja caja3 = new Caja(5);
        Caja caja4 = new Caja(1, 2, 3, "Cajini");

        System.out.println(caja1);
        System.out.println(caja2);
        System.out.println(caja3);
        System.out.println(caja4);
    }
}
