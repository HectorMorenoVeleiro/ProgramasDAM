package tercer_trimestre.bucle;

import java.util.ArrayList;
import java.util.List;

public class PruebaVelocistas {

    public static void main(String[] args) {

        int numeroEtapa = 0;

        // Creamos lista competidores
        List<Ciclista> peloton = new ArrayList<>();

        peloton.add(new Escalador(numeroEtapa, null, numeroEtapa, numeroEtapa));
        peloton.add(new Escalador(numeroEtapa, null, numeroEtapa, numeroEtapa));
        peloton.add(new Velocista(numeroEtapa, null, numeroEtapa, numeroEtapa));
        peloton.add(new Velocista(numeroEtapa, null, numeroEtapa, numeroEtapa));
        peloton.add(new ContraRelojista(numeroEtapa, null, numeroEtapa));
        peloton.add(new ContraRelojista(numeroEtapa, null, numeroEtapa));
    }
}
