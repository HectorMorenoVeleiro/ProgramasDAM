package discoteca;

import java.util.Scanner;

public class Menu {

    private static Scanner sc = new Scanner(System.in);

    /* METODOS */

    // menú para el programa -->
    public static void menu() {
        // empezar
        if (GestorDiscos.discos.length == 0) {
            GestorDiscos.crearColeccion(); // creas una colección de discos primero -->
        } /* if */ else { // cargar colección desde almacenamiento
            GestorDiscos.cargarColeccionDesdeAlmacenamiento();
        } // else

        int opcion = 0; // opción a determinar -->
        do { // inicialización del do-while -->
            System.out.print("\n" + """
                    \n   COLECCIÓN DE DISCOS ->>
                        ========================

                            1.  Listado ->
                            2.  Nuevo disco ->
                            3.  Modificar ->
                            4.  Borrar ->
                            5.  Cargar discos random -->
                            6.  Guardar coleccion -->
                            7.  Cargar coleccion -->
                            10. Salir ->

                        ========================

                        introduzca una opción -->"""); // visualización del menú -->
            opcion = Integer.parseInt(sc.nextLine()); // selección de la opción por Scanner -->

            switch (opcion) { // switch para cada caso (case) -->
                case 1: // caso mostrar discos -->
                    System.out.println("\n" + """
                             LISTADO
                            =========""");
                    GestorDiscos.listarDiscos();
                    break;
                case 2: // caso crear disco -->
                    System.out.println("\n" + """
                             NUEVO DISCO
                            =============""");
                    GestorDiscos.addDisco();
                    break;
                case 3: // caso modificar disco -->
                    System.out.println("\n" + """
                             MODIFICAR
                            ===========""");
                    GestorDiscos.modificarDiscos();
                    break;
                case 4: // caso borrar disco -->
                    System.out.println("\n" + """
                             BORRAR
                            ========""");
                    GestorDiscos.borrarDiscos();
                    break;
                case 5: // cargar discos random
                    System.out.println("\n" + """
                                 CARGANDO DISCOS
                                =================
                            """);
                    GestorDiscos.mockDiscos(); // carga discos
                    break;
                case 6: // guardar coleccion
                    System.out.println("\n" + """
                                 GUARDANDO COLECCION
                                =====================
                            """);
                    GestorDiscos.guardarColeccionDesdeAlmacenamiento();
                    break;
                case 7: // cargar coleccion
                    System.out.println("\n" + """
                                 CARGANDO COLECCION
                                =====================
                            """);
                    GestorDiscos.cargarColeccionDesdeAlmacenamiento();
                    break;
                case 10:
                    System.out.println("....saliendo....");
                    GestorDiscos.guardarColeccionDesdeAlmacenamiento();
                    break;
                default: // caso ninguna de las anteriores -->
                    System.out.println("....mal introducido....");
                    break;
            } // switch
        } while (opcion != 10); // do-while
    } // menu
} // class
