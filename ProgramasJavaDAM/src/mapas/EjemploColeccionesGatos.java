package mapas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class EjemploColeccionesGatos {

    public static void main(String[] args) {
        List<Gato> gateria = new ArrayList<>();
        gateria.add(new Gato("Zarpas", "Naranja", "Tabby"));
        gateria.add(new Gato("Abelardo", "Gris", "Persa"));
        gateria.add(new Gato("Isidoro", "Naranja", "Callejero"));
        gateria.add(new Gato("Isidoro", "Naranja", "Callejero"));

        System.out.println("---Lista Inicial ---\n" + gateria);

        // 2.sort

        Collections.sort(gateria);
        System.out.println("--- ordenados (A - Z) --- \n" + gateria);

        // 3.reverse
        Collections.reverse(gateria);
        System.out.println("--- ordenados (Z - A) --- \n" + gateria);

        // 4.shufar
        Collections.shuffle(gateria);
        System.out.println("--- Gatos tras shufle ---\n" + gateria);

        // 5.MIN y MAX
        Gato primero = Collections.min(gateria);
        Gato ultimo = Collections.max(gateria);

        System.out.println("primero (" + primero + ") y ultimo (" + ultimo + ").");

        // 6.frequency
        int numIsidoros = Collections.frequency(gateria, new Gato("Isidoro", "", ""));
        System.out.println("numero de Isidoros " + numIsidoros);

        // 7.ReplaceAll
        Collections.replaceAll(gateria,
                new Gato("Isidoro", "", ""),
                new Gato("Michi supremo", "Dorado", "Dios"));

        System.out.println("trass el ReplaceAll " + gateria);

        // 8.binarySearch
        Collections.sort(gateria);
        int pos = Collections.binarySearch(gateria, new Gato("Abelardo", "", ""));

        System.out.println("Abelardo esta en la posicion " + pos);

        // 9.unmodifiablelist
        List<Gato> listaBlindada = Collections.unmodifiableList(gateria);

    }

}
