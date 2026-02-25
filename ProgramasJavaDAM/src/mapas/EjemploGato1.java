package mapas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EjemploGato1 {

    public static void main(String[] args) {
        List<Gato> gateria = new ArrayList<Gato>();

        // el gato es anonimo
        gateria.add(new Gato("Garfield", "naranja", "angora"));
        gateria.add(new Gato("Pepe", "gris", "mestizo"));
        gateria.add(new Gato("Mauri", "blanco", "manx"));
        gateria.add(new Gato("Ulises", "marrón", "persa"));
        gateria.add(new Gato("Adán", "negro", "angora"));

        Collections.sort(gateria);

        gateria.forEach(gato -> System.out.println(gato));
    }
}
