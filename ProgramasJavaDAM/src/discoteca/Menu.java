package discoteca;

import java.util.Scanner;

public class Menu {

    private static Scanner sc = new Scanner(System.in);

    /* METODOS */

    // menú para el programa -->
    public static void menu() {
        int opcion = 0; // opción a determinar -->
        do { // inicialización del do-while -->
            System.out.print("""
                    \n   COLECCIÓN DE DISCOS ->>
                        ========================

                        1. Listado ->
                        2. Nuevo disco ->
                        3. Modificar ->
                        4. Borrar ->
                        5. Salir ->

                        ========================

                        introduzca una opción -->"""); // visualización del menú -->
            opcion = Integer.parseInt(sc.nextLine()); // selección de la opción por Scanner -->

            switch (opcion) { // switch para cada caso (case) -->
                case 1: // caso mostrar discos -->
                    System.out.println("""
                            \n   LISTADO
                                =========""");
                    for (Disco d : GestorDiscos.discos) { // muestreo
                        // TODO: añade un contador de discos
                        if (!d.getCodigo().equals("LIBRE")) {
                            System.out.println(d);
                        }
                    }
                    break;
                case 2: // caso crear disco -->
                    System.out.println("""
                            \n   NUEVO DISCO
                                =============""");
                    GestorDiscos.addDisco();
                    break;
                case 3: // caso modificar disco -->
                    System.out.println("""
                            \n   MODIFICAR
                                ===========""");
                    // TODO: método para modificar un disco existente (que tenga codigo numerico)
                    break;
                case 4: // caso borrar disco -->
                    System.out.println("""
                            \n   BORRAR
                                ========""");
                    // TODO: método para borrar un disco
                    break;
                default: // caso ninguna de las anteriores -->
                    System.out.println("....abandono gestión de discos....");
                    break;
            } // switch
        } while (opcion != 5); // do-while
    } // menu
} // class
