package gestion_almacen;

import java.util.Scanner;

public class Teclado {

    static Scanner entrada = new Scanner(System.in);

    public static char leerCaracter() {
        char caracter;
        try {
            return leerCadena().charAt(0);
        } catch (Exception e) {
            caracter = 0;
        }
        return caracter;
    }

    public static char leerCaracter(String mensaje) {
        System.out.println(mensaje);
        return leerCaracter();
    }

    public static String leerCadena(String mensaje) {
        System.out.println(mensaje);
        return leerCadena();
    }

    public static String leerCadena() {
        return entrada.nextLine();

    }

    public static int leerEntero() throws NoEsEnteroException {

        try {
            return Integer.parseInt(leerCadena().trim());
        } catch (NumberFormatException e) {
            throw new NoEsEnteroException("Introduzca un número entero.");
        }
    }

    public static int leerEntero(String mensaje) throws NoEsEnteroException {
        System.out.println(mensaje);
        return leerEntero();
    }

    public static double leerDecimal() throws NoEsDecimalException {
        try {
            return Double.parseDouble(leerCadena().trim());
        } catch (NumberFormatException e) {
            throw new NoEsDecimalException("Introduzca un número decimal.");
        }
    }

    public static double leerDecimal(String mensaje) throws NoEsDecimalException {
        System.out.println(mensaje);
        return leerDecimal();
    }

}