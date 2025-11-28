package ejerciciosnumerosaleatorios;

import java.util.Scanner;

public class Ejercicio30 {
    /*
     * El pequeño Roberto tenía como mascota un pececillo dentro de una pecera. Los
     * Reyes Magos le han traído un caballito de mar ($) y una caracola (@) para que
     * le hagan compañía al pez. Realiza un programa que pinte por pantalla la
     * pecera
     * con los tres animalitos acuáticos colocados dentro en posiciones aleatorias.
     * Por
     * una cuestión de física elemental, ninguno de los animales puede coincidir
     * en la misma posición. Se debe pedir al usuario el ancho y el alto de la
     * pecera,
     * que como mínimo serán de 4 unidades.
     * Ejemplo:
     * Por favor, introduzca la altura de la pecera (como mínimo 4): 4
     * Ahora introduzca la anchura (como mínimo 4): 7
     * * * * * * *
     * 
     * @ & *
     * $ *
     * * * * * * *
     */
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Por favor, introduzca la altura de la pecera (como minimo 4): ");
        int alturaPecera = Integer.parseInt(sc.nextLine()); // minimo 4
        System.out.print("Ahora introduzca la anchura (como minimo 4): ");
        int anchuraPecera = Integer.parseInt(sc.nextLine()); // minimo 4

        int posicionAlturaPez;
        int posicionAnchuraPez;
        int posicionAlturaCaballidoDeMar;
        int posicionAnchuraCaballidoDeMar;
        int posicionAlturaCaracola;
        int posicionAnchuraCaracola;

        posicionAlturaPez = (int) (Math.random() * (alturaPecera - 2)) + 2;
        posicionAnchuraPez = (int) (Math.random() * (anchuraPecera - 2)) + 2;

        do {
            posicionAlturaCaballidoDeMar = (int) (Math.random() * (alturaPecera - 2) + 2);
            posicionAnchuraCaballidoDeMar = (int) (Math.random() * (anchuraPecera - 2) + 2);
        } while (posicionAlturaCaballidoDeMar == posicionAlturaPez
                && posicionAnchuraCaballidoDeMar == posicionAnchuraPez);

        do {
            posicionAlturaCaracola = (int) (Math.random() * (alturaPecera - 2) + 2);
            posicionAnchuraCaracola = (int) (Math.random() * (anchuraPecera - 2) + 2);
        } while ((posicionAlturaCaracola == posicionAlturaPez && posicionAnchuraCaracola == posicionAnchuraPez)
                || (posicionAlturaCaracola == posicionAlturaCaballidoDeMar
                        && posicionAnchuraCaracola == posicionAnchuraCaballidoDeMar));

        for (int iteracionAltura = 1; iteracionAltura <= alturaPecera; iteracionAltura++) {

            for (int iteracionAnchura = 1; iteracionAnchura <= anchuraPecera; iteracionAnchura++) {

                if (iteracionAltura == 1 || iteracionAltura == alturaPecera)
                    System.out.print("* ");
                else {
                    if (iteracionAnchura == 1 || iteracionAnchura == anchuraPecera)
                        System.out.print("* ");
                    else if (iteracionAltura == posicionAlturaPez && iteracionAnchura == posicionAnchuraPez)
                        System.out.print("& ");
                    else if (iteracionAltura == posicionAlturaCaballidoDeMar
                            && iteracionAnchura == posicionAnchuraCaballidoDeMar)
                        System.out.print("$ ");
                    else if (iteracionAltura == posicionAlturaCaracola && iteracionAnchura == posicionAnchuraCaracola)
                        System.out.print("@ ");
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
