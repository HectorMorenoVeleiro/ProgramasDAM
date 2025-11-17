package tres;

import java.util.Scanner;

public class Ejemplo7 {
    // EJEMPLO CON BREAK
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("INTRODUCE UN NUMERO HASTA EL QUE QUIERAS CORTAR --> ");
        int numero = Integer.parseInt(sc.nextLine());
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            if (i == numero)
                break;
            System.out.println("\t\t\t\t\ti = [" + i + "]");
        }

        System.out.println("|-------------------------------------------------|");
        System.out.println("|              EJEMPLO DE CONTINUE                |");
        System.out.println("|-------------------------------------------------|");

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0)
                continue;
            System.out.println("\t\t\t\t  i impar = [" + i + "]");
        }

    }
}
