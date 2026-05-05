package tercer_trimestre.medicina;

public class Medico {

    public String nombre; // Atributo que define el nombre de un medico

    // const
    public Medico(String nombre) {
        super();
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "[nombre=" + nombre + "]";
    }

}
