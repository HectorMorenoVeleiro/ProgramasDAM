package tres;

import java.util.Scanner;

public class Propuesto9 {
    // di si un numero es Omir o no lo es.

    // theorem fundamental con base 10
    public static int cuentaDigitos(int numero) {
        int digitos = 0;
        while (numero > 0) {
            numero /= 10;
            digitos++;
        }
        return digitos;
    }

    public static int invierteOrdenNumero(int numero) {
        int potenciaNumero = cuentaDigitos(numero) - 1;
        int reverso = 0;
        while (numero > 0) {
            int cifra = numero % 10;
            numero /= 10;
            reverso += cifra * Math.pow(10, potenciaNumero);
            potenciaNumero--;
        }
        return reverso;
    }

    public boolean esPrimo(int numero) {
        boolean primo = true;
        int cociente = 2;
        while (cociente < numero) {
            if (numero % cociente == 0) {
                primo = false;
                return primo;
            }
            cociente++;
        }
        return primo;
    }

    public boolean esOmirp(int numero) {
        boolean omirp = true;
        return omirp;
    }
    // pa casa

    public static void main(String[] args) {
        int numero = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce numero: ");
        numero = Integer.parseInt(sc.nextLine());
        System.out.println("dicho numero al reves es : " + invierteOrdenNumero(numero));
        sc.close();
    }

}
