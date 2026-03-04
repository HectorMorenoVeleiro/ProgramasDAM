package discoteca_flexible;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorDiscos implements Serializable {

    public static Scanner sc = new Scanner(System.in);
    public static List<Disco> discos = new ArrayList<Disco>();

    // TODO: Añadir un metodo comparator para ordenar la lista en base a lo que te
    // TODO: salga
    // TODO: Aprender a usarlo pq copiar lo del profesor me sirve de nada y menos
    // TODO: Comparator = Comparator.comparing(Disco:get());

    public static int getConteoDiscos() {
        return discos.size();
    } // getConteoDiscos

    public static void mockDiscos() {
        if (discos.isEmpty()) {
            discos.add(new Disco(
                    "GASA41", "Wim Mertens", "Maximazing the Audience", "instrumental", 50));
            discos.add(new Disco(
                    "FGHQ64", "Metallica", "Black album", "hard rock", 46));
            discos.add(new Disco(
                    "TYUI89", "Supersubmarina", "Viento de cara", "pop rock", 42));
        } // if
    } // mockDiscos

    public static void listarDiscos() {
        for (Disco disco : discos) {
            if (!disco.getCodigo().equals("LIBRE")) {
                System.out.println(disco);
            } // if
        } // fori
        System.out.println("Ahora mismo hay " + getConteoDiscos() + " discos.");
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
            } // try-catch
        } // while-true
    } // darValorInt

    public static Disco buscarPorCodigo(String codigo) {
        for (Disco d : discos) {
            if (d.getCodigo().equals(codigo)) {
                return d;
            } // if
        } // for-each
        return null;
    } // buscarPorCodigo

    public static void modificarDiscos() {
        boolean salir = true;
        boolean encontrado = false;
        int decision = 0;
        while (salir) {
            System.out.print("Introduce el código que quiera modificar -> ");
            String introduceCodigo = sc.nextLine();
            Disco disco = buscarPorCodigo(introduceCodigo);
            if (disco != null) {
                encontrado = true;
                System.out.printf("""
                         Muestreo del disco -->
                        ========================
                         ·Codigo    -> %s
                         ·Autor     -> %s
                         ·Título    -> %s
                         ·Género    -> %s
                         ·Duración  -> %d
                        ========================
                        """, disco.getCodigo(), disco.getAutor(),
                        disco.getTitulo(), disco.getGenero(), disco.getDuracion());
                while (decision != 5) {
                    decision = darValorInt("""
                             Que valor vas a querer modificar ?? -->
                            =======================================
                                1. autor
                                2. titulo
                                3. genero
                                4. duración
                                5. salir
                            =======================================
                             Introduce tu respuesta -->
                            """);
                    switch (decision) {
                        case 1:
                            System.out.println("""
                                     CAMBIANDO AUTOR
                                    ==================""");
                            disco.setAutor(darValorString("Cual vas a querer que sea el autor? -->"));
                            break;
                        case 2:
                            System.out.println("""
                                     CAMBIANDO TITULO
                                    ==================""");
                            disco.setTitulo(darValorString("Cual vas a querer que sea el titulo? -->"));
                            break;
                        case 3:
                            System.out.println("""
                                     CAMBIANDO GENERO
                                    ==================""");
                            disco.setGenero(darValorString("Cual vas a querer que sea el genero? -->"));
                            break;
                        case 4:
                            System.out.println("""
                                     CAMBIANDO DURACION
                                    =====================""");
                            disco.setDuracion(darValorInt("Cual vas a querer que sea la duración? -->"));
                            break;
                        case 5:
                            System.out.println("....saliendo....");
                            salir = false;
                            break;
                        default:
                            System.out.println("....decisión mal introducida....");
                            continue;
                    } // switch
                } // while
                break;
            } // if
            if (!encontrado) {
                decision = darValorInt("""
                            ....Lo sentimos, el código que ha introducido es incorrecto....
                            ===============================================================
                                1. volver a introducir el código
                                2. volver al menú
                            ===============================================================
                            -> introduzca su respuesta:
                        """);
                if (decision == 2)
                    break;
                else if (decision == 1)
                    continue;
                else {
                    System.out.println("condición incorrecta, saliendo...");
                    break;
                } // else
            } // if
        } // while-salir
    } // modificarDiscos

    public static void addDisco() {
        System.out.println("\n--- INTRODUCIR NUEVO DISCO ---");
        String codigoIn = darValorString("Código: ");
        String autorIn = darValorString("Autor: ");
        String tituloIn = darValorString("Título: ");
        String generoIn = darValorString("Género: ");
        int duracionIn = darValorInt("Duración: ");

        discos.add(new Disco(codigoIn, autorIn, tituloIn, generoIn, duracionIn));
    } // addDisco

    public static void borrarDiscos() {
        while (true) {
            System.out.println("Introduce el código del disco que quieras borrar: ");
            String introduceCodigo = sc.nextLine();
            int decision = 0;
            boolean encontrado = false;
            Disco disco = buscarPorCodigo(introduceCodigo);
            if (disco != null) {
                encontrado = true;
                decision = darValorInt("""
                             Estas seguro de que quieres borrarlo ?? -->
                            =============================================
                                1. si, lo estoy
                                2. no. no lo estoy
                            =============================================
                                -> introduzca su respuesta:
                        """);
                if (decision == 1) {
                    discos.remove(disco);
                    break;
                } else if (decision == 2) {
                    System.out.println("...volviendo al menu...");
                    break;
                } // else-if
                break;
            } // if
            if (!encontrado) {
                decision = darValorInt("""
                        ....Lo sentimos, el código que ha introducido es incorrecto....
                        ===============================================================
                            1. volver a introducir el código
                            2. volver al menú
                        ===============================================================
                            -> introduzca su respuesta:
                        """);
                if (decision == 2) // gestionas la posicion
                    break;
                else if (decision == 1)
                    continue;
                else {
                    System.out.println("condición incorrecta, saliendo...");
                    break;
                } // else
            } // if
        } // while-True
    } // borrarDiscos
} // GestorDiscos
