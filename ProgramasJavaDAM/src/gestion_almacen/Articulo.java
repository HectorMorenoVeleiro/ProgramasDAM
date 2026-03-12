package gestion_almacen;

public class Articulo {

    // generador de código aleatoriamente -->
    private static int contador = 1;

    // tmb es el nombre -->
    private String descripcion;

    // precios -->
    private double precioCompra;
    private double precioVenta;

    // stock del artículo -->
    private int stock;

    // identifica al artículo. Sera UNICO para cada instanciación -->
    private int codigo;

    // constructor para crear un obj artículo con código pasado de forma interna
    // (por contador en setContador()) -->
    Articulo(String descripcion, double precioCompra, double precioVenta, int stock)
            throws StockNegativoException, // ===
            PrecioCompraNegativoException, // excepciones de código
            PrecioVentaNegativoException { // ===

        // por clean code llama a los setters -->
        setDescripcion(descripcion);
        setPrecioCompra(precioCompra);
        setPrecioVenta(precioVenta);
        setStock(stock);
        setCodigo(); // atención a la llamada "setCodigo()"

    } // Articulo()

    // constructor donde únicamente le pases el código (en algún momento lo quite de
    // cuajo) -->
    Articulo(int codigoArticulo) {
        setCodigo(codigoArticulo);

    } // Articulo()

    // setter para el codigo vacio por contador (el habitual) -->
    private void setCodigo() {
        this.codigo = Articulo.contador++;

    } // setCodigo()

    // setter normal para el codigo -->
    private void setCodigo(int codigo) {
        this.codigo = codigo;

    } // setCodigo()

    // getter para mostrar el código -->
    public int getCodigo() {
        return codigo;

    } // getCodigo()

    // getter para la descripción -->
    public String getDescripcion() {
        return descripcion;

    } // getDescripción()

    // y su seter para modificarla -->
    void setDescripcion(String descripcion) {
        this.descripcion = descripcion;

    } // setDescripcion()

    // getter para el precio de la compra -->
    public double getPrecioCompra() {
        return precioCompra;

    } // getPrecioCompra()

    // setter del precio de la compra, el cual ocupa la excepción de is es negativo
    // el precio de la compra y lo testea dentro del método -->
    void setPrecioCompra(double precioCompra) throws PrecioCompraNegativoException {
        if (precioCompra >= 0) {
            this.precioCompra = precioCompra;
        } else
            throw new PrecioCompraNegativoException("El precio de compra no puede ser negativo.");

    } // setPrecioCompra()

    // getter del precio de la venta -->
    public double getPrecioVenta() {
        return precioVenta;

    } // getPrecioVenta()

    // setter del precio de la venta al igual que el de la compra, donde se chequea
    // la excepción dicha previamente -->
    void setPrecioVenta(double precioVenta) throws PrecioVentaNegativoException {
        if (precioVenta >= 0) {
            this.precioVenta = precioVenta;
        } else
            throw new PrecioVentaNegativoException("El precio de venta no puede ser negativo.");

    } // setPrecioVenta()

    // getter del stock
    public int getStock() {
        return stock;

    } // getStock()

    // setter del stocke que como antes pilla la excepcion negativa -->
    void setStock(int stock) throws StockNegativoException {
        if (stock >= 0) {
            this.stock = stock;
        } else
            throw new StockNegativoException("El stock no puede ser negativo.");

    } // setStock()

    // método para incrementar el stock de un artículo espefífico q mira la
    // excepcion del stock negativa y la cantidad negativa -->
    public void incrementaStock(int cantidad) throws StockNegativoException, CantidadNegativaException {
        if (cantidad > 0)
            setStock(getStock() + cantidad);
        else
            throw new CantidadNegativaException("No se puede añadir una cantidad de stock negativo.");

    } // incrementaStock()

    // método para decrementar el stock de un artículo espefífico q mira la
    // excepcion del stock negativa y la cantidad negativa -->
    public void decrementaStock(int cantidad) throws CantidadNegativaException, StockNegativoException {
        if (cantidad > 0)
            setStock(getStock() - cantidad);
        else
            throw new CantidadNegativaException("No se puede añadir una cantidad de stock negativo.");

    } // decrementaStock()

    // método hashCode para ver si dos objetos tienen el mismo código -->
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigo;
        return result;

    } // hashCode()

    // equals para ver si dos objetos tienen el mismo código o no -->
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Articulo other = (Articulo) obj;
        return this.codigo == other.codigo;
    } // equals()

    // método toString para mostrar todos los parámetros -->
    @Override
    public String toString() {
        return "\n'''''''''''''''''''''''''''''''''''''''\nCodigo: " + getCodigo() + "\nDescripcion: "
                + getDescripcion() + "\nPrecioCompra: "
                + getPrecioCompra()
                + "\nPrecioVenta: " + getPrecioVenta() + "\nStock: " + getStock()
                + "\n'''''''''''''''''''''''''''''''''''''''";

    } // toString()

    // un setter(o método constructor) para cambiarle el valor a todo menos al
    // código -->
    public void set(String descripcion, double precioCompra, double precioVenta, int stock)
            throws StockNegativoException, PrecioCompraNegativoException, PrecioVentaNegativoException {
        setDescripcion(descripcion);
        setPrecioCompra(precioCompra);
        setPrecioVenta(precioVenta);
        setStock(stock);

    } // setNoCode()

} // Articulo.java