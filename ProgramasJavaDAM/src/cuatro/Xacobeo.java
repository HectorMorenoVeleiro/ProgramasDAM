package cuatro;

public class Xacobeo {

    private int año;
    private final int[] rango = { 6, 5, 6, 11 };

    public Xacobeo(int año) {
        this.año = año;
    }

    public boolean esXacobeo() {
        int contador = 7;
        while (contador < año) {
            for (int i = 0; i < rango.length; i++) {
                contador += rango[i];
                if (año == contador)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Xacobeo xac1 = new Xacobeo(2004);
        System.out.println(xac1.esXacobeo());
    }
}
