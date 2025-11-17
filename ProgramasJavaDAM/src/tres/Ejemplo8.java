package tres;

public class Ejemplo8 {
    //
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            if (i == 5)
                break;
            if (i == 3) {
                i++;
                continue;
            }
            System.out.println("i = " + i);
            i++;
        }
    }
}

