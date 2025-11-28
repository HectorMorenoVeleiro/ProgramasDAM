package ejerciciosnumerosaleatorios;

import java.util.Objects;
import java.util.Scanner;

public class Ejercicio14 {
    // Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6.
    // El programa intentará adivinar el número que estás pensando - un número entre
    // 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el
    // programa debe preguntar si el número que estás pensando es mayor o menor que
    // el que te acaba de decir.
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("INTRODUCE UN NUMERO RANDOM DEL 1 AL 100");
        int tuNumero = Integer.parseInt(sc.nextLine());
        int limiteArriba = 100, limiteAbajo = 0;
        int randomNumero;
        for (int i = 0; i < 5; i++) {
            randomNumero = (int) (Math.random() * (limiteArriba - limiteAbajo) + limiteAbajo);
            System.out.println(randomNumero);
            if (randomNumero == tuNumero)
                break;
            else {
                System.out.println("TU NUMERO ES MAYOR O MENOR QUE EL MIO?");
                String respuesta = sc.nextLine();
                if (Objects.equals(respuesta, "menor"))
                    limiteArriba = randomNumero;
                if (Objects.equals(respuesta, "mayor"))
                    limiteAbajo = randomNumero;
            }
        }
    }
}
