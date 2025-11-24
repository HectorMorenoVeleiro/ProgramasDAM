package cuatro;

import java.util.Scanner;

public class BuscarNumeroArray {

    public static void main(String[] args) {
        int[] datos = { 1, 2, 3, 3, 4, 4, 5, 2 };

        int numero = 0;

        System.out.println("busqueda de numero...");
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("introduce el numero: ");
            numero = Integer.parseInt(sc.nextLine());
        } while (numero < 0 || numero > 1000);

        boolean esta = false;
        for (Integer pillo : datos) {
            if (pillo == numero)
                esta = true;
        }

        System.out.println(esta);
        sc.close();
    }
}
