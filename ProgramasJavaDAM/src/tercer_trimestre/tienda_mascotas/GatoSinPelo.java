package tercer_trimestre.tienda_mascotas;

public class GatoSinPelo extends Gato {

    public enum razaSP {
        esfinge, elfo, donskoy
    }

    private razaSP raza;

    // ctr
    public GatoSinPelo(String nombre, String color, int edad, double altSalto, double lngSalto, razaSP raza) {
        super(nombre, color, edad, altSalto, lngSalto);
        this.raza = raza;
    }

    // getters + setters
    public razaSP getRaza() {
        return raza;
    }

    public void setRaza(razaSP raza) {
        this.raza = raza;
    }

    @Override
    public double calcularPrecioVentaFinal() {
        super.calcularPrecioVentaFinal();
        setPrecio(getPrecio() + getPrecio() * 0.4d);
        return getPrecio();
    }

    @Override
    public void sonido() {
        super.sonido();
    }

    // toString
    @Override
    public String toString() {
        return "GatoSinPelo [raza=" + raza + "]";
    }

}
