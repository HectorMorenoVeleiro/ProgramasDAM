package discoteca;

import java.util.Scanner;

public class GestorDiscos {

    public static Scanner sc = new Scanner(System.in); // implementas Scanner -->
    public static Disco[] discos = new Disco[100]; // Array de discos -->
    public static int conteoDiscos = 0;

    /* METODOS */

    // getter y setter para el conteo de discos
    public static int getConteoDiscos() {
        return conteoDiscos;
    } // getConteoDiscos

    public static void setConteoDiscos(int conteoDiscos) {
        GestorDiscos.conteoDiscos = conteoDiscos;
    } // setConteoDiscos

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
        System.out.println("Se han cargado 3 discos de prueba");
        setConteoDiscos(getConteoDiscos() + 3);
    } // mockDiscos

    public static void listarDiscos() {
        for (Disco d : GestorDiscos.discos) { // muestreo
            if (!d.getCodigo().equals("LIBRE")) {
                System.out.println(d);
            } // if
        } // fori
        System.out.println("Ahora mismo hay " + getConteoDiscos() + " discos");
    } // listarDiscos

    public static String darValorString(String mensaje) {
        while (true) {
            try {
                System.out.println(mensaje);
                String nuevoValor = sc.nextLine();
                return nuevoValor;
            } catch (Exception e) {
                System.out.println("...ERROR, repita el valor...\n" + e);
            } // try-catch
        } // while-true
    } // darValorString

    public static int darValorInt(String mensaje) {
        while (true) {
            try {
                System.out.println(mensaje);
                int nuevoValor = Integer.parseInt(sc.nextLine());
                return nuevoValor;
            } catch (Exception e) {
                System.out.println("...ERROR, repita el valor...\n" + e);
            }
        }
    }

    public static void modificarDiscos() {
        while (true) {
            System.out.print("Introduce el código del código que quieras modificar --> ");
            String introduceCodigo = sc.nextLine();
            int decision = 0;
            boolean encontrado = false;
            for (int i = 0; i < discos.length; i++) {
                if (discos[i].getCodigo().equals(introduceCodigo)) {
                    encontrado = true;
                    while (decision != 5) {
                        System.out.println("""
                                 Que valor vas a querer modificar ?? -->
                                ========================================
                                    1. autor
                                    2. titulo
                                    3. genero
                                    4. duración
                                    5. salir
                                ========================================
                                 Introduce tu respuesta -->
                                """);
                        decision = Integer.parseInt(sc.nextLine());
                        switch (decision) {
                            case 1:
                                discos[i].setAutor(darValorString("Cual vas a querer que sea el autor? ->"));
                                break;
                            case 2:
                                discos[i].setTitulo(darValorString("Cual vas a querer que sea el titulo? ->"));
                                break;
                            case 3:
                                discos[i].setGenero(darValorString("Cual vas a querer que sea el genero? ->"));
                                break;
                            case 4:
                                discos[i].setDuracion(darValorInt("Cual vas a querer que sea la duración? ->"));
                                break;
                            default:
                                System.out.println("....decisión mal introducida....");
                                continue;
                        } // switch
                    } // while
                    break;
                } // if
            } // foreach
            if (!encontrado) {
                System.out.println("""
                        ....Lo sentimos, el código que ha introducido es incorrecto....
                        ===============================================================
                            1. volver a introducir el código
                            2. volver al menú
                        ===============================================================
                            -> introduzca su respuesta:
                        """);
                decision = Integer.parseInt(sc.nextLine());
                if (decision == 2)
                    break;
                else if (decision == 1)
                    continue;
                else {
                    System.out.println("condición incorrecta, saliendo...");
                    break;
                } // else
            } // if
        } // while-true
    } // modificarDiscos

    public static void borrarDiscos() {
        while (true) {
            System.out.print("Introduce el código del código que quieras borrar --> ");
            String introduceCodigo = sc.nextLine();
            int decision = 0;
            boolean encontrado = false;
            for (int i = 0; i < discos.length; i++) {
                if (discos[i].getCodigo().equals(introduceCodigo)) {
                    encontrado = true;
                    System.out.println("""
                                 Estas seguro de que quieres borrarlo ?? -->
                                =============================================
                                    1. si, lo estoy
                                    2. no. no lo estoy
                                =============================================
                                    -> introduzca su respuesta:
                            """);
                    decision = Integer.parseInt(sc.nextLine());
                    if (decision == 1) {
                        discos[i] = new Disco();
                        setConteoDiscos(getConteoDiscos() - 1);
                        break;
                    } else if (decision == 2) {
                        System.out.println("....volviendo al menu....");
                        break;
                    } // if-elseif
                    break;
                } // if
            } // fori
            if (!encontrado) {
                System.out.println("""
                        ....Lo sentimos, el código que ha introducido es incorrecto....
                        ===============================================================
                            1. volver a introducir el código
                            2. volver al menú
                        ===============================================================
                            -> introduzca su respuesta:
                        """);
                decision = Integer.parseInt(sc.nextLine());
                if (decision == 2)
                    break;
                else if (decision == 1)
                    continue;
                else {
                    System.out.println("condición incorrecta, saliendo...");
                    break;
                } // else
            } // if
        } // while-true

    } // borrarDiscos

    // metodo para añadir discos -->
    public static void addDisco() {
        System.out.println("Por favor, introduzca los datos del disco.");
        String codigoIn = darValorString("Codigo: ");
        String autorIn = darValorString("Autor: ");
        String tituloIn = darValorString("Titulo: ");
        String generoIn = darValorString("Genero: ");
        int duracionIn = darValorInt("Duración: ");

        for (int i = 0; i < discos.length; i++) {
            if (discos[i].getCodigo().equals("LIBRE")) {
                discos[i] = new Disco(codigoIn, autorIn, tituloIn, generoIn, duracionIn);
                setConteoDiscos(getConteoDiscos() + 1);
                break;
            } // if
        } // fori
    } // addDisco
} // class
