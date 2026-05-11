package tercer_trimestre.compo;

import java.util.ArrayList;

public class Triangulo {

    ArrayList<Punto> puntos = new ArrayList<>();

    public Triangulo(int x1, int y1, int x2, int y2, int x3, int y3) {
        puntos.add(new Punto(x1, y1));
        puntos.add(new Punto(x2, y2));
        puntos.add(new Punto(x3, y3));
    }

    void imprimir() {
        for (Punto punto : puntos) {
            System.out.println(punto.x + " " + punto.y);
        }
    }

}
