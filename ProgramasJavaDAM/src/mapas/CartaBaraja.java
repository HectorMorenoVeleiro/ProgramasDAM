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
        return "Carta [valor=" + valor + ", palo=" + palo + "]";
    }

    public static void main(String[] args) {

        ArrayList<Carta> mano = new ArrayList<Carta>();

        for (int i = 0; i < 5; i++) {
            Carta carta = new Carta();
            System.out.println(carta);
            mano.add(carta);
        }

        mano.sort((o1, o2) -> o1.compareTo(o2));

        for (Carta carta : mano) {
            System.out.println(carta);
        }

        System.out.println("ve tu mano");
        System.out.println(mano);
    }

}
