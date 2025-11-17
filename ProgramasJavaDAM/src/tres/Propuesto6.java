package tres;

public class Propuesto6 {
    // Multiplica
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("\ntabla del " + i);
            System.out.println("----------------------------");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
    }
}
