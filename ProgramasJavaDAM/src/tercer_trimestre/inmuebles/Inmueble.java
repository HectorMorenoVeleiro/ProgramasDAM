package tercer_trimestre.inmuebles;

import java.util.HashMap;
import java.util.Map;

public class Inmueble {

    public static final Map<String, Double> VALOR_METRO_CUADRADO = new HashMap<>();

    // atributos
    protected int ID; // identifica direccion
    protected int area;
    protected String direccion;
    protected double precioVenta = 0d; // no precio hasta llegar a objeto de tabla subida

    // ctr inmueble
    public Inmueble(int ID, int area, String direccion) {
        this.ID = ID;
        this.area = area;
        this.direccion = direccion;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    /* metodos propios */

    // precio de la venta
    public double calcularPrecioVenta(double valorAreaUnitario) {
        setPrecioVenta(getArea() * valorAreaUnitario);
        return getPrecioVenta();
    }

    // imprimir
    public void imprimir() {
        System.out.println("ID inmo = " + getID());
        System.out.println("Area = " + getArea());
        System.out.println("Direccion = " + getDireccion());
        System.out.println("Precio de Venta = " + getPrecioVenta());
    }

}
