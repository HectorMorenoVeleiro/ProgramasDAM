package cuatro;

import EjerciciosCuentaPropia.AjustesProgramas;

public class Divisores {

    public static boolean esPerfecto(int n) {
        int suma = 0;
        for (int index = 1; index < n; index++) {
            if (n % index == 0)
                suma += index;
        }
        if (suma == n)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println("obtencion de todos los divisores de un entero.........");
        int entero = AjustesProgramas.enterIntegerPorScanner("introduce entero positivo --> ");
        System.out.println("el numero " + entero + " tiene los siguientes divisores : ");

        for (int i = 1; i <= entero; i++)
            if (entero % i == 0)
                System.out.println(i + ", ");

        System.out.println("el numero " + entero + " tiene los siguientes divisores : ");
    }

}
