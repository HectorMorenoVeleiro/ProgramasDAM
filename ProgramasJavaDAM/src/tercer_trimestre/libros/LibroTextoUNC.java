package tercer_trimestre.libros;

public class LibroTextoUNC extends LibroTexto {

    // atributes
    private String facultad;

    // ctr
    public LibroTextoUNC(String titulo, String autor, int curso, String facultad) {
        super(titulo, autor, curso);
        this.facultad = facultad;
    }

    // gettes + setters
    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    // toString
    @Override
    public String toString() {
        String str = super.toString();
        return "LIBRO TEXTO U: " + str + "\nFacultad: " + getFacultad();
    }
}
