package gestion_almacen;

import java.util.Scanner;

public class Test {

    static Almacen almacen = new Almacen();
    static Scanner entrada = new Scanner(System.in);
    private static Menu menu = new Menu(" --> MENÚ GESTISIMAL <-- ", new String[] { "Listado", "Alta", "Baja",
            "Modificación", "Entada de mercancía", "Salida de mercancía", "Salir" });

    public static void main(String[] args) throws Exception {

        almacenDePrueba();
        do {
            switch ((menu.gestionar())) {
                case 1:
                    System.out.println(almacen);
                    break;
                case 2:
                    add();
                    break;
                case 3:
                    baja();
                    break;
                case 4:
                    modificar();
                    break;
                case 5:
                    entradaAlmacen();
                    break;
                case 6:
                    salidaAlmacen();
                    break;
                case 7:
                    almacenDePrueba();
                default:
                    System.out.println("Gracias por usar Gestisimal.");
                    return;
            }
        } while (true);
    }

    private static void almacenDePrueba() {
        try {
            almacen.add("1", 11, 11, 11);
            almacen.add("1", 22, 22, 22);
            almacen.add("33", 11, 11, 33);
            almacen.add("44", 11, 11, 44);
            almacen.add("55", 11, 11, 55);
        } catch (Exception e) {
            System.out.println("ESTO NO DEBE APARECERRRRRRRRRRRRRRRRR");
        }
    }

    private static void add() throws Exception {

        try {
            System.out.println("--AÑADIR ARTÍCULO--");
            String descripcion = Teclado.leerCadena("Introduzca la descripción del artículo:");
            double precioCompra = Teclado.leerDecimal("Introduzca el precio de compra del artículo:");
            double precioVenta = Teclado.leerDecimal("Introduzca el precio de venta del artículo:");
            int stock = Teclado.leerEntero("Introduzca el stock del artículo:");

            almacen.add(descripcion, precioCompra, precioVenta, stock);
            System.out.println("Artículo añadido.");
        } catch (Exception e) {
            System.err.println("No se ha podido dar de alta al artículo. " + e.getMessage());
            entrada.nextLine();
        }
    }

    private static void baja() throws CodigoNoValidoException, NoEsEnteroException, PrecioCompraNegativoException,
            StockNegativoException, PrecioVentaNegativoException {
        try {
            int codigo = Teclado.leerEntero("Introduce el códido del artículo a eliminar.");
            if (almacen.delete(codigo))
                System.out.println("Artículo eliminado.");
            else
                System.err.println(
                        "El artículo no se ha podido eliminar. No existe un artículo con ese código en el almacen.");
        } catch (NoEsEnteroException n) {
            System.err.println(n.getMessage());
        }
    }

    private static void modificar()
            throws StockNegativoException, PrecioCompraNegativoException, PrecioVentaNegativoException,
            NoEsEnteroException, NoEsDecimalException {

        try {
            System.out.println("--MODIFICAR ARTÍCULO--");
            int codigo = Teclado.leerEntero("Introduce el códido del artículo a eliminar.");
            Articulo articulo = almacen.get(codigo);
            System.out.println(articulo);

            String descripcion = Teclado.leerCadena("Introduzca la descripción del artículo:");
            double precioCompra = Teclado.leerDecimal("Introduzca el precio de compra del artículo:");
            double precioVenta = Teclado.leerDecimal("Introduzca el precio de venta del artículo:");
            int stock = Teclado.leerEntero("Introduzca el stock del artículo:");

            almacen.set(articulo, descripcion, precioCompra, precioVenta, stock);
        } catch (ArticuloNoExisteException | PrecioCompraNegativoException | PrecioVentaNegativoException
                | StockNegativoException | NoEsDecimalException | NoEsEnteroException e) {
            System.err.println("No se ha podido modificar el artículo." + e.getMessage());
            entrada.nextLine();
        }
    }

    private static void entradaAlmacen() throws NoEsEnteroException, StockNegativoException {
        try {
            System.out.println("--INCREMENTAR STOCK--");
            int codigo = Teclado.leerEntero("Introduce el códido del artículo a eliminar.");
            Articulo articulo = almacen.get(codigo);
            System.out.println(articulo);

            int cantidad = Teclado.leerEntero("Introduzca el número de artículos a aumentar del stock del almacen.");
            almacen.incrementar(codigo, cantidad);
        } catch (ArticuloNoExisteException | CantidadNegativaException e) {
            System.err.println("No se ha podido incrementar el stock del artículo." + e.getMessage() + "\n");
        }
    }

    private static void salidaAlmacen() throws NoEsEnteroException, CantidadNegativaException {
        try {
            System.out.println("--DECREMENTAR STOCK--");
            int codigo = Teclado.leerEntero("Introduce el códido del artículo a eliminar.");
            Articulo articulo = almacen.get(codigo);
            System.out.println(articulo);

            int cantidad = Teclado.leerEntero("Introduzca el número de artículos a eliminar del stock del almacen.");
            almacen.decrementar(codigo, cantidad);
        } catch (ArticuloNoExisteException | StockNegativoException | CantidadNegativaException e) {
            System.err.println("No se ha podido decrementar el stock del artículo." + e.getMessage() + "\n");
        }
    }
}
