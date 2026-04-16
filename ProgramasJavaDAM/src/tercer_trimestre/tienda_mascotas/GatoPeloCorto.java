package tercer_trimestre.tienda_mascotas;

public class GatoPeloCorto extends Gato {

    public enum razaPC {
        azul_ruso, britanico, manx, devon_rex
    }

    private razaPC raza;

    // ctr
    public GatoPeloCorto(String nombre, String color, int edad, double altSalto, double lngSalto, razaPC raza) {
        super(nombre, color, edad, altSalto, lngSalto);
        this.raza = raza;
    }

    // getters + setters
    public razaPC getRaza() {
        return raza;
    }

    public void setRaza(razaPC raza) {
        this.raza = raza;
    }

    @Override
    public void sonido() {
        super.sonido();
    }

    // toString
    @Override
    public String toString() {
        return "GatoPeloCorto [raza=" + raza + "]";
    }

}
