package tres;

import java.util.Scanner;

//pepe fonts
public class Propuesto10BienHecho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        do {
            System.out.println("Introduce un numero entero positivo");
            n = Integer.parseInt(sc.nextLine());
        } while (n < 1000 || n > 9999);
        sc.close();
        System.out.println("El numero " + n + " es vampiro? " + esVampiro(n));
    }

    public static boolean esVampiro(int n) {
        boolean vamp = false;
        // troceado
        int d = n % 10;
        // System.out.println(d);
        int c = (n / 10) % 10;
        // System.out.println(c);
        int b = ((n / 10) / 10) % 10;
        // System.out.println(b);
        int a = ((n / 10) / 10) / 10;
        // System.out.println(a);
        // que combinaciones tenemos que probar
        // ab cd
        if ((a * 10 + b) * (c * 10 + d) == n)
            vamp = true;
        // ab dc
        if ((a * 10 + b) * (d * 10 + c) == n)
            vamp = true;
        // ba cd
        if ((b * 10 + a) * (c * 10 + d) == n)
            vamp = true;
        // ba dc
        if ((b * 10 + a) * (d * 10 + c) == n)
            vamp = true;
        // ad bc
        if ((a * 10 + d) * (b * 10 + c) == n)
            vamp = true;
        // ad cb
        if ((a * 10 + d) * (c * 10 + b) == n)
            vamp = true;
        // da bc
        if ((d * 10 + a) * (b * 10 + c) == n)
            vamp = true;
        // da cb
        if ((d * 10 + a) * (c * 10 + b) == n)
            vamp = true;
        // ac bd
        if ((a * 10 + c) * (b * 10 + d) == n)
            vamp = true;
        // ac db
        if ((a * 10 + c) * (d * 10 + b) == n)
            vamp = true;
        // ca bd
        if ((c * 10 + a) * (b * 10 + d) == n)
            vamp = true;
        // ca db
        if ((c * 10 + a) * (d * 10 + b) == n)
            vamp = true;
        return vamp;
    }
}
