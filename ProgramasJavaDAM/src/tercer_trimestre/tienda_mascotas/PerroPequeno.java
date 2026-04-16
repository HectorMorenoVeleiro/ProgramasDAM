package tercer_trimestre.tienda_mascotas;

public class PerroPequeno extends Perro {

    public enum razaP {
        caniche, yorkshire, terrier, schnauzer, chihuahua
    }

    private razaP raza;

    // ctr
    public PerroPequeno(String nombre, String color, int edad, double peso, boolean muerde, razaP raza) {
        super(nombre, color, edad, peso, muerde);
        this.raza = raza;
    }

    // getters + setters
    public razaP getRaza() {
        return raza;
    }

    public void setRaza(razaP raza) {
        this.raza = raza;
    }

    @Override
    public void sonido() {
        super.sonido();
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + "PerroMediano [raza=" + raza + "]";
    }
}
