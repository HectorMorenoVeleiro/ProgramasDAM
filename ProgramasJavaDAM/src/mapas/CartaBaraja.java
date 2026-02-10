package mapas;

import java.util.ArrayList;
import java.util.Random;

public class CartaBaraja implements Comparable<CartaBaraja> {

    public enum Valor {
        AS, DOS, TRES, CUATRO, CINCO, SEIS, SIETE, SOTA, CABALLO, REY
    }

    enum Palos {
        ESPADAS, BASTOS, COPAS, OROS
    }

    // atributos -->
    String valor;
    String palo;

    // constructor -->
    CartaBaraja() {
        Random random = new Random();
        Valor[] valores = Valor.values();
        Palos[] palos = Palos.values();
        this.valor = valores[random.nextInt(valores.length)].name();
        this.palo = palos[random.nextInt(palos.length)].name();
    }

    public String getValor() {
        return valor;
    }

    public String getPalo() {
        return palo;
    }

    // ESTE METODO PERMITIRA comparar dos objetos carta y ordenarlos segun el
    // criterio de su interior
    public int compareTo(CartaBaraja otra) {
        // la carta que llama a este metodo es this
        // la carta con la que comparo es o
        // quiero ordenar por palos
        // quiero ordenar por palos
        int compPalo = this.palo.compareTo(otra.palo);
        if (compPalo != 0)
            return compPalo;
        return this.valor.compareTo(otra.valor);
    }

    @Override
    public String toString() {
        return this.valor + " de " + this.palo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((valor == null) ? 0 : valor.hashCode());
        result = prime * result + ((palo == null) ? 0 : palo.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CartaBaraja other = (CartaBaraja) obj;
        if (this.valor == null) {
            if (other.valor != null)
                return false;
        } else if (!this.valor.equals(other.valor))
            return false;
        if (this.palo == null) {
            if (other.palo != null)
                return false;
        } else if (!this.palo.equals(other.palo))
            return false;
        return true;
    }

    public static void main(String[] args) {

        ArrayList<CartaBaraja> mano = new ArrayList<CartaBaraja>();

        for (int i = 0; i < 5; i++) {
            CartaBaraja carta = new CartaBaraja();
            if (!mano.contains(carta)) {
                mano.add(carta);
            }
        }

        for (CartaBaraja carta : mano) {
            System.out.println(carta);
        }

        mano.sort(CartaBaraja::compareTo);
        System.out.println("\n\tve tu mano\n");

        for (CartaBaraja carta : mano) {
            System.out.println(carta);
        }
    }

}
