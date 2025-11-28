package ejerciciosclase;

import java.util.Scanner;

public class AjustesProgramas {
    public static Scanner sc = new Scanner(System.in);

    public static int introduceRangoDeIntegers(int rangoSuperior, int rangoInferior, String orden) {
        int numero1;
        while (true) {
            System.out.print(orden);
            try {
                numero1 = Integer.parseInt(sc.nextLine());
                if (numero1 >= rangoInferior && numero1 <= rangoSuperior) {
                    break;
                } else {
                    System.out.println("ERROR: Fuera de rango");
                }
            } catch (NumberFormatException e) {
                System.out.println("ERROR DE TIPO");
            }
        }
        return numero1;
    }

    public static String introduceStringPorScanner(String orden) {
        String palabra;
        while (true) {
            System.out.print(orden);
            palabra = sc.nextLine();
            if (!palabra.isEmpty()) {
                break;
            } else {
                System.out.println("ERROR: No puede estar vacío");
            }
        }
        return palabra;
    }

    public static float introduceFloatPorScanner(String orden) {
        float numero1;
        while (true) {
            System.out.print(orden);
            try {
                numero1 = Float.parseFloat(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("ERROR DE TIPO");
            }
        }
        return numero1;
    }

    public static double introducirDoublePorScanner(String orden) {
        double numero1;
        while (true) {
            System.out.print(orden);
            try {
                numero1 = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("ERROR DE TIPO");
            }
        }
        return numero1;
    }

    public static int introducirIntegerPorScanner(String orden) {
        int numero1;
        while (true) {
            System.out.print(orden);
            try {
                numero1 = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("ERROR DE TIPO");
            }
        }
        return numero1;
    }

    public static long introducirLongPorScanner(String orden) {
        long numero1;
        while (true) {
            System.out.print(orden);
            try {
                numero1 = Long.parseLong(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("ERROR DE TIPO");
            }
        }
        return numero1;
    }

    public static int salir() {
        System.out.println(
                "\tQue deseas hacer?\n" +
                        "\t(1)Seguir\n" +
                        "\t(2)Salir\n" +
                        "____________________________");
        return introduceRangoDeIntegers(2, 1, null);
    }
}
