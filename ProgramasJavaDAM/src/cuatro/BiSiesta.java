package cuatro;

public class BiSiesta {
    // La regla para determinar un año bisiesto es que el año debe ser divisible por
    // 4, pero los años divisibles por 100 no son bisiestos a menos que también sean
    // divisibles por 400.
    private int año;

    public BiSiesta(int año) {
        this.año = año;
    }

    public boolean esBisiesto() {
        if (this.año % 4 == 0 || this.año % 100 == 0 && this.año % 400 == 0)
            return true;
        return false;
    }
}
