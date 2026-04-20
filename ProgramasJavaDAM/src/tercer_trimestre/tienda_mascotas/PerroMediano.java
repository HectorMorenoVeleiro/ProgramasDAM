package tercer_trimestre.tienda_mascotas;

public class PerroMediano extends Perro {

    public enum razaM {
        collie, dalmata, bulldog, galgo, sabueso
    }

    private razaM raza;

    // ctr
    public PerroMediano(String nombre, String color, int edad, double peso, boolean muerde, razaM raza) {
        super(nombre, color, edad, peso, muerde);
        this.raza = raza;
    }

    // getters + setters
    public razaM getRaza() {
        return raza;
    }

    public void setRaza(razaM raza) {
        this.raza = raza;
    }

    @Override
    public double calcularPrecioVentaFinal() {
        super.calcularPrecioVentaFinal();
        setPrecio(getPrecio() + getPrecio() * 0.6d);
        return getPrecio();
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
