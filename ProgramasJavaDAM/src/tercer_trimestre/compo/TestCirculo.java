package tercer_trimestre.compo;

public class TestCirculo {

    public static void main(String[] args) {

        // instanciamos Circulos
        Circulo circ1 = new Circulo(1, 3, 7);
        Circulo circ2 = new Circulo(8, 3, 6);

        System.out.println();

        // mostramos el circulo
        System.out.println("===========CIRCULO===========");

        System.out.println();
        circ1.imprimir();
        circ2.imprimir();
        System.out.println();

        // mostramos el punto del circulo
        System.out.println("===========PUNTO============");

        System.out.println();
        System.out.println("-- En el circulo uno el centro esta en el punto: " + circ1.getPunto() + "...");
        System.out.println("-- En el circulo dos el centro esta en el punto: " + circ2.getPunto() + "...");
        System.out.println();

        System.out.println("==========TRIANGULO=========");

        System.out.println();
        // crear 3 puntos para construir un triangulo
        Triangulo tri = new Triangulo(1, 2, 1, 2, 1, 2);
        tri.imprimir();
        System.out.println();

        System.out.println("============RECTA===========");

        System.out.println();
        // test Recta
        Recta rct = new Recta(1, 2, 1, 2);
        rct.imprimir();
        System.out.println();

        System.out.println("============================");

    }
}
