package mapas;

import java.util.ArrayList;
// TODO: make this class so it has some type of sense

public class EjemploGato1 {

    public static void main(String[] args) {
        ArrayList<Gato> gateria = new ArrayList<Gato>();

        // el gato es anonimo
        gateria.add(new Gato("Garfield", "naranja", "angora"));
        gateria.add(new Gato("Pepe", "gris", "mestizo"));
        gateria.add(new Gato("Mauri", "blanco", "manx"));
        gateria.add(new Gato("Ulises", "marrón", "persa"));
        gateria.add(new Gato("Adán", "negro", "angora"));

        // ordena usando el metodo compareTo
        // Collections.sort((gato1, gato2) -> gato1.compareTo(gato2));

        System.out.println("Datos de los gatos ordenados por nombre: ");

        for (Gato gatoaux : gateria) {
            System.out.print(gatoaux + "\n");
        }
    }
}
