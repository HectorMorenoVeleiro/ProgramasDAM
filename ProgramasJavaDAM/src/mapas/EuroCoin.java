package mapas;

import java.util.HashMap;
import java.util.Random;

public class EuroCoin {

    /*
     * Ejercicio 7
     * La máquina Eurocoin genera una moneda de curso legal cada vez que se pulsa un
     * botón siguiendo la siguiente pauta: o bien coincide el valor con la moneda
     * anteriormente generada - 1 céntimo, 2 céntimos, 5 céntimos, 10 céntimos, 25
     * céntimos, 50 céntimos, 1 euro o 2 euros - o bien coincide la posición – cara
     * o cruz. Simula, mediante un programa, la generación de 6 monedas aleatorias
     * siguiendo la pauta correcta. Cada moneda generada debe ser una instancia de
     * la clase Moneda y la secuencia se debe ir almacenando en una lista.
     * Ejemplo:
     * 2 céntimos – cara
     * 2 céntimos – cruz
     * 50 céntimos – cruz
     * 1 euro – cruz
     * 1 euro – cara
     * 10 céntimos – cara
     */

    public static HashMap<String, Float> contar = new HashMap<String, Float>() {
        {
            put("1 centimo", 0.01f);
            put("2 centimos", 0.02f);
            put("5 centimos", 0.05f);
            put("10 centimos", 0.10f);
            put("20 centimos", 0.20f);
            put("50 centimos", 0.50f);
            put("1 euro", 1.00f);
            put("2 euros", 2.00f);
        }
    };

    static String[] valores = { "1 centimo", "2 centimos", "5 centimos", "10 centimos", "20 centimos", "50 centimos",
            "1 euro", "2 euros" };
    static String[] posiciones = { "cara", "cruz" };

    String posicion;
    String valor;

    EuroCoin() {
        this.valor = valores[new Random().nextInt(valores.length)];
        this.posicion = posiciones[new Random().nextInt(posiciones.length)];
    }

    public String getValor() {
        return valor;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
}
