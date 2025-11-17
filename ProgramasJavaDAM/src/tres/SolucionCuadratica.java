package tres;

import java.util.Scanner;

public class SolucionCuadratica {

    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Una ecuación cuadrática es del tipo " +
                "ax^2+bx+c=0");
        System.out.println("Dame la a: ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("Dame la b: ");
        double b = Double.parseDouble(sc.nextLine());
        System.out.println("Dame la c: ");
        double c = Double.parseDouble(sc.nextLine());

        double discriminante = Math.pow(b, 2) - (4 * a * c);
        System.out.println(discriminante);

        if (discriminante > 0.0) {
            System.out.println("la ecuacion tiene 2 soluciones");
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("las soluciones son: " + raiz1 + " y " + raiz2);
        } else if (discriminante == 0.0) {
            System.out.println("la ecuacion tiene una solucion doble");
            double raizUnicaDoble = -b / 2 * a;
            System.out.println("la solucion doble es : " + raizUnicaDoble);
        } else
            System.out.println("la ecuacion no tiene solucion");
    }
}
