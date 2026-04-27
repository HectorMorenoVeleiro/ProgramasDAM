package tercer_trimestre.bucle;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class testeoConDosEtapas {

    public static void main(String[] args) {

        int numeroEtapa = 0;

        // 1. Creamos la lista de competidores
        List<Ciclista> peloton = new ArrayList<>();
        peloton.add(new Ciclista(10, "Nairo Quintana"));
        peloton.add(new Ciclista(25, "Egan Bernal"));
        peloton.add(new Ciclista(7, "Tadej Pogačar"));
        peloton.add(new Ciclista(1, "Jonas Vingegaard"));
        peloton.add(new Ciclista(44, "Rigoberto Urán"));

        // 2. SIMULACIÓN ETAPA 1
        System.out.println("--- INICIANDO ETAPA 1 (Montaña) ---");
        // simularEtapaYMostrar(peloton, 1);
        numeroEtapa = 1;

        // A /Cada ciclista corre la etapa (entre 3000 y 5000 segundos)
        for (Ciclista c : peloton) {
            // correr etapa asigna el tiempo parcial Y Actualiza el acumulado
            c.correrEtapa(3000, 5000); // tu decides los valores en segundos
        }

        // --- CLASIFICACIÓN DE LA ETAPA ---
        // B / Ordenamos por tiempo de la etapa actual (atributo 'tiempo')
        peloton.sort(Comparator.comparingInt(Ciclista::getTiempo));
        System.out.println("\nCLASIFICACIÓN ETAPA " + numeroEtapa + ":");
        for (int i = 0; i < peloton.size(); i++) {
            Ciclista c = peloton.get(i);
            System.out.println((i + 1) + ". " + c.getNombre() + " - Tiempo Etapa: " + c.getTiempo() + "s");
        }

        // --- CLASIFICACIÓN GENERAL ---
        // C/ Ordenamos por tiempo acumulado
        peloton.sort(Comparator.comparingInt(Ciclista::getTiempoAcumulado));
        System.out.println("\nCLASIFICACIÓN GENERAL TRAS ETAPA " + numeroEtapa + ":");
        for (int i = 0; i < peloton.size(); i++) {
            Ciclista c = peloton.get(i);
            // IMPORTANTE!!!!!!!!!!!!
            // Actualizamos la posición general en el objeto
            c.setPosicionGen(i + 1);
            System.out.println(
                    "Pos " + c.getPosicionGen() + ": " + c.getNombre() + " | Total: " + c.getTiempoAcumulado() + "s");
        }
        System.out.println("------------------------------------------");

        // 1. Creamos la lista de competidores
        List<Ciclista> peloton2 = new ArrayList<>();
        peloton2.add(new Ciclista(3, "Pedro Picapiedra"));
        peloton2.add(new Ciclista(40, "Pedris Picapiedris"));
        peloton2.add(new Ciclista(43, "Pedrer PiQuepiedrer"));
        peloton2.add(new Ciclista(63, "Manuel Teruel"));
        peloton2.add(new Ciclista(13, "Rigor Picor"));

        // 2. SIMULACIÓN ETAPA 2
        System.out.println("--- INICIANDO ETAPA 2 (Montaña) ---");
        // simularEtapaYMostrar(peloton, 1);
        numeroEtapa += 1;

        // A /Cada ciclista corre la etapa (entre 3000 y 5000 segundos)
        for (Ciclista c : peloton2) {
            // correr etapa asigna el tiempo parcial Y Actualiza el acumulado
            c.correrEtapa(3000, 5000); // tu decides los valores en segundos
        }

        // --- CLASIFICACIÓN DE LA ETAPA ---
        // B / Ordenamos por tiempo de la etapa actual (atributo 'tiempo')
        peloton2.sort(Comparator.comparingInt(Ciclista::getTiempo));
        System.out.println("\nCLASIFICACIÓN ETAPA " + numeroEtapa + ":");
        for (int i = 0; i < peloton2.size(); i++) {
            Ciclista c = peloton2.get(i);
            System.out.println((i + 1) + ". " + c.getNombre() + " - Tiempo Etapa: " + c.getTiempo() + "s");
        }

        // --- CLASIFICACIÓN GENERAL ---
        // C/ Ordenamos por tiempo acumulado
        peloton2.sort(Comparator.comparingInt(Ciclista::getTiempoAcumulado));
        System.out.println("\nCLASIFICACIÓN GENERAL TRAS ETAPA " + numeroEtapa + ":");
        for (int i = 0; i < peloton2.size(); i++) {
            Ciclista c = peloton2.get(i);
            // IMPORTANTE!!!!!!!!!!!!
            // Actualizamos la posición general en el objeto
            c.setPosicionGen(i + 1);
            System.out.println(
                    "Pos " + c.getPosicionGen() + ": " + c.getNombre() + " | Total: " + c.getTiempoAcumulado() + "s");
        }
        System.out.println("------------------------------------------");

    }

}