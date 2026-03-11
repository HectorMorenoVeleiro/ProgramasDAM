package gestion_almacen;

import java.util.ArrayList;

public class Almacen {

    private ArrayList<Articulo> arraylist = new ArrayList<Articulo>();

    public void annadir(String descripcion, double precioCompra, double precioVenta, int stock) throws Exception {
        Articulo articulo = new Articulo(stock);
        if (!(arraylist.contains(articulo)))
            arraylist.add(articulo);
        else
            throw new ArticuloYaExisteException("El árticulo ya existe.");

    }

    public boolean baja(int codigo) throws CodigoNoValidoException, PrecioCompraNegativoException,
            StockNegativoException, PrecioVentaNegativoException {

        for (int i = 0; i < arraylist.size(); i++) {
            if (arraylist.get(i).getCodigo() == codigo)
                return arraylist.remove(arraylist.get(i));
        }
        throw new CodigoNoValidoException("El codigo " + codigo + " no existe en el almacen");

    }

    public void set(Articulo articulo, String descripcion, double precioCompra, double precioVenta, int stock)
            throws StockNegativoException, PrecioCompraNegativoException, PrecioVentaNegativoException {
        int indice = arraylist.indexOf(articulo);
        articulo.set(descripcion, precioCompra, precioVenta, stock);
        arraylist.set(indice, arraylist.get(indice));
    }

    @Override
    public String toString() {
        return "Artículo " + arraylist + "";
    }

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

    public void incrementar(int codigo, int cantidad) throws StockNegativoException, CantidadNegativaException {
        for (Articulo articulo : arraylist) {
            if (articulo.getCodigo() == codigo) {
                articulo.incrementaStock(cantidad);
            }
        }
    }

    public void decrementar(int codigo, int cantidad) throws StockNegativoException, CantidadNegativaException {
        for (Articulo articulo : arraylist) {
            if (articulo.getCodigo() == codigo) {
                articulo.decrementaStock(cantidad);
            }
        }
    }
}