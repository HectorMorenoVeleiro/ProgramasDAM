package tercer_trimestre.inmuebles;

import java.util.HashMap;
import java.util.Map;

public class Inmueble {

    // inicialize map
    public static final Map<String, Double> VALOR_METRO_CUADRADO = new HashMap<>();

    // filled map hole
    public static final void poblar() {
        VALOR_METRO_CUADRADO.put("Casa rural", 1500.0);
        VALOR_METRO_CUADRADO.put("Casa en conjunto cerrado", 2500.0);
        VALOR_METRO_CUADRADO.put("Casa independiente", 3000.0);
        VALOR_METRO_CUADRADO.put("Apartaestudio", 1500.0);
        VALOR_METRO_CUADRADO.put("Apartamento familiar", 2000.0);
        VALOR_METRO_CUADRADO.put("Local comercial", 3000.0);
        VALOR_METRO_CUADRADO.put("Oficina", 3500.0);
    }

    // atributes
    protected int ID; // identifica direccion
    protected int area;
    protected String direccion;
    protected double precioVenta = 0d; // no precio hasta llegar a objeto de tabla subida

    // ctr
    public Inmueble(int ID, int area, String direccion) {
        this.ID = ID;
        this.area = area;
        this.direccion = direccion;
    }

    // getters_setters
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

    /* own methods */

    // sales prices
    // no atribute, overwrites by herency
    protected double calcularPrecioVenta() {
        return getPrecioVenta();
    }

    // print atributes
    public void imprimir() {
        System.out.println("ID inmo = " + getID());
        System.out.println("Area = " + getArea());
        System.out.println("Direccion = " + getDireccion());
        System.out.println("Precio de Venta = " + getPrecioVenta());
    }

}
