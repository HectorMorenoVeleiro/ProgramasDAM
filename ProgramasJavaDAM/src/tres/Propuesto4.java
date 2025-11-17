package tres;

/*
 * if (j == 0 || j == 2 * i + 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
 */
public class Propuesto4 {

    public static void main(String[] args) {
        System.out.println(
                "INTRODUCE EL NUMERO DE FILAS --> ");
        int fakeLimite = 7 + 3;
        for (int i = 0; i < 7; i++) {
            if (i < 7 / 2) {
                for (int k = 7 - 1; k > i; k--)
                    System.out.print(" ");
                for (int j = 0; j < 2 * i + 1; j++) {
                    if (j == 0)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            } else {
                for (int k = -1 + 1; k < i; k++)
                    System.out.print(" ");
                for (int j = (fakeLimite / 2) + 2; j > 0; j--) {
                    if (j == 0)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                fakeLimite -= (double) 4;
            }
            System.out.println("\n");
        } // bucle externo
    }
    // nipu
}
