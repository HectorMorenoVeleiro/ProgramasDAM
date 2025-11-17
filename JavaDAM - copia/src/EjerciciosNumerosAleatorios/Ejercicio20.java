package EjerciciosNumerosAleatorios;

import java.util.Scanner;

public class Ejercicio20 {
    //Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
    //agua. La capacidad será indicada por el usuario. La cuba se llenará con una
    //cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
    //pueda admitir. El ancho de la cuba no varía.
    //Ejemplo:
    //Por favor, indique la capacidad de la cuba en litros: 3
    //*    *
    //*====*
    //*====*
    //******
    //La cuba tiene una capacidad de 3 litros y contiene 2 litros de agua.
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Cuantos litros caben en el cubo ? : ");
        int capacidadCubo = Integer.parseInt(sc.nextLine());
        int comoDeLlenoEstaElCubo = (int) (Math.random() * capacidadCubo);
        for (int i = 0; i < capacidadCubo; i++) {
            if (i >= comoDeLlenoEstaElCubo)
                System.out.println("*==================*");
            else
                System.out.println("*                  *");
        }
        System.out.println("********************");
        System.out.println("La cuba tiene una capacidad de " + capacidadCubo +
                " litros y contiene " + comoDeLlenoEstaElCubo + " litros de agua");
    }
}
