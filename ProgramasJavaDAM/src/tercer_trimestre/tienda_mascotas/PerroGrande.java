package tercer_trimestre.tienda_mascotas;

public class PerroGrande extends Perro {
    public enum razaG {
        pastor_aleman, dobermae, rotweiller
    }

    // atributo raza por perro
    private razaG tipo;

    // constructor
    public PerroGrande(String nombre, String color, int edad, double peso, boolean muerde, razaG tipo) {
        super(nombre, color, edad, peso, muerde);
        this.tipo = tipo;
    }

    // getters + setters
    public razaG getTipo() {
        return tipo;
    }

    public void setTipo(razaG tipo) {
        this.tipo = tipo;
    }

    @Override
    public double calcularPrecioVentaFinal() {
        super.calcularPrecioVentaFinal();
        setPrecio(getPrecio() + getPrecio() * 0.05d);
        return getPrecio();
    }

    @Override
    public void sonido() {
        super.sonido();
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + "PerroGrande [tipo=" + tipo + "]";
    }

}
