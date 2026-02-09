package mapas;

import java.util.Arrays;
import java.util.Random;

public class Carta {

    public enum Valor {
        AS, DOS, TRES, CUATRO, CINCO, SEIS, SIETE, SOTA, CABALLO, REY
    }

    enum Palos {
        ESPADAS, BASTOS, COPAS, OROS
    }

    // atributos -->
    Valor[] valores = Valor.values();
    Palos[] palos = Palos.values();
    String valor;
    String palo;

    // constructor -->
    Carta() {
        Random random = new Random();
        this.valor = valores[random.nextInt(valores.length)].name();
        this.palo = palos[random.nextInt(palos.length)].name();
    }

    // getters y setters
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public static void main(String[] args) {
        Carta car1 = new Carta();

        System.out.println(car1.getValor() + " de " + car1.getPalo());
    }

}
