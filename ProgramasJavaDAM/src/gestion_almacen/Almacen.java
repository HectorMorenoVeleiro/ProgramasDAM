package gestion_almacen;

import java.util.ArrayList;

/**
 * Gestiona el conjunto de artículos del almacén.
 *
 */

public class Almacen {

    // MI ALMACEN es un arraylist de articulos???
    private ArrayList<Articulo> arraylist = new ArrayList<Articulo>();

    public void annadir(String descripcion, double precioCompra, double precioVenta, int stock) throws Exception {
        Articulo articulo = new Articulo(stock);
        if (!(arraylist.contains(articulo)))
            arraylist.add(articulo);
        else
            throw new ArticuloYaExisteException("El árticulo ya existe.");

    }

    /**
     * Elimina el artículo del almacén
     * 
     * @param codigo
     *               Código del artículo a eliminar
     * @return true si se ha eliminado. false en otro caso.
     */
    public boolean baja(int codigo) throws CodigoNoValidoException, PrecioCompraNegativoException,
            StockNegativoException, PrecioVentaNegativoException {

        for (int i = 0; i < arraylist.size(); i++) {
            if (arraylist.get(i).getCodigo() == codigo)
                return arraylist.remove(arraylist.get(i));
        }
        throw new CodigoNoValidoException("El codigo " + codigo + " no existe en el almacen");

    }

    /**
     * Modificar articulo
     * 
     * @param articulo
     * @param descripcion
     * @param precioCompra
     * @param precioVenta
     * @param stock
     * @throws StockNegativoException
     * @throws PrecioVentaNegativoException
     * @throws PrecioCompraNegativoException
     */

    public void set(Articulo articulo, String descripcion, double precioCompra, double precioVenta, int stock)
            throws StockNegativoException, PrecioCompraNegativoException, PrecioVentaNegativoException {
        int indice = arraylist.indexOf(articulo);
        articulo.set(descripcion, precioCompra, precioVenta, stock);
        arraylist.set(indice, arraylist.get(indice));
    }

    /**
     * Método toString
     */
    @Override
    public String toString() {
        return "Artículo " + arraylist + "";
    }

    /**
     * Método get para obtener el codigo del artículo.
     * 
     * @param codigo
     * @return
     * @throws ArticuloNoExisteException
     */

    public Articulo get(int codigo) throws ArticuloNoExisteException {
        try {
            for (Articulo articulo : arraylist) {
                if (articulo.getCodigo() == codigo) {
                    return articulo;
                }
            }
        } catch (IndexOutOfBoundsException e) {
            throw new ArticuloNoExisteException("El código del artículo no existe en el almacén.");
        }
        return null;
    }

    /**
     * Metodo incrementar, que aumenta las unidades de stock de un artículo.
     * 
     * @param codigo
     * @param cantidad
     * @throws CantidadNegativaException
     * @throws StockNegativoException
     */
    public void incrementar(int codigo, int cantidad) throws StockNegativoException, CantidadNegativaException {
        for (Articulo articulo : arraylist) {
            if (articulo.getCodigo() == codigo) {
                articulo.incrementaStock(cantidad);
            }
        }
    }

    /**
     * Método decrementar, que disminuye las unidades de stock de un artículo.
     * 
     * @param codigo
     * @param cantidad
     * @throws CantidadNegativaException
     * @throws StockNegativoException
     */
    public void decrementar(int codigo, int cantidad) throws StockNegativoException, CantidadNegativaException {
        for (Articulo articulo : arraylist) {
            if (articulo.getCodigo() == codigo) {
                articulo.decrementaStock(cantidad);
            }
        }
    }
}