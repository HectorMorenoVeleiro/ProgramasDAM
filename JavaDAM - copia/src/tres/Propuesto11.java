package tres;

import EjerciciosClase.AjustesProgramas;

public class Propuesto11 {
    // programa que muestre los 50 primeros pares
    public static void main(String[] args) {

        int primerNumero = AjustesProgramas.introducirIntegerPorScanner("primer termino --> ");
        int diferenciaASumar = AjustesProgramas.introducirIntegerPorScanner("diferencia a sumar --> ");
        int terminoAObtener = AjustesProgramas.introducirIntegerPorScanner("dime que termino deseas obtener --> ");

        int termino = primerNumero;
        int acumula = primerNumero;

        for (int i = primerNumero; i < terminoAObtener; i++) {
            System.out.println(termino + " ");
            termino += diferenciaASumar;
            acumula += termino;
        }

        System.out.println("el termino " + terminoAObtener + " es: " + termino);
        System.out.println("la suma de los " + terminoAObtener + " primeros terminos de la sucesion es " + acumula);

        long primer = AjustesProgramas.introducirLongPorScanner("introduce el primero --> ");
        long ultimo = AjustesProgramas.introducirLongPorScanner("introduce el ultimo --> ");

        long n = ultimo - primer + 1;
        long suma = (n * (primer + ultimo)) / 2;

        System.out.println("la suma de tu sucesion es " + (long) (suma));
    }
}