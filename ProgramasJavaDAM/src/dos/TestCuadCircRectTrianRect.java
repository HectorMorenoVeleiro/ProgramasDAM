package dos;

import java.awt.Color;

public class TestCuadCircRectTrianRect {

    public static void main(String[] args) {

        TrianguloRectangulo trianguloRectangulo = new TrianguloRectangulo(2, 2, Color.DARK_GRAY);
        Cuadrado cuadrado = new Cuadrado(2, Color.MAGENTA);
        Circulo circulo = new Circulo(2, Color.cyan);
        Rectangulo rectangulo = new Rectangulo(2, 2, Color.GREEN);

        System.out.println("El area del cirulo es: " + circulo.calcularArea());
        System.out.println("El area del cuadrado es: " + cuadrado.calcularArea());
        System.out.println("El area del rectangulo es: " + rectangulo.calcularArea());
        System.out.println("El area del triangulo rectangulo es: " + trianguloRectangulo.calcularArea());

        System.out.println("El perimetro del cirulo es: " + circulo.calcularPerimetro());
        System.out.println("El perimetro del cuadrado es: " + cuadrado.calcularPerimetro());
        System.out.println("El perimetro del rectangulo es: " + rectangulo.calcularPerimetro());
        System.out.println("El perimetro del triangulo rectangulo es: " + trianguloRectangulo.calcularPerimetro());

        System.out.println("La hipotenusa del triangulo es: " + trianguloRectangulo.calcularHipotenusa());

        System.out.println(circulo.toString());
        System.out.println(cuadrado.toString());
        System.out.println(rectangulo.toString());
        System.out.println(trianguloRectangulo.toString());
    }
}
