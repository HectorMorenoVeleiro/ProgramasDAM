package ejerciciosnumerosaleatorios;

import java.util.Scanner;

public class Ejercicio6 {
    // Escribe un programa que piense un número al azar entre 0 y 100.
    // El usuario debe adivinarlo y tiene para ello 5 oportunidades.
    // Después de cada intento fallido, el programa dirá cuántas
    // oportunidades quedan y si el número introducido esmenor o mayor
    // que el número secreto.
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numeroUsuario;
        int i = 0;
        int numeroAzar = (int) (Math.random() * 100);
        System.out.println("NUMERO AZAR CREADO");
        do {
            i++;
            System.out.println("INTENTA ADIVINAR EL NUMERO");
            numeroUsuario = Integer.parseInt(sc.nextLine());
            if (numeroAzar < numeroUsuario)
                System.out.println("EL NUMERO ES MENOR");
            if (numeroAzar > numeroUsuario)
                System.out.println("EL NUMERO ES MAYOR");
        } while (numeroAzar != numeroUsuario && i < 5);
    }
}
