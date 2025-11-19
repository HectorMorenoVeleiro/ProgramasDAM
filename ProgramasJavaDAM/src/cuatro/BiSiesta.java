package cuatro;

public class BiSiesta {
    // La regla para determinar un año bisiesto es que el año debe ser divisible por
    // 4, pero los años divisibles por 100 no son bisiestos a menos que también sean
    // divisibles por 400.

    // atributos
    private int año;

    // método constructor
    public BiSiesta(int año) {
        this.año = año;
    }

    // métoco para calcular si esBisiesto
    public boolean esBisiesto() {
        return this.año % 4 == 0 && this.año % 400 == 0;
    }
}
