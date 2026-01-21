package ejercicios;

import java.util.Scanner;

public class Resuelto8 {

    public static boolean esCapicua(int numero) {
        boolean cap = false;
        String derecho = String.valueOf(numero);
        String reves = new StringBuilder(derecho).reverse().toString();
        int oremun = Integer.parseInt(reves);
        if (numero == oremun) {
            cap = true;
        }

        return cap;
    }

    public static void main(String[] args) {
        System.out.println("dame un entero: ");
        Scanner sc = new Scanner(System.in);
        int lee = Integer.parseInt(sc.nextLine());

        System.out.println("el numero es capicua: " + lee);

        sc.close();
    }
}
