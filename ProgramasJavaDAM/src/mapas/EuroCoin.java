package mapas;

import java.util.Random;

public class EuroCoin {

    // atributes

    String[] valores = { "1 centimo", "2 centimos", "5 centimos", "10 centimos", "20 centimos", "50 centimos", "1 euro",
            "2 euros" };

    String valor;

    EuroCoin() {
        this.valor = valores[new Random().nextInt(valores.length)];
    }

    public String getValor() {
        return valor;
    }
}
