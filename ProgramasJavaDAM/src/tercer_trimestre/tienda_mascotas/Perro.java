package tercer_trimestre.tienda_mascotas;

public class Perro extends Mascota {

    // atributes
    protected double peso;
    protected boolean muerde;

    // ctr
    public Perro(String nombre, String color, int edad, double peso, boolean muerde) {
        super(nombre, color, edad);
        this.peso = peso;
        this.muerde = muerde;
    }

    // setters + getters
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isMuerde() {
        return muerde;
    }

    public void setMuerde(boolean muerde) {
        this.muerde = muerde;
    }

    @Override
    public void sonido() {
        // recordatorio metodo clase padre
        super.sonido();
        System.out.println("el pero hace guau");
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + "Perro [peso=" + peso + ", muerde=" + muerde + "]";
    }

}
