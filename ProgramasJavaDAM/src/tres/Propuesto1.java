package tres;

import EjerciciosCuentaPropia.AjustesProgramas;

public class Propuesto1 {
    // REALIZA UN PROGRAMA CON 3 VARIABLES DE TIPO ENTERO A, B, C. EL PROGRAMA
    // DEBERA MOSTRAR EL VALOR MENOR Y MAYOR
    public static void main(String[] args) {
        int A = AjustesProgramas.enterIntegerPorScanner("DIME UN NUMERO ENTERO A -> ");
        int B = AjustesProgramas.enterIntegerPorScanner("DIME UN NUMERO ENTERO B -> ");
        int C = AjustesProgramas.enterIntegerPorScanner("DIME UN NUMERO ENTERO C -> ");
        String MAYOR = null, MENOR = null;
        if (A > B) {
            if (A > C && C > B) {
                MAYOR = "A";
                MENOR = "B";
            } else {
                MAYOR = "C";
                MENOR = "B";
            }
        } else {
            if (A < C && C > B) {
                MAYOR = "C";
                MENOR = "A";
            } else {
                MAYOR = "B";
                MENOR = "C";
            }
        }
        System.out.println("EL NUMERO MAYOR ES --> " + MAYOR);
        System.out.println("EL NUMERO MAYOR ES --> " + MENOR);
    }
}
