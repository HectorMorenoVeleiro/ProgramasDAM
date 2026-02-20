package mapas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EuroCoinTest {

    public static void main(String[] args) {

        Random random = new Random(); // creas random
        List<EuroCoin> monedas = new ArrayList<EuroCoin>();
        float prob = 0; // creas una probabilidad a 0

        for (int i = 0; i < 6; i++) { // for para crear cada moneda

            monedas.add(new EuroCoin());
            prob = random.nextFloat();
            if (i != 0)
                if (prob > 0.5)
                    monedas.get(i).setValor(monedas.get(i - 1).getValor());
                else
                    monedas.get(i).setPosicion(monedas.get(i - 1).getPosicion());
        }

        for (EuroCoin moneda : monedas) // muestras el condenido del array monedas
            System.out.println(moneda.getValor() + " - " + moneda.getPosicion());

    }
}