package ejerciciosnumerosaleatorios;

import java.util.Scanner;

public class Ejercicio17 {
    // Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
    // Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
    // serán de 4 unidades. No hay que comprobar que los datos se introducen
    // correctamente; podemos suponer que el usuario los introduce bien. Dentro de
    // la pecera hay que colocar de forma aleatoria un pececito, que puede estar
    // situado en cualquiera de las posiciones que quedan en el hueco que forma el
    // rectángulo.
    // Ejemplo:
    // Por favor, introduzca la altura de la pecera (como mínimo 4): 4
    // Ahora introduzca la anchura (como mínimo 4): 7
    // * * * * * * *
    // * *
    // * & *
    // * * * * * * *
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Por favor, introduzca la altura de la pecera (como minimo 4): ");
        int alturaPecera = Integer.parseInt(sc.nextLine()); // minimo 4
        System.out.print("Ahora introduzca la anchura (como minimo 4): ");
        int anchuraPecera = Integer.parseInt(sc.nextLine()); // minimo 4
        int posicionAlturaPez = (int) (Math.random() * (alturaPecera - 2) + 1);
        int posicionAnchuraPez = (int) (Math.random() * (anchuraPecera - 2) + 1);
        for (int iteracionAltura = 1; iteracionAltura <= alturaPecera; iteracionAltura++) {
            for (int iteracionAnchura = 1; iteracionAnchura <= anchuraPecera; iteracionAnchura++) {
                if (iteracionAltura == 1 || iteracionAltura == alturaPecera)
                    System.out.print("* ");
                else {
                    if (iteracionAnchura == 1 || iteracionAnchura == anchuraPecera)
                        System.out.print("* ");
                    else {
                        if (iteracionAltura == posicionAlturaPez && iteracionAnchura == posicionAnchuraPez)
                            System.out.print("& ");
                        else
                            System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
