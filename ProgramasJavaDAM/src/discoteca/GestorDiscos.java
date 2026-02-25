package discoteca;

import java.util.Scanner;

public class GestorDiscos {

    public static Scanner sc = new Scanner(System.in); // implementas Scanner -->
    public static Disco[] discos = new Disco[100]; // Array de discos -->

    /* METODOS */

    // crear la coleción de discos -->
    public static void crearColeccion() {
        for (int i = 0; i < discos.length; i++) { // fori para cada disco
            discos[i] = new Disco(); // crear nuevo disco
        } // for
    } // crearColección

    // muestreo de datos(test) -->
    public static void mockDiscos() {
        discos[0] = new Disco(
                "GASA41", "Wim Mertens", "Maximazing the Audience", "instrumental", 50);
        discos[1] = new Disco(
                "FGHQ64", "Metallica", "Black album", "hard rock", 46);
        discos[2] = new Disco(
                "TYUI89", "Supersubmarina", "Viento de cara", "pop rock", 42);
    } // mockDiscos

    // metodo para añadir discos -->
    public static void addDisco() {
        // *
        // TODO: generate method
        // TODO: hay que pedir los datos del disco
        // TODO: hay que crear un disco nuevo
        // TODO: se añadirá a la colección
        // */

        // TODO: quizá hay que repetirlo -->
        System.out.println("Por favor, introduzca los datos del disco.");
        System.out.print("Código: ");
        String codigoIn = sc.nextLine();
        System.out.print("Autor: ");
        String autorIn = sc.nextLine();
        System.out.print("Título: ");
        String tituloIn = sc.nextLine();
        System.out.print("Género: ");
        String generoIn = sc.nextLine();
        System.out.print("Duración: ");
        Integer duracionIn = Integer.parseInt(sc.nextLine());
        // TODO: encuentra una forma de saber la primera posicion vacia
        discos[primeraLibre] = new Disco(codigoIn, autorIn, tituloIn,
                generoIn, duracionIn);
    } // addDisco

} // class
