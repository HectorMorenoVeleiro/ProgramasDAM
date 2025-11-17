package tres;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dime que termino quieres calcular");
        int ene = Integer.parseInt(sc.nextLine());

        if (ene == 0)
            System.out.println("el termino es : " + 0);
        if (ene == 1)
            System.out.println("el termino es : " + 1);
        int a = 0, b = 1; // termino (a) uno y termino (b) dos
        for (int i = 2; i <= ene; i++) {
            int siguiente = a + b; // el 3 es (a) primero + (b) segundo
            a = b; // en el (a) 1 pones el que antes era (b) 2
            b = siguiente;
        }
        System.out.println("el termino n es : " + b);
        sc.close();
    }

}
