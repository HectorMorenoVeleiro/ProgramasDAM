package tres;

import ejercicioscuentapropia.AjustesProgramas;

public class Resuelto2B {
    // Repite la piramide pidiendole al usuario el numero de filas
    public static void main(String[] args) {
        int limite = AjustesProgramas.enterIntegerPorScanner(
                "INTRODUCE EL NUMERO DE FILAS --> ");
        for (int i = 0; i < limite; i++) {
            for (int k = limite - 1; k > i; k--)
                System.out.print(" ");
            for (int j = 0; j < 2 * i + 1; j++)
                System.out.print("*");
            System.out.println();
        } // bucle externo
    }
}
