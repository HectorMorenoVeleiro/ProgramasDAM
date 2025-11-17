package dos;

import java.awt.Color;

public class Rectangulo {

    int base;
    int altura;
    Color color;

    public Rectangulo(int base, int altura, Color color) {
        this.base = base;
        this.altura = altura;
        this.color = color;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Rectangulo [base=" + base + ", altura=" + altura + ", color=" + color + "]";
    }

    double calcularArea() {
        return base * altura;
    }

    double calcularPerimetro() {
        return (2 * base) + (2 * altura);
    }
}
