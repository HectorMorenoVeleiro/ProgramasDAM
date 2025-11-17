package tres;

public class Propuesto2 {
    public static void main(String[] args) {
        // bucle interno OJO i<j
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            } // int j
            System.out.println();
        } // ext i
    }
}
