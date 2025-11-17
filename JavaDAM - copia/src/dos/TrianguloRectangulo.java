package dos;

import java.awt.Color;

public class TrianguloRectangulo {

    int cateto1;
    int cateto2;
    Color color;

    public TrianguloRectangulo(int cateto1, int cateto2, Color color) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
        this.color = color;
    }

    public int getCateto1() {
        return cateto1;
    }

    public void setCateto1(int cateto1) {
        this.cateto1 = cateto1;
    }

    public int getCateto2() {
        return cateto2;
    }

    public void setCateto2(int cateto2) {
        this.cateto2 = cateto2;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double calcularHipotenusa() {
        int suma = (int) (Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        return Math.sqrt(suma);
        // return (int) Math.pow((Math.pow(cateto1, 2) + Math.pow(cateto2, 2)),
        // (1 / 2);
    }

    double calcularArea() {
        return (cateto1 * cateto2) / 0.5;
    }

    double calcularPerimetro() {
        return cateto1 + cateto2 + calcularHipotenusa();
    }

    @Override
    public String toString() {
        return "TrianguloRectangulo [cateto1=" + cateto1 + ", cateto2=" + cateto2 + ", color=" + color
                + "\ncalcularHipotenusa()=" + calcularHipotenusa() + ", calcularArea()=" + calcularArea()
                + "\ncalcularPerimetro()=" + calcularPerimetro() + "]";
    }

}
