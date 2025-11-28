package ejerciciosnumerosaleatorios;

import java.util.Objects;
import java.util.Scanner;

public class Ejercicio27 {
    // Implementa el juego piedra, papel y tijera. Primero, el usuario introduce su
    // jugada y luego el ordenador genera al azar una de las opciones. Si el usuario
    // introduce una opción incorrecta, el programa deberá mostrar un mensaje de
    // error.
    // Ejemplo 1:
    // Turno del jugador (introduzca piedra, papel o tijera): papel
    // Turno del ordenador: papel
    // Empate
    // Ejemplo 2:
    // Turno del jugador (introduzca piedra, papel o tijera): papel
    // Turno del ordenador: tijera
    // Gana el ordenador
    // Ejemplo 3:
    // Turno del jugador (introduzca piedra, papel o tijera): piedra
    // Turno del ordenador: tijera
    // Gana el jugador
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String[] opcionAElegir = new String[] { "piedra", "papel", "tijera" };
        String opcionJugador;

        System.out.print("Turno del jugador (introduzca piedra, papel o tijera): ");
        opcionJugador = sc.nextLine();

        String opcionMaquina = opcionAElegir[(int) (Math.random() * opcionAElegir.length)];
        System.out.println("turno del ordenador : " + opcionMaquina);

        if (Objects.equals(opcionJugador, opcionMaquina))
            System.out.println("Empate");
        else if (Objects.equals(opcionJugador, opcionAElegir[0]) && Objects.equals(opcionMaquina, opcionAElegir[1]))
            System.out.println("Gana el jugador");
        else if (Objects.equals(opcionJugador, opcionAElegir[0]) && Objects.equals(opcionMaquina, opcionAElegir[2]))
            System.out.println("Gana la maquina");
        else if (Objects.equals(opcionJugador, opcionAElegir[1]) && Objects.equals(opcionMaquina, opcionAElegir[0]))
            System.out.println("Gana la maquina");
        else if (Objects.equals(opcionJugador, opcionAElegir[1]) && Objects.equals(opcionMaquina, opcionAElegir[2]))
            System.out.println("Gana el jugador");
        else if (Objects.equals(opcionJugador, opcionAElegir[2]) && Objects.equals(opcionMaquina, opcionAElegir[0]))
            System.out.println("Gana el jugador");
        else if (Objects.equals(opcionJugador, opcionAElegir[2]) && Objects.equals(opcionMaquina, opcionAElegir[1]))
            System.out.println("Gana la maquina");
        else
            System.out.println("error");
    }
}
