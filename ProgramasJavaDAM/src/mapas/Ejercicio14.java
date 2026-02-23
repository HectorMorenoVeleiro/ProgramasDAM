package mapas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {

        List<Ecologico> compra = new ArrayList<Ecologico>();
        Scanner sc = new Scanner(System.in);
        String producto = null;

        do {
            System.out.println("nombre producto: ");
            producto = sc.nextLine();
        } while (producto.equals("fin"));
    }
}
