package tres;

public class Resuelto6 {
    public static void main(String[] args) {
        int contador = 200;
        // me comentan que el do/while es una puta mierda
        do {
            System.out.println(contador);
            contador++;
        } while (contador <= 300);

        System.out.println("\nahora con for.......\n");

        for (int j = 200; j <= 300; j++) {
            System.out.println(j);
        }
    }

}
