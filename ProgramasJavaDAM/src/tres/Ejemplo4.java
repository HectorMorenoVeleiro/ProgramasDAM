package tres;

import java.util.Scanner;

public class Ejemplo4 {

    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("empezamos en el uno...");
        System.out.print("hasta que numero quieres contar ? -- > ");
        int numero = Integer.parseInt(sc.nextLine());
        System.out.println("-----------------------------------");
        int contador = 1;
        do {
            System.out.println(contador);
            contador ++;
        } while (contador <= numero);
    }
}
