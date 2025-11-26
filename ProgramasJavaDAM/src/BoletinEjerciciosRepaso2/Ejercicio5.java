package BoletinEjerciciosRepaso2;

import java.util.Scanner;

public class Ejercicio5 {
    // Realizar un juego para adivinar un numero. Para ello pedir un numero N, y
    // luego ir pidiendo numeros indicando "mayor" o "menor" segun sea mayor o menor
    // con respecto a N. El proceso termina cuando el usuario acierta.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("que quieres haer ? 1/2");
        int decision = Integer.parseInt(sc.nextLine());
        while (true) {
            if (decision == 1) {
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
                break;
            } else if (decision == 2) {
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
                break;
            } else
                continue;
        }
        sc.close();
    }

}
