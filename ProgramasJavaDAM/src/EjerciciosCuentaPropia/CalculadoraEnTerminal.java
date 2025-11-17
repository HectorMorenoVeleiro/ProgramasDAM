package EjerciciosCuentaPropia;

import java.util.Scanner;
import java.util.Map;

/*
 * "Calculadora" its a class which main function relies on doing
 * 4 different operations (add, subs, mul, div) without saving 
 * the answer that is given as a result, making use of a simple
 * menu to choose between options.
 */

public class CalculadoraEnTerminal {
    public static double numero1, numero2, num;
    public static int decision;
    public static Scanner sc = new Scanner(System.in);

    public static int fijarIntervaloInt(int intervaloMinimo, int intervaloMaximo) { // Methot that fixate and interval
                                                                                    // between two options of a menu
        int valor;
        while (true) {
            if (sc.hasNextInt()) {
                valor = sc.nextInt();
                sc.nextLine();
                if (valor >= intervaloMinimo && valor <= intervaloMaximo)
                    return valor;
            } else {
                System.out
                        .println("Introduce un número entero entre " + intervaloMinimo + " y " + intervaloMaximo + ":");
                sc.nextLine();
            }
        }
    }

    public static double introduceNumero(String orden, String operacion) { // Class with the purpose of making a number.
        System.out.println("\nIntroduce el " + orden + " número a " + operacion + ": \n");
        while (!sc.hasNextDouble()) {
            System.out.println("ERROR, NUMERO DECIMAL NON DETECTED: ");
            sc.nextLine();
        }
        num = sc.nextDouble();
        sc.nextLine();
        return num;
    }

    public static void menu() { // Methot that makes a menu to choose between operations.
        System.out.println("""
                Que operación deseas realizar

                \t(1) Suma
                \t(2) Resta
                \t(3) Multiplicación
                \t(4) División
                \t(5) Salir
                _________________________________""");
        decision = fijarIntervaloInt(1, 5);

        Map<Integer, Runnable> operaciones = Map.of( // Map that saves the functions with a key for execution.
                1, CalculadoraEnTerminal::operacionSuma,
                2, CalculadoraEnTerminal::operacionResta,
                3, CalculadoraEnTerminal::operacionMultiplicacion,
                4, CalculadoraEnTerminal::operacionDivision,
                5, CalculadoraEnTerminal::salidaUsuario);
        operaciones.getOrDefault(decision, () -> System.out.println("TOO MANY ERRORS, FORCED EXIT")).run();
        // Exit Default.
    }

    public static void operacionSuma() { // // Introduce two numbers to operate with them (add).
        numero1 = introduceNumero("primer", "sumar");
        numero2 = introduceNumero("segundo", "sumar");
        System.out.println("\nLa suma de " + numero1 + " + " + numero2 + " da: " + (numero1 + numero2));
        salidaUsuario();
    }

    public static void operacionResta() { // Introduce two numbers to operate with them (sub).
        numero1 = introduceNumero("primer", "restar");
        numero2 = introduceNumero("segundo", "restar");
        System.out.println("\nLa resta de " + numero1 + " - " + numero2 + " da: " + (numero1 - numero2));
        salidaUsuario();
    }

    public static void operacionMultiplicacion() { // Introduce two numbers to operate with them (mul).
        numero1 = introduceNumero("primer", "multiplicar");
        numero2 = introduceNumero("segundo", "multiplicar");
        System.out.println("\nLa multiplicación de " + numero1 + " * " + numero2 + " da: " + (numero1 * numero2));
        salidaUsuario();
    }

    public static void operacionDivision() { // Introduce two numbers to operate with them (div).
        numero1 = introduceNumero("primer", "dividir");
        numero2 = introduceNumero("segundo", "dividir");
        System.out.println("\nLa división de " + numero1 + " / " + numero2 + " da: " + (numero1 / numero2));
        salidaUsuario();
    }

    public static void salidaUsuario() { // Methot which makes an menu to exit the program.
        System.out.println("""
                \n¿Deseas salir?
                \n\t(1) Menu
                \t(2) Salir
                _________________________________""");
        int respuesta = fijarIntervaloInt(1, 2);
        if (respuesta == 1) {
            menu();
        } else {
            System.out.println("\nPROGRAM CLOSED"); // Closes the program.
        }
    }
}