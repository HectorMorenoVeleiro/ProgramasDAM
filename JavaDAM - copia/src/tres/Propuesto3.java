package tres;

public class Propuesto3 {
    public static void main(String[] args) {
        System.out.println(
                "INTRODUCE EL NUMERO DE FILAS --> ");
        int fakeLimite = 5 + 3;
        for (int i = 0; i < 7; i++) {
            if (i < 7 / 2) {
                for (int k = 7 - 1; k > i; k--)
                    System.out.print(" ");
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }
            } else {
                for (int k = -1 + 1; k < i; k++)
                    System.out.print(" ");
                for (int j = (fakeLimite / 2) + 2; j > 0; j--) {
                    System.out.print("*");
                }
                fakeLimite -= (double) 4;
            }
            System.out.println("\n");
        } // bucle externo
    }
}
