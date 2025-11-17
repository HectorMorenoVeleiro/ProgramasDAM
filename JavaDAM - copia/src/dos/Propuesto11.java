package dos;

import java.util.Scanner;

public class Propuesto11 {

    public static double patatasKg, chocoKg;

    public static Scanner sc = new Scanner(System.in);

    public static double numeroClientes(double patatasKg, double chocoKg) {

        int cantidadPersComen = 0;

        double cantidadPersPorPatatasKg = patatasKg;
        double cantidadPersPorChocoKg = chocoKg * 2;

        if (cantidadPersPorChocoKg > cantidadPersPorPatatasKg) {
            cantidadPersComen = (int) cantidadPersPorPatatasKg;
        } else if (cantidadPersPorPatatasKg > cantidadPersPorChocoKg) {
            cantidadPersComen = (int) cantidadPersPorChocoKg;
        } else if (cantidadPersPorChocoKg == cantidadPersPorPatatasKg) {
            cantidadPersComen = (int) cantidadPersPorChocoKg;
        }
        return cantidadPersComen;
    }

    public void addPapas(double p) {
        Propuesto11.patatasKg += p;
    }

    public void addChocos(double c) {
        Propuesto11.chocoKg += c;
    }

    public void showPapas() {
        System.out.println("en el almacen tenemos " + Propuesto11.patatasKg + " Kilos de papas");
    }

    public void showChoco() {
        System.out.println("en el almacen tenemos " + Propuesto11.patatasKg + " Kilos de papas");
    }

    public void existenciasAlmacen() {
        this.showPapas();
        this.showChoco();
    }

    public static void main(String[] args) {
        patatasKg = 0;
        chocoKg = 0;

        boolean decision = true;

        while (decision) {
            System.out.println("cuantos Kg de patatas quieres usar: ");
            patatasKg = Double.parseDouble(sc.nextLine());
            System.out.println("cuantos Kg de choco quieres usar: ");
            chocoKg = Double.parseDouble(sc.nextLine());

            if (patatasKg < 1) {
                System.out.println("pero chiquillo mete mas papa, asi no se puede: ");
            } else if (chocoKg < 0.5) {
                System.out.println("pero chiquillo mete mas choco, asi no se puede: ");
            } else {
                decision = false;
            }
        }
        System.out.println("la cantidad de personas que pueden comer es de: " + numeroClientes(patatasKg, chocoKg));

    }
}
