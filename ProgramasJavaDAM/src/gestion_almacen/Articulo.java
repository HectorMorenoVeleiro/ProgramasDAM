package gestion_almacen;

public class Articulo {

    /**
     * Generará códigos para los artículos
     */

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

    /**
     * Constructor de la clase artículo -->
     * 
     * @param descripcion
     * @param precioCompra
     * @param precioVenta
     * @param stock
     * @throws StockNegativoException
     * @throws PrecioCompraNegativoException
     * @throws PrecioVentaNegativoException
     */

    Articulo(String descripcion, double precioCompra, double precioVenta, int stock)
            throws StockNegativoException, PrecioCompraNegativoException, PrecioVentaNegativoException {
        setDescripcion(descripcion);
        setPrecioCompra(precioCompra);
        setPrecioVenta(precioVenta);
        setStock(stock);
        setCodigo(); // atención a la llamada "setCodigo()"
    }

    /**
     * @param codigoArticulo constructor código
     */
    Articulo(int codigoArticulo) {
        setCodigo(codigoArticulo);
    }

    /**
     * @param codigo generado automaticamente en 1
     */

    private void setCodigo() {
        this.codigo = Articulo.contador++;
    }

    /**
     * @param codigo codigo del artículo
     */

    private void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return codigo del artículo
     */

    public int getCodigo() {
        return codigo;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the precioCompra
     */
    public double getPrecioCompra() {
        return precioCompra;
    }

    /**
     * @param precioCompra the precioCompra to set
     * 
     * @throws PrecioCompraNegativoException
     */
    void setPrecioCompra(double precioCompra) throws PrecioCompraNegativoException {
        if (precioCompra >= 0) {
            this.precioCompra = precioCompra;
        } else
            throw new PrecioCompraNegativoException("El precio de compra no puede ser negativo.");
    }

    /**
     * @return the precioVenta
     */
    public double getPrecioVenta() {
        return precioVenta;
    }

    /**
     * @param precioVenta the precioVenta to set
     * 
     * @throws PrecioVentaNegativoException
     */
    void setPrecioVenta(double precioVenta) throws PrecioVentaNegativoException {
        if (precioVenta >= 0) {
            this.precioVenta = precioVenta;
        } else
            throw new PrecioVentaNegativoException("El precio de venta no puede ser negativo.");

    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     * 
     * @throws StockNegativoException
     */
    void setStock(int stock) throws StockNegativoException {
        if (stock >= 0) {
            this.stock = stock;
        } else
            throw new StockNegativoException("El stock no puede ser negativo.");
    }

    /**
     * @param cantidad
     * @throws StockNegativoException
     * @throws CantidadNegativaException
     */
    public void incrementaStock(int cantidad) throws StockNegativoException, CantidadNegativaException {
        if (cantidad > 0)
            setStock(getStock() + cantidad);
        else
            throw new CantidadNegativaException("No se puede añadir una cantidad de stock negativo.");
    }

    /**
     * @param cantidad
     * @throws CantidadNegativaException
     * @throws StockNegativoException
     */
    public void decrementaStock(int cantidad) throws CantidadNegativaException, StockNegativoException {
        if (cantidad > 0)
            setStock(getStock() - cantidad);
        else
            throw new CantidadNegativaException("No se puede añadir una cantidad de stock negativo.");
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigo;
        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
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

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */

    @Override
    public String toString() {
        return "\nCodigo: " + getCodigo() + "\nDescripcion: " + getDescripcion() + "\nPrecioCompra: "
                + getPrecioCompra()
                + "\nPrecioVenta: " + getPrecioVenta() + "\nStock: " + getStock()
                + "\n'''''''''''''''''''''''''''''''''''''''";
    }

    /**
     * Método set usado en Almacen para realizar la modificación.
     * 
     * @param descripcion
     * @param precioCompra
     * @param precioVenta
     * @param stock
     * @throws StockNegativoException
     * @throws PrecioCompraNegativoException
     * @throws PrecioVentaNegativoException
     */

    public void set(String descripcion, double precioCompra, double precioVenta, int stock)
            throws StockNegativoException, PrecioCompraNegativoException, PrecioVentaNegativoException {
        setDescripcion(descripcion);
        setPrecioCompra(precioCompra);
        setPrecioVenta(precioVenta);
        setStock(stock);
    }
}