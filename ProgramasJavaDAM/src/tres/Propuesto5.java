package tres;

import java.util.Scanner;

public class Propuesto5 {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("dime dia, mes y año --> ");
        int dia = Integer.parseInt(sc.nextLine());
        int mes = Integer.parseInt(sc.nextLine());
        int año = Integer.parseInt(sc.nextLine());

        int numero = 0;
        int lucky = 0;

        numero = dia + mes + año;
        System.out.println("proto lucky es --> " + numero);

        while (numero / 10 != 0) {
            int suma = 0;

            while (numero > 0) {
                int digito = numero % 10;
                suma += digito;
                numero = numero / 10;
            }
            lucky = suma;
        }

        System.out.println("tu lucky number es : " + lucky);

    }

}
