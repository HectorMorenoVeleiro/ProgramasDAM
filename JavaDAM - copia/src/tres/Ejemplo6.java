package tres;

import java.util.Scanner;

public class Ejemplo6 {

    private static final Scanner sc = new Scanner(System.in);

    // ejemplo con 2 contadores
    public static void main(String[] args) {
        System.out.print("INTRODUCE UN NUMERO HASTA EL QUE QUIERAS CONTAR --> ");
        int numero = Integer.parseInt(sc.nextLine());
        System.out.println("---------------------------------------------------");
        // ejemplo 2 contadores
        int j = 10;
        for (int i = 0; i < numero; i++) {
            System.out.println("[" + i + "] y [" + j + "]");
            j--;
        }
        // ejemplo condicion permanencia en bucle +compleja
        // (relaciona 2 contadores/variables)
        System.out.println("---------------------------------------------------");
        System.out.println("AHORA LA CONDICION ES i < j");
        j = numero;
        for (int i = 0; i < j; i++) {
            System.out.println("[" + i + "] y [" + j + "]");
            j--;
        }
    }
}
