package tercer_trimestre.mundial;

public class Masajista extends SeleccionFutbol {

    private String Titulacion;
    private int aniosExperiencia;

    public Masajista() {
        super();
    }

    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        Titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    // getter y setter
    public String getTitulacion() {
        return Titulacion;
    }

    public void setTitulacion(String titulacion) {
        Titulacion = titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public void darMasaje() {
        System.out.println("giving a masaje todo crazy");
    }

    @Override
    public void Viajar() {
        super.Viajar();
        System.out.println("el masajista viaja en la bodega (retoque)");
    }

    @Override
    public String toString() {
        return super.toString() + "\nMasajista [titulacion= " + getTitulacion() + " aniosExperiencia= "
                + getAniosExperiencia() + "]";
    }
}
