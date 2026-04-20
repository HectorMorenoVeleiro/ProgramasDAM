package tercer_trimestre.tienda_mascotas;

public class Gato extends Mascota {

    // atributes
    protected double altSalto;
    protected double lngSalto;

    // ctr
    public Gato(String nombre, String color, int edad, double altSalto, double lngSalto) {
        super(nombre, color, edad);
        this.altSalto = altSalto;
        this.lngSalto = lngSalto;
    }

    // getters + settes
    public double getAltSalto() {
        return altSalto;
    }

    public void setAltSalto(double altSalto) {
        this.altSalto = altSalto;
    }

    public double getLngSalto() {
        return lngSalto;
    }

    public void setLngSalto(double lngSalto) {
        this.lngSalto = lngSalto;
    }

    @Override
    public double calcularPrecioVentaFinal() {
        setPrecio(precioBase + (precioBase * 0.1d));
        return getPrecio();
    }

    @Override
    public void sonido() {
        // recordatorio metodo clase padre
        super.sonido();
        System.out.println("el gato hace miau");
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + "Gato [altSalto=" + altSalto + ", lngSalto=" + lngSalto + "]";
    }

}
