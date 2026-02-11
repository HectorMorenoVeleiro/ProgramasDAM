package mapas;

import java.util.ArrayList;

public class PuntuacionMano {

    public static void main(String[] args) {

        ArrayList<CartaBaraja> mano = new ArrayList<CartaBaraja>();

        while (mano.size() < 5) {
            CartaBaraja carta = new CartaBaraja();
            if (!mano.contains(carta)) {
                mano.add(carta);
            }
        }

        mano.sort((o1, o2) -> o1.compareTo(o2));

        CartaBaraja.puntosCartas();

        int total = 0;
        for (CartaBaraja carta : mano) {
            System.out.println(carta);
            total += CartaBaraja.puntos.get(carta.getValor());
        }
        System.out.println("tienes " + total + " puntos");
    }
}
