package tercer_trimestre.tienda_mascotas;

public class GatoPeloLargo extends Gato {

    public enum razaPL {
        angora, himalayo, balines, somali
    }

    private razaPL raza;

    // ctr
    public GatoPeloLargo(String nombre, String color, int edad, double altSalto, double lngSalto, razaPL raza) {
        super(nombre, color, edad, altSalto, lngSalto);
        this.raza = raza;
    }

    // getters + setters
    public razaPL getRaza() {
        return raza;
    }

    public void setRaza(razaPL raza) {
        this.raza = raza;
    }

    @Override
    public double calcularPrecioVentaFinal() {
        super.calcularPrecioVentaFinal();
        setPrecio(getPrecio() + getPrecio() * 0.3d);
        return getPrecio();
    }

    @Override
    public void sonido() {
        super.sonido();
    }

    // toString
    @Override
    public String toString() {
        return "GatoPeloLargo [raza=" + raza + "]";
    }
}
