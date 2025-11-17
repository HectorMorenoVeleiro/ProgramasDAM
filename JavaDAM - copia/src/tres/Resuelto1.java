package tres;

import EjerciciosCuentaPropia.AjustesProgramas;

public class Resuelto1 {

    public static void main(String[] args) {
        /*
         * Transforma el siguiente bucle en un bucle while
         * for (int i=5; i<15; i++){
         * }
         */
        System.out.println("cambiado a bucle-while");
        int contador = 5;
        int limite = AjustesProgramas.enterIntegerPorScanner(
                "INTRODUCE UN LIMITE A CONTAR DESDE 5 --> ");
        while (contador <= limite) {
            System.out.println(contador);
            contador++;
        }
    }
}
