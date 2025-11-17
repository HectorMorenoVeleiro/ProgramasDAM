package tres;

import EjerciciosCuentaPropia.AjustesProgramas;

public class Ejemplo2 {

    public static void main(String[] args) {
        int mes = AjustesProgramas.enterIntegerPorScanner("INTRODUCE NUMERO DE MES (1-12): ");
        String resultado = null;
        System.out.println("-----------------------------------");
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                resultado = "MES 31 DIAS";
                break;
            case 4:
                resultado = "MES 30 DIAS";
                break;
            case 2:
                resultado = "MES 28 DIAS (29 SI BISIESTO)";
            default:
        }
        System.out.println(resultado);
    }
}
