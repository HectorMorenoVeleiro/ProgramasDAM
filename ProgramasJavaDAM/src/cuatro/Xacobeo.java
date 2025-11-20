package cuatro;

import java.util.Arrays;

public class Xacobeo {

    // atributos
    private int año;
    private final int[] AÑOS_XACOBEO = { 1909, 1915, 1920, 1926, 1937, 1938, 1943,
            1948, 1954, 1965, 1971, 1976, 1982, 1993, 1999, 2004, 2010, 2021, 2027,
            2032, 2038, 2049, 2055, 2060, 2066, 2077, 2083, 2088, 2094 };

    // método constructor
    public Xacobeo(int año) {
        this.año = año;
    }

    // método que dice si es no
    public boolean esXacobeo() {
        return Arrays.stream(AÑOS_XACOBEO).anyMatch(a -> a == año);
    }

    public static void main(String[] args) {
        Xacobeo xac1 = new Xacobeo(2004);
        System.out.println(xac1.esXacobeo());
    }
}
