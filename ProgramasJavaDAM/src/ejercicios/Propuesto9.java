package ejercicios;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Propuesto9 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] aleatorios = new int[100];

        for (int i = 0; i < aleatorios.length; i++) {
            aleatorios[i] = 10 + random.nextInt(100);
        }

        System.out.println(Arrays.toString(aleatorios));

        // ordeno
        // Arrays.sort(Aleatorio);
        // System.out.println(Arrays.toString(aleatorios));
        int max = aleatorios[0], min = aleatorios[0];
        int total = 0;

        for (int i : aleatorios) {
            if (i >= max) {
                max = i;
            }
            if (i <= min) {
                min = i;
            }
            total += i;
        }

        System.out.println("el máximo es -> " + max);
        System.out.println("el mínimo es -> " + min);
        System.out.println("la media es -> " + (double) (total / aleatorios.length));

        // diccionario/mapa
        Map<Integer, Integer> cuenta = new HashMap<Integer, Integer>();

        // Está el mapa completo desde 10 hasta 80 SIN INICIALIZAR

        for (int i : aleatorios)
            cuenta.put(i, 0);

        // contar
        for (int i : aleatorios) {
            int valor = cuenta.get(i);
            cuenta.put(i, valor + 1);
        }

        // Mostrar mapa
        for (Map.Entry<Integer, Integer> pareja : cuenta.entrySet()) {
            System.out.println(pareja.getKey() + " --> ");
            System.out.print(pareja.getValue() + "\n");
        }

        // cuenta.Mostrar (si es solo para mostrar ambos hacen lo mismo) -->
        System.out.println(cuenta.toString());
        System.out.println(cuenta.entrySet());

        // guardar el valor que mas se repite -->
        int moda = aleatorios[0];
        int repe = 0;

        for (Map.Entry<Integer, Integer> pareja : cuenta.entrySet()) {
            if (pareja.getValue() > repe) {
                repe = pareja.getValue();
                moda = pareja.getKey();
            }
        }

        // mostramos la moda -->
        System.out.println("la moda es: " + moda + " que se repite " + repe + " veces");




    }
}
