package dos;

public class TestAutomovilSegunEnunciado {

    public static void main(String[] args) {

        AutomovilSegunEnunciado auto1 = new AutomovilSegunEnunciado(0, null, null, 0, 0, 0, 0, null, null, null, false);
        AutomovilSegunEnunciado auto2 = new AutomovilSegunEnunciado(0, null, null, 0, 0, 0, 0, null, null, null, false);

        System.out.println(auto1.equals(auto2));
    }
}
