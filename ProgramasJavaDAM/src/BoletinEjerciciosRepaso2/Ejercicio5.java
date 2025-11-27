package BoletinEjerciciosRepaso2;

import java.util.Scanner;

public class Ejercicio5 {
    // Realizar un juego para adivinar un numero. Para ello pedir un numero N, y
    // luego ir pidiendo numeros indicando "mayor" o "menor" segun sea mayor o menor
    // con respecto a N. El proceso termina cuando el usuario acierta.

    public static void main(String[] args) {
        EjercicioVersion2();
    }

    public static void EjercicioVersion1() {
        Scanner sc = new Scanner(System.in);
        int numeroGenerado = (int) (Math.random() * 1000 + 1);
        int numeroPersona = 0;

        while (numeroGenerado != numeroPersona) {
            System.out.println("introduce un numero adivinar");
            numeroPersona = Integer.parseInt(sc.nextLine());

            if (numeroPersona < numeroGenerado)
                System.out.println("el numero es mayor");

            else if (numeroPersona > numeroGenerado)
                System.out.println("el numero es menor");
        }
        sc.close();
    }

    public static void EjercicioVersion2() {
        Scanner sc = new Scanner(System.in);
        int numeroGenerado = (int) (Math.random() * 10 + 1);
        int numeroPersona = 0;
        int intentos = 0;

        System.out.println(
                "AL PRESIONAR ENTER, TENDRAS 10 INTENTOS PARA ADIVINAR UN NUMERO GENERADO AUTOMATICAMENTE ENTRE 1000 Y 0");
        sc.nextLine();

        do {
            System.out.println("introduce un numero adivinar");
            numeroPersona = Integer.parseInt(sc.nextLine());

            if (numeroPersona < numeroGenerado)
                System.out.println("el numero es mayor");

            else if (numeroPersona > numeroGenerado)

                System.out.println("el numero es menor");

            if (numeroGenerado != numeroPersona)
                System.out.println("te quedan " + ((9) - intentos) + " intentos");

            intentos++;

            if (numeroGenerado == numeroPersona)
                break;

        } while (intentos <= 10);

        if (numeroGenerado == numeroPersona)

            System.out.println("chachi, acertaste");

        else if (numeroGenerado != numeroPersona)

            System.out.println("cachis, fallaste");

        sc.close();
    }

    public static void EjercicioConUnaVuelta() {
        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("""

                            Que quieres hacer ?

                            1. La maquina adivina tu numero

                            2. Adivinas el numero de la maquina

                            3. Salir
                        __________________________________________

                    """);

            int decision = Integer.parseInt(sc.nextLine());

            if (decision == 1) { // tu dices el numero a adivinar y la maquina adivina

                System.out.println("introduce el numero a adivinar");
                int numeroAdivinar = Integer.parseInt(sc.nextLine());
                int limiteTop = 1000;
                int limiteBot = 0;

                while (true) {
                    int numero = (int) ((Math.random() * (limiteTop - limiteBot) + limiteBot));

                    if (numero == numeroAdivinar)
                        break;

                    if (numero > numeroAdivinar) {
                        limiteTop = numero;
                        System.out.println(numero);
                        System.out.println("el numero es menor");
                    }

                    if (numero < numeroAdivinar) {
                        System.out.println(numero);
                        limiteBot = numero;
                        System.out.println("el numero es mayor");
                    }

                    sc.nextLine();
                }
                System.out.println("acertaste");
            }

            if (decision == 2) { // la maquina pone un numero y tu lo adivinas

                int numeroGenerado = (int) (Math.random() * 1000 + 1);
                int numeroPersona = 0;

                while (numeroGenerado != numeroPersona) {

                    System.out.println("introduce un numero para ser adivinado");
                    numeroPersona = Integer.parseInt(sc.nextLine());

                    if (numeroPersona < numeroGenerado)
                        System.out.println("el numero es mayor");

                    else if (numeroPersona > numeroGenerado)
                        System.out.println("el numero es menor");

                }
            }

            if (decision == 3)
                break;

        }

        sc.close();
    }

}
