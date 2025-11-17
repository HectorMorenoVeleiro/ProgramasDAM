package tres;

public class Resuelto2 {
    /*
     * 2. Realiza un programa utilizando bucles que muestre
     * la siguiente figura por pantalla
     * *
     * ***
     * ***** ()arbol de navidad
     */
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int k = 2; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        } // bucle externo
    }

}
