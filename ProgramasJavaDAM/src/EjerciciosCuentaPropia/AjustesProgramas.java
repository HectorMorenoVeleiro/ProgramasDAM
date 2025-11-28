package ejercicioscuentapropia;

import java.util.Scanner;

public class AjustesProgramas {
    // Ajustes programas es una clase dedicada a la
    // iniciación de formas, ejemplos y mas que tengan
    // objetivo la simplificación de código de forma mas
    // eficiente
    public static Scanner sc = new Scanner(System.in);

    public static int enterNumPorScanner(String text) {
        // Esta clase simplifica el método para que no haya necesidad de explicar mas
        int num1;
        System.out.print(text);
        num1 = Integer.parseInt(sc.nextLine());
        return num1;
    }

    public static int contarDigitosEnArray(int[] numeros) {
        int totalDigitos = 0;
        for (int num : numeros) {
            // Convertimos el número a String (valor absoluto para evitar contar signo
            // negativo)
            String numeroComoTexto = String.valueOf(Math.abs(num));
            // Sumamos la longitud de la cadena que representa el número
            totalDigitos += numeroComoTexto.length();
        }
        return totalDigitos;
    }

    private static int from1To2(int num1, int num2) {
        return (num1 + num2 + Math.abs(num1 - num2)) / 2;
    }

    // Método recursivo para encontrar el máximo de un array de números
    public static int mayorNNumeros(int[] numeros, int indice) {
        if (numeros.length == 2) {
            // Caso base para exactamente dos elementos, usar el método from1To2
            return from1To2(numeros[0], numeros[1]);
        } else if (indice == numeros.length - 1) {
            // Caso base para último elemento (solo un número)
            return numeros[indice];
        } else {
            // Recursividad: comparar elemento actual con mayor de los siguientes
            int maxResto = mayorNNumeros(numeros, indice + 1);
            return from1To2(numeros[indice], maxResto);
        }
    }

    public static void main(String[] args) {
        int[] numeros = { 123, 45, 6, 7890, 0, -56 };
        int resultado = contarDigitosEnArray(numeros);
        System.out.println("Total de dígitos en el array: " + resultado);
    }

    public static String enterPalabraPorScanner(String text) {
        String palabra;
        System.out.print(text);
        palabra = sc.nextLine();
        return palabra;
    }

    public static int operacionNums(int num1, int num2, String text) {
        int resultado = 0;
        switch (text) {
            case "suma" -> resultado = num1 + num2;
            case "resta" -> resultado = num1 - num2;
            case "multiplicacion" -> resultado = num1 * num2;
            case "division" -> resultado = num1 / num2;
            case "resto" -> resultado = num1 % num2;
        }
        return resultado;
    }

    public static void CalculadoraEnTerminal() {
        CalculadoraEnTerminal.menu();
    }

    public static int cuentaDigitosNum(int num) {
        int digitos = 0;
        while (num > 0) {
            num /= 10;
            digitos++;
        }
        return digitos;
    }

    public static int invierteOrdenNum(int num) {
        int potencianum = cuentaDigitosNum(num) - 1;
        int reverso = 0;
        while (num > 0) {
            int cifra = num % 10;
            num /= 10;
            reverso += cifra * Math.pow(10, potencianum);
            potencianum--;
        }
        return reverso;
    }

    public static int enterRangoDeIntegers(int bot, int top, String text) {
        int num1;
        while (true) {
            System.out.print(text);
            try {
                num1 = Integer.parseInt(sc.nextLine());
                if (num1 >= bot && num1 <= top) {
                    break;
                } else {
                    System.out.println("ERROR: Fuera de rango");
                }
            } catch (NumberFormatException e) {
                System.out.println("ERROR DE TIPO");
            }
        }
        return num1;
    }

    public static String enterStringPorScanner(String text) {
        String palabra;
        while (true) {
            System.out.print(text);
            palabra = sc.nextLine();
            if (!palabra.isEmpty()) {
                break;
            } else {
                System.out.println("ERROR: No puede estar vacío");
            }
        }
        return palabra;
    }

    public static float enterFloatPorScanner(String text) {
        float num1;
        while (true) {
            System.out.print(text);
            try {
                num1 = Float.parseFloat(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("ERROR DE TIPO");
            }
        }
        return num1;
    }

    public static double enterDoublePorScanner(String text) {
        double num1;
        while (true) {
            System.out.print(text);
            try {
                num1 = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("ERROR DE TIPO");
            }
        }
        return num1;
    }

    public static int enterIntegerPorScanner(String text) {
        int num1;
        while (true) {
            System.out.print(text);
            try {
                num1 = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("ERROR DE TIPO");
            }
        }
        return num1;
    }

    public static long enterLongPorScanner(String text) {
        long num1;
        while (true) {
            System.out.print(text);
            try {
                num1 = Long.parseLong(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("ERROR DE TIPO");
            }
        }
        return num1;
    }

    public static int salir() {
        System.out.println(
                """
                        \tQue deseas hacer?
                        \t(1)Seguir
                        \t(2)Salir
                        ____________________________""");
        return enterRangoDeIntegers(2, 1, "tenCuidadoGorditaNoMeMandesOtrosNumerinesGuarrindonguilla");
    }
}
