package tres;

import EjerciciosCuentaPropia.AjustesProgramas;

public class Ejemplo3 {

    public static void main(String[] args) {
        int numero = AjustesProgramas.enterIntegerPorScanner("HASTA DONDE QUIERES CONTAR? -->");
        int i = 0;
        System.out.println("----------------------------");
        while (i <= numero) {
            System.out.print("[" + i + "] \t");
            i++;
            if (i % 10 == 0)
                System.out.println();
        }
    }
}
