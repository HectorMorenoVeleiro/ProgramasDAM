package ejerciciosclase;

import java.util.Scanner;

public class MayorYMenorDe3 {
    private static final Scanner sc = new Scanner(System.in);

    public static int introducirIntegerScanner(String orden) {
        System.out.println(orden);
        int numero = Integer.parseInt(sc.nextLine());
        return numero;
    }

    public static void main(String[] args) {
        // intente hacer el programa con la media, pero la media
        // no sirve para calcular el mayor pues puede ocurrir que
        // ningun dos numeros sean mayores que la media, por tanto
        // recurri a buscar una formula para hallar el mayor, pero
        // me acabe rindiendo y le pregunte a chatGPT
        int[] numeros = new int[3];
        double MAYOR = 0, MENOR = 0;
        for (int i = 0; i <= 2; i++)
            numeros[i] = introducirIntegerScanner("INTRODUCE EL NUMERO " + i + " --> ");
        int[] numeros2 = numeros.clone();
        MAYOR = (((numeros[0] + numeros[1] + Math.abs(numeros[0] - numeros[1])) / 2) + numeros[2]
                + Math.abs(((numeros[0] + numeros[1] + Math.abs(numeros[0] - numeros[1])) / 2) - numeros[2])) / 2;
        for (int j = 0; j <= 2; j++)
            if ((numeros2[j] - ((((numeros[0] + numeros[1] + numeros[2]) / 3) - MAYOR / 3)
                    + (Math.abs((((numeros[0] + numeros[1] + numeros[2]) / 3) - (MAYOR / 3))
                            - ((numeros[0] + numeros[1] + numeros[2] - MAYOR) / 2))))) < 0)
                MENOR = numeros2[j];
        System.out.println("el mayor es : " + MAYOR + " y el menor es : " + MENOR);
    }
}