package ejerciciosnumerosaleatorios;

import java.util.Scanner;

public class Ejercicio22 {
    // Realiza un programa que pinte por pantalla una serpiente con un “serpenteo”
    // aleatorio. La cabeza se representará con el carácter @ y se debe colocar
    // exactamente en la posición 13 (con 12 espacios delante). A partir de ahí,
    // el cuerpo irá serpenteando de la siguiente manera: se generará de forma
    // aleatoria un valor entre tres posibles que hará que el siguiente carácter se
    // coloque una posición a la izquierda del anterior, alineado con el anterior o
    // una
    // posición a la derecha del anterior. La longitud de la serpiente se pedirá por
    // teclado y se supone que el usuario introducirá un dato correcto.
    // Ejemplo:
    // Por favor, introduzca la longitud de la serpiente en caracteres contando la
    // cabeza: 6
    // @
    // *
    // *
    // *
    // *
    // *
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        char[] snake = new char[] { '@', '*', ' ' };
        System.out.println("Introduce la longitud de la serpiente en caracteres contando la cabeza");
        int longitudSerpiente = Integer.parseInt(sc.nextLine());
        int rango = 13;
        for (int i = 0; i < longitudSerpiente; i++) {
            for (int j = 0; j < rango; j++)
                System.out.print(snake[2]);
            if (i == 0)
                System.out.print(snake[0] + "\n");
            else
                System.out.print(snake[1] + "\n");
            rango = rango - ((int) (Math.random() * 4 - 2));
        }
    }
}
