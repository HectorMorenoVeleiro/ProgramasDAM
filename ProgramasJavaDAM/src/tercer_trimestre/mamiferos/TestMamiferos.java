package tercer_trimestre.mamiferos;

import java.util.ArrayList;

public class TestMamiferos {

    public static void main(String[] args) {

        ArrayList<Mamifero> lista = new ArrayList<>();

        Ballena ba = new Ballena();
        lista.add(ba);

        Ornitorrinco or = new Ornitorrinco();
        lista.add(or);

        for (Mamifero mamifero : lista) {
            System.out.println(mamifero.toString());
            // if (mamifero instanceof Ornitorrinco)
            // ((Ornitorrinco) mamifero).ponerHuevos();
        }
    }

}
