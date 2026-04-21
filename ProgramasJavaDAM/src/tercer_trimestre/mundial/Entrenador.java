package tercer_trimestre.mundial;

public class Entrenador extends SeleccionFutbol {

    private String idFederacion;

    public Entrenador() {
        super();
    }

    public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    // getter y setter
    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    // metodos propios
    public void dirigirPartido() {
        System.out.println("el objeto entrenador dirige un partido...");
    }

    public void dirigirEntreno() {
        System.out.println("el objeto entrenador dirige un entrenamiento...");
    }

    @Override
    public String toString() {
        return super.toString() + "\nEntrenador [idFederacion= " + getIdFederacion() + "]";
    }

}
