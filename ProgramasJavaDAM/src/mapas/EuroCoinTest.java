package mapas;

import java.util.Random;

public class EuroCoinTest {

    public static void main(String[] args) {

        Random random = new Random(); // creas random
        EuroCoin[] monedas = new EuroCoin[6]; // creas array de monedas
        float prob = 0; // creas una probabilidad a 0

        for (int i = 0; i < monedas.length; i++) { // for para crear cada moneda
            if (i == 0) // instruccion condicional para excepcion de primera instancia
                monedas[i] = new EuroCoin();
            else { // instruccion condicional que recoge uno de los dos valores previos del del
                   // array
                   // segun una probabilidad generada por un random
                monedas[i] = new EuroCoin();
                prob = random.nextFloat();
                if (prob > 0.5) {
                    monedas[i].setValor(monedas[i - 1].getValor());
                } else {
                    monedas[i].setPosicion(monedas[i - 1].getPosicion());
                }
            }
        }

        for (EuroCoin moneda : monedas) // muestras el condenido del array monedas
            System.out.println(moneda.getValor() + " - " + moneda.getPosicion());

    }
}
