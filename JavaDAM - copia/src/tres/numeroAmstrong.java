package tres;

import java.util.Scanner;
// comprobación de número amstrong 3 dijitos
public class numeroAmstrong {
    public static final Scanner sc = new Scanner(System.in);

    public static int CuentaDigitos (int numero) {
        int digitos = 0;
        do {
            //quitar digito
            numero = numero/10;
            //incrementar contador
            digitos++;
        } while (numero > 0);
        return digitos;
    }

}
