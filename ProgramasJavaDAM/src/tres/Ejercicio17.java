package tres;

public class Ejercicio17 {

    double aux = 0;
    double termino = 0;

    public int metodoRecursivo(int num) {
        if (num == 0) { // instruccion condicional
            return num;
        } else {
            return metodoRecursivo(num - 1); // se contiene a si mismo
        }

    }

}
