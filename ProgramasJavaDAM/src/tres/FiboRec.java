package tres;

import EjerciciosCuentaPropia.AjustesProgramas;

public class FiboRec {

    public static int Fibonacci(int ene) {
        // caso limite
        if (ene == 1)
            return 0;
        else if (ene == 2)
            return 1;
        // caso recursivo Fn = Fn - 1 + Fn - 2
        else
            return Fibonacci(ene - 1) + Fibonacci(ene - 2);
    }

    public static void main(String[] args) {
        int enesimo = AjustesProgramas.enterIntegerPorScanner("termino a obtener de la sucesion de Fibonacci : ");
        System.out.println("el termino " + enesimo + " es " + Fibonacci(enesimo));
    }

}
