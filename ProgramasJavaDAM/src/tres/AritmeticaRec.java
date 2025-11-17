package tres;

import EjerciciosClase.AjustesProgramas;

public class AritmeticaRec {
    // programa que muestre los 50 primeros pares

    // metodo sacar termino n gracias a conocer el termino anterior a el

    public static int primerNumero;
    public static int diferenciaASumar;

    /*
     * METODO ITERATIVO
     * for (...)... termin+diferencia/ acumula+termino;
     */

    // metodo recursivo
    public static int terminoEne(int ene) {
        // recursividad
        if (ene == 1) // caso limite/base
            return primerNumero;
        // recursividad caso generico
        else {
            return terminoEne(ene - 1) + diferenciaASumar;
        }
    }

    public static int sumaHastaEne(int n) {
        if (n == 1) {
            return primerNumero;
        } else {
            return terminoEne(n) + sumaHastaEne(n - 1);
        }
    }

    public static void main(String[] args) {

        primerNumero = AjustesProgramas.introducirIntegerPorScanner("primer termino --> ");
        diferenciaASumar = AjustesProgramas.introducirIntegerPorScanner("diferencia a sumar --> ");
        int terminoAObtener = AjustesProgramas.introducirIntegerPorScanner("dime que termino deseas obtener --> ");

        int terminoMomento = primerNumero;
        int acumula = primerNumero;

        // for (char i = 'a'; i < 'a' + terminoAObtener; i++) {
        // System.out.print(i + ".[" + terminoMomento + "]\t");
        // terminoMomento *= diferenciaASumar;
        // acumula += terminoMomento;
        // }

        // System.out.println("\nel termino " + terminoAObtener + " es: " +
        // terminoMomento);
        System.out.println("\nel termino " + terminoAObtener + " es: " + terminoEne(terminoAObtener));
        System.out.println("la suma de los " + terminoAObtener + " primeros terminos de la sucesion es " + acumula);

        System.out.println("la suma por FORMULA DA : "
                + primerNumero * ((int) Math.pow(diferenciaASumar, terminoAObtener) - 1) / (diferenciaASumar - 1));

        long primer = AjustesProgramas.introducirLongPorScanner("introduce el primero --> ");
        long ultimo = AjustesProgramas.introducirLongPorScanner("introduce el ultimo --> ");

        long n = ultimo - primer + 1;
        long suma = (n * (primer + ultimo)) / 2;

        System.out.println("tengo mucha " + suma + " y tambien mucho " + terminoMomento);

        // System.out.println("la suma de tu sucesion es " + (long) (suma));
    }
}