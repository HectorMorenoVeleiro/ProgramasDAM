package tercer_trimestre.compo;

public class Circulo {

    /*
     * Atributo que identifica el punto central donde se encuentra localizado un
     * círculo
     */
    Punto centro;
    int radio; // Atributo que identifica el radio de un círculo

    public Circulo(int x, int y, int radio) {
        // compo
        centro = new Punto(x, y); /* Crea un círculo con los valores pasados como parámetros */
        this.radio = radio; // Inicializa el atributo radio
    }

    int getRadio() {
        return radio;
    }

    void setRadio(int radio) {
        this.radio = radio;
    }

    void imprimir() {
        System.out.println("El centro del círculo es la coordenada (" + centro.getX() + "," + centro.getY()
                + ") y tiene un radio = " + radio);
    }

}