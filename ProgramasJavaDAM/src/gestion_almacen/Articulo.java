package gestion_almacen;

public class Articulo {

    /* atributo de clase */
    private static int contador = 1;

    /* atributo de objeto */
    // tmb es el nombre -->
    private String descripcion;
    // precios -->
    private double precioCompra;
    private double precioVenta;
    // stock del artículo -->
    private int stock;

    // identifica al artículo. Sera único -->
    private int codigo;

    Articulo(String descripcion, double precioCompra, double precioVenta, int stock)
            throws StockNegativoException, PrecioCompraNegativoException, PrecioVentaNegativoException {
        setDescripcion(descripcion);
        setPrecioCompra(precioCompra);
        setPrecioVenta(precioVenta);
        setStock(stock);
        setCodigo(); // atención a la llamada "setCodigo()"
    }

    private void setCodigo() {
        this.codigo = Articulo.contador++;
    }

    private void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    void setPrecioCompra(double precioCompra) throws PrecioCompraNegativoException {
        if (precioCompra >= 0) {
            this.precioCompra = precioCompra;
        } else
            throw new PrecioCompraNegativoException("El precio de compra no puede ser negativo.");
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    void setPrecioVenta(double precioVenta) throws PrecioVentaNegativoException {
        if (precioVenta >= 0) {
            this.precioVenta = precioVenta;
        } else
            throw new PrecioVentaNegativoException("El precio de venta no puede ser negativo.");

    }

    public int getStock() {
        return stock;
    }

    void setStock(int stock) throws StockNegativoException {
        if (stock >= 0) {
            this.stock = stock;
        } else
            throw new StockNegativoException("El stock no puede ser negativo.");
    }

    public void incrementaStock(int cantidad) throws StockNegativoException, CantidadNegativaException {
        if (cantidad > 0)
            setStock(getStock() + cantidad);
        else
            throw new CantidadNegativaException("No se puede añadir una cantidad de stock negativo.");
    }

    public void decrementaStock(int cantidad) throws CantidadNegativaException, StockNegativoException {
        if (cantidad > 0)
            setStock(getStock() - cantidad);
        else
            throw new CantidadNegativaException("No se puede añadir una cantidad de stock negativo.");
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigo;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return true;
        Articulo other = (Articulo) obj;
        return this.codigo != other.codigo;
    }

    @Override
    public String toString() {
        return "\nCodigo: " + getCodigo() + "\nDescripcion: " + getDescripcion() + "\nPrecioCompra: "
                + getPrecioCompra()
                + "\nPrecioVenta: " + getPrecioVenta() + "\nStock: " + getStock()
                + "\n'''''''''''''''''''''''''''''''''''''''";
    }

    public void set(String descripcion, double precioCompra, double precioVenta, int stock)
            throws StockNegativoException, PrecioCompraNegativoException, PrecioVentaNegativoException {
        setDescripcion(descripcion);
        setPrecioCompra(precioCompra);
        setPrecioVenta(precioVenta);
        setStock(stock);
    }
}