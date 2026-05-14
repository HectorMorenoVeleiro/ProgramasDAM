package tercer_trimestre.charlin;

public class LineaPedido {

    String ID;
    double cantidadProduct;
    double precioUnit;

    LineaPedido(String ID, double cantidadProduct, double precioUnit) {
        this.ID = ID;
        this.cantidadProduct = cantidadProduct;
        this.precioUnit = precioUnit;
    }

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public double getCantidadProduct() {
        return cantidadProduct;
    }

    public void setCantidadProduct(double cantidadProduct) {
        this.cantidadProduct = cantidadProduct;
    }

    public double getPrecioUnit() {
        return precioUnit;
    }

    public void setPrecioUnit(double precioUnit) {
        this.precioUnit = precioUnit;
    }

    public void calcSubtotal() {

    }

}
