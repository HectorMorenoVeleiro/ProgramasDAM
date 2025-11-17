package dos;

import java.awt.Color;

public class Circulo {

    int radio;
    Color color;

    Circulo(int radio, Color color) {
        this.radio = radio;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circulo [radio=" + radio + ", color=" + color + "]";
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    // propios
    double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
