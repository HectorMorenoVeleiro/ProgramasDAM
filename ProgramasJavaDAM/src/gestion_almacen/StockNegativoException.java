package gestion_almacen;

public class StockNegativoException extends Exception {
    public StockNegativoException(String string) {
        super(string);
    }
}
