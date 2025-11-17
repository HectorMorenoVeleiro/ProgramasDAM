package tres;

import java.util.HashMap;
import java.util.Map;

import EjerciciosCuentaPropia.AjustesProgramas;

public class Resuelto7 {
    // Escribe programa que cuente por pantalla del 1 al 10 en ingles.
    // con estructura default
    public static void main(String[] args) {
        String[] tranduccionado = { "eins", "zwei", "drei", "vier", "funf", "sechs", "sieben", "acht", "neun", "zhen" };
        int numero = AjustesProgramas.enterRangoDeIntegers(1, 10, "DIME UN NUMERO DEL 1 AL 10 -> ");

        System.out.println("------------------------------------");

        System.out.print("traducido al ingles: --> ");
        switch (numero) {
            case 1 -> System.out.print("one");
            case 2 -> System.out.print("two");
            case 3 -> System.out.print("three");
            case 4 -> System.out.print("four");
            case 5 -> System.out.print("five");
            case 6 -> System.out.print("six");
            case 7 -> System.out.print("seven");
            case 8 -> System.out.print("eight");
            case 9 -> System.out.print("nine");
            case 10 -> System.out.print("ten");
            default -> System.out.print("NaN.......");
        }
        System.out.println("\ntraducido al aleman --> " + tranduccionado[numero - 1]);

        Map<Integer, String> numerosFrances = new HashMap<>();
        numerosFrances.put(1, "un");
        numerosFrances.put(2, "deux");
        numerosFrances.put(3, "trois");
        numerosFrances.put(4, "quatre");
        numerosFrances.put(5, "cinq");
        numerosFrances.put(6, "six");
        numerosFrances.put(7, "sept");
        numerosFrances.put(8, "huit");
        numerosFrances.put(9, "neuf");
        numerosFrances.put(10, "dix");

        System.out.print("traducido al frances --> " + numerosFrances.get(numero));

    }
}
