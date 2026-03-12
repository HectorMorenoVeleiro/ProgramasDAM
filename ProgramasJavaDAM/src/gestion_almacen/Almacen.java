package gestion_almacen;

import java.util.ArrayList;

public class Almacen {

    /*
     * Clase Almacen creada para gestionar los procesos del almacen
     * y la variedad de artículos disponibles a la entrada del consumidor
     * de forma accesible y entendible
     */

    // primero creamos una lista (ArrayList) de Articulos para introducirle -->
    private ArrayList<Articulo> arraylist = new ArrayList<Articulo>();

    // método para añadir nuevos Articulos -->
    public void add(String descripcion, double precioCompra, double precioVenta, int stock) throws Exception {
        Articulo articulo = new Articulo(descripcion, precioCompra, precioVenta, stock);
        if (!(arraylist.contains(articulo)))
            arraylist.add(articulo);
        else
            throw new ArticuloYaExisteException("El árticulo ya existe.");

    } // add()

    // método para borrar articulos por codigo -->
    public boolean delete(int codigo) throws CodigoNoValidoException, PrecioCompraNegativoException,
            StockNegativoException, PrecioVentaNegativoException {

        for (int i = 0; i < arraylist.size(); i++) {
            if (arraylist.get(i).getCodigo() == codigo)
                return arraylist.remove(arraylist.get(i));
        }
        throw new CodigoNoValidoException("El codigo " + codigo + " no existe en el almacen");

    } // delete()

    // método para setear cualquier parte del artículo (empiezo a pensar q aqui hay
    // mucho metodo redundante) -->
    public void set(Articulo articulo, String descripcion, double precioCompra, double precioVenta, int stock)
            throws StockNegativoException, PrecioCompraNegativoException, PrecioVentaNegativoException {
        int indice = arraylist.indexOf(articulo);
        articulo.set(descripcion, precioCompra, precioVenta, stock);
        arraylist.set(indice, arraylist.get(indice));

    } // set()

    // método para mostrar cada artículo de forma entendible -->
    @Override
    public String toString() {
        String string = "";
        for (Articulo articulo : arraylist) {
            string += articulo.toString() + "\n\n";
        } // for-enhanced
        return string;

    } // toString

    // méodo para pillar un artículo y modificarlo o verlo o loqsea desde su código
    // aplicando la excepcion pertinente -->
    public Articulo get(int codigo) throws ArticuloNoExisteException {
        try {
            for (Articulo articulo : arraylist) {
                if (articulo.getCodigo() == codigo) {
                    return articulo;
                } // if
            } // for-enhanced
        } catch (IndexOutOfBoundsException e) {
            throw new ArticuloNoExisteException("El código del artículo no existe en el almacén.");
        } // catch
        return null;

    } // toString

    // código para incrementar el Stock de un Articulo -->
    public void incrementar(int codigo, int cantidad) throws StockNegativoException, CantidadNegativaException {
        for (Articulo articulo : arraylist) {
            if (articulo.getCodigo() == codigo) {
                articulo.incrementaStock(cantidad);
            } // if
        } // for-enhanced

    } // incrementar()

    // código para decrementar el stock de una articulo -->
    public void decrementar(int codigo, int cantidad) throws StockNegativoException, CantidadNegativaException {
        for (Articulo articulo : arraylist) {
            if (articulo.getCodigo() == codigo) {
                articulo.decrementaStock(cantidad);
            } // if
        } // for

    } // decrementar()

} // Almacen