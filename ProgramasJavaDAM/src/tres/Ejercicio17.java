package tres;

import java.util.Scanner;

public class Ejercicio17 {

    // Escribir un programa que dado un número entero positivo n, calcule la suma
    // de la siguiente serie: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Primer termino de la sucesión ---> ");
        double primer = Double.parseDouble(sc.nextLine());
        System.out.println("dime que termino deseas obtener ---->");
        int ene = Integer.parseInt(sc.nextLine());
        // ojo a la inicialización
        double aux = primer;
        double termino = primer; // el primer termino es 1

        // repetitiva
        for (int i = 1; i <= ene; i++) {
            System.out.println(termino + ", ");
            // termino= termino + 1/i;
            aux = i;
            termino = 1 / aux;
        }
        System.out.println("el termino " + ene + " es: " + termino);
        sc.close();
    }
}
