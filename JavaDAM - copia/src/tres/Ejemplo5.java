package tres;

import java.util.Scanner;

public class Ejemplo5 {
    // Ejemplo de bucle for
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("INTRODUCE UN NUMERO HASTA EL QUE QUIERAS CONTAR --> ");
        int numero = Integer.parseInt(sc.nextLine());
        System.out.println("---------------------------------------------------");

        // bucle repeticiones conocidas
        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }

        System.out.println("----------------------------------------------------");
        System.out.println("AHORA SOLO PARES: ");

        for (int j = 0; j <= numero; j = j + 2) {
            System.out.println(j);
        }

        System.out.println("----------------------------------------------------");
        System.out.println("AHORA SOLO IMPARES: ");

        for (int k = 1; k <= numero; k = k + 2) {
            System.out.println(k);
        }
    }
}
