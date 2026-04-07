package tercer_trimestre;

public class CuentaTest {

    public static void main(String[] args) {

        Cuenta uno = new Cuenta(245.56f, 1.45f);
        System.out.println(uno);

        uno.consignar(120.5f);
        uno.retirar(23.78f);

        System.out.println(uno);

        uno.extractoMensual();
        System.out.println(uno);

        CuentaCorriente dos = new CuentaCorriente(566.34f, 1f);
        System.out.println(dos);

    }
}
